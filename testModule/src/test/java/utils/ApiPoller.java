package utils;

import io.restassured.response.Response;
import static org.assertj.core.api.Assertions.assertThat;


import java.util.function.Predicate;
import java.util.function.Supplier;

public class ApiPoller {

    /**
     * Polls an API call and checks for a 200 status code and a condition on the response body.
     *
     * @param apiCall   The API call to execute.
     * @param dtoClass  The class of the DTO to map the response to.
     * @param condition The condition to check on the DTO.
     * @param <T>       The type of the DTO.
     * @return The DTO if conditions are met, or null if not.
     */
    public static <T> T pollApiCall(Supplier<Response> apiCall,
                                    Class<T> dtoClass,
                                    Predicate<T> condition) {
        final int maxAttempts = 3; // Hardcoded number of attempts
        final long delayInMillis = 1000; // Hardcoded delay of 1 second
        T dto = null;

        Response response = null;
        for (int attempt = 0; attempt < maxAttempts; attempt++) {
            try {
                Thread.sleep(delayInMillis);

                response = apiCall.get();
                if (response.getStatusCode() == 200) {
                    dto = response.then().extract().as(dtoClass);
                    if (condition.test(dto)) {
                        break; // Exit loop if condition is met
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException("Polling interrupted", e);
            }
        }

        // Perform assertions before returning the DTO
        assertThat(dto)
                .as("DTO should not be null after successful API call")
                .isNotNull();

        assertThat(response.getStatusCode())
                .as("Status code should be 200 after " + maxAttempts + " tries")
                .isEqualTo(200);

        return dto;
    }


    public static <T> T pollApiCall200(Supplier<Response> apiCall,
                                    Class<T> dtoClass) {
        final int maxAttempts = 3; // Hardcoded number of attempts
        final long delayInMillis = 1000; // Hardcoded delay of 1 second
        T dto = null;

        for (int attempt = 0; attempt < maxAttempts; attempt++) {
            try {
                Thread.sleep(delayInMillis);

                Response response = apiCall.get();
                if (response.getStatusCode() == 200) {
                    dto = response.then().extract().as(dtoClass);
                    break; // Exit loop if status code is 200
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException("Polling interrupted", e);
            }
        }

        // Perform assertions before returning the DTO
        assertThat(dto)
                .as("DTO should not be null after successful API call")
                .isNotNull();

        return dto;
    }
}
