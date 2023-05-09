package tn.ondev.configuration;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix = "foo-config")
public class FooConfig {
    private String name;
    private List<String> aliases;
    private FooConfig.Duyo duyo;
    @Data
    private static class Duyo{
    	private String name;
    	private String prename;
    }
}