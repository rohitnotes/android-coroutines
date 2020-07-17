package br.com.brunocardoso.studying.filmescoroutines.ui.main

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

class MainRepository {
    
    suspend fun getFilmesCoroutines(): List<Filme> {
        return withContext(Dispatchers.Default) {
            delay(3000)
            listOf(
                Filme(1, "Titulo 01"),
                Filme(2, "Titulo 02")
            )
        }
    }
}