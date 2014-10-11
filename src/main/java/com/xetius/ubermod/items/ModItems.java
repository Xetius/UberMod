package com.xetius.ubermod.items;

import com.xetius.ubermod.items.smelted.SmeltedItem;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {

    public static UberItem smeltedDiamond;
    public static UberItem smeltedGold;
    public static UberItem smeltedIron;
    public static UberItem smeltedChainmail;

    public static void registerItems() {
        smeltedDiamond = (UberItem) new SmeltedItem().setUnlocalizedName("smeltedDiamond").setTextureName("ubermod:smeltedDiamond");
        smeltedGold = (UberItem) new SmeltedItem().setUnlocalizedName("smeltedGold").setTextureName("ubermod:smeltedGold");
        smeltedIron = (UberItem) new SmeltedItem().setUnlocalizedName("smeltedIron").setTextureName("ubermod:smeltedIron");
        smeltedChainmail = (UberItem) new SmeltedItem().setUnlocalizedName("smeltedChainmail").setTextureName("ubermod:smeltedChainmail");

        GameRegistry.registerItem(smeltedDiamond, "smeltedDiamond");
        GameRegistry.registerItem(smeltedGold, "smeltedGold");
        GameRegistry.registerItem(smeltedIron, "smeltedIron");
        GameRegistry.registerItem(smeltedChainmail, "smeltedChainmail");
    }
}
