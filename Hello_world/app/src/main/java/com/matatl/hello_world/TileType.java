package com.matatl.hello_world;

/**
 * This enum contains the types for tiles on
 * the board. This includes <code>TILE_TYPE_DEFAULT</code>
 * which is used when a tile is inactive, 
 * <code>TILE_TYPE_POINT</code> for active tiles,
 * <code>TILE_TYPE_BOMB</code> for the bomb tiles,
 * and <code>TILE_TYPE_MULT</code> for multipliers
 */

public enum TileType {
	TILE_TYPE_DEFAULT,
	TILE_TYPE_POINT,
	TILE_TYPE_BOMB,
	TILE_TYPE_MULT
}