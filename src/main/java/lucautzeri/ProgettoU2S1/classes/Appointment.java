package lucautzeri.ProgettoU2S1.classes;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "appointments")
public class Appointment {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private User user;
    private LocalDate startDate;
    @ManyToOne
    private Workstation workstation;

    public Appointment(User user, LocalDate startDate, Workstation workstation) {
        this.user = user;
        this.startDate = startDate;
        this.workstation = workstation;
    }
}
