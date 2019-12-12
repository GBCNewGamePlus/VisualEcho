package com.mygdx.game.actor;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.mygdx.game.base.ActorBeta;

public class Streak extends ActorBeta
{
    private Skin skin;
    private Label label;

    public Streak(float x, float y, Stage s)
    {
        super(x, y, s);
        skin = new Skin(Gdx.files.internal("Skin/Quantum UI SCF.json"));
        skin.getFont("font").getData().setScale(2.0f);
        label = new Label("Streak: 0", skin);
        label.setPosition(x, y);
        s.addActor(label);
    }
    public void SetStreak(int streak)
    {
        label.setText("Score: " + (int)streak);
    }
}
