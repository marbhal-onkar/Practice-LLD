package builder;

public class Client {

    public static void main(String[] args) {
        Person person = Person.builder()
                .firstName("Onkar")
                .lastName("Marbhal")
                .description("Architect")
                .age(26)
                .build();
        System.out.println(person.toString());
    }
}
