package com.zhu.startdemo1.autoConfigure;

import com.zhu.startdemo1.config.configProperties;
import com.zhu.startdemo1.service.start;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(start.class)
@EnableConfigurationProperties(configProperties.class)
public class StarterAutoConfigure {



    @Autowired
    private configProperties properties;

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(prefix = "config", value = "enabled", havingValue = "true")
    start start (){
        return new start(properties.getStr());
    }
}
