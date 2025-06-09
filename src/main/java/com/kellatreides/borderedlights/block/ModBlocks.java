package com.kellatreides.borderedlights.block;

import com.kellatreides.borderedlights.BorderedLights;
import com.kellatreides.borderedlights.item.Moditems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks
{
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(BorderedLights.MODID);

    public static final DeferredBlock<Block> BLACK_DEEPBRICK = registerBlock("black_deepbrick",() -> new Block(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS).lightLevel(state -> 15)));
    public static final DeferredBlock<Block> BLUE_DEEPBRICK = registerBlock("blue_deepbrick",() -> new Block(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS).lightLevel(state -> 15)));
    public static final DeferredBlock<Block> BROWN_DEEPBRICK = registerBlock("brown_deepbrick", () -> new Block(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS).lightLevel(state -> 15)));
    public static final DeferredBlock<Block> CYAN_DEEPBRICK = registerBlock("cyan_deepbrick", () -> new Block(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS).lightLevel(state -> 15)));
    public static final DeferredBlock<Block> DARKGRAY_DEEPBRICK = registerBlock("darkgray_deepbrick", () -> new Block(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS).lightLevel(state -> 15)));
    public static final DeferredBlock<Block> GREEN_DEEPBRICK = registerBlock("green_deepbrick",() -> new Block(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS).lightLevel(state -> 15)));
    public static final DeferredBlock<Block> LIME_DEEPBRICK = registerBlock("lime_deepbrick",() -> new Block(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS).lightLevel(state -> 15)));
    public static final DeferredBlock<Block> LIGHTBLUE_DEEPBRICK = registerBlock("lightblue_deepbrick",() -> new Block(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS).lightLevel(state -> 15)));
    public static final DeferredBlock<Block> LIGHTGRAY_DEEPBRICK = registerBlock("lightgray_deepbrick",() -> new Block(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS).lightLevel(state -> 15)));
    public static final DeferredBlock<Block> MAGENTA_DEEPBRICK = registerBlock("magenta_deepbrick",() -> new Block(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS).lightLevel(state -> 15)));
    public static final DeferredBlock<Block> ORANGE_DEEPBRICK = registerBlock("orange_deepbrick",() -> new Block(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS).lightLevel(state -> 15)));
    public static final DeferredBlock<Block> PINK_DEEPBRICK = registerBlock("pink_deepbrick",() -> new Block(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS).lightLevel(state -> 15)));
    public static final DeferredBlock<Block> PURPLE_DEEPBRICK = registerBlock("purple_deepbrick",() -> new Block(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS).lightLevel(state -> 15)));
    public static final DeferredBlock<Block> RED_DEEPBRICK = registerBlock("red_deepbrick", () -> new Block(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS).lightLevel(state -> 15)));
    public static final DeferredBlock<Block> WHITE_DEEPBRICK = registerBlock("white_deepbrick", () -> new Block(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS).lightLevel(state -> 15)));
    public static final DeferredBlock<Block> YELLOW_DEEPBRICK = registerBlock("yellow_deepbrick", () -> new Block(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE_BRICKS).lightLevel(state -> 15)));



    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block){
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends  Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        Moditems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
