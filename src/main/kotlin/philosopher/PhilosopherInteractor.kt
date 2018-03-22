package philosopher

class PhilosopherInteractor {

    fun listPhilosopher(): List<Philosopher> {
        return listOf(
                Philosopher("Maurice Moss", "path/to/Moss.jpg"),
                Philosopher("Maurice Moss", "path/to/Moss.jpg"),
                Philosopher("Maurice Moss", "path/to/Moss.jpg")
        )
    }
}