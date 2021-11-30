package nl.springstart.practice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/person/get")
    public Person getPerson() {
        return new Person(1L, "Alex", "van Manen");
    }
}
