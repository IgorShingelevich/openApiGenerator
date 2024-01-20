package base;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration;
import org.json.JSONException;
import org.json.JSONObject;
import org.openapitools.client.service.petStoreService.ApiClient;
import org.skyscreamer.jsonassert.JSONAssert;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.config;
import static io.restassured.config.ObjectMapperConfig.objectMapperConfig;
import static org.assertj.core.api.Assertions.assertThat;
import static org.openapitools.client.service.petStoreService.GsonObjectMapper.gson;

public abstract class BaseApiTest  extends BaseTest {


    protected void assertResponsePartialNoATExcludeFields(JsonPath expectedJsonPath, JsonPath actualJsonPath, List<String> excludedFields) {
        Object expectedResponse = expectedJsonPath.get();
        Object actualResponse = actualJsonPath.get();
        RecursiveComparisonConfiguration.Builder builder = RecursiveComparisonConfiguration.builder();
        // Condition 1: Ignore fields ending with specific patterns
        builder = builder.withIgnoredFieldsMatchingRegexes(".*(At|Ended|Started|countNotReadNotification)");
        // Condition 2: Handling excluded fields
        if (!excludedFields.isEmpty()) {
            builder = builder.withIgnoredFields(excludedFields.toArray(new String[0]));
        }
        RecursiveComparisonConfiguration configuration = builder.build();
        assertThat(actualResponse)
                .usingRecursiveComparison(configuration)
                .isEqualTo(expectedResponse);
    }

    public static <T> void assertDtoPartial(T actualDto, T expectedDto, String fieldToExclude) {
        RecursiveComparisonConfiguration comparisonConfiguration = RecursiveComparisonConfiguration.builder()
                .withIgnoredFields(fieldToExclude)
                .build();

        assertThat(actualDto)
                .usingRecursiveComparison(comparisonConfiguration)
                .isEqualTo(expectedDto);
    }

    public static <T> void assertDtoPartial(T actualDto, T expectedDto, List<String> fieldsToExclude) {
        RecursiveComparisonConfiguration comparisonConfiguration = RecursiveComparisonConfiguration.builder()
                .withIgnoredFields(fieldsToExclude.toArray(new String[0]))

                .build();
        Assertions.assertThat(actualDto)
                .usingRecursiveComparison(comparisonConfiguration)
                .isEqualTo(expectedDto);
    }




}
