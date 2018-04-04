package com.okamidev.philosopher

data class Philosopher(val id: Int, val name: String, val imgSrc: String, val quotes: List<String>, val real: Boolean) {
    constructor(id: Int, name: String, imgSrc: String, quotes: List<String>) : this(id, name, imgSrc, quotes, true)
}