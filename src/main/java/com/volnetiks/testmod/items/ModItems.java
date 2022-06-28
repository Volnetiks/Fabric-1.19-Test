package com.volnetiks.testmod.items;

import com.volnetiks.testmod.TestMod;
import com.volnetiks.testmod.items.custom.DowsingRodItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item JADE_INGOT = registerItem("jade_ingot", new Item(new FabricItemSettings().group(ModItemGroups.JADE)));
    public static final Item JADE_NUGGET = registerItem("jade_nugget", new Item(new FabricItemSettings().group(ModItemGroups.JADE)));
    public static final Item DOWSING_ROD = registerItem("dowsing_rod", new DowsingRodItem(new FabricItemSettings().group(ModItemGroups.JADE).maxDamage(32)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TestMod.LOGGER.info("Registering Mod Items for " + TestMod.MOD_ID);
    }
}
