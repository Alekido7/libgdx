package org.sfsoft.drop.characters;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

public class Frog extends Item {

	public Frog(Vector2 position, float speed, 
		TextureRegion texture, int score) {
		super(position, speed, texture, score);
	}

	@Override
	public void update(float dt) {
		
		move(new Vector2(0, -dt));
	}
}
