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


public class Citrine_Block {
    public static final Block CITRINE_BLOCK = registerCitrineBlock("citrine_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(8.0f).requiresTool()), ItemGroups.BUILDING_BLOCKS);
    private static Block registerCitrineBlock(String name, Block block, ItemGroup group) {
        registerCitrineBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(InterestingMod.MOD_ID,name),block);
    }
    private static Item registerCitrineBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(InterestingMod.MOD_ID, name),
                    new BlockItem(block,new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }
    public static void registerCitrine_Block() {
        InterestingMod.LOGGER.info("Registering Citrine_Block for" + InterestingMod.MOD_ID);
    }
}
