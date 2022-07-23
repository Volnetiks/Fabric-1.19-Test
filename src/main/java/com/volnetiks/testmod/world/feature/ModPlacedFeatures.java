package com.volnetiks.testmod.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryEntry<PlacedFeature> JADE_ORE_PLACED = PlacedFeatures.register("jade_ore_placed", ModConfiguredFeatures.JADE_ORE, modifiersWithCount(9, HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(80))));
    public static final RegistryEntry<PlacedFeature> NETHER_JADE_ORE_PLACED = PlacedFeatures.register("nether_jade_ore_placed", ModConfiguredFeatures.NETHER_JADE_ORE, modifiersWithCount(10, HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(80))));
    public static final RegistryEntry<PlacedFeature> END_JADE_ORE_PLACED = PlacedFeatures.register("end_jade_ore_placed", ModConfiguredFeatures.END_JADE_ORE, modifiersWithCount(6, HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(80))));

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    private static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    private static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }

}
