package com.newgameplus.visualechogame.actor.title;

import com.newgameplus.visualechogame.base.ActorBeta;

public final class GameLogo extends ActorBeta {
    public GameLogo (float sizeY, String texturePath) {
        // Setup basic stuff
        loadTexture(texturePath);
        // resizes the logo according to the screen
        float originalHeight = getHeight();
        float originalWidth = getWidth();

        float ratioY = sizeY/originalHeight;

        setHeight(originalHeight * ratioY);
        setWidth(originalWidth * ratioY);


    }
}
