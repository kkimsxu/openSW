package _03.Xmas;

import java.time.LocalDate;
import java.time.Period;

public class Model {
    public String christmas() {
        LocalDate today = LocalDate.now();
        LocalDate xmas = LocalDate.of(2023,12,25);
        Period period = Period.between(today, xmas);
        int month = period.getMonths();
        int day = period.getDays();
        return "올해 크리스마스까지 " + month + "달하고 " + day + "일 남았다!";
    }
}
