package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingServiceImpl;


/**
 * Created by jt on 5/24/17.
 * Example of a class of what not to do
 */

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
