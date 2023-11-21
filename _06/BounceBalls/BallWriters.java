package _06.BounceBalls;

import java.awt.*;

public class BallWriters {
    private MovingBall_ ball1, ball2;
    private Color ball1_color;
    private Color ball2_color;

    public  BallWriters(MovingBall_ b1, MovingBall_ b2, Color c1, Color c2) {
        ball1 = b1;
        ball2 = b2;
        ball1_color = c1;
        ball2_color = c2;
    }
    public void paintComponent(Graphics g) {
        int radius1 = ball1.radiusOf();
        int radius2 = ball2.radiusOf();
        g.setColor(ball1_color);
        g.fillOval(ball1.xPosition() - radius1, ball1.yPosition() - radius1, radius1 * 2, radius1 * 2);
        g.setColor(ball2_color);
        g.fillOval(ball2.xPosition() - radius2, ball2.yPosition() - radius2, radius2 * 2, radius2 * 2);
    }
}
