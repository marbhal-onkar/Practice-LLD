package builder;

public class Client {

    public static void main(String[] args) {
        Person person = new Person.Builder()
                .firstName("Onkar")
                .lastName("Marbhal")
                .description("Architect")
                .age(26)
                .build();
        System.out.println(person.toString());
    }
}
