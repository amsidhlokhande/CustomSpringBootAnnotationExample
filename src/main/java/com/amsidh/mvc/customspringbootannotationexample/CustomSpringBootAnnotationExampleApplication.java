package com.amsidh.mvc.customspringbootannotationexample;

import com.amsidh.mvc.customspringbootannotationexample.service.MyService;
import com.amsidh.mvc.customspringbootannotationexample.service.MyServiceImpl;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;

@Data
@RequiredArgsConstructor
@SpringBootApplication
@ComponentScan(value = "com.amsidh.mvc.customspringbootannotationexample.service", nameGenerator = AnnotationBeanNameGenerator.class,
scopeResolver = AnnotationScopeMetadataResolver.class, scopedProxy = ScopedProxyMode.DEFAULT,
resourcePattern = "**/*Impl.class", lazyInit = true)
public class CustomSpringBootAnnotationExampleApplication implements CommandLineRunner {

    private final MyService myService;

    public static void main(String[] args) {
        SpringApplication.run(CustomSpringBootAnnotationExampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        myService.show("!!!!!!!!!!!Hello World!!!!!!!!!");
    }
}
