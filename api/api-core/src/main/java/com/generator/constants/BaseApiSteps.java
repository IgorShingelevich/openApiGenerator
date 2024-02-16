package com.generator.constants;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration;

import java.util.List;
import java.util.function.Function;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class BaseApiSteps {

    protected static Function<Response, Response> checkSuccessStatusCode() {
        return r -> r.then()
                .assertThat()
                .statusCode(200)
                .extract()
                .response()
                .prettyPeek();
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


}
