package net.dogdev.stuffmod;

import net.dogdev.stuffmod.block.ModBlocks;
import net.dogdev.stuffmod.item.ModItems;
import net.dogdev.stuffmod.painting.ModPaintings;
import net.dogdev.stuffmod.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class StuffMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.


	public static final String MOD_ID = "stuffmod";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModPaintings.registerPainting();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGen.generateModWorldGen();

		LOGGER.info("Hello Fabric world!");
	}
}
