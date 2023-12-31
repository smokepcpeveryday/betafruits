package net.smokepcpeveryday.betafruits;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.smokepcpeveryday.betafruits.block.ModBlocks;
import net.smokepcpeveryday.betafruits.item.ModItemGroups;
import net.smokepcpeveryday.betafruits.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Betafruits implements ModInitializer {
    /**
     * Runs the mod initializer.
     */
    public static final String MOD_ID = "betafruits";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static Identifier id(String path) {
        if (!path.startsWith(MOD_ID + ":")) {
            return new Identifier(idString(path));
        } else {
            return new Identifier(path);
        }
    }

    public static String idString(String path) {
        return MOD_ID + ":" + path;
    }



    @Override

    public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();

    }



}
