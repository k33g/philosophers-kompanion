package com.okamidev.philosopher

class PhilosopherInteractor {

    val philosopherMap = linkedMapOf(
            1 to Philosopher(1,
                    "Maurice Moss",
                    "/img/moss.jpg",
                    listOf(
                            "I'm here to drink milk and kick ass. And i just finished my milk...",
                            "I'll just put the over here with the rest of the fire."
                    )
            ),
            2 to Philosopher(2,
                    "Sheldon Cooper",
                    "/img/sheldon.jpg",
                    listOf(
                            "This is my spot"
                    )
            ),
            3 to Philosopher(3,
                    "Jeff Goldblum",
                    "/img/goldblum.jpg",
                    listOf(
                            "La vie trouve toujours le chemin.",
                            "Dieu crée les dinosaures. Dieu détruit les dinosaures. Dieu crée l’homme. L’homme détruit Dieu. L’homme crée les dinosaures..."
                    )
            ),
            4 to Philosopher(
                    4,
                    "Jean Claude Van Damme",
                    "/img/jcvd.jpg",
                    listOf(
                            "Une noisette, je la casse entre mes fesses!",
                            "1+1 = 11"
                    )
            )
    )

    fun listPhilosopher(): MutableCollection<Philosopher> {
        return philosopherMap.values
    }

    fun getById(philosopherId: String): Philosopher {
        return philosopherMap.getOrDefault(philosopherId.toInt(), Philosopher(0, "Inconnu", "", listOf()))
    }
}