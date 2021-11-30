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
//		Person person = new Person();
//		person.setFirstName("Alex");
//		person.setLastName("van Manen");
//		Person person = new Person("Henk", "de Tester");

		return new Person("Henk", "de Tester");
	}


}
