import javax.swing.ImageIcon;

public class Ball extends Sprite implements Sizes {
	private int xDirection;
	private int yDirection;
	
	public Ball() {
		xDirection = 1;
		yDirection = -1;
		
		ImageIcon ballIcon = new ImageIcon("res/ball3.png");
		image = ballIcon.getImage();
		
		imageWidth = image.getWidth(null);
		imageHeight = image.getHeight(null);
		
		resetState();
	}
	
	/*
	 * This method moves the ball and if the ball hits the borders, its directions change
	 */
	public void move() {
		x += xDirection;
		y += yDirection;
		
		if (x == 0) setXDirection(1);
		if (x == WIDTH - imageWidth) setXDirection(-1);
		if (y == 0) setYDirection(1);
	}
	
	private void resetState() {
		x = BALL_X;
		y = BALL_Y;
	}
	
	/*
	 * When the ball hits the paddle or the brick, the direction of ball changes
	 */
	public void setXDirection(int x) {
		xDirection = x;
	}
	
	/*
	 * When the ball hits the paddle or the brick, the direction of ball changes
	 */
	public void setYDirection(int y) {
		yDirection = y;
	}
	
	public int getYDirection() {
		return yDirection;
	}
}
