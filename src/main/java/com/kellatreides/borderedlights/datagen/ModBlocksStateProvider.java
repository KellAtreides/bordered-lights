package com.kellatreides.borderedlights.datagen;

import com.kellatreides.borderedlights.BorderedLights;
import com.kellatreides.borderedlights.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import static net.minecraft.data.models.model.TextureMapping.cube;

public class ModBlocksStateProvider extends BlockStateProvider {
    public ModBlocksStateProvider(PackOutput output, ExistingFileHelper exFileHelper){
        super(output, BorderedLights.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.BLACK_DEEPBRICK);
        blockWithItem(ModBlocks.BLUE_DEEPBRICK);
        blockWithItem(ModBlocks.BROWN_DEEPBRICK);
        blockWithItem(ModBlocks.CYAN_DEEPBRICK);
        blockWithItem(ModBlocks.DARKGRAY_DEEPBRICK);
        blockWithItem(ModBlocks.GREEN_DEEPBRICK);
        blockWithItem(ModBlocks.LIME_DEEPBRICK);
        blockWithItem(ModBlocks.LIGHTBLUE_DEEPBRICK);
        blockWithItem(ModBlocks.LIGHTGRAY_DEEPBRICK);
        blockWithItem(ModBlocks.MAGENTA_DEEPBRICK);
        blockWithItem(ModBlocks.ORANGE_DEEPBRICK);
        blockWithItem(ModBlocks.PINK_DEEPBRICK);
        blockWithItem(ModBlocks.PURPLE_DEEPBRICK);
        blockWithItem(ModBlocks.RED_DEEPBRICK);
        blockWithItem(ModBlocks.WHITE_DEEPBRICK);
        blockWithItem(ModBlocks.YELLOW_DEEPBRICK);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock){

        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
