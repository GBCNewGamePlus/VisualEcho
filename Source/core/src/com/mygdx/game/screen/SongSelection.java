package com.mygdx.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.mygdx.game.base.ScreenBeta;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.scenes.scene2d.Actor;

public final class SongSelection extends ScreenBeta {
    Skin Quantum;
    String[] songNames = {"Cyberjazz Nights", "Neon Trip", "Cry No More"};
    Button[] normalDifficulty = new Button[3];
    Button[] expertDifficulty = new Button[3];
    Button[] songTitle = new Button[3];
    Button[][] songHolder = {songTitle, normalDifficulty, expertDifficulty};
    @Override
    public void initialize() {
        Quantum = new Skin(Gdx.files.internal("Skin/Quantum UI SCF.json"));
        /*
        for (int i = 0; i < songHolder.length; i++){
            songTitle[i] = new Button(Quantum);
            songTitle[i].setStyle(Quantum.get("default",Button.ButtonStyle.class));
            songTitle[i].setPosition((Gdx.graphics.getWidth()/2),((Gdx.graphics.getHeight()/2)-200)+(200*i), Align.center);
            songTitle[i].setSize(300,100);
            songTitle[i].addListener(new ChangeListener() {
                @Override
                public void changed (ChangeEvent event, Actor actor) {

                }
            });
            st.addActor(normalDifficulty[i]);
            normalDifficulty[i] = new Button(Quantum);
            normalDifficulty[i].setStyle(Quantum.get("default",Button.ButtonStyle.class));
            normalDifficulty[i].setPosition((Gdx.graphics.getWidth()/2)-200,((Gdx.graphics.getHeight()/2)-100)+(200*i), Align.center);
            normalDifficulty[i].setSize(150,50);
            normalDifficulty[i].addListener(new ChangeListener() {
                @Override
                public void changed (ChangeEvent event, Actor actor) {

                }
            });
            st.addActor(expertDifficulty[i]);
            st.addActor(expertDifficulty[i]);
            expertDifficulty[i] = new Button(Quantum);
            expertDifficulty[i].setStyle(Quantum.get("default",Button.ButtonStyle.class));
            expertDifficulty[i].setPosition((Gdx.graphics.getWidth()/2)+200,((Gdx.graphics.getHeight()/2)-100)+(200*i), Align.center);
            expertDifficulty[i].setSize(150,50);
            expertDifficulty[i].addListener(new ChangeListener() {
                @Override
                public void changed (ChangeEvent event, Actor actor) {

                }
            });
            st.addActor(expertDifficulty[i]);

        }*/
    }

    @Override
    public void update(float dt) {

    }
}
