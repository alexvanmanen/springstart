package nl.springstart.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/person/get/{id}")
    public Optional<Person> getPerson(@PathVariable int id) {
        return personRepository.findById(id);
        //return new Person(1L, "Alex", "van Manen");
    }
}
