package com.kellatreides.borderedlights.datagen;

import com.kellatreides.borderedlights.block.ModBlocks;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;

import java.util.Map;
import java.util.Set;

public class ModBlocksLootTableProvider extends BlockLootSubProvider {
    protected ModBlocksLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.BLACK_DEEPBRICK.get());
        dropSelf(ModBlocks.BLUE_DEEPBRICK.get());
        dropSelf(ModBlocks.BROWN_DEEPBRICK.get());
        dropSelf(ModBlocks.CYAN_DEEPBRICK.get());
        dropSelf(ModBlocks.DARKGRAY_DEEPBRICK.get());
        dropSelf(ModBlocks.GREEN_DEEPBRICK.get());
        dropSelf(ModBlocks.LIME_DEEPBRICK.get());
        dropSelf(ModBlocks.LIGHTBLUE_DEEPBRICK.get());
        dropSelf(ModBlocks.LIGHTGRAY_DEEPBRICK.get());
        dropSelf(ModBlocks.MAGENTA_DEEPBRICK.get());
        dropSelf(ModBlocks.ORANGE_DEEPBRICK.get());
        dropSelf(ModBlocks.PINK_DEEPBRICK.get());
        dropSelf(ModBlocks.PURPLE_DEEPBRICK.get());
        dropSelf(ModBlocks.RED_DEEPBRICK.get());
        dropSelf(ModBlocks.WHITE_DEEPBRICK.get());
        dropSelf(ModBlocks.YELLOW_DEEPBRICK.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
