import io.restassured.response.Response;
import org.junit.Test;
import org.openapitools.client.api.petStoreApi.PetApi;
import org.openapitools.client.model.petStoreModel.Pet;
import org.openapitools.client.service.petStoreService.ApiClient;

import java.util.function.Function;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertNotNull;

public class MyTest {

    @Test
    public void test() {
        System.out.println("test");
    }

    @Test
    public void getPetByIdTest() {
        // Configure and create an instance of ApiClient
        ApiClient.Config config = ApiClient.Config.apiConfig();
        ApiClient apiClient = ApiClient.api(config);

        // Use the PetApi from the ApiClient
        PetApi petApi = apiClient.pet();

        // Adjust the response processing function to return a Response
        Function<Response, Response> responseFunction = response -> response.then()
                .statusCode(200)
                .extract()
                .response(); // Adjust here to return a Response object

        // Execute the getPetById operation and assert the response
        Pet pet = petApi.getPetById()
                .petIdPath(1L)
                .executeAs(responseFunction);

        assertNotNull("Retrieved pet should not be null", pet);
        System.out.println("Retrieved pet: " + pet);
    }


    private static final String BASE_URL = "https://petstore.swagger.io/v2";
    @Test
    public void getPetByIdSimpleTest() {
        Pet pet = given()
                .baseUri(BASE_URL)
                .when()
                .get("/pet/{petId}", 1L)
                .then()
                .statusCode(200)
                .assertThat().body(notNullValue())
                .extract()
                .as(Pet.class);

        System.out.println("Retrieved pet: " + pet);

        //do smth here
    }
}
