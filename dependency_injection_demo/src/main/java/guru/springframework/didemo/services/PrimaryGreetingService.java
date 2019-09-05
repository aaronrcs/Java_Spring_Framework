package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//Using @Service will tell the Spring context to bring this class as a Spring Bean
@Service
@Primary
//"default means we want this bean to be the default bean
// It will also be active when theres other profiles are not active
@Profile({"eng", "default"})
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from Primary service";
    }
}
