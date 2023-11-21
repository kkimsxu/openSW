package _06;

import javax.swing.*;
import java.awt.*;

public class Target extends JPanel {
    private int size = 500;
    private int x = 0;
    private int rings = 10;

    public Target() {
        JFrame frame = new JFrame();
        frame.getContentPane().add(this);
        frame.setTitle("Target");
        frame.setSize(size, size+28);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(x, x, size, size);
        while (rings >= 0) {
            if (rings >= 9) {
                g.setColor(Color.white);
                g.fillOval(x, x, size, size);
                g.setColor(Color.black);
                g.drawOval(x, x, size, size);
            }
            else if (rings >= 7) {
                g.setColor(Color.black);
                g.fillOval(x, x, size, size);
                g.setColor(Color.white);
                g.drawOval(x, x, size, size);
            }
            else if (rings >= 5) {
                g.setColor(Color.blue);
                g.fillOval(x, x, size, size);
                g.setColor(Color.black);
                g.drawOval(x, x, size, size);
            }
            else if (rings >= 3) {
                g.setColor(Color.red);
                g.fillOval(x, x, size, size);
                g.setColor(Color.black);
                g.drawOval(x, x, size, size);
            }
            else {
                g.setColor(Color.yellow);
                g.fillOval(x, x, size, size);
                g.setColor(Color.black);
                g.drawOval(x, x, size, size);
            }
            x += 25;
            size -= 50;
            rings -= 1;
        }
    }

    public static void main(String[] args) {
        new Target();
    }
}

