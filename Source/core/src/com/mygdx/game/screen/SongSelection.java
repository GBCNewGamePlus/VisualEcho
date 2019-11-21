package com.mygdx.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.mygdx.game.base.ScreenBeta;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.scenes.scene2d.Actor;

import java.util.Random;

public final class SongSelection extends ScreenBeta {
    private Skin Quantum;
    private Table songList;
    private String[] songNames;
    private TextButton[] normalDifficulty;
    private ChangeListener[] nDList;
    private TextButton[] expertDifficulty;
    private ChangeListener[] eDList;
    private TextButton[] songTitle;
    private ChangeListener[] sTList;
    private TextButton[][] songHolder;
    private TextButton backButton;
    private ChangeListener bBList;
    private boolean[] tapped;
    private Music[] soundTrack;
    @Override
    public void initialize() {

        Quantum = new Skin(Gdx.files.internal("Skin/Quantum UI SCF.json"));
        songNames = new String[]{"Cyberjazz Nights", "Neon Trip", "Cry No More"};
        soundTrack = new Music[3];
        soundTrack[0] = Gdx.audio.newMusic(Gdx.files.internal("01.FULL TRACKS/01. Cyberjazz Nights.mp3"));
        soundTrack[1] = Gdx.audio.newMusic(Gdx.files.internal("01.FULL TRACKS/02. Neon Trip.mp3"));
        soundTrack[2] = Gdx.audio.newMusic(Gdx.files.internal("01.FULL TRACKS/03. Cry No More.mp3"));
        normalDifficulty = new TextButton[3];
        expertDifficulty = new TextButton[3];
        nDList = new ChangeListener[3];
        eDList = new ChangeListener[3];
        sTList = new ChangeListener[3];
        songTitle = new TextButton[3];
        songHolder = new TextButton[3][];
        tapped = new boolean[3];
        float padTableItems = HEIGHT/30.0f;
        songList = new Table();
        songList.setOrigin(Align.top);
        songList.setPosition(WIDTH/2,HEIGHT/2);
        for (int i = 0; i < songHolder.length; i++){
            tapped[i] = false;
            songTitle[i] = new TextButton(songNames[i],Quantum);
            songTitle[i].setStyle(Quantum.get("default",TextButton.TextButtonStyle.class));
            songTitle[i].addListener(new ChangeListener() {
                @Override
                public void changed (ChangeEvent event, Actor actor) {

                }
            });
            normalDifficulty[i] = new TextButton("Normal",Quantum);
            normalDifficulty[i].setStyle(Quantum.get("default",TextButton.TextButtonStyle.class));
            normalDifficulty[i].setVisible(false);
            normalDifficulty[i].addListener(new ChangeListener() {
                @Override
                public void changed (ChangeEvent event, Actor actor) {

                }
            });
            expertDifficulty[i] = new TextButton("Expert",Quantum);
            expertDifficulty[i].setStyle(Quantum.get("default",TextButton.TextButtonStyle.class));
            expertDifficulty[i].setVisible(false);
            expertDifficulty[i].addListener(new ChangeListener() {
                @Override
                public void changed (ChangeEvent event, Actor actor) {

                }
            });
            backButton = new TextButton("Back",Quantum);
            backButton.setStyle(Quantum.get("default",TextButton.TextButtonStyle.class));

            songList.add(normalDifficulty[i]).padBottom(padTableItems);
            songList.add(songTitle[i]).padBottom(padTableItems);
            songList.add(expertDifficulty[i]).padBottom(padTableItems);
            songList.row();


        }
        songList.add(backButton).padBottom(padTableItems);
        songList.row();
        st.addActor(songList);
        songList.setDebug(false);
        songList.setVisible(true);
        songHolder[0] = songTitle;
        songHolder[1] = normalDifficulty;
        songHolder[2] = expertDifficulty;
    }

    @Override
    public void show() {
        super.show();
        for (int i = 0; i < 3; i++){
            normalDifficulty[i].setVisible(false);
            expertDifficulty[i].setVisible(false);
            tapped[i] = false;
        }
        songTitle[0].addListener(sTList[0] = new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                for (int i = 0; i < 3; i++){
                    soundTrack[i].stop();
                    normalDifficulty[i].setVisible(false);
                    expertDifficulty[i].setVisible(false);
                }

                tapped[0] = !tapped[0];
                normalDifficulty[0].setVisible(tapped[0]);
                expertDifficulty[0].setVisible(tapped[0]);
                if (tapped[0] == true){
                    soundTrack[0].setVolume(0.3f);
                    soundTrack[0].setLooping(true);
                    soundTrack[0].play();
                }
            }
        });
        songTitle[1].addListener(sTList[1] = new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                for (int i = 0; i < 3; i++){
                    soundTrack[i].stop();
                    normalDifficulty[i].setVisible(false);
                    expertDifficulty[i].setVisible(false);
                }

                tapped[1] = !tapped[1];
                normalDifficulty[1].setVisible(tapped[1]);
                expertDifficulty[1].setVisible(tapped[1]);
                if (tapped[1] == true){
                    soundTrack[1].setVolume(0.3f);
                    soundTrack[1].setLooping(true);
                    soundTrack[1].play();
                }
            }
        });
        songTitle[2].addListener(sTList[2] = new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                for (int i = 0; i < 3; i++){
                    soundTrack[i].stop();
                    normalDifficulty[i].setVisible(false);
                    expertDifficulty[i].setVisible(false);
                }

                tapped[2] = !tapped[2];
                normalDifficulty[2].setVisible(tapped[2]);
                expertDifficulty[2].setVisible(tapped[2]);
                if (tapped[2] == true){
                    soundTrack[2].setVolume(0.3f);
                    soundTrack[2].setLooping(true);
                    soundTrack[2].play();
                }
            }
        });
        normalDifficulty[0].addListener(nDList[0] = new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                transitionTo = "Gameplay";
            }
        });
        expertDifficulty[0].addListener(eDList[0] = new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                transitionTo = "Gameplay";
            }
        });
        normalDifficulty[1].addListener(nDList[1] = new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                transitionTo = "Gameplay";
            }
        });
        expertDifficulty[1].addListener(eDList[1] = new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                transitionTo = "Gameplay";
            }
        });
        normalDifficulty[2].addListener(nDList[2] = new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                transitionTo = "Gameplay";
            }
        });
        expertDifficulty[2].addListener(eDList[2] = new ChangeListener() {
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
        for (int i = 0; i < 3; i++){
            soundTrack[i].stop();
            songTitle[i].removeListener(sTList[i]);
            normalDifficulty[i].removeListener(nDList[i]);
            expertDifficulty[i].removeListener(eDList[i]);
            tapped[i] = false;
        }
        backButton.removeListener((bBList));

    }
    @Override
    public void update(float dt) {

    }
}
