package net.smokepcpeveryday.betafruits.item;

import net.minecraft.block.Block;
import net.minecraft.item.AliasedBlockItem;
import net.smokepcpeveryday.betafruits.block.BetafruitsCropBlock;

public class SeedItem extends AliasedBlockItem {
    public SeedItem(Block block, Settings settings) {
        super(block, settings);
        ((BetafruitsCropBlock) block).setSeedsItem(this);
    }
}
