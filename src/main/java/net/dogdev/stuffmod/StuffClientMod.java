package net.dogdev.stuffmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.dogdev.stuffmod.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class StuffClientMod implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GFUEL_CROP, RenderLayer.getCutout());
    }
}