package exercisms.dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription){
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("M/dd/yyyy HH:mm:ss");
        LocalDateTime d01 = LocalDateTime.parse(appointmentDateDescription, parser);
        return d01;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        if (appointmentDate.isBefore(LocalDateTime.now())) {
            return true;
        }
        return false;
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        if(hour >=12 && hour < 18) {
            return true;
        }
        return false;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        throw new UnsupportedOperationException("Please implement the AppointmentScheduler.getDescription() method");
    }

    public LocalDate getAnniversaryDate() {
        throw new UnsupportedOperationException("Please implement the AppointmentScheduler.getAnniversaryDate() method");
    }
}
