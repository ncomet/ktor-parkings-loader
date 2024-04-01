# io.swagger.client - Kotlin client library for Gestion de places de parking API

## Requires

* Kotlin 1.4.30
* Gradle 5.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in Swagger definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost:8080/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**parkingsGet**](docs/DefaultApi.md#parkingsget) | **GET** /parkings | Récupérer la liste de tous les parkings
*DefaultApi* | [**parkingsIdGet**](docs/DefaultApi.md#parkingsidget) | **GET** /parkings/{id} | Récupérer les détails d'un parking spécifique
*DefaultApi* | [**parkingsIdSpotsSpotIdDelete**](docs/DefaultApi.md#parkingsidspotsspotiddelete) | **DELETE** /parkings/{id}/spots/{spotId} | Libérer une place de parking
*DefaultApi* | [**parkingsIdSpotsSpotIdGet**](docs/DefaultApi.md#parkingsidspotsspotidget) | **GET** /parkings/{id}/spots/{spotId} | Récupérer les détails d'une place de parking spécifique
*DefaultApi* | [**parkingsIdSpotsSpotIdPut**](docs/DefaultApi.md#parkingsidspotsspotidput) | **PUT** /parkings/{id}/spots/{spotId} | Mettre à jour le statut d'une place de parking
*DefaultApi* | [**parkingsPost**](docs/DefaultApi.md#parkingspost) | **POST** /parkings | Créer un nouveau parking

<a name="documentation-for-models"></a>
## Documentation for Models

 - [io.swagger.client.models.RestBookParkingSpotRequest](docs/RestBookParkingSpotRequest.md)
 - [io.swagger.client.models.RestNewParking](docs/RestNewParking.md)
 - [io.swagger.client.models.RestParking](docs/RestParking.md)
 - [io.swagger.client.models.RestParkingSpot](docs/RestParkingSpot.md)
 - [io.swagger.client.models.RestParkings](docs/RestParkings.md)
 - [io.swagger.client.models.RestSpotStatus](docs/RestSpotStatus.md)

<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
# ktor-parkings-loader
