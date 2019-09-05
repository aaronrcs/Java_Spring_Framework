package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//Using @Service will tell the Spring context to bring this class as a Spring Bean
@Service
@Primary
@Profile("eng")
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from Primary service";
    }
}
