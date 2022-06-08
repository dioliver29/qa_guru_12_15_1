package guru.qa.config;

import org.aeonbits.owner.ConfigFactory;

public class WebDriverProvider {

        public static WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

}
