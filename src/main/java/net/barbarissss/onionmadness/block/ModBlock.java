package net.barbarissss.onionmadness.block;

import net.barbarissss.onionmadness.OnionMadness;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlock {
    public static final Block ONION_RING_BLOCK = registerBlock("onion_ring_block", new Block(FabricBlockSettings.copyOf(Blocks.WARPED_WART_BLOCK)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(OnionMadness.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
       return Registry.register(Registries.ITEM,
               new Identifier(OnionMadness.MOD_ID, name),
               new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        OnionMadness.LOGGER.info("reg block for" + OnionMadness.MOD_ID);
    }
}
