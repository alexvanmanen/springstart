package nl.springstart.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import lombok.Getter;
//import lombok.Setter;

//@Getter
//@Setter
//@ToString
@Data //for setters en getters en tostring
@AllArgsConstructor // geen constructor meer nodig
@NoArgsConstructor // constructor zonder argumenten okay
public class Person {
    private String firstName;
    private String lastName;
    private String favoKleur;
}
