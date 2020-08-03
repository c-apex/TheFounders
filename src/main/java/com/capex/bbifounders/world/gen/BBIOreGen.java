/*
 !!!
 Can't figure out how to get this to work. The problem is getting it to load in the main class.
 !!!
 */
package com.capex.bbifounders.world.gen;

import com.capex.bbifounders.util.RegistryHandler;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class BBIOreGen {
    public static void generateOre() {
        for (Biome biome : ForgeRegistries.BIOMES) {
            ConfiguredPlacement customConfig = Placement.COUNT_RANGE
                    .configure(new CountRangeConfig(20, 5, 5, 25));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                    .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.BIGBOYIUM_ORE.get().getDefaultState(), 10))
                    .withPlacement(customConfig));
        }
    }
}

