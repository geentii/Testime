package week5_Coding;

import java.time.LocalDate;
import java.util.Arrays;

public class WarmUpTask01 {
    public static void main(String[] args) {

        LocalDate[] dates = new LocalDate[10];

        for (int i = 0; i < dates.length; i++) {
            dates[i] = LocalDate.now().plusDays(i);
        }

        System.out.println(Arrays.toString(dates));

    }
}
