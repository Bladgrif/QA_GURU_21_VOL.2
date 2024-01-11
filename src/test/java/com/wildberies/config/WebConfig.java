package com.wildberies.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})

public interface WebConfig extends Config {
    @Key("baseUrl")
    @DefaultValue("https://www.bcc.kz/")
    String baseUrl();

    @Key("browser")
    @DefaultValue("CHROME")
    String browser();

    @Key("browserSize")
    @DefaultValue("2560x1440")
    String browserSize();

    @Key("browserVersion")
    @DefaultValue("100.0")
    String browserVersion();

    @Key("remoteUrl")
    String remoteUrl();
}