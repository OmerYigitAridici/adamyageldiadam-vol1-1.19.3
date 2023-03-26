package net.omar.myman;

import net.fabricmc.api.ModInitializer;

import net.omar.myman.block.Citrine_Block;
import net.omar.myman.block.Citrine_Ore;
import net.omar.myman.block.Deepslate_Citrine_Ore;
import net.omar.myman.item.Citrine;
import net.omar.myman.item.Raw_Citrine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InterestingMod implements ModInitializer {
	public static final String MOD_ID = "myman";
	public static final Logger LOGGER = LoggerFactory.getLogger("myman");

	@Override
	public void onInitialize() {
		Citrine.registerCitrine();
		Raw_Citrine.registerRaw_Citrine();
		Citrine_Block.registerCitrine_Block();
		Citrine_Ore.registerCitrine_Ore();
		Deepslate_Citrine_Ore.registerDeepslate_Citrine_Ore();
	}
}