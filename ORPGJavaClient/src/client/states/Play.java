package client.states;

import client.GameClient;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Play implements Screen {
	GameClient game;
	
	SpriteBatch batch;
	BitmapFont font;
	
	OrthographicCamera camera;
	
	public Play(GameClient game) {
		this.game = game;
		
		batch = new SpriteBatch();
		font = new BitmapFont(Gdx.files.internal("assets/data/fonts/font.fnt"), Gdx.files.internal("assets/data/fonts/font.png"), false);	
	
		camera = new OrthographicCamera();
	}
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
			font.setColor(1.0f, 1.0f, 1.0f, 1.0f);
			font.draw(batch, "FPS: " + Gdx.graphics.getFramesPerSecond(), 10, 600 - 10);
			font.draw(batch, "Mouse X: " + Gdx.input.getX(), 10, 600 - 25);
			font.draw(batch, "Mouse Y: " + Gdx.input.getY(), 10, 600 - 40);
			font.draw(batch, "Character X: ", 10, 600 - 55);
			font.draw(batch, "Character Y: ", 10, 600 - 70);
		batch.end();
	}

	@Override
	public void resize(int width, int height) {
		camera.s
	}

	@Override
	public void show() {
		
	}

	@Override
	public void hide() {
		
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void resume() {
		
	}

	@Override
	public void dispose() {
		
	}

}
