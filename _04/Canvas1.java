package _04;

import javax.swing.*;
import java.awt.*;

public class Canvas1 extends JPanel {
    public Canvas1() {
        JFrame frame = new JFrame();
        frame.setTitle("Canvas1");
        frame.setSize(300, 200);
        frame.getContentPane().add(this);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void paintComponent(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Java!", 100, 60);
    }

    public static void main(String[] args) {
        new Canvas1();
    }
}
