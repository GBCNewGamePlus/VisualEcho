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
    private Music success, fail;

    public Note(float x, float y, Stage s)
    {
        super(x, y, s);
        WIDTH = Gdx.graphics.getWidth();
        HEIGHT = Gdx.graphics.getHeight();

        noteSpawnSize = 12;
        noteSpawn = loadAnimationFromFiles(GetSpritesFromFile("Note", noteSpawnSize), 0.1f, false);
        setVisible(false);
        setAnimation(noteSpawn, false);

        success = Gdx.audio.newMusic(Gdx.files.internal("success.wav"));
        success.setLooping(false);
        fail = Gdx.audio.newMusic(Gdx.files.internal("fail.wav"));
        fail.setLooping(false);
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
                PlayMusic(fail);
                setVisible(false);
            }
        }
    }

    public void Spawn()
    {
        setVisible(true);
        setAnimation(noteSpawn, false);
    }

    public void Tapped()
    {
        if (isVisible())
        {
            if (noteSpawn.getKeyFrameIndex(getElapsedTime()) > 6)
                PlayMusic(success);
            else
                PlayMusic(fail);
            setVisible(false);
        }
    }

    private void PlayMusic(Music music)
    {
        if (music.isPlaying())
            music.setPosition(0);
        music.play();
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
