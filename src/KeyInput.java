import java.awt.event.*;

public class KeyInput extends KeyAdapter {
	
	Handler handler;
	
	public KeyInput(Handler handler) {
		this.handler = handler;
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
			Wizard tempObject = (Wizard) handler.object.get(Handler.PLAYERID);
			
				if(key == KeyEvent.VK_W) tempObject.setUp(true);
				if(key == KeyEvent.VK_S) tempObject.setDown(true);
				if(key == KeyEvent.VK_A) tempObject.setLeft(true);
				if(key == KeyEvent.VK_D) tempObject.setRight(true);
	}
	
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
		Wizard tempObject = (Wizard) handler.object.get(Handler.PLAYERID);
		
			if(key == KeyEvent.VK_W) tempObject.setUp(false);
			if(key == KeyEvent.VK_S) tempObject.setDown(false);
			if(key == KeyEvent.VK_A) tempObject.setLeft(false);
			if(key == KeyEvent.VK_D) tempObject.setRight(false);
	}
}
