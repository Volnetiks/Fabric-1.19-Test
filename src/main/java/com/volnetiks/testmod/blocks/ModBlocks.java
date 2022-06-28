package com.volnetiks.testmod.blocks;

import com.volnetiks.testmod.TestMod;
import com.volnetiks.testmod.items.ModItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block JADE_BLOCK = registerBlock("jade_block", new Block(FabricBlockSettings.of(Material.METAL).strength(3f).requiresTool()), ModItemGroups.JADE);
    public static final Block JADE_ORE = registerBlock("jade_ore", new Block(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroups.JADE);

    private static Block registerBlock(String name, Block block, ItemGroup itemGroup) {
        registerBlockItem(name, block, itemGroup);
        return Registry.register(Registry.BLOCK, new Identifier(TestMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup itemGroup) {
        return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(itemGroup)));
    }

    public static void registerModBlocks() {
        TestMod.LOGGER.info("Registering Mod Blocks for " + TestMod.MOD_ID);
    }

}
