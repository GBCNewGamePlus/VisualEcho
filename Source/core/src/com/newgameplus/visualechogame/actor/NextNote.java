package com.newgameplus.visualechogame.actor;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.newgameplus.visualechogame.base.ActorBeta;

public class NextNote extends ActorBeta
{
    public int index;
    private float WIDTH, HEIGHT;
    private Animation idle;

    public NextNote(float x, float y, int thisIndex, Stage s)
    {
        super(x, y, s);
        WIDTH = Gdx.graphics.getWidth();
        HEIGHT = Gdx.graphics.getHeight();

        index = thisIndex;
        idle = loadAnimationFromFiles(GetSpritesFromFile("NextNote", 1), 1, true);
        setVisible(false);
        setAnimation(idle, true);
    }

    @Override
    public void act(float dt)
    {
        super.act(dt);
    }

    public void Spawn(float x, float y)
    {
        setPosition(x,y);
        setVisible(true);
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

