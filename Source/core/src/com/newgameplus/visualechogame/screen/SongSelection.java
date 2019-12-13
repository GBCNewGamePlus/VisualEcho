package com.newgameplus.visualechogame.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.newgameplus.visualechogame.base.ScreenBeta;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.scenes.scene2d.Actor;

public final class SongSelection extends ScreenBeta {
    private Table songList;
    private String songName;
    private TextButton expertDifficulty;
    private ChangeListener eDList;
    private TextButton songTitle;
    private ChangeListener sTList;
    private TextButton songHolder;
    private TextButton backButton;
    private ChangeListener bBList;
    private boolean tapped;
    private Music soundTrack;
    private Label title;
    @Override
    public void initialize() {
        songName = "Neon Trip";
        soundTrack = Gdx.audio.newMusic(Gdx.files.internal("01.FULL TRACKS/02. Neon Trip.mp3"));
        float padTableItems = HEIGHT/30.0f;
        songList = new Table();
        songList.setOrigin(Align.top);
        songList.setPosition(WIDTH/2,HEIGHT/2);
        tapped = false;

        title = new Label("Settings", sk);
        title.setFontScale(4.0f);
        songList.add(title).colspan(2).padBottom(2*padTableItems);
        songList.row();


        songTitle = new TextButton("Neon Trip",sk);
        songTitle.setStyle(sk.get("default",TextButton.TextButtonStyle.class));
        songTitle.addListener(new ChangeListener() {
            @Override
            public void changed (ChangeEvent event, Actor actor) {

            }
        });
        float originalWidthST = songTitle.getWidth();
        float originalHeightST = songTitle.getHeight();
        float rateST = 0.15f * (HEIGHT/originalHeightST);
        songTitle.getLabel().setFontScale(rateST,rateST);
        songList.add(songTitle).padBottom(padTableItems).height(originalHeightST*rateST).width(originalWidthST*rateST);

        expertDifficulty = new TextButton("Expert",sk);
        expertDifficulty.setStyle(sk.get("default",TextButton.TextButtonStyle.class));
        expertDifficulty.setVisible(false);
        expertDifficulty.addListener(new ChangeListener() {
            @Override
            public void changed (ChangeEvent event, Actor actor) {

            }
        });
        float originalWidthED = expertDifficulty.getWidth();
        float originalHeightED = expertDifficulty.getHeight();
        float rateED = 0.15f * (HEIGHT/originalHeightED);
        expertDifficulty.getLabel().setFontScale(rateED,rateED);

        songList.add(expertDifficulty).padBottom(padTableItems).height(originalHeightED*rateED).width(originalWidthED*rateED);
        songList.row();

        backButton = new TextButton("Back",sk);
        backButton.setStyle(sk.get("default",TextButton.TextButtonStyle.class));
        float originalWidthBK = backButton.getWidth();
        float originalHeightBK = backButton.getHeight();
        float rateBK = 0.15f * (HEIGHT/originalHeightBK);
        backButton.getLabel().setFontScale(rateBK,rateBK);
        songList.add(backButton).colspan(2).height(originalHeightBK*rateBK).width(originalWidthBK*rateBK);
        songList.row();

        st.addActor(songList);
        songList.setDebug(false);
        songList.setVisible(true);
    }

    @Override
    public void show() {
        super.show();
        expertDifficulty.setVisible(false);
        tapped = false;
        songTitle.addListener(sTList = new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                soundTrack.stop();
                expertDifficulty.setVisible(false);
                tapped = !tapped;
                expertDifficulty.setVisible(tapped);
                if (tapped){
                    soundTrack.setVolume(0.3f);
                    soundTrack.setLooping(true);
                    soundTrack.play();
                }
            }
        });

        expertDifficulty.addListener(eDList = new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                transitionTo = "Gameplay";
            }
        });

        backButton.addListener(bBList = new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                transitionTo = "Title";
            }
        });


        songList.setVisible(true);
    }
    @Override
    public void hide(){
        super.hide();
        songList.setVisible(false);
        soundTrack.stop();
        songTitle.removeListener(sTList);
        expertDifficulty.removeListener(eDList);
        tapped = false;
        backButton.removeListener((bBList));
    }
    @Override
    public void update(float dt) {

    }
}
