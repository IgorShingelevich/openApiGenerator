/*
 * Adobe Experience Manager (AEM) API
 * Swagger AEM is an OpenAPI specification for Adobe Experience Manager (AEM) API
 *
 * The version of the OpenAPI document: 3.7.1-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package client.api.adobe;

import org.openapitools.client.service.adobeService.ApiClient;
import org.openapitools.client.api.adobe.CqApi;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ErrorLoggingFilter;
import org.junit.Before;
import org.junit.jupiter.api.Test;


import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;
import static io.restassured.config.RestAssuredConfig.config;
import static org.openapitools.client.service.adobeService.GsonObjectMapper.gson;

/**
 * API tests for CqApi
 */
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.*;

@Tag("baseApi")
@Epic("setEpic")
@Feature("setFeature")
@Story("setStory")
@Disabled
public class CqApiTest {

    private CqApi api;

    @Before
    public void createApi() {
        api = ApiClient.api(ApiClient.Config.apiConfig().reqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())))
                        .addFilter(new ErrorLoggingFilter())
                        .setBaseUri("https://api.apis.guru"))).cq();
    }

    /**
     * Default response
     */
    @Test
    public void shouldSee0AfterGetLoginPage() {
        api.getLoginPage().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Default response
     */
    @Test
    public void shouldSee0AfterPostCqActions() {
        String authorizableId = null;
        String changelog = null;
        api.postCqActions()
                .authorizableIdQuery(authorizableId)
                .changelogQuery(changelog).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

}
