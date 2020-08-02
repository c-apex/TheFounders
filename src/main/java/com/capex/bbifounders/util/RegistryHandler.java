package com.capex.bbifounders.util;

import com.capex.bbifounders.TheFounders;
import com.capex.bbifounders.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {


    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TheFounders.MOD_ID);

    public static void init () {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // ITEMS
    public static final RegistryObject<Item> STEEL_OF_THE_FOUNDERS = ITEMS.register("steel_of_the_founders", ItemBase::new);
    public static final RegistryObject<Item> BIGBOYIUM = ITEMS.register("bigboyium", ItemBase::new);
}
