package net.dogdev.stuffmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent GFUEL = (new FoodComponent.Builder()).hunger(4).saturationModifier(1.2F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 0), 1.0F).alwaysEdible().build();
    public static final FoodComponent OBAMA = (new FoodComponent.Builder()).hunger(20).saturationModifier(20F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 150, 15), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 2), 1.0F).alwaysEdible().build();
    public static final FoodComponent BRAZIL_NUTS = (new FoodComponent.Builder()).hunger(2).saturationModifier(1.2F).statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 150, 5), 1.0F).alwaysEdible().build();
    public static final FoodComponent BRAZIL_COOKIE = (new FoodComponent.Builder()).hunger(10).saturationModifier(15F).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 500, 5), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 5), 1.0F).alwaysEdible().build();
}

