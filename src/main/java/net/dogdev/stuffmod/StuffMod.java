package net.dogdev.stuffmod;

import com.github.crimsondawn45.fabricshieldlib.lib.object.FabricBannerShieldItem;
import com.github.crimsondawn45.fabricshieldlib.lib.object.FabricShieldItem;
import net.dogdev.stuffmod.block.ModBlocks;
import net.dogdev.stuffmod.enchantment.ModEnchantments;
import net.dogdev.stuffmod.item.ModItems;
import net.dogdev.stuffmod.painting.ModPaintings;
import net.dogdev.stuffmod.util.ModRegistries;
import net.dogdev.stuffmod.villager.ModVillager;
import net.dogdev.stuffmod.world.dimension.ModDimensions;
import net.dogdev.stuffmod.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class StuffMod implements ModInitializer {

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.

	public static final Item OBAMA_SHIELD = new FabricBannerShieldItem(new FabricItemSettings().maxDamage(999999999).group(ItemGroup.COMBAT), 100, 50, ModItems.OBAMIUM); // FabricShieldItem(settings.maxDamage(durability), cooldownTicks, enchantability, repairItem)
	public static final Item BRAZIL_SHIELD = new FabricShieldItem(new FabricItemSettings().maxDamage(999999999).group(ItemGroup.COMBAT), 100, 100, ModItems.BRAZILLIUM);
	public static final String MOD_ID = "stuffmod";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModPaintings.registerPainting();
		ModEnchantments.registerModEnchantments();
		ModRegistries.registerModStuffs();
		ModVillager.setupPOIs();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGen.generateModWorldGen();
		ModDimensions.register();
		Registry.register(Registry.ITEM, new Identifier("stuffmod", "obama_shield"), OBAMA_SHIELD);
		Registry.register(Registry.ITEM, new Identifier("stuffmod", "brazil_shield"), BRAZIL_SHIELD);

		LOGGER.info("Hello Fabric world!");
	}
}
