package com.mygdx.game.actor.splash;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.Align;
import com.mygdx.game.base.ActorBeta;

public final class Logo extends ActorBeta {
    public Logo (float x, float y, Stage s, float sizeX, float sizeY, String texturePath) {
        // Setup basic stuff
        super(x, y, s);
        loadTexture(texturePath);//"Title/TitleScreen.jpg"

        setOrigin(Align.center);

        // Defines the largest ratio to cover the screen
        float ratioX = sizeX/this.getWidth();
        float ratioY = sizeY/this.getHeight();
        float finalScale = (ratioX < ratioY) ? ratioX:ratioY;

        float originalHeight = getHeight();
        float originalWidth = getWidth();

        setHeight(originalHeight * finalScale);
        setWidth(originalWidth * finalScale);

        // Centers the image regardless of what is passed on x and y
        setX((sizeX - getWidth())/2);
        setY((sizeY - getHeight())/2);
    }
}
