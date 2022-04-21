package net.dogdev.stuffmod.item;

import net.dogdev.stuffmod.StuffMod;
import net.dogdev.stuffmod.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item OBAMA_SWORD = registerItem("obamium_sword",
            new SwordItem(ModToolMaterials.OBAMA, 10, -2f,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item GFUEL_SEEDS = registerItem("gfuel_seeds",
            new AliasedBlockItem(ModBlocks.GFUEL_CROP,
                    new FabricItemSettings().group(ItemGroup.FOOD)));
    public static final Item GFUEL = registerItem("gfuel",
                    new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.GFUEL)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(StuffMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        StuffMod.LOGGER.info("Registering Mod Items for " + StuffMod.MOD_ID);
    }
}
