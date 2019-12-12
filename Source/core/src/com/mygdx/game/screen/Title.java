package com.mygdx.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.utils.Align;
import com.mygdx.game.actor.title.GameLogo;
import com.mygdx.game.base.ScreenBeta;

import java.util.Random;

public final class Title extends ScreenBeta {
    private Table mainContent;
    private GameLogo gameLogo;

    private TextButton songList;
    private ChangeListener songListListener;

    private TextButton settings;
    private ChangeListener settingsListener;

    private TextButton credits;
    private ChangeListener creditsListener;

    private Music soundTrack;


    @Override
    public void initialize() {

        float padTableItems = HEIGHT/30.0f;

        // Table elements
        gameLogo = new GameLogo(HEIGHT/2.50f, "Title/VisualEchoLogo.png");

        songList = new TextButton("Song List", sk);
        songList.setTransform(true);
        songList.setScale(2);

        settings = new TextButton("Settings", sk);
        settings.setTransform(true);
        settings.setScale(2);

        credits = new TextButton("Credits", sk);
        credits.setTransform(true);
        credits.setScale(2);

        // Table
        mainContent = new Table();
        mainContent.setOrigin(Align.top);
        mainContent.setPosition(WIDTH/2,HEIGHT/2);

        mainContent.add(gameLogo).padBottom(2*padTableItems);
        mainContent.row();

        mainContent.add(songList).padBottom(padTableItems);
        mainContent.row();

        mainContent.add(settings).padBottom(padTableItems);
        mainContent.row();

        mainContent.add(credits);

        st.addActor(mainContent);
        mainContent.setDebug(false);
        mainContent.setVisible(false);
    }

    @Override
    public void show() {
        super.show();
        // music changes every reload
        if(soundTrack == null)
        {
            Random random = new Random();
            if(random.nextFloat()>=0.5f){
                soundTrack= Gdx.audio.newMusic(Gdx.files.internal("Title/Ambient1.mp3"));
            }
            else{
                soundTrack= Gdx.audio.newMusic(Gdx.files.internal("Title/Ambient2.mp3"));
            }
            soundTrack.setVolume(0.3f);
            soundTrack.setLooping(true);
            soundTrack.play();
        }

        songList.addListener(songListListener = new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                soundTrack.stop();
                soundTrack = null;
                transitionTo = "SongSelection";
            }
        });
        settings.addListener(settingsListener = new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                transitionTo = "Settings";
            }
        });
        credits.addListener(creditsListener = new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                transitionTo = "Credits";
            }
        });

        mainContent.setVisible(true);
    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void hide(){
        super.hide();
        mainContent.setVisible(false);
        songList.removeListener(songListListener);
        settings.removeListener(settingsListener);
        credits.removeListener(creditsListener);
    }

}
