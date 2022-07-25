

package net.dogdev.stuffmod.world.feature;

import net.dogdev.stuffmod.StuffMod;
import net.dogdev.stuffmod.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_OBAMA_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.STONE_OBAMIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.DEEPSlATE_OBAMIUM_ORE.getDefaultState()));

    public static final List<OreFeatureConfig.Target> BRAZIL_BRAZIL_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.BRAZIL_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> OBAMA_ORE =
            ConfiguredFeatures.register("obama_ore",Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_OBAMA_ORES, 9));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> BRAZIL_ORE =
            ConfiguredFeatures.register("stuffmod:brazil_ore",Feature.ORE,
                    new OreFeatureConfig(BRAZIL_BRAZIL_ORES, 9));

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> BRAZIL_NUT_FLOWER =
            ConfiguredFeatures.register("stuffmod:brazil_nut_flower", Feature.FLOWER,
                    ConfiguredFeatures.createRandomPatchFeatureConfig(64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                            new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.BRAZIL_NUT_FLOWER)))));



    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + StuffMod.MOD_ID);
    }
}