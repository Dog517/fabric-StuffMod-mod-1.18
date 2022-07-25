package net.dogdev.stuffmod.block;

import net.dogdev.stuffmod.StuffMod;
import net.dogdev.stuffmod.block.custom.GFuelCropBlock;
import net.dogdev.stuffmod.block.custom.ModObamaBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static net.minecraft.block.AbstractBlock.Settings.copy;

public class ModBlocks {


    public static final Block GFUEL_CROP = registerBlockWithoutBlockItem("gfuel_crop",
            new GFuelCropBlock(copy(Blocks.WHEAT).nonOpaque()), ItemGroup.FOOD);
    public static final Block BRAZIL_NUT_FLOWER = registerBlock("brazil_nut_flower",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 12,
                    FabricBlockSettings.copy(Blocks.DANDELION).strength(0.1f).nonOpaque()), ItemGroup.DECORATIONS);
    public static final Block POTTED_BRAZIL_NUT_FLOWER = registerBlockWithoutBlockItem("potted_brazil_nut_flower",
            new FlowerPotBlock(ModBlocks.BRAZIL_NUT_FLOWER,
                    FabricBlockSettings.copy(Blocks.POTTED_ALLIUM).nonOpaque()), ItemGroup.DECORATIONS);
    public static final Block STONE_OBAMIUM_ORE = registerBlock("stone_obamium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ItemGroup.MATERIALS);
    public static final Block DEEPSlATE_OBAMIUM_ORE = registerBlock("deepslate_obamium_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ItemGroup.MATERIALS);
    public static final Block OBAMIUM_BLOCK = registerBlock("obamium_block",
            new ModObamaBlock(FabricBlockSettings.of(Material.METAL).nonOpaque().strength(10.0f).requiresTool()), ItemGroup.MATERIALS);
    public static final Block STONKS_MARKET = registerBlock("stonks_market",
            new ModObamaBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f)), ItemGroup.DECORATIONS);
    public static final Block STONKS_MARKET_BOTTOM = registerBlock("stonks_market_bottom",
            new ModObamaBlock(FabricBlockSettings.of(Material.WOOD).strength(1.0f)), ItemGroup.DECORATIONS);

    public static final Block BRAZIL_ORE = registerBlock("brazil_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(5.5f).requiresTool()), ItemGroup.MATERIALS);

    public static final Block BRAZIL_FRAME = registerBlock("brazil_frame",
            new Block(FabricBlockSettings.of(Material.METAL).strength(5.5f).requiresTool()), ItemGroup.MATERIALS);



    private static Block registerBlock(String name, Block block, ItemGroup group, String tooltipKey) {
        registerBlockItem(name, block, group, tooltipKey);
        return Registry.register(Registry.BLOCK, new Identifier(StuffMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group, String tooltipKey) {
        return Registry.register(Registry.ITEM, new Identifier(StuffMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)) {
                    @Override
                    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
                        tooltip.add(new TranslatableText(tooltipKey));
                    }
                });
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.BLOCK, new Identifier(StuffMod.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(StuffMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(StuffMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        StuffMod.LOGGER.info("Registering ModBlocks for " + StuffMod.MOD_ID);
    }
}