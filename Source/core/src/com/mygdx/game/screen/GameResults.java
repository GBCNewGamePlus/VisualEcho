package com.mygdx.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.CheckBox;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.utils.Align;
import com.mygdx.game.actor.gameResults.FinalImage;
import com.mygdx.game.base.ScreenBeta;

import java.util.Random;

public final class GameResults extends ScreenBeta {

    private Table mainContent;
    private FinalImage finalImage;

    private TextButton retrySong;
    private ChangeListener retrySongListener;

    private TextButton back;
    private ChangeListener backListener;

    private Label titleText;
    private Label resultText;

    private Music soundTrack;

    private Random random;
    private Preferences results;

    @Override
    public void initialize() {
        random = new Random();

        float padTableItems = HEIGHT/30.0f;
        // Table elements
        titleText = new Label("Performance", sk);
        titleText.setFontScale(3.0f);

        resultText= new Label("Accuracy: " + SongData.accuracy + "%\nScore: " + SongData.score, sk);
        resultText.setFontScale(4.0f);

        retrySong = new TextButton("Retry", sk);
        back = new TextButton("Back", sk);

        // Table
        mainContent = new Table();
        mainContent.setOrigin(Align.top);
        mainContent.setPosition(WIDTH/2,HEIGHT/2);

        mainContent.add(titleText).padBottom(3*padTableItems).colspan(2);
        mainContent.row();

        mainContent.add(resultText).padBottom(3*padTableItems).colspan(2);
        mainContent.row();

        mainContent.add(retrySong);
        mainContent.add(back);

        mainContent.setDebug(false);
        mainContent.setVisible(false);

    }

    @Override
    public void show() {
        super.show();
        mainContent.setVisible(true);

        float dice = random.nextFloat();
        int imageAndSound = 4;
        if(dice <=0.25f){
            imageAndSound = 1;
        }else if(dice <=0.5f){
            imageAndSound = 2;
        }else if(dice <=0.75f){
            imageAndSound = 3;
        }
        //finalImage = new FinalImage (0, 0, st, WIDTH, HEIGHT, "GameResults/Image" + Integer.toString(imageAndSound) + ".jpg");
        soundTrack = Gdx.audio.newMusic(Gdx.files.internal("GameResults/Results"+ Integer.toString(imageAndSound) +".mp3"));
        soundTrack.play();

        st.addActor(mainContent);

        mainContent.addAction(Actions.sequence(
                Actions.fadeOut(0), Actions.fadeIn(4.0f)));

        retrySong.addListener(retrySongListener = new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                transitionTo = "Gameplay";
            }
        });
        back.addListener(backListener = new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                transitionTo = "SongSelection";
            }
        });

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void hide() {
        super.hide();
        retrySong.removeListener(retrySongListener);
        back.removeListener(backListener);
        mainContent.remove();
    }

}
