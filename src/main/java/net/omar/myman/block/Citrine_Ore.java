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

public class Citrine_Ore {
    public static final Block CITRINE_ORE = registerCitrineOre("citrine_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    private static Block registerCitrineOre(String name, Block block, ItemGroup group) {
        registerCitrineOreItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(InterestingMod.MOD_ID, name),block);
    }
    private static Item registerCitrineOreItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(InterestingMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    return item;
    }
    public static void registerCitrine_Ore(){
        InterestingMod.LOGGER.info("Registering Citrine_Ore for" + InterestingMod.MOD_ID);
    }
}
