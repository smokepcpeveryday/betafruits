package net.smokepcpeveryday.betafruits.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.smokepcpeveryday.betafruits.Betafruits;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.smokepcpeveryday.betafruits.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup FRUITS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Betafruits.MOD_ID, "fruits"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.betafruits"))
                    .icon(() -> new ItemStack(ModItems.PINECONE)).entries((displayContext, entries) -> {

                        //FRUITS
                        entries.add(ModItems.PEAR);
                        entries.add(ModItems.MANGO);
                        entries.add(ModItems.STARFRUIT);
                        entries.add(ModItems.LEMON);
                        entries.add(ModItems.ORANGE);
                        entries.add(ModItems.PINEAPPLE);
                        entries.add(ModItems.GRAPES);
                        entries.add(ModItems.COCONUT);
                        entries.add(ModItems.LIME);
                        entries.add(ModItems.POMEGRANATE);
                        entries.add(ModItems.PEACH);
                        entries.add(ModItems.PLUM);
                        entries.add(ModItems.STRAWBERRY);
                        entries.add(ModItems.BLUEBERRIES);
                        entries.add(ModItems.BANANA);
                        entries.add(ModItems.CHERRIES);
                        entries.add(ModItems.BLACKBERRY);

                        //PIES
                        entries.add(ModItems.PEAR_PIE);
                        entries.add(ModItems.MANGO_PIE);
                        entries.add(ModItems.BLUEBERRY_PIE);
                        entries.add(ModItems.APPLE_PIE);

                        //MISC
                        entries.add(ModItems.PINECONE);
                        entries.add(ModItems.PINECONE_JELLY);
                        entries.add(ModItems.PEACH_COBBLER);
                        entries.add(ModItems.BANANA_BREAD);

                        //SEEDS
                        entries.add(ModItems.PINEAPPLE_SEEDS);
                        entries.add(ModItems.STRAWBERRY_SEEDS);
                    }).build());

    public static final ItemGroup GEARTH = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Betafruits.MOD_ID, "gearth"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.betafruits"))
                    .icon(() -> new ItemStack(ModItems.PINECONE)).entries((displayContext, entries) -> {

                                //FRUITS
                                entries.add(ModItems.MINER);

                            }).build());






    public static void registerItemGroups() {
        Betafruits.LOGGER.info("Registering Item Groups for " + Betafruits.MOD_ID);
    }
}
