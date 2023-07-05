package net.dogdev.stuffmod.painting;

import net.dogdev.stuffmod.StuffMod;
import net.fabricmc.fabric.api.networking.v1.S2CPlayChannelEvents;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModPaintings {

    public static final PaintingVariant RICK = RegisterPaintings("rick", new PaintingVariant(32,32));




        private static PaintingVariant RegisterPaintings(String name, PaintingVariant paintingMotive){
            return Registry.register(Registry.PAINTING_VARIANT, new Identifier(StuffMod.MOD_ID, name), paintingMotive);
        }


    public static void registerPainting(){

        StuffMod.LOGGER.info("Registering Paintings For " + StuffMod.MOD_ID);

    }
}
