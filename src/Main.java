import exercisms.dateTime.AppointmentScheduler;
import exercisms.nullability.Badge;

import java.time.*;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2007,12,13);
        LocalDate date1 = LocalDate.of(2007,12,14);
        LocalDate date2 = LocalDate.of(2007,12,15);


        System.out.println(date.toString());
        System.out.println(LocalDate.now());



        System.out.println(date1.isBefore(date2));
        System.out.println(date2.isBefore(date1));
        System.out.println(date.getDayOfMonth());
        System.out.println(date);

        AppointmentScheduler scheduler = new AppointmentScheduler();
        scheduler.schedule("7/25/2019 13:45:00");





    }
}