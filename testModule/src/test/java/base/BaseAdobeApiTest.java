package base;


import io.restassured.builder.RequestSpecBuilder;
import org.openapitools.client.api.adobe.*;
import org.openapitools.client.service.adobeService.ApiClient;

import static io.restassured.RestAssured.config;
import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;
import static org.openapitools.client.service.adobeService.GsonObjectMapper.gson;

public class BaseAdobeApiTest extends BaseApiTest{
    private static final String BASE_URL = "https://api.apis.guru";
    private static final ApiClient ADOBE_CLIENT = ApiClient.api(configureAdobeApiClient(BASE_URL));

    protected final ConsoleApi consoleApi = ADOBE_CLIENT.console();
    protected final CqApi cqApi = ADOBE_CLIENT.cq();
    protected final CrxApi crxApi = ADOBE_CLIENT.crx();
    protected final CustomApi customApi = ADOBE_CLIENT.custom();
    protected final GraniteApi graniteApi = ADOBE_CLIENT.granite();
    protected final SlingApi slingApi = ADOBE_CLIENT.sling();


    protected static ApiClient.Config configureAdobeApiClient(String baseUrl) {
        return ApiClient.Config.apiConfig().reqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())))
                        .addFilter(new CustomLoggingFilter())
                        .setBaseUri(baseUrl)
        );
    }
}
