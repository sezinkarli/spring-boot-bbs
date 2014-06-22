package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author sezin karli (skarligmail.com)
 * @since 3/19/14 9:26 AM
 *        User: Sezin Karli
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class SpringBootBBS {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootBBS.class, args);
    }
}
