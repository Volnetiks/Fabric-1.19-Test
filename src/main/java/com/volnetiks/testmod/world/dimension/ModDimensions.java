package com.volnetiks.testmod.world.dimension;

import com.volnetiks.testmod.TestMod;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

public class ModDimensions {
    public static final RegistryKey<World> CUSTOM_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY, new Identifier(TestMod.MOD_ID, "volnetiks"));
    public static final RegistryKey<DimensionType> CUSTOM_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY, CUSTOM_DIMENSION_KEY.getValue());

    public static void register() {
        TestMod.LOGGER.info("Registering Dimensions for " + TestMod.MOD_ID);

        CustomPortalBuilder.beginPortal()
                .frameBlock(Blocks.GLOWSTONE)
                .destDimID(CUSTOM_DIMENSION_KEY.getValue())
                .tintColor(45, 79, 195)
                .onlyLightInOverworld()
                .registerPortal();
    }

}
