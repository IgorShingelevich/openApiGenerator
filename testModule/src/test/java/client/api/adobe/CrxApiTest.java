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

import java.io.File;
import org.openapitools.client.model.adobe.InstallStatus;
import org.openapitools.client.service.adobeService.ApiClient;
import org.openapitools.client.api.adobe.CrxApi;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.ErrorLoggingFilter;
import org.junit.Before;
import org.junit.Test;


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
 * API tests for CrxApi
 */
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.*;

@Tag("api")
@Epic("setEpic")
@Feature("setFeature")
@Story("setStory")
@Disabled
public class CrxApiTest {

    private CrxApi api;

    @Before
    public void createApi() {
        api = ApiClient.api(ApiClient.Config.apiConfig().reqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())))
                        .addFilter(new ErrorLoggingFilter())
                        .setBaseUri("https://api.apis.guru"))).crx();
    }

    /**
     * CRXDE is enabled
     */
    @Test
    public void shouldSee200AfterGetCrxdeStatus() {
        api.getCrxdeStatus().execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * CRXDE is disabled
     */
    @Test
    public void shouldSee404AfterGetCrxdeStatus() {
        api.getCrxdeStatus().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Retrieved CRX package manager install status
     */
    @Test
    public void shouldSee200AfterGetInstallStatus() {
        api.getInstallStatus().execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Default response
     */
    @Test
    public void shouldSee0AfterGetInstallStatus() {
        api.getInstallStatus().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Package Manager Servlet is disabled
     */
    @Test
    public void shouldSee404AfterGetPackageManagerServlet() {
        api.getPackageManagerServlet().execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Package Manager Servlet is active
     */
    @Test
    public void shouldSee405AfterGetPackageManagerServlet() {
        api.getPackageManagerServlet().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Default response
     */
    @Test
    public void shouldSee0AfterPostPackageService() {
        String cmd = null;
        api.postPackageService()
                .cmdQuery(cmd).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Default response
     */
    @Test
    public void shouldSee0AfterPostPackageServiceJson() {
        String path = null;
        String cmd = null;
        String groupName = null;
        String packageName = null;
        String packageVersion = null;
        String charset = null;
        Boolean force = null;
        Boolean recursive = null;
        File _package = null;
        api.postPackageServiceJson()
                .pathPath(path)
                .cmdQuery(cmd).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Default response
     */
    @Test
    public void shouldSee0AfterPostPackageUpdate() {
        String groupName = null;
        String packageName = null;
        String version = null;
        String path = null;
        String filter = null;
        String charset = null;
        api.postPackageUpdate()
                .groupNameQuery(groupName)
                .packageNameQuery(packageName)
                .versionQuery(version)
                .pathQuery(path).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Default response
     */
    @Test
    public void shouldSee0AfterPostSetPassword() {
        String old = null;
        String plain = null;
        String verify = null;
        api.postSetPassword()
                .oldQuery(old)
                .plainQuery(plain)
                .verifyQuery(verify).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

}
