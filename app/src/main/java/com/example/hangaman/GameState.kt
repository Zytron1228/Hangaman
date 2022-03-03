package com.example.hangaman

sealed class GameState {
    class running(val lettersUSed: String,
    val underscoreWord: String,
    val drawable: Int): GameState()
    class Lost(val wordToGuess: String): GameState()
    class Won(val wordToGuess: String): GameState()
}
