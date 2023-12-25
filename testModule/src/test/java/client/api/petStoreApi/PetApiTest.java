/*
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * The version of the OpenAPI document: 1.0.6
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package client.api.petStoreApi;

import java.io.File;

import client.model.petStoreModel.CustomLoggingFilter;
import org.openapitools.client.model.petStoreModel.Pet;
import org.openapitools.client.service.petStoreService.ApiClient;
import org.openapitools.client.api.petStoreApi.PetApi;
import io.restassured.builder.RequestSpecBuilder;
import org.junit.jupiter.api.Test;


import java.util.*;

import static io.restassured.RestAssured.given;
import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;
import static io.restassured.config.RestAssuredConfig.config;
import static org.openapitools.client.service.petStoreService.GsonObjectMapper.gson;

/**
 * API tests for PetApi
 */
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.*;

@Tag("api")
@Epic("setEpic")
@Feature("setFeature")
@Story("setStory")
//@Disabled
public class PetApiTest {

    private PetApi api;

    @BeforeEach
    public void createApi() {
        api = ApiClient.api(ApiClient.Config.apiConfig().reqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())))
//                        .addFilter(new ErrorLoggingFilter())
                        .addFilter(new CustomLoggingFilter())
                        .setBaseUri("https://petstore.swagger.io/v2"))).pet();
    }

//    @BeforeEach
//    public void createApi() {
//        try {
//            api = ApiClient.api(ApiClient.Config.apiConfig().reqSpecSupplier(
//                    () -> new RequestSpecBuilder()
//                    // Configuration
//            )).pet();
//            System.out.println("API client initialized successfully");
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("Error initializing API client: " + e.getMessage());
//        }
//    }


    /**
     * Invalid input
     */
    @Test
    public void shouldSee405AfterAddPet() {
        Pet body = new Pet();
        body.setId(-1L);
        api.addPet()
                .body(body).execute(r -> r.prettyPeek())
//                .then()
//                .statusCode(405) // Validate that the status code is indeed 405
//                .body("type", equalTo("error")) // Assuming the response has an error type field
//                .body("message", containsString("Method Not Allowed"))
        ; // Validate the error message
        // TODO: test validations
    }

    @Test
    public void shouldSee405AfterAddPet2() {
        // Define the base URI for the Petstore API
        String baseUri = "https://petstore.swagger.io/v2";

        // Send a POST request directly using RestAssured, with a null body
        given()
                .baseUri(baseUri)
                .basePath("/pet")
                .contentType("application/json")
                .body("")
                .when()
                .post()
                .then()
                .statusCode(405); // Replace with the expected status code
    }


    /**
     * Invalid ID supplied
     */
    @Test
    public void shouldSee400AfterDeletePet() {
        Long petId = null;
        String apiKey = null;
        api.deletePet()
                .petIdPath(petId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Pet not found
     */
    @Test
    public void shouldSee404AfterDeletePet() {
        Long petId = null;
        String apiKey = null;
        api.deletePet()
                .petIdPath(petId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee200AfterFindPetsByStatus() {
        List<String> status = null;
        api.findPetsByStatus()
                .statusQuery(status).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Invalid status value
     */
    @Test
    public void shouldSee400AfterFindPetsByStatus() {
        List<String> status = null;
        api.findPetsByStatus()
                .statusQuery(status).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee200AfterFindPetsByTags() {
        List<String> tags = null;
        api.findPetsByTags()
                .tagsQuery(tags).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Invalid tag value
     */
    @Test
    public void shouldSee400AfterFindPetsByTags() {
        List<String> tags = null;
        api.findPetsByTags()
                .tagsQuery(tags).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee200AfterGetPetById() {
        Long petId = 1L;
        api.getPetById()
                .petIdPath(petId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Invalid ID supplied
     */
    @Test
    public void shouldSee400AfterGetPetById() {
        Long petId = null;
        api.getPetById()
                .petIdPath(petId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Pet not found
     */
    @Test
    public void shouldSee404AfterGetPetById() {
        Long petId = null;
        api.getPetById()
                .petIdPath(petId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Invalid ID supplied
     */
    @Test
    public void shouldSee400AfterUpdatePet() {
        Pet body = null;
        api.updatePet()
                .body(body).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Pet not found
     */
    @Test
    public void shouldSee404AfterUpdatePet() {
        Pet body = null;
        api.updatePet()
                .body(body).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Validation exception
     */
    @Test
    public void shouldSee405AfterUpdatePet() {
        Pet body = null;
        api.updatePet()
                .body(body).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Invalid input
     */
    @Test
    public void shouldSee405AfterUpdatePetWithForm() {
        Long petId = null;
        String name = null;
        String status = null;
        api.updatePetWithForm()
                .petIdPath(petId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * successful operation
     */
    @Test
    public void shouldSee200AfterUploadFile() {
        Long petId = null;
        String additionalMetadata = null;
        File _file = null;
        api.uploadFile()
                .petIdPath(petId).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

}
