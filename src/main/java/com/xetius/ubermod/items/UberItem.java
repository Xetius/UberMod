package com.xetius.ubermod.items;

import com.xetius.ubermod.creativeTab.CreativeTabUberMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import static com.xetius.ubermod.reference.Reference.MOD_PREFIX;

public class UberItem extends Item {
    public UberItem() {
        super();
        setMaxStackSize(64);
        setCreativeTab(CreativeTabUberMod.UberModTab);
        setUnlocalizedName("uberItem");
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        return getUnlocalizedName();
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("item.%s%s", MOD_PREFIX, getUnwrappedUnlocalisedName());
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon(getUnlocalizedName().substring(getUnlocalizedName().indexOf(".") + 1));
    }

    private String getUnwrappedUnlocalisedName() {
        String unlocalisedName = super.getUnlocalizedName();
        return unlocalisedName.substring(unlocalisedName.indexOf(".") + 1);
    }
}
