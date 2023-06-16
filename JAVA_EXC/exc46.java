package JAVA_EXC;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class exc46 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSS", new Locale("pt", "BR"));
        String formattedDateTime = now.format(formatter);

        System.out.println("Agora: " + formattedDateTime);

    }
}
