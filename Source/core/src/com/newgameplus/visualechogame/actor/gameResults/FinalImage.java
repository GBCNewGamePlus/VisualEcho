package com.newgameplus.visualechogame.actor.gameResults;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.Align;
import com.newgameplus.visualechogame.base.ActorBeta;

public final class FinalImage extends ActorBeta {
    public FinalImage (float x, float y, Stage s, float sizeX, float sizeY, String texturePath) {
        // Setup basic stuff
        super(x, y, s);
        loadTexture(texturePath);//"Title/TitleScreen.jpg"

        // Defines the largest ratio to cover the screen
        loadTexture(texturePath);//"Title/TitleScreen.jpg"
        float originalWidth = getWidth();
        float originalHeight = getHeight();
        setOrigin(Align.center);

        // Defines the largest ratio to cover the screen
        float ratioX = sizeX/originalWidth;
        float ratioY = sizeY/originalHeight;
        float finalScale = (ratioX < ratioY) ? ratioX:ratioY;

        setHeight(originalHeight * finalScale);
        setWidth(originalWidth * finalScale);

        // Centers the image regardless of what is passed on x and y
        setX((sizeX - getWidth())/2);
        setY((sizeY - getHeight())/2);
    }
}
