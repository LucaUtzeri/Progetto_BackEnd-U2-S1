package lucautzeri.ProgettoU2S1.classes;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table (name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String name;
    private String lastName;
    private String email;

    public User(String username, String name, String lastName, String email) {
        this.username = username;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }
}
