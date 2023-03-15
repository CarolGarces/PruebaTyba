package utils;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.configuration.SystemPropertiesConfiguration;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;

public class PropertiesUtils {

    private static final EnvironmentVariables ENVIRONMENTS = new SystemPropertiesConfiguration(SystemEnvironmentVariables.createEnvironmentVariables()).getEnvironmentVariables();

    public static String getProperty(String key){
        return EnvironmentSpecificConfiguration.from(ENVIRONMENTS).getProperty(key);
    }
}
