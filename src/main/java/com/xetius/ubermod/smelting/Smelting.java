package com.xetius.ubermod.smelting;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static com.xetius.ubermod.items.ModItems.smeltedChainmail;
import static com.xetius.ubermod.items.ModItems.smeltedDiamond;
import static com.xetius.ubermod.items.ModItems.smeltedGold;
import static com.xetius.ubermod.items.ModItems.smeltedIron;

public class Smelting {
    public static void addSmeltingRecipes() {
        GameRegistry.addSmelting(Items.diamond_helmet, new ItemStack(smeltedDiamond, 4), 0.1f);
        GameRegistry.addSmelting(Items.diamond_chestplate, new ItemStack(smeltedDiamond, 6), 0.1f);
        GameRegistry.addSmelting(Items.diamond_leggings, new ItemStack(smeltedDiamond, 5), 0.1f);
        GameRegistry.addSmelting(Items.diamond_boots, new ItemStack(smeltedDiamond, 3), 0.1f);
        GameRegistry.addSmelting(Items.diamond_sword, new ItemStack(smeltedDiamond, 1), 0.1f);
        GameRegistry.addSmelting(Items.diamond_pickaxe, new ItemStack(smeltedDiamond, 2), 0.1f);
        GameRegistry.addSmelting(Items.diamond_axe, new ItemStack(smeltedDiamond, 2), 0.1f);
        GameRegistry.addSmelting(Items.diamond_hoe, new ItemStack(smeltedDiamond, 1), 0.1f);

        GameRegistry.addSmelting(Items.golden_helmet, new ItemStack(smeltedGold, 4), 0.1f);
        GameRegistry.addSmelting(Items.golden_chestplate, new ItemStack(smeltedGold, 6), 0.1f);
        GameRegistry.addSmelting(Items.golden_leggings, new ItemStack(smeltedGold, 5), 0.1f);
        GameRegistry.addSmelting(Items.golden_boots, new ItemStack(smeltedGold, 3), 0.1f);
        GameRegistry.addSmelting(Items.golden_sword, new ItemStack(smeltedGold, 1), 0.1f);
        GameRegistry.addSmelting(Items.golden_pickaxe, new ItemStack(smeltedGold, 2), 0.1f);
        GameRegistry.addSmelting(Items.golden_axe, new ItemStack(smeltedGold, 2), 0.1f);
        GameRegistry.addSmelting(Items.golden_hoe, new ItemStack(smeltedGold, 1), 0.1f);

        GameRegistry.addSmelting(Items.iron_helmet, new ItemStack(smeltedIron, 4), 0.1f);
        GameRegistry.addSmelting(Items.iron_chestplate, new ItemStack(smeltedIron, 6), 0.1f);
        GameRegistry.addSmelting(Items.iron_leggings, new ItemStack(smeltedIron, 5), 0.1f);
        GameRegistry.addSmelting(Items.iron_boots, new ItemStack(smeltedIron, 3), 0.1f);
        GameRegistry.addSmelting(Items.iron_sword, new ItemStack(smeltedIron, 1), 0.1f);
        GameRegistry.addSmelting(Items.iron_pickaxe, new ItemStack(smeltedIron, 2), 0.1f);
        GameRegistry.addSmelting(Items.iron_axe, new ItemStack(smeltedIron, 2), 0.1f);
        GameRegistry.addSmelting(Items.iron_hoe, new ItemStack(smeltedIron, 1), 0.1f);

        GameRegistry.addSmelting(Items.chainmail_helmet, new ItemStack(smeltedChainmail, 4), 0.1f);
        GameRegistry.addSmelting(Items.chainmail_chestplate, new ItemStack(smeltedChainmail, 6), 0.1f);
        GameRegistry.addSmelting(Items.chainmail_leggings, new ItemStack(smeltedChainmail, 5), 0.1f);
        GameRegistry.addSmelting(Items.chainmail_boots, new ItemStack(smeltedChainmail, 3), 0.1f);
    }
}
