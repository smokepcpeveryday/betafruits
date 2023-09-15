package net.smokepcpeveryday.betafruits.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.smokepcpeveryday.betafruits.Betafruits;
import net.smokepcpeveryday.betafruits.block.custom.BetafruitsCropBlock;
import net.smokepcpeveryday.betafruits.block.custom.BlackberryBush;
import net.smokepcpeveryday.betafruits.block.custom.BlueberryBush;
import net.smokepcpeveryday.betafruits.block.custom.CommunicationTerminal;

public class ModBlocks {

    //CROPS
    public static final Block PINEAPPLE_CROP = registerBlockWithoutItem("pineapple_crop", new BetafruitsCropBlock());
    public static final Block STRAWBERRY_CROP = registerBlockWithoutItem("strawberry_crop", new BetafruitsCropBlock());

    //BUSHES
    public static final BlueberryBush BLUEBERRY_BUSH = (BlueberryBush) registerBlockWithoutItem("blueberry_bush",new BlueberryBush(FabricBlockSettings.create().resistance(0).nonOpaque().luminance(5).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP)));
    public static final BlackberryBush BLACKBERRY_BUSH = (BlackberryBush) registerBlockWithoutItem("blackberry_bush",new BlackberryBush(FabricBlockSettings.create().resistance(0).nonOpaque().luminance(5).noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP)));


    //GEARTHCORP
    public static final Block COMMUNICATION_TERMINAL = registerBlock("communication_terminal", new CommunicationTerminal(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));


    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(Betafruits.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Betafruits.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Betafruits.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Betafruits.LOGGER.info("Registering Mod Blocks for " + Betafruits.MOD_ID);
    }


}
