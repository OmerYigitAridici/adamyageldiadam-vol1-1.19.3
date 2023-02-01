package net.omar.myman;

import net.fabricmc.api.ModInitializer;

import net.omar.myman.item.CitrineVariations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InterestingMod implements ModInitializer {
	public static final String MOD_ID = "myman";
	public static final Logger LOGGER = LoggerFactory.getLogger("myman");

	@Override
	public void onInitialize() {
		CitrineVariations.registerModItems();
	}
}