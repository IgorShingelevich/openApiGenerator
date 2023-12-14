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


package org.openapitools.client.service.petStoreService;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.ResponseSpecification;

import java.util.function.Function;

public class ResponseSpecBuilders {

    private ResponseSpecBuilders() {
    }

    public static Function<Response, Response> validatedWith(ResponseSpecification respSpec) {
        return response -> response.then().spec(respSpec).extract().response();
    }

    public static Function<Response, Response> validatedWith(ResponseSpecBuilder respSpec) {
        return validatedWith(respSpec.build());
    }

    /**
     * @param code expected status code
     * @return ResponseSpecBuilder
     */
    public static ResponseSpecBuilder shouldBeCode(int code) {
        return new ResponseSpecBuilder().expectStatusCode(code);
    }
}