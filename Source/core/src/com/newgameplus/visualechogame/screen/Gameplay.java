package com.newgameplus.visualechogame.screen;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.audio.Music;
import com.newgameplus.visualechogame.actor.NextNote;
import com.newgameplus.visualechogame.actor.Note;
import com.newgameplus.visualechogame.actor.Score;
import com.newgameplus.visualechogame.base.ScreenBeta;
import java.util.ArrayList;

public class Gameplay extends ScreenBeta
{
    public String transitionTo;
    private float WIDTH, HEIGHT;
    private float startSongAfter, startSongTimer;
    private Music song;
    private float animTime, lag;
    private ArrayList<Note> notes;
    private ArrayList<NextNote> nextNotes;
    private float spawnNextNoteBefore;
    private int nextNoteIndex;
    private int noteIndex;
    private int posIndex;
    private int nextPosIndex;
    private float[] timeStamps, positions;
    private int score;
    private int notesTapped;
    private Score scoreLabel;
    private Preferences prefs;
    private boolean showNote;

    @Override
    public void initialize()
    {
        prefs = Gdx.app.getPreferences("VisualEchoPreferences");
        WIDTH = Gdx.graphics.getWidth();
        HEIGHT = Gdx.graphics.getHeight();
        Gdx.app.log("DEBUG", "" + WIDTH + "x" + HEIGHT);
        song = Gdx.audio.newMusic(Gdx.files.internal("01.FULL TRACKS/02. Neon Trip.mp3"));
        song.setLooping(false);
        notes = new ArrayList<>();
        for (int i = 0; i < 20; i++)
        {
            notes.add(new Note(0,0, st));
        }
        nextNotes = new ArrayList<>();
        for (int i = 0; i < 20; i++)
        {
            nextNotes.add(new NextNote(0,0, -1, st));
        }
        animTime = notes.get(0).animTime;

    }

    @Override
    public void show()
    {
        super.show();
        startSongAfter = 3.0f;
        startSongTimer = 0;
        nextNoteIndex = 0;
        noteIndex = 0;
        posIndex = 0;
        nextPosIndex = 0;
        spawnNextNoteBefore = 1;
        score = 0;
        notesTapped = 0;
        transitionTo = "";
        timeStamps = SongData.timeStamps;
        positions = SongData.positions;
        scoreLabel = new Score(75, HEIGHT - 150, st);
        Gdx.app.log("DEBUG", "Timestamps: " + timeStamps.length);
        Gdx.app.log("DEBUG", "Positions: " + positions.length);

        showNote = true;
        if(prefs.contains("ShowNextNote")){
            showNote = prefs.getBoolean("ShowNextNote");
        }
        lag = 0.2f;
        if(prefs.contains("Latency")){
            lag = prefs.getFloat("Latency");
        }

    }

    @Override
    public void update(float dt)
    {
        //NoteManager(dt);
        StartSong(dt);
        //ProcessNextNotes();
        ProcessNotes();
        EndSong();
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button)
    {
        NoteCollision(screenX, HEIGHT - screenY);
        return super.touchDown(screenX, screenY, pointer, button);
    }

    @Override
    public void hide()
    {
        super.hide();
    }

    private void NoteCollision(float tapX, float tapY)
    {
        for (int i = 0; i < notes.size(); i++)
        {
            Note thisNote = notes.get(i);
            if (thisNote.isVisible())
            {
                if (tapX > thisNote.getX() && tapX < thisNote.getX() + thisNote.getWidth())
                {
                    if (tapY > thisNote.getY() && tapY < thisNote.getY() + thisNote.getHeight())
                    {
                        notesTapped++;
                        score += thisNote.Tapped();
                        scoreLabel.SetScore( score, (int)( ((float)notesTapped / (float)(noteIndex) * 100) ) );
                        break;
                    }
                }
            }
        }
    }

    private void StartSong(float dt)
    {
        if (!song.isPlaying())
        {
            startSongTimer += dt;
            if (startSongTimer >= startSongAfter)
            {
                StartFrom(0);
            }
        }
    }

    private void EndSong()
    {
        if (song.isPlaying() && song.getPosition() >= 211)
        {
            song.stop();
            prefs.putInteger("CurrentAccuracy", (int)(((float)notesTapped / (float)timeStamps.length) * 100));
            prefs.putInteger("CurrentScore", score);
            prefs.flush();
            transitionTo = "GameResults";
        }
    }

    private void SpawnNote(float x, float y)
    {
        for (int i = 0; i < notes.size(); i++)
        {
            Note thisNote = notes.get(i);
            if (!thisNote.isVisible())
            {
                thisNote.Spawn(x,y);
                break;
            }
        }
    }

    private void SpawnNextNote(float x, float y, int index)
    {
        for (int i = 0; i < nextNotes.size(); i++)
        {
            NextNote thisNote = nextNotes.get(i);
            if (!thisNote.isVisible())
            {
                thisNote.Spawn(x,y);
                thisNote.index = index;
                break;
            }
        }
    }

    private void DespawnNextNote(int index)
    {
        for (int i = 0; i < nextNotes.size(); i++)
        {
            NextNote thisNote = nextNotes.get(i);
            if (thisNote.index == index)
            {
                thisNote.setVisible(false);
                break;
            }
        }
    }

    private void ProcessNotes()
    {
        if (noteIndex < timeStamps.length)
        {
            if (song.getPosition() >= (timeStamps[noteIndex] - animTime + lag))
            {
                SpawnNote(positions[posIndex], positions[posIndex+1]);
                DespawnNextNote(noteIndex);
                noteIndex++;
                posIndex += 2;
            }
        }
    }

    private void ProcessNextNotes()
    {
        if (nextNoteIndex < timeStamps.length)
        {
            if (song.getPosition() >= (timeStamps[nextNoteIndex] - animTime + lag - spawnNextNoteBefore))
            {
                SpawnNextNote(positions[nextPosIndex] + 100 - 16, positions[nextPosIndex+1] + 100 - 16, nextNoteIndex);
                nextNoteIndex++;
                nextPosIndex += 2;
            }
        }
    }

    private void StartFrom(float sec)
    {
        while (true)
        {
            if (timeStamps[noteIndex] < sec)
            {
                noteIndex++;
                posIndex += 2;
            }
            else
            {
                break;
            }
        }
        song.setPosition(sec);
        song.play();
    }
}
