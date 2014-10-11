package com.xetius.ubermod;

import com.xetius.ubermod.proxy.Proxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import static com.xetius.ubermod.reference.Reference.CLIENT_PROXY;
import static com.xetius.ubermod.reference.Reference.MOD_ID;
import static com.xetius.ubermod.reference.Reference.MOD_NAME;
import static com.xetius.ubermod.reference.Reference.MOD_VERSION;
import static com.xetius.ubermod.reference.Reference.SERVER_PROXY;

@Mod(modid = MOD_ID, name = MOD_NAME, version = MOD_VERSION)
public class UberMod {
    @Instance(MOD_ID)
    public static UberMod instance;

    @SidedProxy(clientSide = CLIENT_PROXY, serverSide = SERVER_PROXY)
    public static Proxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
}
