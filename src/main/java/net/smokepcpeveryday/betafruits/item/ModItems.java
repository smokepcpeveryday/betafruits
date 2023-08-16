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
    public static final Item MANGO = registerItem("mango", new Item(new FabricItemSettings().food(ModFoodComponents.MANGO)));
    public static final Item STARFRUIT = registerItem("starfruit", new Item(new FabricItemSettings().food(ModFoodComponents.STARFRUIT)));
    public static final Item LEMON = registerItem("lemon", new Item(new FabricItemSettings().food(ModFoodComponents.LEMON)));
    public static final Item ORANGE = registerItem("orange", new Item(new FabricItemSettings().food(ModFoodComponents.ORANGE)));
    public static final Item PINEAPPLE = registerItem("pineapple", new Item(new FabricItemSettings().food(ModFoodComponents.PINEAPPLE)));
    public static final Item GRAPES = registerItem("grapes", new Item(new FabricItemSettings().food(ModFoodComponents.GRAPES)));
    public static final Item COCONUT = registerItem("coconut", new Item(new FabricItemSettings().food(ModFoodComponents.COCONUT)));
    public static final Item LIME = registerItem("lime", new Item(new FabricItemSettings().food(ModFoodComponents.LIME)));
    public static final Item POMEGRANATE = registerItem("pomegranate", new Item(new FabricItemSettings().food(ModFoodComponents.POMEGRANATE)));
    public static final Item PEACH = registerItem("peach", new Item(new FabricItemSettings().food(ModFoodComponents.PEACH)));
    public static final Item PLUM = registerItem("plum", new Item(new FabricItemSettings().food(ModFoodComponents.PLUM)));
    public static final Item STRAWBERRY = registerItem("strawberry", new Item(new FabricItemSettings().food(ModFoodComponents.STRAWBERRY)));
    public static final Item BLUEBERRIES = registerItem("blueberries", new Item(new FabricItemSettings().food(ModFoodComponents.BLUEBERRIES)));
    public static final Item BANANA = registerItem("banana", new Item(new FabricItemSettings().food(ModFoodComponents.BANANA)));
    public static final Item CHERRIES = registerItem("cherries", new Item(new FabricItemSettings().food(ModFoodComponents.CHERRIES)));
    public static final Item BLACKBERRY = registerItem("blackberry", new Item(new FabricItemSettings().food(ModFoodComponents.BLACKBERRY)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(PINECONE);
        entries.add(PINECONE_JELLY);
        entries.add(PEAR);
        entries.add(MANGO);
        entries.add(STARFRUIT);
        entries.add(LEMON);
        entries.add(ORANGE);
        entries.add(PINEAPPLE);
        entries.add(GRAPES);
        entries.add(COCONUT);
        entries.add(LIME);
        entries.add(POMEGRANATE);
        entries.add(PEACH);
        entries.add(PLUM);
        entries.add(STRAWBERRY);
        entries.add(BLUEBERRIES);
        entries.add(BANANA);
        entries.add(CHERRIES);
        entries.add(BLACKBERRY);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Betafruits.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Betafruits.LOGGER.info("Registering Mod Items for " + Betafruits.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}