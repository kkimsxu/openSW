package _04;

import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;

public class ClockWriter extends JPanel {
    private int width;
    public ClockWriter(int w) {
        width = w;
        JFrame frame = new JFrame();
        frame.getContentPane().add(this);
        frame.setTitle("Clock");
        frame.setSize(width, width);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void paintComponent(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, width, width);
        LocalTime now = LocalTime.now();
        int minutes_angle = 90 - now.getMinute() * 6;
        int hours_angle = 90 - now.getHour() * 30;
        int x = 50;
        int y = 50;
        int diameter = 100;
        g.setColor(Color.black);
        g.drawOval(x, y, diameter, diameter);
        g.setColor(Color.red);
        g.fillArc(x+5, x+5, diameter-10, diameter-10, minutes_angle, 5);
        g.setColor(Color.blue);
        g.fillArc(x+25, x+25, diameter-50, diameter-50, hours_angle, -8);
    }

    public static void main(String[] args) {
        new ClockWriter(400);
    }
}
