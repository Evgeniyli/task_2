package com.testframework.model.providers;
import com.testframework.core.parser.JSONParserUtils;
import com.testframework.core.report.TestReporter;

import java.util.Map;
import java.util.Objects;

public class DataProviders {
    private static final String BASE_PATH = "src/main/resources/test_data_web_elements";
    private static Map<String, Map<String, String>> elementsStore = null;
    public static final String ENV = System.getProperty("env");
    private final static String JSON_FILE_NAME = String.format("%s/data_web_elements.json", BASE_PATH);
    public static final String ENV_BASE_CONFIG = String.format("%s/%s/base.json", BASE_PATH,  ENV);

    /**
     * Get value by keys for new UI
     *
     * @param pageName    JSON object
     * @param elementName JSON object field
     * @return value of the specified parameters
     */
    public static String getValue(String pageName, String elementName) {
        if (elementsStore == null) {
            elementsStore = JSONParserUtils.parseJSON(JSON_FILE_NAME);
        }
        return Objects.requireNonNull(elementsStore).get(pageName).get(elementName);
    }

    /**
     * Get value by keys for specified environment
     *
     * @param pageName    JSON object
     * @param elementName JSON object field
     * @return value of the specified parameters
     */
    public static String getEnvValue(String pageName, String elementName) {
        String value;
        var json = Objects.requireNonNull(JSONParserUtils.parseJSON(ENV_BASE_CONFIG));
        value = json
                .get(pageName)
                .get(elementName);
        if (value == null) {
            throw new NullPointerException(String.format("%s elementName is not exist in pageName=%s", elementName, pageName));
        }
        if (value.equalsIgnoreCase("null")) {
            TestReporter.logger.error("value is null");
            return null;
        }
        return value;
    }
}
