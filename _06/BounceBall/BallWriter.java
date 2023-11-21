package _06.BounceBall;
import java.awt.Color;
import java.awt.Graphics;

public class BallWriter {
    private MovingBall ball;
    private Color balls_color;

    public  BallWriter(MovingBall x, Color c) {
        ball = x;
        balls_color = c;
    }
    public void paintComponent(Graphics g) {
        g.setColor(balls_color);
        int radius = ball.radiusOf();
        g.fillOval(ball.xPosition() - radius, ball.yPosition() - radius, radius * 2, radius * 2);

    }
}
