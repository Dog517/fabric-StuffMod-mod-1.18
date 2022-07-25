package net.dogdev.stuffmod.sounds;

import net.dogdev.stuffmod.StuffMod;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {
    public static SoundEvent STONKS_VILLAGER_WORK = registerSoundEvent("stonks_villager_work");
    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(StuffMod.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}