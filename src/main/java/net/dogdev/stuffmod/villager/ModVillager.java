package net.dogdev.stuffmod.villager;

import com.google.common.collect.ImmutableSet;
import net.dogdev.stuffmod.StuffMod;
import net.dogdev.stuffmod.block.ModBlocks;
import net.dogdev.stuffmod.sounds.ModSounds;
import net.fabricmc.fabric.mixin.object.builder.PointOfInterestTypeAccessor;
import net.fabricmc.fabric.mixin.object.builder.VillagerProfessionAccessor;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillager {
    public static final PointOfInterestType STONKS_POI = registerPOI("stonkspoi", ModBlocks.STONKS_MARKET_BOTTOM);
    public static final VillagerProfession STONKS = registerProfession("stonks", STONKS_POI);


    public static VillagerProfession registerProfession(String name, PointOfInterestType type) {
        return Registry.register(Registry.VILLAGER_PROFESSION, new Identifier(StuffMod.MOD_ID, name),
                VillagerProfessionAccessor.create(name, type, ImmutableSet.of(), ImmutableSet.of(),
                        ModSounds.STONKS_VILLAGER_WORK));
    }

    public static PointOfInterestType registerPOI(String name, Block block) {
        return Registry.register(Registry.POINT_OF_INTEREST_TYPE, new Identifier(StuffMod.MOD_ID, name),
                PointOfInterestTypeAccessor.callCreate(name,
                        ImmutableSet.copyOf(block.getStateManager().getStates()), 1, 1));
    }

    public static void setupPOIs() {
        PointOfInterestTypeAccessor.callSetup(STONKS_POI);
    }
}