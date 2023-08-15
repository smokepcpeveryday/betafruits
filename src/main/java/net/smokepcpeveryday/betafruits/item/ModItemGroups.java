package net.smokepcpeveryday.betafruits.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.smokepcpeveryday.betafruits.Betafruits;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    // adds shit to the fruits section
    public static final ItemGroup FRUIT_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Betafruits.MOD_ID, "fruits"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.fruits"))
                    .icon(() -> new ItemStack(ModItems.PINECONE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.PINECONE);
                        entries.add(ModItems.PINECONE_JELLY);
                        entries.add(ModItems.PEAR);

                    }).build());


    public static void registerItemGroups() {
        Betafruits.LOGGER.info("Registering Item Groups for " + Betafruits.MOD_ID);
    }
}
