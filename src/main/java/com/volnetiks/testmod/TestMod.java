package com.volnetiks.testmod;

import com.volnetiks.testmod.blocks.ModBlocks;
import com.volnetiks.testmod.items.ModItems;
import com.volnetiks.testmod.painting.ModPaintings;
import com.volnetiks.testmod.utils.ModRegistries;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {

	public static final String MOD_ID = "testmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModRegistries.registerModUtilities();
		ModPaintings.registerPaintings();
	}
}
