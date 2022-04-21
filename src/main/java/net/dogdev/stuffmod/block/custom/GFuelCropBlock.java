package net.dogdev.stuffmod.block.custom;

import net.dogdev.stuffmod.item.ModItems;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

public class GFuelCropBlock extends CropBlock {
    public GFuelCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.GFUEL_SEEDS;
    }
}
