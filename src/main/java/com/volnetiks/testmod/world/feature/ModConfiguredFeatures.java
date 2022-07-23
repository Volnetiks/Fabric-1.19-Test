package com.volnetiks.testmod.world.feature;

import com.volnetiks.testmod.TestMod;
import com.volnetiks.testmod.blocks.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreFeatureConfig.Target> OVERWORLD_JADE_ORES = List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.JADE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_JADE_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> NETHER_JADE_ORES = List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.BASE_STONE_NETHER, ModBlocks.NETHERRACK_JADE_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> END_JADE_ORES = List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.JADE_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(new BlockMatchRuleTest(Blocks.END_STONE), ModBlocks.END_JADE_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> JADE_ORE = ConfiguredFeatures.register("jade_ore", Feature.ORE, new OreFeatureConfig(OVERWORLD_JADE_ORES, 9));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> NETHER_JADE_ORE = ConfiguredFeatures.register("nether_jade_ore", Feature.ORE, new OreFeatureConfig(NETHER_JADE_ORES, 12));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> END_JADE_ORE = ConfiguredFeatures.register("end_jade_ore", Feature.ORE, new OreFeatureConfig(END_JADE_ORES, 6));

    public static void registerConfiguredFeatures() {
        TestMod.LOGGER.info("Registering Configured Features for " + TestMod.MOD_ID);
    }

}
