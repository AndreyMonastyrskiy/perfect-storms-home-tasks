package module03.TASK_08;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ProgramTask08_01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int currentYear = LocalDate.now().getYear();
        int daysCount = 0;
        do {
            System.out.println(DateTimeFormatter.ofPattern("MMMM d", Locale.US).format(now));
            now = now.plusDays(1);
            daysCount++;
        } while (now.getYear() == currentYear);
        System.out.println(daysCount);
    }

}
