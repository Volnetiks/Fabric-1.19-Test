package com.volnetiks.testmod.utils;

import com.volnetiks.testmod.TestMod;
import com.volnetiks.testmod.items.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {

    public static void registerModUtilities() {
        registerFuels();
    }

    private static void registerFuels() {
        TestMod.LOGGER.info("Registering fuels for " + TestMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.FUEL, 200);
    }

}
