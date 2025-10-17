package net.casper.azuritemod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.casper.azuritemod.AzuriteMod;
import net.casper.azuritemod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup AZURITE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AzuriteMod.MOD_ID, "azurite_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RAW_AZURITE))
                    .displayName(Text.translatable("itemgroup.azuritemod.azurite_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.AZURITE_INGOT);
                        entries.add(ModItems.RAW_AZURITE);
                    }).build());

    public static final ItemGroup AZURITE_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AzuriteMod.MOD_ID, "azurite_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.AZURITE_BLOCK))
                    .displayName(Text.translatable("itemgroup.azuritemod.azurite_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.AZURITE_BLOCK);
                    }).build());

    public static final ItemGroup DILLY_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AzuriteMod.MOD_ID, "dilly_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.DILLY))
                    .displayName(Text.translatable("itemgroup.azuritemod.dilly_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.DILLY_BLOCK);
                        entries.add(ModBlocks.AZURITE_BLOCK);
                        entries.add(ModItems.DILLY);
                    })
                    .build()
    );



    public static void registerItemGroups() {
        AzuriteMod.LOGGER.info("Registering Item Groups for " + AzuriteMod.MOD_ID);
    }
}