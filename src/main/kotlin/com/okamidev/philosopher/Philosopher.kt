package com.okamidev.philosopher

data class Philosopher(val id: Int, val name: String, val imgSrc: String, val quotes: MutableList<String>, val real: Boolean) {
    constructor(id: Int, name: String, imgSrc: String, quotes: MutableList<String>) : this(id, name, imgSrc, quotes, true)

    fun addQuote(quote: String) {
        quotes.add(quote)
    }
}