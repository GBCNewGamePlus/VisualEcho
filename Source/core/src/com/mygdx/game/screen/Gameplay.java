package com.mygdx.game.screen;

import com.badlogic.gdx.Gdx;
import com.mygdx.game.actor.Note;
import com.mygdx.game.base.ScreenBeta;

import java.sql.Time;
import java.util.Random;

public class Gameplay extends ScreenBeta
{
    private Note note;
    private float timer, spawnRate;
    private float WIDTH, HEIGHT;
    private Random random;

    @Override
    public void initialize()
    {
        WIDTH = Gdx.graphics.getWidth();
        HEIGHT = Gdx.graphics.getHeight();
        timer = 0;
        spawnRate = 5.0f;
        note = new Note(100,100, st);
        note.Spawn();
        random = new Random();
    }

    @Override
    public void update(float dt)
    {
        NoteManager(dt);
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button)
    {
        NoteCollision(screenX, HEIGHT - screenY);
        return super.touchDown(screenX, screenY, pointer, button);
    }

    private void NoteCollision(float tapX, float tapY)
    {
        if (note.isVisible())
        {
            if (tapX > note.getX() && tapX < note.getX() + note.getWidth())
            {
                if (tapY > note.getY() && tapY < note.getY() + note.getHeight())
                {
                    note.Tapped();
                }
            }
        }
    }

    private void NoteManager(float dt)
    {
        timer += dt;
        if (timer >= spawnRate)
        {
            note.setX(random.nextFloat() * (WIDTH - note.getWidth()));
            note.setY(random.nextFloat() * (HEIGHT - note.getHeight()));
            note.Spawn();
            timer = 0;
        }
    }
}
