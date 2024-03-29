package net.omar.myman.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.omar.myman.InterestingMod;

public class Citrine {
    public static final Item CITRINE = registerItem("citrine",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
       return Registry.register(Registries.ITEM, new Identifier(InterestingMod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.INGREDIENTS, CITRINE);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerCitrine() {
        InterestingMod.LOGGER.info("Registering Citrine for" + InterestingMod.MOD_ID);

        addItemsToItemGroup();
    }
}
