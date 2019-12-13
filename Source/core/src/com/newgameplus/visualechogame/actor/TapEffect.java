package com.newgameplus.visualechogame.actor;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.newgameplus.visualechogame.base.ActorBeta;

public class TapEffect extends ActorBeta
{
    private float WIDTH, HEIGHT;
    private Animation anim;

    public TapEffect(float x, float y, Stage s)
    {
        super(x, y, s);
        WIDTH = Gdx.graphics.getWidth();
        HEIGHT = Gdx.graphics.getHeight();

        anim = loadAnimationFromFiles(GetSpritesFromFile("TapGreen", 22), 0.02f, false);
        setVisible(false);

    }

    @Override
    public void act(float dt)
    {
        super.act(dt);
        if (anim.getKeyFrameIndex(getElapsedTime()) >=  21)
        {
            setVisible(false);
        }
    }

    public void Spawn(float x, float y)
    {
        setPosition(x,y);
        setVisible(true);
        setAnimation(anim, true);
    }

    private String[] GetSpritesFromFile(String dir, int size)
    {
        String[] array = new String[size];
        for (int i = 0; i < size; i++)
        {
            array[i] = dir + "/" + (i+1) + ".png";
        }
        return array;
    }
}
