package com.okamidev.philosopher

class PhilosopherInteractor {

    fun listPhilosopher(): List<Philosopher> {
        return listOf(
                Philosopher("Maurice Moss", "/img/moss.jpg"),
                Philosopher("Sheldon Cooper", "/img/sheldon.jpg"),
                Philosopher("Jeff Goldblum", "/img/goldblum.jpg"),
                Philosopher("Jean Claude Van Damme", "/img/jcvd.jpg")
        )
    }
}