package lucautzeri.ProgettoU2S1.classes;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Appointment {
    private User user;
    private LocalDate startDate;
    private Workstation workstation;

    public Appointment(User user, LocalDate startDate, Workstation workstation) {
        this.user = user;
        this.startDate = startDate;
        this.workstation = workstation;
    }
}
