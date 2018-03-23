package com.okamidev.presenter

import com.okamidev.philosopher.Philosopher
import java.util.*

class PhilosopherResponse(philosopher: Philosopher) {
    val img = Base64.getEncoder().encodeToString(this.javaClass.getResource(philosopher.imgSrc).readBytes())
    val name = philosopher.name
}