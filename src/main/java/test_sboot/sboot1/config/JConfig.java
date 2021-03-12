package test_sboot.sboot1.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import test_sboot.sboot1.model.DevProfile;
import test_sboot.sboot1.model.ProductionProfile;
import test_sboot.sboot1.model.SystemProfile;

@Configuration
public class JConfig {
    @Bean(name="dev")
    @ConditionalOnProperty(prefix = "netology", name = "profile.dev", havingValue = "true")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean(name="prod")
    @ConditionalOnProperty(prefix = "netology", name = "profile.dev", havingValue = "false")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
