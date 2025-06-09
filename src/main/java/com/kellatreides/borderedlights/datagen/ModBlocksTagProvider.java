package com.kellatreides.borderedlights.datagen;

import com.kellatreides.borderedlights.BorderedLights;
import com.kellatreides.borderedlights.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlocksTagProvider extends BlockTagsProvider{
    public ModBlocksTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, BorderedLights.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.BLACK_DEEPBRICK.get())
                .add(ModBlocks.BLUE_DEEPBRICK.get())
                .add(ModBlocks.BROWN_DEEPBRICK.get())
                .add(ModBlocks.CYAN_DEEPBRICK.get())
                .add(ModBlocks.DARKGRAY_DEEPBRICK.get())
                .add(ModBlocks.GREEN_DEEPBRICK.get())
                .add(ModBlocks.LIGHTBLUE_DEEPBRICK.get())
                .add(ModBlocks.LIGHTGRAY_DEEPBRICK.get())
                .add(ModBlocks.LIME_DEEPBRICK.get())
                .add(ModBlocks.MAGENTA_DEEPBRICK.get())
                .add(ModBlocks.ORANGE_DEEPBRICK.get())
                .add(ModBlocks.PINK_DEEPBRICK.get())
                .add(ModBlocks.PURPLE_DEEPBRICK.get())
                .add(ModBlocks.RED_DEEPBRICK.get())
                .add(ModBlocks.WHITE_DEEPBRICK.get())
                .add(ModBlocks.YELLOW_DEEPBRICK.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.BLACK_DEEPBRICK.get())
                .add(ModBlocks.BLUE_DEEPBRICK.get())
                .add(ModBlocks.BROWN_DEEPBRICK.get())
                .add(ModBlocks.CYAN_DEEPBRICK.get())
                .add(ModBlocks.DARKGRAY_DEEPBRICK.get())
                .add(ModBlocks.GREEN_DEEPBRICK.get())
                .add(ModBlocks.LIGHTBLUE_DEEPBRICK.get())
                .add(ModBlocks.LIGHTGRAY_DEEPBRICK.get())
                .add(ModBlocks.LIME_DEEPBRICK.get())
                .add(ModBlocks.MAGENTA_DEEPBRICK.get())
                .add(ModBlocks.ORANGE_DEEPBRICK.get())
                .add(ModBlocks.PINK_DEEPBRICK.get())
                .add(ModBlocks.PURPLE_DEEPBRICK.get())
                .add(ModBlocks.RED_DEEPBRICK.get())
                .add(ModBlocks.WHITE_DEEPBRICK.get())
                .add(ModBlocks.YELLOW_DEEPBRICK.get());
    }
}
