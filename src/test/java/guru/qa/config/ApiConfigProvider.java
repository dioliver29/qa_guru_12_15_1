package guru.qa.config;

import org.aeonbits.owner.ConfigFactory;

public class ApiConfigProvider {

    public static ApiConfig config = ConfigFactory.create(ApiConfig.class, System.getProperties());

}
