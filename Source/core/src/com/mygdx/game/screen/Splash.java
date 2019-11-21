package com.mygdx.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.actions.RunnableAction;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.mygdx.game.actor.splash.Logo;
import com.mygdx.game.base.ScreenBeta;

public final class Splash extends ScreenBeta {
    private Logo groupLogo;
    private Label groupNameLabel;
    private Logo gameTitle;
    private Music soundTrack;
    private boolean startedMusic = false;

    @Override
    public void initialize() {
        groupLogo = new Logo(0, 0, st, WIDTH, HEIGHT, "Splash/NGPlusLogo.png");
        gameTitle = new Logo(0, 0, st, WIDTH, HEIGHT, "Splash/VisualEcho.png");

        soundTrack = Gdx.audio.newMusic(Gdx.files.internal("Splash/CyberIntro.mp3"));
        soundTrack.setVolume(0.3f);
        soundTrack.setLooping(false);

        groupNameLabel = new Label("NewGamePlus presents", sk);
        groupNameLabel.setFontScale(1.5f);
        groupNameLabel.setPosition(3*WIDTH/12, HEIGHT - 11*HEIGHT/12);
        st.addActor(groupNameLabel);
    }

    @Override
    public void show()
    {
        super.show();
        soundTrack.play();
        gameTitle.addAction(Actions.fadeOut(0));
        groupNameLabel.addAction(Actions.fadeOut(0));
        RunnableAction run = new RunnableAction();
        run.setRunnable(new Runnable() {
            @Override
            public void run() {
                startedMusic = true;
                gameTitle.addAction(Actions.sequence(
                        Actions.fadeOut(0), Actions.fadeIn(3.0f)
                ));
            }
        });
        groupLogo.addAction(Actions.forever(Actions.sequence(
                Actions.scaleTo(1.01f,1.01f,0.3f),
                Actions.scaleTo(1.0f,1.0f,0.3f),
                Actions.scaleTo(0.99f,0.99f,0.3f),
                Actions.scaleTo(1.0f,1.0f,0.3f)
        )));
        groupNameLabel.addAction(Actions.sequence(
                Actions.fadeOut(0), Actions.fadeIn(2.0f),Actions.fadeOut(2.5f)));

        groupLogo.addAction(Actions.sequence(
                Actions.fadeOut(0), Actions.fadeIn(2.0f),Actions.fadeOut(2.5f),
                run
        ));
    }


    @Override
    public void update(float dt) {
        if(startedMusic && !soundTrack.isPlaying()){
            transitionTo = "Title";
        }
    }

    @Override
    public void hide(){
        super.hide();
    }

}
