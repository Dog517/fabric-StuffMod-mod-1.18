package net.dogdev.stuffmod.item;

import net.dogdev.stuffmod.StuffMod;
import net.dogdev.stuffmod.block.ModBlocks;
import net.dogdev.stuffmod.item.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item OBAMA_SWORD = registerItem("obamium_sword",
            new SwordItem(ModToolMaterials.OBAMA, 10, -2f,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item OBAMA_PICKAXE = registerItem("obamium_pickaxe",
            new ModPickaxeItems(ModToolMaterials.OBAMA, 5, -2f,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item OBAMA_AXE = registerItem("obamium_axe",
            new ModAxeItems(ModToolMaterials.OBAMA, 11, -3f,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item OBAMA_SHOVEL = registerItem("obamium_shovel",
            new ModShovelItems(ModToolMaterials.OBAMA, 3, -2f,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item OBAMA_HOE = registerItem("obamium_hoe",
            new ModHoeItem(ModToolMaterials.OBAMA, 3, -2f,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));

    public static final Item BRAZIL_SWORD = registerItem("brazil_sword",
            new ModSwordItem(ModToolMaterials.BRAZIL, 15, -2f,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    public static final Item BRAZIL_PICKAXE = registerItem("brazil_pickaxe",
            new ModPickaxeItems(ModToolMaterials.BRAZIL, 6, -2f,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item BRAZIL_AXE = registerItem("brazil_axe",
            new ModAxeItems(ModToolMaterials.BRAZIL, 16, -3f,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item BRAZIL_SHOVEL = registerItem("brazil_shovel",
            new ModShovelItems(ModToolMaterials.BRAZIL, 4, -2f,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));
    public static final Item BRAZIL_HOE = registerItem("brazil_hoe",
            new ModHoeItem(ModToolMaterials.BRAZIL, 4, -2f,
                    new FabricItemSettings().group(ItemGroup.TOOLS)));

    public static final Item GFUEL_SEEDS = registerItem("gfuel_seeds",
            new AliasedBlockItem(ModBlocks.GFUEL_CROP,
                    new FabricItemSettings().group(ItemGroup.FOOD)));
    public static final Item GFUEL = registerItem("gfuel",
                    new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.GFUEL)));
    public static final Item OBAMIUM = registerItem("obamium",
            new Item(new FabricItemSettings().group(ItemGroup.MISC).food(ModFoodComponents.OBAMA)));

    public static final Item BRAZIL_NUTS = registerItem("brazil_nuts",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.BRAZIL_NUTS)));

    public static final Item BRAZIL_COOKIE = registerItem("brazil_cookie",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.BRAZIL_COOKIE)));

    public static final Item BRAZILLIUM = registerItem("brazillium",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item BITCOIN = registerItem("bitcoin",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    public static final Item BRAZILFLINT = registerItem("brazilflint",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    
    public static final Item OBAMA_HELMET = registerItem("obama_helmet",
            new ArmorItem(ModArmorMaterials.OBAMA, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item OBAMA_CHESTPLATE = registerItem("obama_chestplate",
            new ArmorItem(ModArmorMaterials.OBAMA, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item OBAMA_LEGGINGS = registerItem("obama_leggings",
            new ArmorItem(ModArmorMaterials.OBAMA, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item OBAMA_BOOTS = registerItem("obama_boots",
            new ArmorItem(ModArmorMaterials.OBAMA, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));

    public static final Item OBAMA_BOW = registerItem("obama_bow",
            new BowItem(new FabricItemSettings().group(ItemGroup.COMBAT)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(StuffMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        StuffMod.LOGGER.info("Registering Mod Items for " + StuffMod.MOD_ID);
    }
}
