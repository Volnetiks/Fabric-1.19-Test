package com.volnetiks.testmod.items;

import com.volnetiks.testmod.TestMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup JADE = FabricItemGroupBuilder.build(new Identifier(TestMod.MOD_ID, "jade"), () -> new ItemStack(ModItems.JADE_INGOT));

}
