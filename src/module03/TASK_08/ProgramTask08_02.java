package module03.TASK_08;

import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.*;

public class ProgramTask08_02 {
    public static void main(String[] args) {
        Map<Month, DayOfWeek> days = getDaysAtEndOfEachMonthFromYear(1945);
        System.out.println("last days in 1945 = " + days);
    }

    public static Map<Month, DayOfWeek> getDaysAtEndOfEachMonthFromYear(int year) {
        Map<Month, DayOfWeek> result = new LinkedHashMap<>();
        LocalDate currentDate = LocalDate.of(year, Month.JANUARY, 1);
        for (int i = 0; i < 12; i++) {
            result.put(currentDate.getMonth(), currentDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek());
            currentDate = currentDate.plusMonths(1);
        }
        return result;
    }
}


