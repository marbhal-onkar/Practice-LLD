package designpatterns.builder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *  Normal class with getter and constructor
 */
@Getter
@AllArgsConstructor
@ToString
public class Person {
    private final String firstName;
    private final String lastName;
    private final String description;
    private final int age;
}
