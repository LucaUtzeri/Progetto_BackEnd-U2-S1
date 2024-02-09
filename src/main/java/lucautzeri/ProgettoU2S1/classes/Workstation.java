package lucautzeri.ProgettoU2S1.classes;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lucautzeri.ProgettoU2S1.misc.Type;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table (name = "work_stations")
public class Workstation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String description;
    @Enumerated (EnumType.STRING)
    private Type type;
    private int maxOccupants;
    @ManyToOne
    private Building building;

    public Workstation(String description, Type type, int maxOccupants, Building building) {
        this.description = description;
        this.type = type;
        this.maxOccupants = maxOccupants;
        this.building = building;
    }
}
