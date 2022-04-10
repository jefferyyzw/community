package com.nowcoder.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.logging.SimpleFormatter;

/**
 * @author yzw
 * @version 1.0
 */
@Configuration
public class AlphaConfig {
    @Bean
    public SimpleDateFormat simpleFormatter() {
        return new SimpleDateFormat(("yyyy-MM-dd HH:mm:ss"));

    }

}
