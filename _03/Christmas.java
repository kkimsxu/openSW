package _03;

import java.time.LocalDate;
import java.time.Period;

public class Christmas {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate xmas = LocalDate.of(2023,12,25);
        Period period = Period.between(today, xmas);
        int month = period.getMonths();
        int day = period.getDays();
        System.out.println("올해 크리스마스까지 " + month + "달하고 " + day + "일 남았다!");

    }
}
