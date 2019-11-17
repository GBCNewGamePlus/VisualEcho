package com.mygdx.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.mygdx.game.base.ScreenBeta;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.scenes.scene2d.Actor;

public final class SongSelection extends ScreenBeta {
    Skin Quantum;
    String[] songNames;
    TextButton[] normalDifficulty;
    TextButton[] expertDifficulty;
    TextButton[] songTitle;
    TextButton[][] songHolder;
    @Override
    public void initialize() {
        Quantum = new Skin(Gdx.files.internal("Skin/Quantum UI SCF.json"));
        songNames = new String[]{"Cyberjazz Nights", "Neon Trip", "Cry No More"};
        normalDifficulty = new TextButton[3];
        expertDifficulty = new TextButton[3];
        songTitle = new TextButton[3];
        songHolder = new TextButton[3][];
        for (int i = 0; i < songHolder.length; i++){
            songTitle[i] = new TextButton(songNames[i],Quantum);
            songTitle[i].setStyle(Quantum.get("default",TextButton.TextButtonStyle.class));
            songTitle[i].setPosition((Gdx.graphics.getWidth()/2),((Gdx.graphics.getHeight()/2)-200)+(200*i), Align.center);
            songTitle[i].setSize(400,200);
            songTitle[i].addListener(new ChangeListener() {
                @Override
                public void changed (ChangeEvent event, Actor actor) {

                }
            });
            st.addActor(songTitle[i]);
            normalDifficulty[i] = new TextButton("Normal",Quantum);
            normalDifficulty[i].setStyle(Quantum.get("default",TextButton.TextButtonStyle.class));
            normalDifficulty[i].setPosition((Gdx.graphics.getWidth()/2)-200,((Gdx.graphics.getHeight()/2)-100)+(200*i), Align.center);
            normalDifficulty[i].setSize(200,75);
            normalDifficulty[i].addListener(new ChangeListener() {
                @Override
                public void changed (ChangeEvent event, Actor actor) {

                }
            });
            st.addActor(normalDifficulty[i]);
            expertDifficulty[i] = new TextButton("Expert",Quantum);
            expertDifficulty[i].setStyle(Quantum.get("default",TextButton.TextButtonStyle.class));
            expertDifficulty[i].setPosition((Gdx.graphics.getWidth()/2)+200,((Gdx.graphics.getHeight()/2)-100)+(200*i), Align.center);
            expertDifficulty[i].setSize(150,50);
            expertDifficulty[i].addListener(new ChangeListener() {
                @Override
                public void changed (ChangeEvent event, Actor actor) {

                }
            });
            st.addActor(expertDifficulty[i]);

        }
        songHolder[0] = songTitle;
        songHolder[1] = normalDifficulty;
        songHolder[2] = expertDifficulty;
    }

    @Override
    public void update(float dt) {

    }
}
