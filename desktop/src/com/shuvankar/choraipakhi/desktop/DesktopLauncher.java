package com.shuvankar.choraipakhi.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.shuvankar.choraipakhi.ZeroGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Chori Pakhi";
		config.width = 272;
		config.height = 408;
		new LwjglApplication(new ZeroGame(), config);
	}
}
