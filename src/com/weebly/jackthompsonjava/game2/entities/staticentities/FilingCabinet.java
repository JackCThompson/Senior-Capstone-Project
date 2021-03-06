package com.weebly.jackthompsonjava.game2.entities.staticentities;

import java.awt.Rectangle;

import com.weebly.jackthompsonjava.game2.Handler;
import com.weebly.jackthompsonjava.game2.gfx.AnimHandlerUnanimated;
import com.weebly.jackthompsonjava.game2.gfx.Assets;

public class FilingCabinet extends StaticEntity{

	public FilingCabinet(int x, int y, Handler handler) {
		super(x, y, handler);
		
		this.width = 23;
		this.height = 23;

		bounds = new Rectangle(x, y, width, height);      
		collisionBox = new Rectangle(0, 18, 23, 5); 
	}

	@Override
	protected void init() {
		ID = 2003;
	}

	@Override
	protected void initAnimHandler() {
		animHandler = new AnimHandlerUnanimated(this);
		animHandler.setTexture(Assets.filingCabinet);
	}

}
