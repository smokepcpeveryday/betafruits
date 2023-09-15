package net.smokepcpeveryday.betafruits.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.smokepcpeveryday.betafruits.Betafruits;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.smokepcpeveryday.betafruits.block.ModBlocks;

public class ModItems {

    //THIS SECTION IS FOR ALL THE FRUIT STUFF

    //PINECONE
    public static final Item PINECONE = registerItem("pinecone", new Item(new FabricItemSettings()));
    public static final Item PINECONE_JELLY = registerItem("pinecone_jelly", new Item(new FabricItemSettings().food(ModFoodComponents.PINECONE_JELLY)));


    //FRUITS
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
    public static final Item BLUEBERRIES = registerItem("blueberries", new AliasedBlockItem(ModBlocks.BLUEBERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.BLUEBERRIES)));
    public static final Item BANANA = registerItem("banana", new Item(new FabricItemSettings().food(ModFoodComponents.BANANA)));
    public static final Item CHERRIES = registerItem("cherries", new Item(new FabricItemSettings().food(ModFoodComponents.CHERRIES)));
    public static final Item BLACKBERRY = registerItem("blackberry", new AliasedBlockItem(ModBlocks.BLACKBERRY_BUSH, new FabricItemSettings().maxCount(64).food(ModFoodComponents.BLACKBERRY)));

    //SEEDS
    public static final Item PINEAPPLE_SEEDS = registerItem("pineapple_seeds", new SeedItem(ModBlocks.PINEAPPLE_CROP, new Item.Settings()));
    public static final Item STRAWBERRY_SEEDS = registerItem("strawberry_seeds", new SeedItem(ModBlocks.STRAWBERRY_CROP, new Item.Settings()));

    //PIES
    public static final Item PEAR_PIE = registerItem("pear_pie", new Item(new FabricItemSettings().food(ModFoodComponents.PEAR_PIE)));
    public static final Item MANGO_PIE = registerItem("mango_pie", new Item(new FabricItemSettings().food(ModFoodComponents.MANGO_PIE)));
    public static final Item BLUEBERRY_PIE = registerItem("blueberry_pie", new Item(new FabricItemSettings().food(ModFoodComponents.BLUEBERRY_PIE)));
    public static final Item APPLE_PIE = registerItem("apple_pie", new Item(new FabricItemSettings().food(ModFoodComponents.APPLE_PIE)));

    //OTHER
    public static final Item PEACH_COBBLER = registerItem("peach_cobbler", new Item(new FabricItemSettings().food(ModFoodComponents.PEACH_COBBLER)));
    public static final Item BANANA_BREAD = registerItem("banana_bread", new Item(new FabricItemSettings().food(ModFoodComponents.BANANA_BREAD)));





    //THIS SECTION IS FOR THE GEARTHY GOODNESS LIKE ABOSS

    //GEARTHCORP ITEMS
    public static final Item MINER = registerItem("miner",
            new PickaxeItem(ToolMaterials.STONE, 2, 2f, new FabricItemSettings()));

    //MARIDIUM
    public static final Item MARIDIUM = registerItem("maridium", new Item(new FabricItemSettings()));
    public static final Item RAW_MARIDIUM = registerItem("raw_maridium", new Item(new FabricItemSettings()));

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