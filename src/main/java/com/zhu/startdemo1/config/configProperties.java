package com.zhu.startdemo1.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@ConfigurationProperties(prefix = "config")
@Data
public class configProperties {

    String str;

}
