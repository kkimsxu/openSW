package _02;

import javax.swing.*;

public class DivisibleBy9 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("점수를 주세요.");
        int s = Integer.parseInt(input);
        boolean d = s % 9 == 0;
        JOptionPane.showMessageDialog(null, "정수 " + s + "는 9로 나누어 떨어지나? " + d);
    }
}
