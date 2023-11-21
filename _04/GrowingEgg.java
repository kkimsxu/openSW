package _04;

import javax.swing.*;
import java.awt.*;

public class GrowingEgg extends JPanel {
    public GrowingEgg() {
        JFrame frame = new JFrame();
        frame.getContentPane().add(this);
        frame.setTitle("Egg");
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void paintComponent(Graphics g) {
        int width = 400;
        g.setColor(Color.green);
        g.fillRect(0, 0, width, width);
        g.setColor(Color.yellow);
        g.fillOval(170, 180, 60, 40);
    }
    public static void main(String[] args) {
        new GrowingEgg();
    }

}
