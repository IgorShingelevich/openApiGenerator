package base;

import io.restassured.builder.RequestSpecBuilder;
import org.openapitools.client.api.petStoreApi.PetApi;
import org.openapitools.client.api.petStoreApi.StoreApi;
import org.openapitools.client.api.petStoreApi.UserApi;
import org.openapitools.client.service.petStoreService.ApiClient;

import static io.restassured.RestAssured.config;
import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;
import static org.openapitools.client.service.petStoreService.GsonObjectMapper.gson;

public abstract class BasePetstoreApiTest extends BaseApiTest {

    private static final String BASE_URL = "https://petstore.swagger.io/v2";
    private static final ApiClient PET_CLIENT = ApiClient.api(configurePetApiClient(BASE_URL));

    protected final PetApi petApi = PET_CLIENT.pet();
    protected final StoreApi storeApi = PET_CLIENT.store();
    protected final UserApi userApi = PET_CLIENT.user();



    protected static ApiClient.Config configurePetApiClient(String baseUrl) {
        return ApiClient.Config.apiConfig().reqSpecSupplier(
                () -> new RequestSpecBuilder()
                        .setConfig(config().objectMapperConfig(objectMapperConfig().defaultObjectMapper(gson())))
                        .addFilter(new CustomLoggingFilter())
                        .setBaseUri(baseUrl)
        );
    }
}
