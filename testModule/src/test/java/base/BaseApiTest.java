package base;

import baseApi.CustomLoggingFilter;
import io.restassured.builder.RequestSpecBuilder;
import org.openapitools.client.service.petStoreService.ApiClient;

import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;
import static io.restassured.config.RestAssuredConfig.config;
import static org.openapitools.client.service.petStoreService.GsonObjectMapper.gson;

public abstract class BaseApiTest {

    protected static ApiClient.Config configureApiClient(String baseUrl) {
        return ApiClient.Config.apiConfig().reqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())))
                        .addFilter(new CustomLoggingFilter())
                        .setBaseUri(baseUrl)
        );
    }

}
