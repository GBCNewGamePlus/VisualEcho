package com.mygdx.game.screen;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.utils.Align;
import com.mygdx.game.base.ScreenBeta;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;

public final class Credits extends ScreenBeta {
    private Table mainContent;
    private TextButton back;
    private ChangeListener backListener;
    private Label title;
    private Label programmer1;
    private Label programmer2;
    private Label programmer3;

    @Override
    public void initialize() {
        float padTableItems = HEIGHT/30.0f;

        // Table elements
        title = new Label("Credits", sk);
        title.setFontScale(4.0f);
        programmer1= new Label("Brody Paterson Mulligan", sk);
        programmer1.setFontScale(2.5f);
        programmer2= new Label("Ekin Karayalcin", sk);
        programmer2.setFontScale(2.5f);
        programmer3= new Label("Ricardo Shimoda Nakasako", sk);
        programmer3.setFontScale(2.5f);

        back = new TextButton("Back", sk);
        float originalWidthBK = back.getWidth();
        float originalHeightBK = back.getHeight();
        float rateBK = 0.15f * (HEIGHT/originalHeightBK);
        back.getLabel().setFontScale(rateBK,rateBK);


        // Table
        mainContent = new Table();
        mainContent.setOrigin(Align.top);
        mainContent.setPosition(WIDTH/2,HEIGHT/2);

        mainContent.add(title).padBottom(3*padTableItems);
        mainContent.row();

        mainContent.add(programmer1).padBottom(padTableItems);
        mainContent.row();

        mainContent.add(programmer2).padBottom(padTableItems);
        mainContent.row();

        mainContent.add(programmer3).padBottom(3*padTableItems);
        mainContent.row();

        mainContent.add(back).height(originalHeightBK*rateBK).width(originalWidthBK*rateBK);

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
                transitionTo = "Title";
            }
        });
        mainContent.setVisible(true);
    }

    @Override
    public void update(float dt) {
    }

    @Override
    public void hide(){
        super.hide();
        back.removeListener(backListener);
        mainContent.setVisible(false);
    }
}
