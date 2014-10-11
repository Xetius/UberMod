package com.xetius.ubermod.recipes;

import com.xetius.ubermod.items.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes {
    public static void addRecipes() {
        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond), new ItemStack(ModItems.smeltedDiamond), new ItemStack(Items.dye, 1, 4));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot), new ItemStack(ModItems.smeltedGold), new ItemStack(Items.dye, 1, 4));
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot), new ItemStack(ModItems.smeltedIron), new ItemStack(Items.dye, 1, 4));
    }
}
