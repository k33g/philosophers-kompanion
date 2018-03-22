package com.okamidev.philosopher

class PhilosopherInteractor {

    fun listPhilosopher(): List<Philosopher> {
        return listOf(
                Philosopher("Maurice Moss", "path/to/Moss.jpg"),
                Philosopher("Sheldon Cooper", "path/to/Sheldon.jpg"),
                Philosopher("Jeff Goldblum", "path/to/Jeff.jpg"),
                Philosopher("Jean Claude Van Damme", "path/to/JCVD.jpg")
        )
    }
}