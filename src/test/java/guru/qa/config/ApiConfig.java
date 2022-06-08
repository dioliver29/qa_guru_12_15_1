package guru.qa.config;

import org.aeonbits.owner.Config;


public interface ApiConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("http://github.com")
    String baseUrl();

    @Key("token")
    String token();

}
