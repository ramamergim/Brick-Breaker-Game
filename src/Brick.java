import javax.swing.ImageIcon;

public class Brick extends Sprite {
	private boolean destroyed; //the state of brick
	
	public Brick(int x, int y) {
		this.x = x;
		this.y = y;
		
		ImageIcon brickIcon = new ImageIcon("res/brick.png");
		
		image = brickIcon.getImage();
		
		imageWidth = image.getWidth(null);
		imageHeight = image.getHeight(null);
		
		destroyed = false;
	}
	
	public boolean isDestroyed() {
		return destroyed;
	}
	
	public void setDestroyed(boolean value) {
		destroyed = value;
	}
}
