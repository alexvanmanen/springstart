package nl.springstart.practice;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Person {
    @javax.persistence.Id
    private Long id;
    private String firstName;
    private String lastName;


}


