package org.zsz.learnspring.basic_di.c_value_spel.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Linus Zhang
 * @create 2022-11-02 23:32
 */
@Configuration
@ComponentScan("org.zsz.learnspring.basic_di.c_value_spel.bean")
@PropertySource("classpath:basic_di/value/red.properties")
public class InjectValueConfiguration {

}
