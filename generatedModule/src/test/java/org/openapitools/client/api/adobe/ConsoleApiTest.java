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

import org.openapitools.client.model.adobe.BundleInfo;
import org.openapitools.client.model.adobe.SamlConfigurationInfo;
import org.openapitools.client.service.adobeService.ApiClient;
import org.openapitools.client.api.adobe.ConsoleApi;
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
 * API tests for ConsoleApi
 */
@Ignore
public class ConsoleApiTest {

    private ConsoleApi api;

    @Before
    public void createApi() {
        api = ApiClient.api(ApiClient.Config.apiConfig().reqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())))
                        .addFilter(new ErrorLoggingFilter())
                        .setBaseUri("https://api.apis.guru"))).console();
    }

    /**
     * Default response
     */
    @Test
    public void shouldSee0AfterGetAemProductInfo() {
        api.getAemProductInfo().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Retrieved bundle info
     */
    @Test
    public void shouldSee200AfterGetBundleInfo() {
        String name = null;
        api.getBundleInfo()
                .namePath(name).execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Default response
     */
    @Test
    public void shouldSee0AfterGetBundleInfo() {
        String name = null;
        api.getBundleInfo()
                .namePath(name).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * OK
     */
    @Test
    public void shouldSee200AfterGetConfigMgr() {
        api.getConfigMgr().execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Unexpected error.
     */
    @Test
    public void shouldSee5XXAfterGetConfigMgr() {
        api.getConfigMgr().execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Default response
     */
    @Test
    public void shouldSee0AfterPostBundle() {
        String name = null;
        String action = null;
        api.postBundle()
                .namePath(name)
                .actionQuery(action).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Default response
     */
    @Test
    public void shouldSee0AfterPostJmxRepository() {
        String action = null;
        api.postJmxRepository()
                .actionPath(action).execute(r -> r.prettyPeek());
        // TODO: test validations
    }


    /**
     * Retrieved AEM SAML Configuration
     */
    @Test
    public void shouldSee200AfterPostSamlConfiguration() {
        Boolean post = null;
        Boolean apply = null;
        Boolean delete = null;
        String action = null;
        String $location = null;
        List<String> path = null;
        Integer serviceRanking = null;
        String idpUrl = null;
        String idpCertAlias = null;
        Boolean idpHttpRedirect = null;
        String serviceProviderEntityId = null;
        String assertionConsumerServiceURL = null;
        String spPrivateKeyAlias = null;
        String keyStorePassword = null;
        String defaultRedirectUrl = null;
        String userIDAttribute = null;
        Boolean useEncryption = null;
        Boolean createUser = null;
        Boolean addGroupMemberships = null;
        String groupMembershipAttribute = null;
        List<String> defaultGroups = null;
        String nameIdFormat = null;
        List<String> synchronizeAttributes = null;
        Boolean handleLogout = null;
        String logoutUrl = null;
        Integer clockTolerance = null;
        String digestMethod = null;
        String signatureMethod = null;
        String userIntermediatePath = null;
        List<String> propertylist = null;
        api.postSamlConfiguration().execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Default response
     */
    @Test
    public void shouldSee302AfterPostSamlConfiguration() {
        Boolean post = null;
        Boolean apply = null;
        Boolean delete = null;
        String action = null;
        String $location = null;
        List<String> path = null;
        Integer serviceRanking = null;
        String idpUrl = null;
        String idpCertAlias = null;
        Boolean idpHttpRedirect = null;
        String serviceProviderEntityId = null;
        String assertionConsumerServiceURL = null;
        String spPrivateKeyAlias = null;
        String keyStorePassword = null;
        String defaultRedirectUrl = null;
        String userIDAttribute = null;
        Boolean useEncryption = null;
        Boolean createUser = null;
        Boolean addGroupMemberships = null;
        String groupMembershipAttribute = null;
        List<String> defaultGroups = null;
        String nameIdFormat = null;
        List<String> synchronizeAttributes = null;
        Boolean handleLogout = null;
        String logoutUrl = null;
        Integer clockTolerance = null;
        String digestMethod = null;
        String signatureMethod = null;
        String userIntermediatePath = null;
        List<String> propertylist = null;
        api.postSamlConfiguration().execute(r -> r.prettyPeek());
        // TODO: test validations
    }

    /**
     * Default response
     */
    @Test
    public void shouldSee0AfterPostSamlConfiguration() {
        Boolean post = null;
        Boolean apply = null;
        Boolean delete = null;
        String action = null;
        String $location = null;
        List<String> path = null;
        Integer serviceRanking = null;
        String idpUrl = null;
        String idpCertAlias = null;
        Boolean idpHttpRedirect = null;
        String serviceProviderEntityId = null;
        String assertionConsumerServiceURL = null;
        String spPrivateKeyAlias = null;
        String keyStorePassword = null;
        String defaultRedirectUrl = null;
        String userIDAttribute = null;
        Boolean useEncryption = null;
        Boolean createUser = null;
        Boolean addGroupMemberships = null;
        String groupMembershipAttribute = null;
        List<String> defaultGroups = null;
        String nameIdFormat = null;
        List<String> synchronizeAttributes = null;
        Boolean handleLogout = null;
        String logoutUrl = null;
        Integer clockTolerance = null;
        String digestMethod = null;
        String signatureMethod = null;
        String userIntermediatePath = null;
        List<String> propertylist = null;
        api.postSamlConfiguration().execute(r -> r.prettyPeek());
        // TODO: test validations
    }

}
