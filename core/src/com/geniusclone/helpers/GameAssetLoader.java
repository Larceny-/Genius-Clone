package com.geniusclone.helpers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class GameAssetLoader {
    public static Texture squareTexture, squareTextureGlow, circleTexture, gameplayBgTexture;
    public static TextureRegion greenSquare, redSquare, yellowSquare, blueSquare;
    public static TextureRegion greenSquareGlow, redSquareGlow, yellowSquareGlow, blueSquareGlow;
    public static Sound redsound, bluesound, yellowsound, greensound, errorSound;
    public static BitmapFont font;

    public static void load() {
        // Gameplay Background
        gameplayBgTexture = new Texture("images/gameplay/background.png");
        gameplayBgTexture.setFilter(TextureFilter.Nearest, TextureFilter.Nearest);

        // gameplayTextures
        circleTexture = new Texture("images/gameplay/circle.png");
        circleTexture.setFilter(TextureFilter.Nearest, TextureFilter.Nearest);

        squareTexture = new Texture("images/gameplay/squaretextures.png");
        squareTexture.setFilter(TextureFilter.Nearest, TextureFilter.Nearest);
        greenSquare = new TextureRegion(squareTexture, 0, 0, 160, 160);
        redSquare = new TextureRegion(squareTexture, 161, 0, 160, 160);
        yellowSquare = new TextureRegion(squareTexture, 322, 0, 160, 160);
        blueSquare = new TextureRegion(squareTexture, 483, 0, 160, 160);

        squareTextureGlow = new Texture("images/gameplay/squaretexturesglow.png");
        squareTextureGlow.setFilter(TextureFilter.Nearest, TextureFilter.Nearest);
        greenSquareGlow = new TextureRegion(squareTextureGlow, 0, 0, 160, 160);
        redSquareGlow = new TextureRegion(squareTextureGlow, 161, 0, 160, 160);
        yellowSquareGlow = new TextureRegion(squareTextureGlow, 322, 0, 160, 160);
        blueSquareGlow = new TextureRegion(squareTextureGlow, 483, 0, 160, 160);

        // sounds
        redsound = Gdx.audio.newSound(Gdx.files.internal("sounds/gameplay/redsound.mp3"));
        bluesound = Gdx.audio.newSound(Gdx.files.internal("sounds/gameplay/bluesound.mp3"));
        greensound = Gdx.audio.newSound(Gdx.files.internal("sounds/gameplay/greensound.mp3"));
        yellowsound = Gdx.audio.newSound(Gdx.files.internal("sounds/gameplay/yellowsound.mp3"));
        errorSound = Gdx.audio.newSound(Gdx.files.internal("sounds/gameplay/errorsound.mp3"));

        //fonts
        font = new BitmapFont(Gdx.files.internal("fonts/text.fnt"));
        font.getData().setScale(.25f, .25f);

    }

    public static void dispose() {
        // We must dispose of the texture when we are finished.

        // textures
        squareTexture.dispose();
        squareTextureGlow.dispose();
        circleTexture.dispose();
        gameplayBgTexture.dispose();

        // sounds
        redsound.dispose();
        bluesound.dispose();
        greensound.dispose();
        yellowsound.dispose();
        errorSound.dispose();

        // fonts
        font.dispose();
    }

}