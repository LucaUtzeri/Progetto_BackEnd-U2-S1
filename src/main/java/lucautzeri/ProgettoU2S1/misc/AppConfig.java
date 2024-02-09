package lucautzeri.ProgettoU2S1.misc;

import com.github.javafaker.Faker;
import lucautzeri.ProgettoU2S1.classes.Building;
import lucautzeri.ProgettoU2S1.classes.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    private Faker faker = new Faker();

    @Bean
    public User user1(){
        return new User(faker.name().username(),faker.name().name(), faker.name().lastName(), faker.internet().emailAddress());
    }

    @Bean
    public Building building1(){
        return new Building(faker.company().industry(), faker.address().fullAddress(), faker.address().city());
    }
}
