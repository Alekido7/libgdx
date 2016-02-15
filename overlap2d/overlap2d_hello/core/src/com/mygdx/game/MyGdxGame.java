package com.mygdx.game;


import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.uwsoft.editor.renderer.SceneLoader;
import com.uwsoft.editor.renderer.utils.ItemWrapper;

public class MyGdxGame extends Game {

	private SceneLoader sceneLoader;
	private Viewport viewport;
	private Player player;
	
	@Override
	public void create () {
		viewport = new FitViewport(800, 600);
		sceneLoader = new SceneLoader();
		sceneLoader.loadScene("MainScene", viewport);

		player = new Player(sceneLoader.world);

		ItemWrapper root = new ItemWrapper(sceneLoader.getRoot());
		root.getChild("box").addScript(player);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		sceneLoader.getEngine().update(Gdx.graphics.getDeltaTime());

		OrthographicCamera camera = (OrthographicCamera) viewport.getCamera();
		camera.position.set(player.getX(), player.getY(), 0);
	}
}