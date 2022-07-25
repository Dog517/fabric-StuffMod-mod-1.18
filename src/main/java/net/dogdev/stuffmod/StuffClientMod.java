package net.dogdev.stuffmod;

import net.dogdev.stuffmod.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.ShieldEntityModel;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.util.Identifier;

public class StuffClientMod implements ClientModInitializer {

    public static final EntityModelLayer OBAMA_SHIELD_MODEL_LAYER = new EntityModelLayer(new Identifier("stuffmod", "obama_shield"),"main");
    public static final EntityModelLayer BRAZIL_SHIELD_MODEL_LAYER = new EntityModelLayer(new Identifier("stuffmod", "brazil_shield"),"main");

    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(OBAMA_SHIELD_MODEL_LAYER, ShieldEntityModel::getTexturedModelData);
        ClientSpriteRegistryCallback.event(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) -> {
            registry.register(new Identifier("stuffmod", "entity/obama_shield"));
            registry.register(new Identifier("stuffmod", "entity/obama_shield_nopattern"));


        });
        EntityModelLayerRegistry.registerModelLayer(BRAZIL_SHIELD_MODEL_LAYER, ShieldEntityModel::getTexturedModelData);
        ClientSpriteRegistryCallback.event(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) -> {
            registry.register(new Identifier("stuffmod", "entity/brazil_shield"));
            registry.register(new Identifier("stuffmod", "entity/brazil_shield_nopattern"));


        });

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GFUEL_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BRAZIL_NUT_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_BRAZIL_NUT_FLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OBAMIUM_BLOCK, RenderLayer.getCutout());
    }
}