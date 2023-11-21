package _06.BounceBalls;

import java.awt.*;

public class BounceTwoBalls {
    public static void main(String[] args) {
    int box_size = 200;
    Box box = new Box(box_size);
    MovingBall_ ball1 = new MovingBall_((int)(box_size / 3.0), (int)(box_size / 5.0), 10, box, +3, +4);
    MovingBall_ ball2 = new MovingBall_((int)(box_size / 5.0), (int)(box_size / 3.0), 5, box, +4, +2);
    BallWriters ball_writer = new BallWriters(ball1, ball2, Color.red, Color.blue);
    BoxWriter box_writer = new BoxWriter(box);
    AnimationWriters writer = new AnimationWriters(box_writer, ball_writer, box_size);
    new BounceControllers(ball1, ball2, writer).runAnimation();
}
}
