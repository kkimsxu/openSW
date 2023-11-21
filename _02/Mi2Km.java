package _02;

import javax.swing.*;

public class Mi2Km {
    public static void main(String[] args) {
        String mile = JOptionPane.showInputDialog("거리가 몇 마일입니까?");
        int m = Integer.parseInt(mile);
        String formattedkm = String.format("%.1f", m * 1.60934);
        JOptionPane.showMessageDialog(null, mile + "마일은" + formattedkm + "킬로미터 입니다.");
    }
}
