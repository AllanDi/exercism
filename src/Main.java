import exercisms.Interfaces.ExperimentalRemoteControlCar;
import exercisms.constructors.NeedForSpeed;
import exercisms.dateTime.AppointmentScheduler;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        ExperimentalRemoteControlCar experimentalRemoteControlCar = new ExperimentalRemoteControlCar();

        System.out.println(experimentalRemoteControlCar);
        experimentalRemoteControlCar.drive();
        System.out.println(experimentalRemoteControlCar.getDistanceTravelled());


    }
}