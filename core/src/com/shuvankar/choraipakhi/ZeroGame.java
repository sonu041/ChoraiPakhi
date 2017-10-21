package com.shuvankar.choraipakhi;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.shuvankar.cphelpers.AssetLoader;
import com.shuvankar.screens.GameScreen;

public class ZeroGame extends Game {
	@Override
	public void create() {
		Gdx.app.log("ZeroGame", "created");
		AssetLoader.load();
		setScreen(new GameScreen());
	}

	@Override
	public void dispose() {
		super.dispose();
		AssetLoader.dispose();
	}
}
