package guru.qa.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${webConfig}.properties"
})

public interface WebDriverConfig extends Config {

    @Key("browser")
    @DefaultValue("CHROME")
    String browser();

    @Key("browserVersion")
    @DefaultValue("91.0")
    String browserVersion();

    @Key("remote")
    String remote();


}
