import processing.core.PApplet;

import java.util.ArrayList;

public class ProcessingOOP extends PApplet {

    public static final int height = 500;
    public static final int width = 500;
    public static final int standardHeight = height / 5;


    public ArrayList<MovingBall> balls = new ArrayList<MovingBall>();

    public static void main(String[] args) {
        ProcessingOOP.main("ProcessingOOP", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(width, height);
    }

    @Override
    public void setup() {
        for (int ball = 1; ball <= 4 ; ball++) {
            balls.add(new MovingBall(ball, ball * standardHeight));
        }
    }

    @Override
    public void draw() {
        for (MovingBall ball :
                balls) {
            ball.moveBall(this);
        }
    }
}
