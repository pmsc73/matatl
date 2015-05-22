package com.matatl.hello_world;

/**
 * This enum contains the types for tiles on
 * the board. This includes
 * <ul>
 * <li><code>TILE_TYPE_DEFAULT</code> which is used when a tile is inactive,</li>
 * <li><code>TILE_TYPE_POINT</code> for active tiles,</li>
 * <li><code>TILE_TYPE_BOMB</code> for the bomb tiles, and </li>
 * <li><code>TILE_TYPE_MULT</code> for multipliers</li>
 * </ul>
 */

public enum TileType {
	TILE_TYPE_DEFAULT,
	TILE_TYPE_POINT,
	TILE_TYPE_BOMB,
	TILE_TYPE_MULT
}