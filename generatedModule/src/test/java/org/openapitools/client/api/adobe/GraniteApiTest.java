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

import java.io.File;
import org.openapitools.client.service.adobeService.ApiClient;
import org.openapitools.client.api.adobe.GraniteApi;
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
 * API tests for GraniteApi
 */
@Ignore
public class GraniteApiTest {

    private GraniteApi api;

    @Before
    public void createApi() {
        api = ApiClient.api(ApiClient.Config.apiConfig().reqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())))
                        .addFilter(new ErrorLoggingFilter())
                        .setBaseUri("https://api.apis.guru"))).granite();
    }

    /**
     * Default response
     */
    @Test
    public void shouldSee0AfterSslSetup() {
        String keystorePassword = null;
        String keystorePasswordConfirm = null;
        String truststorePassword = null;
        String truststorePasswordConfirm = null;
        String httpsHostname = null;
        String httpsPort = null;
        File certificateFile = null;
        File privatekeyFile = null;
        api.sslSetup()
                .keystorePasswordQuery(keystorePassword)
                .keystorePasswordConfirmQuery(keystorePasswordConfirm)
                .truststorePasswordQuery(truststorePassword)
                .truststorePasswordConfirmQuery(truststorePasswordConfirm)
                .httpsHostnameQuery(httpsHostname)
                .httpsPortQuery(httpsPort).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

}
