import java.awt.*;
import java.util.*;


//handles (updates) all GameObjects that could possibly be in the Game
public class Handler {
	
	public static final int PLAYERID = 0;
	
    ArrayList<GameObject> object = new ArrayList<GameObject>();

	public void tick() {
        for(int i = 0; i < object.size(); i++) {
            GameObject tempObject = object.get(i);

            tempObject.tick();
        }
    }

    public void render(Graphics g) {
        for(int i = 0; i < object.size(); i++) {
            GameObject tempObject = object.get(i);

            tempObject.render(g);
        }
    }

    public void addObject(GameObject tempObject) {
        object.add(tempObject);
    }

    public void removeObject(GameObject tempObject) {
        object.remove(tempObject);
    }

}
