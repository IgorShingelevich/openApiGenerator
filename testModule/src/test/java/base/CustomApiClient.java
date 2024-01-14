package base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.function.Supplier;

public class CustomApiClient<T> {
    private T apiInstance;
    private URL baseUrl;
    private Class<T> apiClass;
    private Supplier<T> apiSupplier;

    public CustomApiClient(String baseUrl, Class<T> apiClass, Supplier<T> apiSupplier) throws MalformedURLException {
        this.baseUrl = new URL(baseUrl);
        this.apiClass = apiClass;
        this.apiSupplier = apiSupplier;
        initializeClient();
    }

    private void initializeClient() {
        // Initialize the client with baseUrl, and other common configurations
        apiInstance = apiSupplier.get();
    }

    public T getApi() {
        return apiInstance;
    }
}

