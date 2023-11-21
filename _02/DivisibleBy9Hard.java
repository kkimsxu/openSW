package _02;

import javax.swing.*;

public class DivisibleBy9Hard {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("점수를 주세요.");
        int s = Math.abs(Integer.parseInt(input));
        int abs = (s%10) + (s/10%10) + (s/100%10) + (s/1000%10) + (s/10000%10);
        boolean d = abs % 9 == 0;
        JOptionPane.showMessageDialog(null, "정수 " + s + "는 9로 나누어 떨어지나? " + d);
    }
}
