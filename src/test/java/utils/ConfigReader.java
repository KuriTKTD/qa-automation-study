package utils;

import java.util.Properties;
import java.io.InputStream;

public class ConfigReader {

    private static final Properties properties = new Properties();

    static {
        try{
            InputStream input = ConfigReader.class
                    .getClassLoader()
                    .getResourceAsStream("config.properties");

            properties.load(input);
        } catch (Exception e) {
            throw new RuntimeException("Could not load config.properties", e);
        }

    }

    public static String get(String key) {
        return properties.getProperty(key);
    }


}

