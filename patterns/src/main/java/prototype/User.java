package prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class User implements Cloneable{
    private String firstName;
    private String lastName;
    private UserRole role;

    @Override
    public User clone() throws CloneNotSupportedException {
        return new User(firstName, lastName, role);
    }
}
