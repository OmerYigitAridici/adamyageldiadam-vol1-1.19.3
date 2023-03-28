package net.omar.myman.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.omar.myman.InterestingMod;

public class Deepslate_Citrine_Ore {
    public static final Block DEEPSLATE_CITRINE_ORE = registerDeepslateCitrineOre("deepslate_citrine_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6.0f).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    private static Block registerDeepslateCitrineOre(String name, Block block, ItemGroup group) {
        registerDeepslateCitrineOreItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(InterestingMod.MOD_ID, name),block);
    }
    private static Item registerDeepslateCitrineOreItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(InterestingMod.MOD_ID,name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }
    public static void registerDeepslate_Citrine_Ore(){
        InterestingMod.LOGGER.info("Registering Deepslate_Citrine_Ore for" + InterestingMod.MOD_ID);
    }
}
