package client.api.petStoreApi;

import base.BaseApiTest;
import org.openapitools.client.api.petStoreApi.PetApi;
import org.openapitools.client.api.petStoreApi.StoreApi;
import org.openapitools.client.api.petStoreApi.UserApi;
import org.openapitools.client.service.petStoreService.ApiClient;

public abstract class BasePetApiTest extends BaseApiTest {

    private static final String BASE_URL = "https://petstore.swagger.io/v2";
    private static final ApiClient API_CLIENT = ApiClient.api(configureApiClient(BASE_URL));

    protected final PetApi petApi = API_CLIENT.pet();
    protected final StoreApi storeApi = API_CLIENT.store();
    protected final UserApi userApi = API_CLIENT.user();

}
