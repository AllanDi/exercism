package exercisms.dateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class AppointmentScheduler {

    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();
        LocalDate d04 = LocalDate.parse("2023-12-14");
        LocalDateTime d05 = LocalDateTime.parse("2023-12-14T12:58:00");
        Instant d06 = Instant.parse("2023-12-14T12:58:00Z");
        Instant d07 = Instant.parse("2023-12-14T12:58:00-03:00");

        LocalDate d08 = LocalDate.parse("20/07/2023", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2023 01:30", fmt2);

        LocalDate d10 = LocalDate.of(2023, 12, 15);
        LocalDateTime d11 = LocalDateTime.of(2023, 12, 15, 10, 12);


        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);

        LocalDate d12 = LocalDate.parse("2023-12-14");
        LocalDateTime d13 = LocalDateTime.parse("2023-12-14T12:58:00");
        Instant d14 = Instant.parse("2023-12-14T12:58:00Z");

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("d12 sem formatação = " + d12);
        System.out.println("d12 formatada = " + d12.format(fmt3));
        System.out.println("d12 formatada = " + fmt3.format(d12));
        System.out.println("d12 formatada = " + d12.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("d13 sem formatação = " + d13);
        System.out.println("d13 formatada = " + d13.format(fmt3));
        System.out.println("d13 formatada = " + d13.format(fmt4));
        System.out.println("d13 formatada = " + fmt4.format(d13));
        System.out.println("d13 formatada = " + d13.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));

        System.out.println("d14 sem formatação = " + d14);
        System.out.println("d14 formatada = " + fmt5.format(d14));


        AppointmentScheduler scheduler = new AppointmentScheduler();

        System.out.println(scheduler.schedule("7/25/2019 13:45:00"));


    }
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
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a", Locale.ENGLISH);
        return "You have an appointment on " + appointmentDate.format(formatter);
    }

    public LocalDate getAnniversaryDate() {
        LocalDate anniversaryDate = LocalDate.of(2023, 9, 15);
        return anniversaryDate;
    }

//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.time.format.TextStyle;
//import java.util.Locale;
//
//    class AppointmentScheduler {
//
//        public LocalDateTime schedule(String appointmentDateDescription) {
//            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
//            return LocalDateTime.parse(appointmentDateDescription, dateFormatter);
//        }
//
//        public boolean hasPassed(LocalDateTime appointmentDate) {
//            return appointmentDate.isBefore(LocalDateTime.now());
//        }
//
//        public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
//            return appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18;
//        }
//
//        public String getDescription(LocalDateTime appointmentDate) {
//            return String.format("You have an appointment on %s, %s %s, %d, at %s.",
//                    appointmentDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH),
//                    appointmentDate.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH),
//                    appointmentDate.getDayOfMonth(), appointmentDate.getYear(),
//                    appointmentDate.format(DateTimeFormatter.ofPattern("h:mm a", Locale.ENGLISH)));
//        }
//
//        public LocalDate getAnniversaryDate() {
//            return LocalDate.of(2023, 9, 15);
//        }
//    }
}
