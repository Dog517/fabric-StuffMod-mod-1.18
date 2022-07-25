package net.dogdev.stuffmod.mixin;

import com.github.crimsondawn45.fabricshieldlib.initializers.FabricShieldLibClient;
import net.dogdev.stuffmod.StuffClientMod;
import net.dogdev.stuffmod.StuffMod;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.EntityModelLoader;
import net.minecraft.client.render.entity.model.ShieldEntityModel;
import net.minecraft.client.render.item.BuiltinModelItemRenderer;
import net.minecraft.client.render.model.json.ModelTransformation;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BuiltinModelItemRenderer.class)
public class RendererMixin {
    private ShieldEntityModel modelObamaShield;
    private ShieldEntityModel modelBrazilShield;
    private static final SpriteIdentifier OBAMA_SHIELD = new SpriteIdentifier(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE, new Identifier("stuffmod","entity/obama_shield"));
    private static final SpriteIdentifier BRAZIL_SHIELD = new SpriteIdentifier(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE, new Identifier("stuffmod","entity/brazil_shield"));
    private static final SpriteIdentifier OBAMA_SHIELD_NO_PATTERN = new SpriteIdentifier(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE, new Identifier("stuffmod","entity/obama_shield_nopattern"));
    private static final SpriteIdentifier BRAZIL_SHIELD_NO_PATTERN = new SpriteIdentifier(SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE, new Identifier("stuffmod","entity/brazil_shield_nopattern"));

    @Final
    @Shadow
    private EntityModelLoader entityModelLoader;


    @Inject(method = "reload", at = @At("HEAD"))
    private void setModelObamaShield(CallbackInfo ci){
        this.modelObamaShield = new ShieldEntityModel(this.entityModelLoader.getModelPart(StuffClientMod.OBAMA_SHIELD_MODEL_LAYER));
    }
    @Inject(method = "reload", at = @At("HEAD"))
    private void setModelBrazilShield(CallbackInfo ci){
        this.modelBrazilShield = new ShieldEntityModel(this.entityModelLoader.getModelPart(StuffClientMod.BRAZIL_SHIELD_MODEL_LAYER));
    }

    @Inject(method = "render", at = @At("HEAD"))
    private void mainRender(ItemStack stack, ModelTransformation.Mode mode, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, int overlay, CallbackInfo ci) {
        if (stack.isOf(StuffMod.OBAMA_SHIELD)) {
            FabricShieldLibClient.renderBanner(stack, matrices, vertexConsumers, light, overlay, modelObamaShield, OBAMA_SHIELD, OBAMA_SHIELD_NO_PATTERN);
        }
            //The first five parameters are taken from the method, while the last 3 you provide yourself. You will provide the model, and then your 2 sprite identifiers in the order of ''//SHIELD_NAME//_BASE'' and then ''//SHIELD_NAME//_BASE_NOPATTERN.
        if (stack.isOf(StuffMod.BRAZIL_SHIELD)) {
                    FabricShieldLibClient.renderBanner(stack, matrices, vertexConsumers, light, overlay, modelBrazilShield, BRAZIL_SHIELD, BRAZIL_SHIELD_NO_PATTERN);
                    //The first five parameters are taken from the method, while the last 3 you provide yourself. You will provide the model, and then your 2 sprite identifiers in the order of ''//SHIELD_NAME//_BASE'' and then ''//SHIELD_NAME//_BASE_NOPATTERN.

        }

        }
    }


