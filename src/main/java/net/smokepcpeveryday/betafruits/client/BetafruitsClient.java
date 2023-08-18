package net.smokepcpeveryday.betafruits.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.smokepcpeveryday.betafruits.block.BetafruitsCropBlock;
import net.smokepcpeveryday.betafruits.block.ModBlocks;

public class BetafruitsClient implements ClientModInitializer {
    /**
     * Runs the mod initializer on the client environment.
     */
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STRAWBERRY_CROP, RenderLayer.getCutout());
    }
}
