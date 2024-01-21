package utils;

import io.restassured.path.json.JsonPath;
import io.restassured.path.json.exception.JsonPathException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.List;

import static io.qameta.allure.Allure.step;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;

public class JsonUtils {

    public static JsonPath readFileToJsonPath(String filePath) {
        return step("Reading JsonPath from file: " + filePath, () -> {
            try {
                String fileContent = new String(Files.readAllBytes(Paths.get(filePath)));
                return new JsonPath(fileContent);
            } catch (NoSuchFileException e) {
                throw new RuntimeException("The specified file was not found: " + filePath, e);
            } catch (IOException e) {
                throw new RuntimeException("Error reading from file: " + filePath, e);
            }
        });
    }

    public static <T> T readObjectFromJsonFile(String filePath, String jsonPath, Class<T> type) {
        return step("Getting DTO from JSON object at path: " + jsonPath, () -> {
            try {
                JsonPath jp = readFileToJsonPath(filePath);
                T result = jp.getObject(jsonPath, type);
                assertThat("Resulted object is not an instance of " + type.getName(), result, instanceOf(type));
                return result;
            } catch (JsonPathException e) {
                throw new RuntimeException("Error parsing JSON path: " + jsonPath, e);
            } catch (AssertionError e) {
                throw new RuntimeException("Assertion failed: " + e.getMessage(), e);
            }
        });
    }

    public static <T> List<T> readListFromJsonFile(String filePath, String jsonPath, Class<T> type) {
        return step("Getting the list of DTOs from JSON at path: " + jsonPath, () -> {
            try {
                JsonPath jp = readFileToJsonPath(filePath);
                List<T> resultList = jp.getList(jsonPath, type);
                resultList.forEach(item -> assertThat("Item in the list is not an instance of " + type.getName(), item, instanceOf(type)));
                return resultList;
            } catch (JsonPathException e) {
                throw new RuntimeException("Error parsing JSON path for list: " + jsonPath, e);
            } catch (AssertionError e) {
                throw new RuntimeException("Assertion failed: " + e.getMessage(), e);
            }
        });
    }
}
