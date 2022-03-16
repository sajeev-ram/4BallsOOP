public class MovingBall {
    private int ballNumber;
    private int ballPosX;
    private int ballPosY;
    private int ballDiameter;

    public MovingBall(int ballNumber, int ballPosY) {
        this.ballNumber = ballNumber;
        this.ballPosY = ballPosY;
        this.ballDiameter = 10;
        this.ballPosX = 0;

    }

    public void moveBall(ProcessingOOP processingOOP) {
        processingOOP.ellipse(ballPosX, ballPosY, ballDiameter, ballDiameter);
        ballPosX += ballNumber;
    }
}
