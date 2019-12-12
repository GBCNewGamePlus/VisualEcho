package com.mygdx.game.actor;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.mygdx.game.base.ActorBeta;

public class Note extends ActorBeta
{
    private float WIDTH, HEIGHT;
    private Animation noteSpawn;
    private int noteSpawnSize;
    public float animTime;
    private TapEffect effect;

    public Note(float x, float y, Stage s)
    {
        super(x, y, s);
        WIDTH = Gdx.graphics.getWidth();
        HEIGHT = Gdx.graphics.getHeight();

        noteSpawnSize = 12;
        noteSpawn = loadAnimationFromFiles(GetSpritesFromFile("Note", noteSpawnSize), 0.07f, false);
        setVisible(false);
        setAnimation(noteSpawn, false);
        animTime = 0.07f * 12;
        effect = new TapEffect(0,0, s);
    }

    @Override
    public void act(float dt)
    {
        super.act(dt);
        ManageNote();
    }

    private void ManageNote()
    {
        if (isVisible())
        {
            if (noteSpawn.getKeyFrameIndex(getElapsedTime()) == noteSpawnSize - 1)
            {
                setVisible(false);
            }
        }
    }

    public void Spawn(float x, float y)
    {
        setPosition(x,y);
        setVisible(true);
        setAnimation(noteSpawn, false);
    }

    public int Tapped() // Returns the score you get.
    {
        setVisible(false);
        if (noteSpawn.getKeyFrameIndex(getElapsedTime()) >=  7)
        {
            effect.Spawn(getX() - 25, getY() - 25);
            return 10;
        }
        if (noteSpawn.getKeyFrameIndex(getElapsedTime()) >=  4)
        {
            return 5;
        }
        return 2;
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
