package net.dogdev.stuffmod.util;

import net.dogdev.stuffmod.item.ModItems;
import net.dogdev.stuffmod.villager.ModVillager;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;

public class ModRegistries {
    int price = 5;
    public static void registerModStuffs() {
        registerCustomTrades();
    }
    private static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(ModVillager.STONKS,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.BITCOIN, 1),
                            new ItemStack(Items.EMERALD, 10),
                            1200,3,0.09f));
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 11),
                            new ItemStack(ModItems.BITCOIN, 1),
                            1200,3,0.08f));
                });
    }


}