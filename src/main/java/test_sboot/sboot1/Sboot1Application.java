package test_sboot.sboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "test_sboot")
public class Sboot1Application {

    public static void main(String[] args) {
        SpringApplication.run(Sboot1Application.class, args);
    }

}
