package br.com.java.standard.log.javastandardlog;

import br.com.java.standard.log.javastandardlog.core.UseCase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class JavaStandardLogApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaStandardLogApplication.class, args);

        UseCase.useCaselogInfo();
        UseCase.useCaselogWarn();
        UseCase.useCaselogError();
    }
}
