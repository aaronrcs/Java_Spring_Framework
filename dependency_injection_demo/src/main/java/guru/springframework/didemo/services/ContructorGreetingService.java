package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ContructorGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "I was injected via Contructor!!";
    }
}
