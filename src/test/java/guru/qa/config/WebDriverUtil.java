package guru.qa.config;

import com.codeborne.selenide.Configuration;

public class WebDriverUtil {

    static void configBrowser() {
        Configuration.browser = WebDriverProvider.config.browser();
        Configuration.browserVersion = WebDriverProvider.config.browserVersion();

        if (WebDriverProvider.config.remote() != null) {
            Configuration.remote = WebDriverProvider.config.remote();
        }
    }
}
