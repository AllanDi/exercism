package exercisms.dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {

        LocalDateTime.parse(appointmentDateDescription);


    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        throw new UnsupportedOperationException("Please implement the AppointmentScheduler.hasPassed() method");
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        throw new UnsupportedOperationException("Please implement the AppointmentScheduler.isAfternoonAppointment() method");
    }

    public String getDescription(LocalDateTime appointmentDate) {
        throw new UnsupportedOperationException("Please implement the AppointmentScheduler.getDescription() method");
    }

    public LocalDate getAnniversaryDate() {
        throw new UnsupportedOperationException("Please implement the AppointmentScheduler.getAnniversaryDate() method");
    }
}