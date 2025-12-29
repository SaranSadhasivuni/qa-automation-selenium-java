package com.qa.automation.qa_framework.config;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    public static Properties getProperties() {
        try {
            properties = new Properties();
            FileInputStream fis =
                    new FileInputStream("src/main/resources/config.properties");
            properties.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return properties;
    }
}