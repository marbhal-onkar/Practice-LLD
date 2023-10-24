package designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class UserRegistry {
    private final Map<UserRole, User> registry = new HashMap<>();

    public void addPrototype(UserRole role, User user){
        registry.put(role, user);
    }

    /**
     * cloning the object
     */
    public User getPrototype(UserRole role) throws CloneNotSupportedException {
        return registry.get(role).clone();
    }
}
