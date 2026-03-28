package com.sistemas;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "app")
public class AppProperties {
    private String semester;

    @Data
    public static class Feature {
        private boolean enabled;
    }
}
