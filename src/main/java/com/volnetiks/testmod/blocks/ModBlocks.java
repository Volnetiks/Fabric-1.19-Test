package com.volnetiks.testmod.blocks;

import com.volnetiks.testmod.TestMod;
import com.volnetiks.testmod.blocks.custom.ModLampBlock;
import com.volnetiks.testmod.blocks.custom.SlowBlock;
import com.volnetiks.testmod.items.ModItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModBlocks {

    public static final Block JADE_BLOCK = registerBlock("jade_block", new Block(FabricBlockSettings.of(Material.METAL).strength(3f).requiresTool()), ModItemGroups.JADE);
    public static final Block JADE_ORE = registerBlock("jade_ore", new Block(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroups.JADE);
    public static final Block SLOW_BLOCK = registerBlock("slow_block", new SlowBlock(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroups.JADE);
    public static final Block LAMP_BLOCK = registerBlock("lamp_block", new ModLampBlock(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool().luminance(state -> state.get(ModLampBlock.LIT) ? 15 : 0)), ModItemGroups.JADE);
    public static final Block DEEPSLATE_JADE_ORE = registerBlock("deepslate_jade_ore", new Block(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroups.JADE);
    public static final Block NETHERRACK_JADE_ORE = registerBlock("netherrack_jade_ore", new Block(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroups.JADE);
    public static final Block END_JADE_ORE = registerBlock("end_jade_ore", new Block(FabricBlockSettings.of(Material.METAL).strength(2f).requiresTool()), ModItemGroups.JADE);

    private static Block registerBlock(String name, Block block, ItemGroup itemGroup, String tooltipKey) {
        registerBlockItem(name, block, itemGroup, tooltipKey);
        return Registry.register(Registry.BLOCK, new Identifier(TestMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup itemGroup, String tooltipKey) {
        return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(itemGroup)) {
            @Override
            public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                tooltip.add(Text.translatable(tooltipKey));
            }
        });
    }
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
