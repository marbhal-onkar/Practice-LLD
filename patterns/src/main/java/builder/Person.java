package builder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Normal class with getter and constructor
 */
@Getter
@ToString
public class Person {
    private String firstName;
    private String lastName;
    private String description;
    private int age;

    private Person() {
    }

    private Person(Person person) {
        this.firstName = person.firstName;
        this.lastName = person.lastName;
        this.description = person.description;
        this.age = person.age;
    }

    public static class Builder {
        private final Person person;

        public Builder() {
            person = new Person();
        }

        public Builder firstName(String firstName) {
            person.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            person.lastName = lastName;
            return this;
        }

        public Builder description(String description) {
            person.description = description;
            return this;
        }

        public Builder age(int age) {
            person.age = age;
            return this;
        }

        public Person build() {
            return new Person(person);
        }
    }
}
