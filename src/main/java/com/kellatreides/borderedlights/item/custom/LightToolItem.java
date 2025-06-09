package com.kellatreides.borderedlights.item.custom;

import com.kellatreides.borderedlights.block.ModBlocks;
import com.kellatreides.borderedlights.item.Moditems;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.List;
import java.util.Map;

public class LightToolItem extends Item
{
    private static final Map<Block, Block> LightToolBlue_Map =
            Map.of(
                    Blocks.DEEPSLATE_BRICKS, ModBlocks.BLUE_DEEPBRICK.get(),
                    ModBlocks.GREEN_DEEPBRICK.get(), ModBlocks.BLUE_DEEPBRICK.get(),
                    ModBlocks.RED_DEEPBRICK.get(), ModBlocks.BLUE_DEEPBRICK.get(),
                    ModBlocks.YELLOW_DEEPBRICK.get(), ModBlocks.BLUE_DEEPBRICK.get()
            );
    private static final Map<Block, Block> LightToolGreen_Map =
            Map.of(
                    Blocks.DEEPSLATE_BRICKS, ModBlocks.GREEN_DEEPBRICK.get(),
                    ModBlocks.BLUE_DEEPBRICK.get(), ModBlocks.GREEN_DEEPBRICK.get(),
                    ModBlocks.RED_DEEPBRICK.get(), ModBlocks.GREEN_DEEPBRICK.get(),
                    ModBlocks.YELLOW_DEEPBRICK.get(), ModBlocks.GREEN_DEEPBRICK.get()
            );
    private static final Map<Block, Block> LightToolRed_Map =
            Map.of(
                    Blocks.DEEPSLATE_BRICKS, ModBlocks.RED_DEEPBRICK.get(),
                    ModBlocks.BLUE_DEEPBRICK.get(), ModBlocks.RED_DEEPBRICK.get(),
                    ModBlocks.GREEN_DEEPBRICK.get(), ModBlocks.RED_DEEPBRICK.get(),
                    ModBlocks.YELLOW_DEEPBRICK.get(), ModBlocks.RED_DEEPBRICK.get()
            );
    private static final Map<Block, Block> LightToolYellow_Map =
            Map.of(
                    Blocks.DEEPSLATE_BRICKS, ModBlocks.YELLOW_DEEPBRICK.get(),
                    ModBlocks.BLUE_DEEPBRICK.get(), ModBlocks.YELLOW_DEEPBRICK.get(),
                    ModBlocks.GREEN_DEEPBRICK.get(), ModBlocks.YELLOW_DEEPBRICK.get(),
                    ModBlocks.RED_DEEPBRICK.get(), ModBlocks.YELLOW_DEEPBRICK.get()
            );

    public LightToolItem(Item.Properties properties)
    {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context)
    {
        Level level = context.getLevel();
        Block clickedBlock = level.getBlockState(context.getClickedPos()).getBlock();

        if(LightToolBlue_Map.containsKey(clickedBlock) & context.getPlayer().getOffhandItem().getItem() == Moditems.BLUELIGHT.get()) {
            if(!level.isClientSide()) {
                level.setBlockAndUpdate(context.getClickedPos(), LightToolBlue_Map.get(clickedBlock).defaultBlockState());

                context.getPlayer().getOffhandItem().consume(1, null);
            }
        }
        if(LightToolGreen_Map.containsKey(clickedBlock) & context.getPlayer().getOffhandItem().getItem() == Moditems.GREENLIGHT.get()) {
            if(!level.isClientSide()) {
                level.setBlockAndUpdate(context.getClickedPos(), LightToolGreen_Map.get(clickedBlock).defaultBlockState());

                context.getPlayer().getOffhandItem().consume(1, null);
            }
        }
        if(LightToolRed_Map.containsKey(clickedBlock) & context.getPlayer().getOffhandItem().getItem() == Moditems.REDLIGHT.get()) {
            if(!level.isClientSide()) {
                level.setBlockAndUpdate(context.getClickedPos(), LightToolRed_Map.get(clickedBlock).defaultBlockState());

                context.getPlayer().getOffhandItem().consume(1, null);
            }
        }
        if(LightToolYellow_Map.containsKey(clickedBlock) & context.getPlayer().getOffhandItem().getItem() == Moditems.YELLOWLIGHT.get()) {
            if(!level.isClientSide()) {
                level.setBlockAndUpdate(context.getClickedPos(), LightToolYellow_Map.get(clickedBlock).defaultBlockState());

                context.getPlayer().getOffhandItem().consume(1, null);
            }
        }
        return InteractionResult.SUCCESS;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        if (Screen.hasShiftDown()){
            tooltipComponents.add(Component.translatable("tooltip.borderedlights.lighttool.shift.tooltip"));
        }
        else{
        tooltipComponents.add(Component.translatable("tooltip.borderedlights.lighttool.tooltip"));
        }
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}