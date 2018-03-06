package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bean.ConfigBean;

@Configuration
public class JavaConfig {

    @Bean(name="configBean")
    public ConfigBean helloWorld() {
        return new ConfigBean();
    }

}
