            // 62. dates and times

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        Instant instant = Instant.now();

        System.out.println(instant);

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);

        System.out.println(newDateTime);

        LocalDateTime date1 = LocalDateTime.of(2025, 12, 25, 12, 0, 0);
        LocalDateTime date2 = LocalDateTime.of(2026, 1, 1, 0, 0, 0);

        System.out.println(date1);

        if (date1.isBefore(date2)){
            System.out.println(date1 + " is earlier than " + date2);
        }
        else if (date1.isAfter(date2)){
            System.out.println(date1 + " is later than " + date2);
        }
        else if(date1.isEqual(date2)){
            System.out.println(date1 + " is equal to " + date2);
        }
    }
}
