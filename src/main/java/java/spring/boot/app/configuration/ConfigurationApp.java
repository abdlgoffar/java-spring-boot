package java.spring.boot.app.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//contoh cara memasukkan bean atau component ke dalam container spring boot application
@Configuration
@ComponentScan(
        basePackages = {
                "java.spring.boot.app.components"
        }
)
public class ConfigurationApp {
}
