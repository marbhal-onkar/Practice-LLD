package builder;

import lombok.*;

/**
 * Normal class with getter and constructor
 */
@Getter
@ToString
@Builder
public class Person {
    private String firstName;
    private String lastName;
    private String description;
    private int age;
}
