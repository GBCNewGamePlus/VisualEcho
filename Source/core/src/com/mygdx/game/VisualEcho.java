package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.base.GameBeta;

public class VisualEcho extends GameBeta {
	@Override
	public void create()
	{
		super.create();
		Gdx.app.log("Gdx version", com.badlogic.gdx.Version.VERSION);
	}

	@Override
	public void render()
	{
		super.render();
	}

	@Override
	protected void resetScene(int finalScene) {

	}
}
