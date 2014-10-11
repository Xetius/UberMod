package com.xetius.ubermod.creativeTab;

import com.xetius.ubermod.items.ModItems;
import com.xetius.ubermod.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabUberMod {
    public static final CreativeTabs UberModTab = new CreativeTabs(Reference.MOD_ID) {
        @Override public Item getTabIconItem() {
            return ModItems.smeltedDiamond;
        }

        @Override
        public String getTranslatedTabLabel() {
            return "Xetius's Uber Mod";
        }
    };
}
