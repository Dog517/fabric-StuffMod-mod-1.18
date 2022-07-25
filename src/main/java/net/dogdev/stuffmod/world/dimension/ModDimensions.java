package net.dogdev.stuffmod.world.dimension;

import net.dogdev.stuffmod.StuffMod;
import net.dogdev.stuffmod.block.ModBlocks;
import net.dogdev.stuffmod.item.ModItems;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

public class ModDimensions {
    public static final RegistryKey<World> BRAZIL_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
            new Identifier(StuffMod.MOD_ID, "brazil"));
    public static final RegistryKey<DimensionType> BRAZIL_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY,
            BRAZIL_DIMENSION_KEY.getValue());


    public static void register() {
        StuffMod.LOGGER.debug("Registering ModDimensions for " + StuffMod.MOD_ID);

        CustomPortalBuilder.beginPortal()
                .frameBlock(ModBlocks.BRAZIL_FRAME)
                .destDimID(BRAZIL_DIMENSION_KEY.getValue())
                .tintColor(1, 151, 57)
                .lightWithItem(ModItems.BRAZILFLINT)
                .onlyLightInOverworld()
                .registerPortal();
    }
    }
