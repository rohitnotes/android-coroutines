# Coroutines

**Repository.kt**
```kotlin
  suspend fun getFilmes(): List<Filme> {
      return withContext(Dispatchers.Default) {
          delay(3000)
          listOf(
              Filme(1, "Titulo 01"),
              Filme(2, "Titulo 02")
          )
      }
  }
```

**ViewModel.kt**
```kotlin
    val filmesLiveData = MutableLiveData<List<Filme>>()

    fun fetchFilmes() {
        CoroutineScope(Dispatchers.Main).launch {
            val filmes = withContext(Dispatchers.Default) {
                repository.getFilmesCoroutines()
            }
            filmesLiveData.value = filmes
        }
    }
```
