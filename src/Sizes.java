public interface Sizes {
	/**
	 * @author Mergim Rama
	 * @param WIDTH, HEIGHT - dimensions of the board
	 * @param BOTTOM - when the ball passes this dimension, the game is over
	 * @param BRICKS - number of bricks in the game
	 * @param INIT_PADDLE_X, INNIT_PADDLE_Y - coordinates of the paddle object
	 * @param INNIT_BALL_X, INNIT_BALL_Y - ball coordinates
	 * @param DELAY - delay in milliseconds before game is executed
	 * @param PERIOD - time between successive task executions that form the game cycles
	*/
	public static final int WIDTH = 312;
	public static final int HEIGHT = 400;
	public static final int BOTTOM = 390;
	public static final int BRICK_ROWS = 7;
	public static final int BRICK_COLUMNS = 8;
	public static final int BRICKS = BRICK_ROWS * BRICK_COLUMNS;
	public static final int PADDLE_X = 200;
	public static final int PADDLE_Y = 360;
	public static final int BALL_X = 230;
	public static final int BALL_Y = 340;
	public static final int DELAY = 1000;
	public static final int PERIOD = 10;
}
