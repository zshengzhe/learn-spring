package org.zsz.learnspring.lifecycle.b_jsr250.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zsz.learnspring.lifecycle.b_jsr250.bean.Pen2;

@Configuration
public class Jsr250Configuration {

    @Bean(initMethod = "open", destroyMethod = "close")
    public Pen2 pen() {
        return new Pen2();
    }
    
}
