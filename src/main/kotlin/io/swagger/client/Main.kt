package io.swagger.client

import io.swagger.client.apis.DefaultApi
import io.swagger.client.models.RestBookParkingSpotRequest
import io.swagger.client.models.RestNewParking
import kotlinx.coroutines.*

val randomNames = listOf(
    "Parking des Lilas",
    "Parking des Fauvettes",
    "Parking des Alouettes",
    "Parking des Colibris",
    "Parking des Hirondelles",
    "Parking des Mésanges",
    "Parking des Merles",
    "Parking des Moineaux",
    "Parking des Pinsons",
    "Parking des Rougegorges",
    "Parking des Tourterelles",
    "Parking des Pigeons",
    "Parking des Pies",
    "Parking des Corbeaux",
    "Parking des Corneilles",
    "Parking des Choucas",
    "Parking des Geais",
    "Parking des Pics",
    "Parking des Marmottes",
    "Parking des Ecureuils",
    "Parking des Lapins",
    "Parking des Lièvres",
    "Parking des Renards",
    "Parking des Sangliers",
    "Parking des Chevreuils",
    "Parking des Cerfs",
    "Parking des Biches",
    "Parking des Daims",
    "Parking des Chamois",
    "Parking des Bouquetins",
    "Parking des Mouflons",
    "Parking des Loups",
    "Parking des Lynx",
    "Parking des Ours",
    "Parking des Grizzlis",
    "Parking des Pandas",
    "Parking des Koalas",
    "Parking des Kangourous",
    "Parking des Wallabies",
    "Parking des Wombats",
    "Parking des Ornithorynques",
    "Parking des Dauphins",
    "Parking des Baleines",
    "Parking des Requins",
    "Parking des Raies",
    "Parking des Méduses",
    "Parking des Etoiles de mer",
    "Parking des Crabes",
    "Parking des Homards",
    "Parking des Langoustes",
    "Parking des Crevettes",
    "Parking des Mantes",
    "Parking des Sauterelles",
    "Parking des Criquets",
    "Parking des Grillons",
    "Parking des Fourmis",
    "Parking des Abeilles",
    "Parking des Guêpes",
    "Parking des Frelons",
    "Parking des Bourdons",
    "Parking des Papillons",
    "Parking des Moustiques",
    "Parking des Taons",
    "Parking des Mouches",
    "Parking des Moutchics",
)

fun randomLetter(): Char = ('A'..'Z').random()
fun randomDigit(): Int = (0..9).random()

fun randomLicencePlate(): String =
    "${randomLetter()}${randomLetter()}-${randomDigit()}${randomDigit()}${randomDigit()}-${randomLetter()}${randomLetter()}"

suspend fun main() {
    coroutineScope {
        val parkingIds = (0 until 10_000).map {
            async {
                DefaultApi().parkingsPost(
                    RestNewParking(
                        name = "${randomNames.random()} - $it",
                        location = "Location $it",
                        spotsNumber = 80,
                    )
                )
            }
        }.awaitAll()

        for (i in generateSequence(0) { it }) {
            //launch {
            when ((1..100).random()) {
                in 1..35 -> bookParkingSpot(parkingIds)
                in 36..70 -> freeParkingSpot(parkingIds)
                in 71..85 -> getParking(parkingIds)
                in 86..100 -> getParkingSpot(parkingIds)
            }
            //}
        }
    }
}

private fun getParkingSpot(parkingIds: List<String>) {
    val parkingId = parkingIds.random()
    val spotId = (1..80).random()
    DefaultApi().parkingsIdSpotsSpotIdGet(
        id = parkingId,
        spotId = spotId.toString(),
    )
    println("⬇️Retrieved parking=$parkingId spot=$spotId!")
}

private fun getParking(parkingIds: List<String>) {
    val parkingId = parkingIds.random()
    DefaultApi().parkingsIdGet(
        id = parkingId,
    )
    println("⬇️Retrieved parking=$parkingId!")
}

private fun freeParkingSpot(parkingIds: List<String>) {
    val parkingId = parkingIds.random()
    val spotId = (1..80).random()
    DefaultApi().parkingsIdSpotsSpotIdDelete(
        id = parkingId,
        spotId = spotId.toString(),
    )
    println("🏁Freed parking=$parkingId spot=$spotId!")
}

private fun bookParkingSpot(parkingIds: List<String>) {
    val parkingId = parkingIds.random()
    val spotId = (1..80).random()
    DefaultApi().parkingsIdSpotsSpotIdPut(
        id = parkingId,
        spotId = spotId.toString(),
        body = RestBookParkingSpotRequest(licensePlate = randomLicencePlate())
    )
    println("✅Booked parking=$parkingId spot=$spotId!")
}