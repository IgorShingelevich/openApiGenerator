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


package org.openapitools.client.api.adobe;

import org.openapitools.client.service.adobeService.ApiClient;
import org.openapitools.client.api.adobe.CustomApi;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ErrorLoggingFilter;
import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;
import static io.restassured.config.RestAssuredConfig.config;
import static org.openapitools.client.service.adobeService.GsonObjectMapper.gson;

/**
 * API tests for CustomApi
 */
@Ignore
public class CustomApiTest {

    private CustomApi api;

    @Before
    public void createApi() {
        api = ApiClient.api(ApiClient.Config.apiConfig().reqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())))
                        .addFilter(new ErrorLoggingFilter())
                        .setBaseUri("https://api.apis.guru"))).custom();
    }

    /**
     * Default response
     */
    @Test
    public void shouldSee0AfterGetAemHealthCheck() {
        String tags = null;
        Boolean combineTagsOr = null;
        api.getAemHealthCheck().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Default response
     */
    @Test
    public void shouldSee0AfterPostConfigAemHealthCheckServlet() {
        List<String> bundlesIgnored = null;
        String bundlesIgnoredAtTypeHint = null;
        api.postConfigAemHealthCheckServlet().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Default response
     */
    @Test
    public void shouldSee0AfterPostConfigAemPasswordReset() {
        List<String> pwdresetAuthorizables = null;
        String pwdresetAuthorizablesAtTypeHint = null;
        api.postConfigAemPasswordReset().execute(r -> r.prettyPeek());
        // TODO: test validations
    }

}
