package com.okamidev.philosopher

class PhilosopherInteractor {

    fun listPhilosopher(): List<Philosopher> {
        return listOf(
                Philosopher(1,
                        "Maurice Moss",
                        "/img/moss.jpg",
                        listOf(
                                "I'm here to drink milk and kick ass. And i just finished my milk...",
                                "I'll just put the over here with the rest of the fire."
                        )
                ),
                Philosopher(2,
                        "Sheldon Cooper",
                        "/img/sheldon.jpg",
                        listOf(
                                "This is my spot"
                        )
                ),
                Philosopher(3,
                        "Jeff Goldblum",
                        "/img/goldblum.jpg",
                        listOf(
                                "La vie trouve toujours le chemin.",
                                "Dieu crée les dinosaures. Dieu détruit les dinosaures. Dieu crée l’homme. L’homme détruit Dieu. L’homme crée les dinosaures..."
                        )
                ),
                Philosopher(
                        4,
                        "Jean Claude Van Damme",
                        "/img/jcvd.jpg",
                        listOf(
                                "Une noisette, je la casse entre mes fesses!",
                                "1+1 = 11"
                        )
                )
        )
    }
}