package net.dogdev.stuffmod.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public class ModCowEnchantment extends Enchantment {
    public ModCowEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot... slotTypes) {
        super(weight, type, slotTypes);
    }
    private static boolean toggle = true;
        @Override
        public void onTargetDamaged (LivingEntity user, Entity target,int level){
                if (toggle) {
                    if (!user.world.isClient()) {
                        ServerWorld world = (ServerWorld) user.world;
                        BlockPos position = target.getBlockPos();
                        String name = "John";
                        String name2 = "Jeff";
                        if (level == 1) {
                            EntityType.COW.spawn(world, null, Text.of(name), null, position,
                                    SpawnReason.TRIGGERED, true, true);
                        } else if (level == 2) {
                            EntityType.COW.spawn(world, null, Text.of(name), null, position,
                                    SpawnReason.TRIGGERED, true, true);
                            EntityType.COW.spawn(world, null, Text.of(name2), null, position,
                                    SpawnReason.TRIGGERED, true, true);

                        }
                    }
                    toggle = false;
                } else {
                    toggle = true;
                }


            super.onTargetDamaged(user, target, level);
        }


        @Override
        public int getMaxLevel () {
            return 2;
        }

}