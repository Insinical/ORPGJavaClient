package client.states;

import client.GameClient;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle;

public class Login implements Screen {
	private TextureAtlas atlas;
	private Skin skin;
	private Stage stage;
	private Table table;
	private TextButton login;
	private TextField user, pass, email;
	private Label title, username, password, txtEmail;
	private Sprite menubg;
	private SpriteBatch batch;
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		batch.begin();
			menubg.draw(batch);
			
			GameClient.font.setColor(1.0f, 1.0f, 1.0f, 1.0f);
			GameClient.font.draw(batch, GameClient.name + " " + GameClient.version, 10, 600 - 10);
			GameClient.font.draw(batch, "FPS: " + Gdx.graphics.getFramesPerSecond(), 10, 600 - 25);
			
			title.draw(batch, 1.0f);
			title.setPosition((Gdx.graphics.getWidth() / 2) - (title.getWidth() / 2), 450);
		batch.end();
		
		stage.draw();
		Table.drawDebug(stage);
		stage.act();
	}

	@Override
	public void resize(int width, int height) {
		stage.setViewport(width, height, true);
	}

	@Override
	public void show() {
		stage = new Stage();
		
		Gdx.input.setInputProcessor(stage);
		
		atlas = new TextureAtlas("assets/ui/button.pack");
		skin = new Skin(atlas);
		
        table = new Table();
        table.setBounds(100, 140, 600, 300);
        
		Texture menuTex = new Texture("assets/data/img/ui/menu_bg.png");
		menubg = new Sprite(menuTex);
		menubg.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		
		TextButtonStyle tbs = new TextButtonStyle();
		tbs.up = skin.getDrawable("button.normal9");
		tbs.down = skin.getDrawable("button.pressed9");
		tbs.pressedOffsetX = 1;
		tbs.pressedOffsetY = -1;
		tbs.font = GameClient.menuBtnFont;
		
		LabelStyle titleStyle = new LabelStyle(GameClient.font50, Color.WHITE);
		LabelStyle loginStyle = new LabelStyle(GameClient.loginFnt, Color.WHITE);
		
		TextFieldStyle tfs = new TextFieldStyle();
		tfs.font = GameClient.loginFnt;
		tfs.fontColor = Color.WHITE;
		
		login = new TextButton("Login", tbs);
		
		title = new Label(GameClient.name, titleStyle);
		username = new Label(GameClient.username, loginStyle);
		password = new Label(GameClient.password, loginStyle);
		txtEmail = new Label(GameClient.email, loginStyle);
		
		user = new TextField("", tfs);
		pass = new TextField("", tfs);
		email = new TextField("", tfs);
		
		table.add(username).width(125);
		table.add(user).width(250);
		table.row();
		table.add(password).width(125);
		table.add(pass).width(250);
		table.row();
		table.add(txtEmail).width(125);
		table.add(email).width(250);
		table.row();
		table.add(login);
		table.debug();
		stage.addActor(table);
		
		batch = new SpriteBatch();
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
