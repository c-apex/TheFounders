package com.capex.bbifounders.util;

import com.capex.bbifounders.TheFounders;
import com.capex.bbifounders.blocks.BlockItemBase;
import com.capex.bbifounders.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {


    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TheFounders.MOD_ID);
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TheFounders.MOD_ID);

    public static void init () {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // ITEMS
    public static final RegistryObject<Item> STEEL_OF_THE_FOUNDERS = ITEMS.register("steel_of_the_founders", ItemBase::new);
    public static final RegistryObject<Item> BIGBOYIUM = ITEMS.register("bigboyium", ItemBase::new);
    public static final RegistryObject<Item> CHARITY_BADGE = ITEMS.register("charity_badge", ItemBase::new);
    public static final RegistryObject<Item> VETERAN_BADGE = ITEMS.register("veteran_badge", ItemBase::new);

    // BLOCKS
    public static final RegistryObject<Block> BIGBOYIUM_ORE = BLOCKS.register("bigboyium_ore", () -> new Block(Block.Properties.create(Material.ROCK)));

    // BLOCK ITEMS
    public static final RegistryObject<Item> BIGBOYIUM_ORE_ITEM = ITEMS.register("bigboyium_ore", () -> new BlockItemBase(BIGBOYIUM_ORE.get()));
}