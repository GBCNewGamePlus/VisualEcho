package com.mygdx.game.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.CheckBox;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextField;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.utils.Align;
import com.mygdx.game.base.ScreenBeta;

public final class Settings extends ScreenBeta {
    private Table mainContent;
    private TextButton back;
    private ChangeListener backListener;
    private Label title;
    private Label vibrationLabel;
    private Label latencyLabel;
    private CheckBox vibration;
    private TextField latency;
    private Preferences prefs;
    boolean vibrationSetting = true;
    float latencySetting = 0.0f;

    @Override
    public void initialize() {
        float padTableItems = HEIGHT/30.0f;
        prefs = Gdx.app.getPreferences("VisualEchoPreferences");

        // Table elements
        title = new Label("Settings", sk);
        title.setFontScale(3.0f);

        vibrationLabel= new Label("Vibration", sk);
        vibrationLabel.setFontScale(2.0f);

        latencyLabel= new Label("Latency", sk);
        latencyLabel.setFontScale(2.0f);

        vibration = new CheckBox("", sk);
        latency = new TextField("", sk);

        back = new TextButton("Back", sk);

        // Table
        mainContent = new Table();
        mainContent.setOrigin(Align.top);
        mainContent.setPosition(WIDTH/2,HEIGHT/2);

        mainContent.add(title).padBottom(3*padTableItems).colspan(2);
        mainContent.row();

        mainContent.add(vibrationLabel).padBottom(padTableItems);
        mainContent.add(vibration);
        mainContent.row();

        mainContent.add(latencyLabel).padBottom(3*padTableItems);
        mainContent.add(latency).padBottom(3*padTableItems);
        mainContent.row();

        mainContent.add(back).colspan(2);

        st.addActor(mainContent);
        mainContent.setDebug(false);
        mainContent.setVisible(false);
    }

    @Override
    public void show() {
        super.show();
        back.addListener(backListener = new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                prefs.putBoolean("Vibration", vibration.isChecked());
                prefs.putFloat("Latency", Float.parseFloat(latency.getText()));
                prefs.flush();
                transitionTo = "Title";
            }
        });

        if(!prefs.contains("Vibration")){
            prefs.putBoolean("Vibration", vibrationSetting);
        } else {
            vibrationSetting = prefs.getBoolean("Vibration");
        }
        vibration.setChecked(vibrationSetting);

        if(!prefs.contains("Latency")){
            prefs.putFloat("Latency", latencySetting);
        } else {
            latencySetting = prefs.getFloat("Latency");
        }
        latency.setText(Float.toString(latencySetting));

        mainContent.setVisible(true);
        prefs.flush();
    }

    @Override
    public void update(float dt) {
    }

    @Override
    public void hide(){
        super.hide();
        back.removeListener(backListener);
        mainContent.setVisible(false);
    }}
