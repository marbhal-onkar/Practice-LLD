package designpatterns.prototype;

public class Demo {

    public static void main(String[] args) throws CloneNotSupportedException {
        User u1 = new User("Onkar", "Marbhal", UserRole.ADMIN);

        UserRegistry registry = new UserRegistry();
        registry.addPrototype(UserRole.ADMIN, u1);

        User adminPrototype = registry.getPrototype(UserRole.ADMIN);
    }
}
