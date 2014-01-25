package client.entity;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class Player {
	public static int x = 10;
	public static int y = 10;
	public Sprite sprite;
	public Animation walkAnim;
	
	public Player() {		
		Texture playerTex = new Texture("assets/data/gfx/player/player_down.png");
		sprite = new Sprite(playerTex);
	}
	
	public void render(int x, int y) {
		
	}
	
	public void setX(int x) {
		sprite.setX(x);
	}
	
	public void setY(int y) {
		sprite.setY(y);
	}
}
