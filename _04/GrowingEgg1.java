package _04;

import javax.swing.*;
import java.awt.*;

public class GrowingEgg1 extends JPanel {
    private final int NET_SIZE = 400;
    private int egg_width = 60;
    private int egg_height = 40;
    private int x = 170;
    private int y = 180;
    public GrowingEgg1() {
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
        g.fillOval(x, y, egg_width, egg_height);
        x -= 30;
        y -= 20;
        egg_width += 60;
        egg_height += 40;
    }

    public static void main(String[] args) {
        new GrowingEgg1();
    }
}
