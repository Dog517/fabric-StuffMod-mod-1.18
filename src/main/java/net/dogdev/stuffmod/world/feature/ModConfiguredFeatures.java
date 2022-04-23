

package net.dogdev.stuffmod.world.feature;

import net.dogdev.stuffmod.StuffMod;
import net.dogdev.stuffmod.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final List<OreFeatureConfig.Target> OVERWORLD_OBAMA_ORES = List.of(
            OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.STONE_OBAMIUM_ORE.getDefaultState()),
            OreFeatureConfig.createTarget(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES,
                    ModBlocks.DEEPSlATE_OBAMIUM_ORE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> OBAMA_ORE =
            ConfiguredFeatures.register("obama_ore",Feature.ORE,
                    new OreFeatureConfig(OVERWORLD_OBAMA_ORES, 9));



    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + StuffMod.MOD_ID);
    }
}