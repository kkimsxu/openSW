package _04;

import javax.swing.*;

public class Canvas {
    public Canvas() {
        JFrame frame = new JFrame();
        frame.setTitle("Canavas");
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Canvas();
    }
}
