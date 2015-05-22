package com.matatl.hello_world;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.support.v7.app.ActionBarActivity;

/**
 * Represents a tile object in the game
 * @see ImageButton
 * @author Philip
 */
 
public class Tile extends ImageButton {
    // this value will be set for every tile upon creation
	private TileType type = TileType.TILE_TYPE_DEFAULT;

    public Tile(Context context) {
        super(context);
    }

    public Tile(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public Tile(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    public void setType(TileType type) {
        this.type = type;

    }
}