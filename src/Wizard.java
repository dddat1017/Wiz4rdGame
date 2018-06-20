import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Wizard extends GameObject{
	
	private boolean up = false, down = false, right = false, left = false;
	Handler handler;
	

	public Wizard(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		this.handler = handler;
	}

	public void tick() {
		x += velX;
		y += velY;
		
		//movement
		if(isUp()) velY = -5;
		else if(!isDown()) velY = 0;	//if Up is released and Down isn't being pushed, then vel is 0
		
		if(isDown()) velY = 5;
		else if(!isUp()) velY = 0;
		
		if(isRight()) velX = 5;
		else if(!isLeft()) velX = 0;
		
		if(isLeft()) velX = -5;
		else if(!isRight()) velX = 0;
		
		
	}

    public boolean isUp() {
		return up;
	}

	public void setUp(boolean up) {
		this.up = up;
	}

	public boolean isDown() {
		return down;
	}

	public void setDown(boolean down) {
		this.down = down;
	}

	public boolean isRight() {
		return right;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	public boolean isLeft() {
		return left;
	}

	public void setLeft(boolean left) {
		this.left = left;
	}

	public void render(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(x, y, 32, 48);
	}

	public Rectangle getBounds() {
		return new Rectangle(x, y, 32, 48);
	}

}
