package net.dogdev.stuffmod.villager;

import com.google.common.collect.ImmutableSet;
import net.dogdev.stuffmod.StuffMod;
import net.dogdev.stuffmod.block.ModBlocks;
import net.dogdev.stuffmod.sounds.ModSounds;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.minecraft.block.Block;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillager {
    public static final PointOfInterestType STONKS_POI = registerPOI("stonkspoi", ModBlocks.STONKS_MARKET_BOTTOM);
    public static final VillagerProfession STONKS = registerProfession("stonks",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(StuffMod.MOD_ID, "stonkspoi")));


    public static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registry.VILLAGER_PROFESSION, new Identifier(StuffMod.MOD_ID, name),
                VillagerProfessionBuilder.create().id(new Identifier(StuffMod.MOD_ID, name)).workstation(type)
                                .workSound(ModSounds.STONKS_VILLAGER_WORK).build());
    }

    public static PointOfInterestType registerPOI(String name, Block block) {
        return Registry.register(Registry.POINT_OF_INTEREST_TYPE, new Identifier(StuffMod.MOD_ID, name),
                new PointOfInterestType(ImmutableSet.copyOf(block.getStateManager().getStates()), 1, 1));
    }
}