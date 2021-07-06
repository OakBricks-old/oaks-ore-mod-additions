package org.oakbricks.oakoresplus;

import net.fabricmc.api.ModInitializer;
import org.oakbricks.oakoresplus.init.ModBlocks;

public class OakOresPlus implements ModInitializer {
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModBlocks.blockInit();

		System.out.println("Hello Fabric world!");
	}
}
