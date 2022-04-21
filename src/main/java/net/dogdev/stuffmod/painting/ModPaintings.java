package net.dogdev.stuffmod.painting;

import net.dogdev.stuffmod.StuffMod;
import net.fabricmc.fabric.api.networking.v1.S2CPlayChannelEvents;
import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModPaintings {

    public static final PaintingMotive RICK = RegisterPaintings("rick", new PaintingMotive(32,32));




        private static PaintingMotive RegisterPaintings(String name, PaintingMotive paintingMotive){
            return Registry.register(Registry.PAINTING_MOTIVE, new Identifier(StuffMod.MOD_ID, name), paintingMotive);
        }


    public static void registerPainting(){

        StuffMod.LOGGER.info("Registering Paintings For " + StuffMod.MOD_ID);

    }
}
