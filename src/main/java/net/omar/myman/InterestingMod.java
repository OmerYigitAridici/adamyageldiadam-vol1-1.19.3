package net.omar.myman;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InterestingMod implements ModInitializer {
	public static final String MOD_ID ="myman";
	public static final Logger LOGGER = LoggerFactory.getLogger("myman");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
	}
}