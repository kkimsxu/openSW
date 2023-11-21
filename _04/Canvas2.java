package _04;

import javax.swing.*;
import java.awt.*;

public class Canvas2 extends JPanel {
    public Canvas2() {
        JFrame frame = new JFrame();
        frame.setTitle("Canvas2");
        frame.setSize(300, 200);
        frame.getContentPane().add(this);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void paintComponent(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, 300, 200);
        g.setColor(Color.blue);
        g.drawRect(125, 75, 50, 50);
        g.setColor(Color.cyan);
        g.fillOval(125, 75, 50, 50);
    }

    public static void main(String[] args) {
        new Canvas2();
    }
}
