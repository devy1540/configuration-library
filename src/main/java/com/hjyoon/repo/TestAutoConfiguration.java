package com.hjyoon.repo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value = {TestProperties.class})
public class TestAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public TestUtils testUtils(TestProperties testProperties) {

        return new TestUtils(testProperties.getClient(), testProperties.getPublicKey());
    }
}
