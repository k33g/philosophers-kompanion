package com.okamidev.philosopher

class PhilosopherInteractor {

    val philosopherMap = linkedMapOf(
            1 to Philosopher(1,
                    "Maurice Moss",
                    "/img/moss.jpg",
                    listOf(
                            "I'm here to drink milk and kick ass. And i just finished my milk...",
                            "I'll just put this over here with the rest of the fire.",
                            "I like being weird, weird is all I’ve got. That and my sweet style"
                    ),
                    false
            ),
            2 to Philosopher(2,
                    "Sheldon Cooper",
                    "/img/sheldon.jpg",
                    listOf(
                            "This is my spot",
                            "For the record, it could kill us to meet new people. They could be murderers or the carriers of unusual pathogens. And I'm not insane, my mother had me tested.",
                            "(3 knocks) Penny! (3 knocks) Penny! (3 knocks) Penny!",
                            "Don't be silly, I'm a fan of anything that tries to replace actual human contact.",
                            "The correct animal for inter-species super soldier is the koala. You would wind up with an army so cute, it couldn't be attacked."
                    ),
                    false
            ),
            3 to Philosopher(3,
                    "Jeff Goldblum",
                    "/img/goldblum.jpg",
                    listOf(
                            "La vie trouve toujours le chemin.",
                            "Dieu crée les dinosaures. Dieu détruit les dinosaures. Dieu crée l’homme. L’homme détruit Dieu. L’homme crée les dinosaures...",
                            "See, here I'm now sitting by myself, uh, er, talking to myself. That's, that's chaos theory"
                    )
            ),
            4 to Philosopher(
                    4,
                    "Jean Claude Van Damme",
                    "/img/jcvd.jpg",
                    listOf(
                            "Une noisette, je la casse entre mes fesses!",
                            "Moi, Adam et Eve, j’y crois plus tu vois, parce que je suis pas un idiot : la pomme ça peut pas être mauvais, c’est plein de pectine…",
                            "Selon les statistiques, il y a une personne sur cinq qui est déséquilibrée. S'il y a 4 personnes autour de toi et qu'elles te semblent normales, c'est pas bon."
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