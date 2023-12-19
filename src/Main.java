import exercisms.constructors.NeedForSpeed;
import exercisms.dateTime.AppointmentScheduler;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        NeedForSpeed car = new NeedForSpeed(9,50);
        System.out.println(car.distanceDriven());
        car.drive();
        System.out.println(car.distanceDriven());
        car.drive();
        System.out.println(car.distanceDriven());
        car.drive();
        System.out.println(car.distanceDriven());
        car.drive();
        System.out.println(car.distanceDriven());
        System.out.println( NeedForSpeed.nitro());


    }
}