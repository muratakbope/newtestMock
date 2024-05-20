package kz.singularity.testmock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class TestMockApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestMockApplication.class, args);
    }

}
