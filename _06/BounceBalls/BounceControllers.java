package _06.BounceBalls;

public class BounceControllers {
    private MovingBall_ ball1, ball2;
    private AnimationWriters writer;

    public BounceControllers(MovingBall_ b1, MovingBall_ b2, AnimationWriters w) {
        ball1 = b1;
        ball2 = b2;
        writer = w;
    }
    public void runAnimation() {
        int time_unit = 1;
        int painting_delay = 20;

        boolean crash = false;
        while (!crash) {
            double d = Math.sqrt(Math.pow(ball1.xPosition()-ball2.xPosition(), 2) + Math.pow(ball1.yPosition()-ball2.yPosition(), 2));
            int r = Math.min(ball1.radiusOf(), ball2.radiusOf());
            if (d <= r) {
                crash = true;
                System.out.println("충돌!!");
                System.exit(1);
            }
            else {
                delay(painting_delay);
                ball1.move(time_unit);
                ball2.move(time_unit);
                System.out.println(ball1.xPosition() + ", " + ball1.yPosition());
                System.out.println(ball2.xPosition() + ", " + ball2.yPosition());
                writer.repaint();
            }
        }

    }
    private void delay(int how_long) {
        try {Thread.sleep(how_long); }
        catch (InterruptedException e) { }
    }
}
