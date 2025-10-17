package net.casper.azuritemod;

import net.casper.azuritemod.block.ModBlocks;
import net.casper.azuritemod.item.ModItemGroups;
import net.fabricmc.api.ModInitializer;

import net.casper.azuritemod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class AzuriteMod implements ModInitializer {
    public static final String MOD_ID = "azuritemod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModItemGroups.registerItemGroups();
    }
}