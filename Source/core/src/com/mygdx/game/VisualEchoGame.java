package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.game.base.GameBeta;
import com.mygdx.game.screen.Credits;
import com.mygdx.game.screen.GameResults;
import com.mygdx.game.screen.Gameplay;
import com.mygdx.game.screen.Settings;
import com.mygdx.game.screen.SongSelection;
import com.mygdx.game.screen.Splash;
import com.mygdx.game.screen.Title;

public class VisualEchoGame extends GameBeta
{
	Splash splashScreen;
	Title titleScreen;
	SongSelection songSelectionScreen;
	Credits creditsScreen;
	Settings settingsScreen;
	GameResults gameResultsScreen;
	Gameplay gameplayScreen;


	static final int SPLASH = 0;
	static final int TITLE = 1;
	static final int SONG_SELECTION = 2;
	static final int GAMEPLAY = 3;
	static final int GAME_RESULTS = 4;
	static final int SETTINGS = 5;
	static final int CREDITS = 6;

	@Override
	public void create()
	{
		super.create();
		Gdx.app.log("Gdx version", com.badlogic.gdx.Version.VERSION);

		gameplayScreen = new Gameplay();
		splashScreen = new Splash();
		titleScreen = new Title();
		songSelectionScreen = new SongSelection();
		creditsScreen = new Credits();
		settingsScreen = new Settings();
		gameResultsScreen = new GameResults();

		// Sets the first scene
		currentScene = SPLASH;
		setActiveScreen(splashScreen);
	}

	@Override
	public void render()
	{
		switch (currentScene) {
			case SPLASH:
				if(splashScreen.transitionTo == "Title"){
					resetScene(TITLE);
					setActiveScreen(titleScreen);
				}
				break;
			case TITLE:
				if(titleScreen.transitionTo == "SongSelection"){
					resetScene(SONG_SELECTION);
					setActiveScreen(songSelectionScreen);
				}
				else if(titleScreen.transitionTo == "Credits"){
					resetScene(CREDITS);
					setActiveScreen(creditsScreen);
				}
				else if(titleScreen.transitionTo == "Settings"){
					resetScene(SETTINGS);
					setActiveScreen(settingsScreen);
				}
				break;
			case SONG_SELECTION:
				if(songSelectionScreen.transitionTo == "Title"){
					resetScene(TITLE);
					setActiveScreen(titleScreen);
				}
				else if(songSelectionScreen.transitionTo == "Gameplay"){
					resetScene(GAMEPLAY);
					setActiveScreen(gameplayScreen);
				}
				break;
			case GAMEPLAY:
				if(gameplayScreen.transitionTo == "GameResults"){
					resetScene(GAME_RESULTS);
					setActiveScreen(gameResultsScreen);
				}
				break;
			case GAME_RESULTS:
				if(gameResultsScreen.transitionTo == "SongSelection"){
					resetScene(SONG_SELECTION);
					setActiveScreen(songSelectionScreen);
				}else if(gameResultsScreen.transitionTo == "Gameplay"){
					resetScene(GAMEPLAY);
					setActiveScreen(gameplayScreen);
				}
//
				break;
			case SETTINGS:
				if(settingsScreen.transitionTo == "Title"){
					resetScene(TITLE);
					setActiveScreen(titleScreen);
				}
				break;
			case CREDITS:
				if(creditsScreen.transitionTo == "Title"){
					resetScene(TITLE);
					setActiveScreen(titleScreen);
				}
				break;
		}
		super.render();
	}

	@Override
	protected void resetScene(int finalScene) {
		gameplayScreen.transitionTo = "";
		splashScreen.transitionTo = "";
		titleScreen.transitionTo = "";
		songSelectionScreen.transitionTo = "";
		creditsScreen.transitionTo = "";
		settingsScreen.transitionTo = "";
		gameResultsScreen.transitionTo = "";
		currentScene = finalScene;
	}

	@Override
	public void dispose () {
		gameplayScreen.dispose();
		splashScreen.dispose();
		titleScreen.dispose();
		songSelectionScreen.dispose();
		creditsScreen.dispose();
		settingsScreen.dispose();
		gameResultsScreen.dispose();
	}

}
