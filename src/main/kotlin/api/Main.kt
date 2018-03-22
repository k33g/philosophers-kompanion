package api

import io.vertx.core.Vertx
import philosopher.PhilosopherInteractor

fun main(args: Array<String>) {
    val vertx = Vertx.vertx()
    val philosopherInteractor = PhilosopherInteractor()

    val server = vertx.createHttpServer()

    server.requestHandler({ request ->

        // This handler gets called for each request that arrives on the server
        val response = request.response()
        response.putHeader("content-type", "text/plain")

        // Write to the response and end it
        response.end(philosopherInteractor.listPhilosopher())
    })

    server.listen(8080)
}