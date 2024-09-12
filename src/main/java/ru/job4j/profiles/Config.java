package ru.job4j.profiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan(basePackages = "ru.job4j.profiles")
public class Config {
    @Bean
    @Profile("devAlfa")
    public Dog getAlfaDog() {
        return new Dog("AlfaDog");
    }

    @Bean(name = "SecondDog")
    @Profile("devSecond")
    public Dog getDog() {
        return new Dog("DogSecond");
    }

    @Bean
    @Profile("devDog")
    public Dog someDog() {
        return new Dog("Dog");
    }
}
