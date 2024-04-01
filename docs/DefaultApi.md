# DefaultApi

All URIs are relative to *http://localhost:8080/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**parkingsGet**](DefaultApi.md#parkingsGet) | **GET** /parkings | Récupérer la liste de tous les parkings
[**parkingsIdGet**](DefaultApi.md#parkingsIdGet) | **GET** /parkings/{id} | Récupérer les détails d&#x27;un parking spécifique
[**parkingsIdSpotsSpotIdDelete**](DefaultApi.md#parkingsIdSpotsSpotIdDelete) | **DELETE** /parkings/{id}/spots/{spotId} | Libérer une place de parking
[**parkingsIdSpotsSpotIdGet**](DefaultApi.md#parkingsIdSpotsSpotIdGet) | **GET** /parkings/{id}/spots/{spotId} | Récupérer les détails d&#x27;une place de parking spécifique
[**parkingsIdSpotsSpotIdPut**](DefaultApi.md#parkingsIdSpotsSpotIdPut) | **PUT** /parkings/{id}/spots/{spotId} | Mettre à jour le statut d&#x27;une place de parking
[**parkingsPost**](DefaultApi.md#parkingsPost) | **POST** /parkings | Créer un nouveau parking

<a name="parkingsGet"></a>
# **parkingsGet**
> kotlin.Array&lt;RestParkings&gt; parkingsGet()

Récupérer la liste de tous les parkings

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
try {
    val result : kotlin.Array<RestParkings> = apiInstance.parkingsGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#parkingsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#parkingsGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;RestParkings&gt;**](RestParkings.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="parkingsIdGet"></a>
# **parkingsIdGet**
> RestParking parkingsIdGet(id)

Récupérer les détails d&#x27;un parking spécifique

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val id : kotlin.String = id_example // kotlin.String | Identifiant du parking à récupérer
try {
    val result : RestParking = apiInstance.parkingsIdGet(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#parkingsIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#parkingsIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifiant du parking à récupérer |

### Return type

[**RestParking**](RestParking.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="parkingsIdSpotsSpotIdDelete"></a>
# **parkingsIdSpotsSpotIdDelete**
> parkingsIdSpotsSpotIdDelete(id, spotId)

Libérer une place de parking

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val id : kotlin.String = id_example // kotlin.String | Identifiant du parking à mettre à jour
val spotId : kotlin.String = spotId_example // kotlin.String | Numéro de la place à mettre à jour
try {
    apiInstance.parkingsIdSpotsSpotIdDelete(id, spotId)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#parkingsIdSpotsSpotIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#parkingsIdSpotsSpotIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifiant du parking à mettre à jour |
 **spotId** | **kotlin.String**| Numéro de la place à mettre à jour |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="parkingsIdSpotsSpotIdGet"></a>
# **parkingsIdSpotsSpotIdGet**
> RestParkingSpot parkingsIdSpotsSpotIdGet(id, spotId)

Récupérer les détails d&#x27;une place de parking spécifique

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val id : kotlin.String = id_example // kotlin.String | Identifiant du parking à mettre à jour
val spotId : kotlin.String = spotId_example // kotlin.String | Numéro de la place à mettre à jour
try {
    val result : RestParkingSpot = apiInstance.parkingsIdSpotsSpotIdGet(id, spotId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#parkingsIdSpotsSpotIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#parkingsIdSpotsSpotIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Identifiant du parking à mettre à jour |
 **spotId** | **kotlin.String**| Numéro de la place à mettre à jour |

### Return type

[**RestParkingSpot**](RestParkingSpot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="parkingsIdSpotsSpotIdPut"></a>
# **parkingsIdSpotsSpotIdPut**
> parkingsIdSpotsSpotIdPut(body, id, spotId)

Mettre à jour le statut d&#x27;une place de parking

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val body : RestBookParkingSpotRequest =  // RestBookParkingSpotRequest | 
val id : kotlin.String = id_example // kotlin.String | Identifiant du parking à mettre à jour
val spotId : kotlin.String = spotId_example // kotlin.String | Numéro de la place à mettre à jour
try {
    apiInstance.parkingsIdSpotsSpotIdPut(body, id, spotId)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#parkingsIdSpotsSpotIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#parkingsIdSpotsSpotIdPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RestBookParkingSpotRequest**](RestBookParkingSpotRequest.md)|  |
 **id** | **kotlin.String**| Identifiant du parking à mettre à jour |
 **spotId** | **kotlin.String**| Numéro de la place à mettre à jour |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="parkingsPost"></a>
# **parkingsPost**
> parkingsPost(body)

Créer un nouveau parking

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val body : RestNewParking =  // RestNewParking | 
try {
    apiInstance.parkingsPost(body)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#parkingsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#parkingsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RestNewParking**](RestNewParking.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

