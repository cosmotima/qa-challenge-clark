package config;

import lombok.Data;

@Data
public class WebConfig {
    private String appBaseUrl;
    private WebDriverFactory.Browser browser;
}
