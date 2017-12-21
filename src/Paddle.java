import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

/**
  * Paddle class controls the paddle with left and right key buttons
  * When left arrow key button is pressed, the paddle moves left, when it's released, it's stopped
  * Same for the right arrow key button
 */
public class Paddle extends Sprite implements Sizes {
	
	private int dx;
	
	public Paddle() {
		ImageIcon paddleIcon = new ImageIcon("res/paddle4.png");
		image = paddleIcon.getImage();
		
		imageWidth = image.getWidth(null);
		imageHeight = image.getHeight(null);
		
		resetState();
	}
	
	/**
	 * The paddle moves in horizontal direction only, so we change the x coordinate only.
	 */
	public void move() {
		x += dx;
		
		if (x <= 0) x = 0;
		if (x >= WIDTH - imageWidth) x = WIDTH - imageWidth;
	}
	
	private void resetState() {
		x = PADDLE_X;
		y = PADDLE_Y;
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_LEFT) dx = -1;
		if (key == KeyEvent.VK_RIGHT) dx = 1;
	}
	
	/**
	 * if key is released, paddle stops
	 * @param e - gets key released
	 */
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
		if (key == KeyEvent.VK_LEFT) dx = 0;
		if (key == KeyEvent.VK_RIGHT) dx = 0;
	}
}
