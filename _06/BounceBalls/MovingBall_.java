package _06.BounceBalls;

import _06.BounceBalls.Box;

public class MovingBall_ {
    private int x_pos;
    private int y_pos;
    private int radius;
    private int x_velocity;
    private int y_velocity;
    private _06.BounceBalls.Box container;

    public MovingBall_(int x_initial, int y_initial, int r, Box box, int x, int y) {
        x_pos = x_initial;
        y_pos = y_initial;
        radius = r;
        container = box;
        x_velocity = x;
        y_velocity = y;
    }
    public int xPosition() {
        return x_pos;
    }
    public int yPosition() {
        return y_pos;
    }
    public int radiusOf() {
        return radius;
    }

    public void move(int time_units) {
        x_pos = x_pos + x_velocity*time_units;
        if (container.inHorizontalContact(x_pos))
            x_velocity = - x_velocity;
        y_pos = y_pos + y_velocity * time_units;
        if (container.inVerticalContact(y_pos))
            y_velocity = - y_velocity;
    }

    public void setVelocityX(int x_velo) {

    }

    public void setVelocityY(int y_velo) {

    }
}
