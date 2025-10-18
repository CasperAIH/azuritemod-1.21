package net.casper.azuritemod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.casper.azuritemod.AzuriteMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item AZURITE_INGOT = registerItem("azurite_ingot", new Item(new Item.Settings()));
    public static final Item RAW_AZURITE = registerItem("raw_azurite", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AzuriteMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AzuriteMod.LOGGER.info("Registering Mod Items for " + AzuriteMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(AZURITE_INGOT);
            entries.add(RAW_AZURITE);

        });
    }
}