package net.smokepcpeveryday.betafruits.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.smokepcpeveryday.betafruits.Betafruits;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PINECONE = registerItem("pinecone", new Item(new FabricItemSettings()));
    public static final Item PINECONE_JELLY = registerItem("pinecone_jelly", new Item(new FabricItemSettings().food(ModFoodComponents.PINECONE_JELLY)));

    //Fruits
    public static final Item PEAR = registerItem("pear", new Item(new FabricItemSettings().food(ModFoodComponents.PEAR)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(PINECONE);
        entries.add(PINECONE_JELLY);
        entries.add(PEAR);

    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Betafruits.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Betafruits.LOGGER.info("Registering Mod Items for " + Betafruits.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}