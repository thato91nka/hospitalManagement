package za.co.thato.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = {"za.co.thato"})
@ComponentScan(basePackages = {"za.co.thato"})
@EntityScan(basePackages = {"za.co.thato"})
public class PersistenceContext {

}