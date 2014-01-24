package client;

import client.states.Menu;
import client.states.Play;

import com.badlogic.gdx.Game;

public class GameClient extends Game {
	
	Menu menu;
	Play play;

	@Override
	public void create() {
		menu = new Menu(this);
		play = new Play(this);
		setScreen(menu);
	}
	
}
