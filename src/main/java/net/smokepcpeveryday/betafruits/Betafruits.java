package net.smokepcpeveryday.betafruits;

import net.fabricmc.api.ModInitializer;
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
    @Override

    public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
    }
}
