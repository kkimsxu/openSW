package _04;

import javax.swing.*;
import java.awt.*;

public class GrowingEgg2 extends JPanel {
    private final int NET_SIZE;
    private int egg_width = 60;
    private int egg_height = 40;
    private int x = 170;
    private int y = 180;
    public GrowingEgg2(int s) {
        NET_SIZE = s;
        JFrame frame = new JFrame();
        frame.getContentPane().add(this);
        frame.setTitle("Egg");
        frame.setSize(NET_SIZE, NET_SIZE);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void paintComponent(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(0, 0, NET_SIZE, NET_SIZE);
        g.setColor(Color.yellow);
        g.fillOval(x*NET_SIZE/400, y*NET_SIZE/400, egg_width*NET_SIZE/400, egg_height*NET_SIZE/400);
        x -= 30*NET_SIZE/400;
        y -= 20*NET_SIZE/400;
        egg_width += 60*NET_SIZE/400;
        egg_height += 40*NET_SIZE/400;
    }

    public static void main(String[] args) {
        new GrowingEgg2(200);
    }
}
