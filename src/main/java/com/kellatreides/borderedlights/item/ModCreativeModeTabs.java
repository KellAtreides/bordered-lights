package com.kellatreides.borderedlights.item;

import com.kellatreides.borderedlights.BorderedLights;
import com.kellatreides.borderedlights.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BorderedLights.MODID);

    public static final Supplier<CreativeModeTab> BORDEREDLIGHTS_TAB = CREATIVE_MODE_TAB.register("borderedlights_tab",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BLUE_DEEPBRICK.get()))
            .title(Component.translatable("creativetab.borderedlights.all"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(Moditems.BLACKLIGHT);
                output.accept(Moditems.BLUELIGHT);
                output.accept(Moditems.BROWNLIGHT);
                output.accept(Moditems.CYANLIGHT);
                output.accept(Moditems.DARKGRAYLIGHT);
                output.accept(Moditems.GREENLIGHT);
                output.accept(Moditems.LIGHTBLUELIGHT);
                output.accept(Moditems.LIGHTGRAYLIGHT);
                output.accept(Moditems.LIMELIGHT);
                output.accept(Moditems.MAGENTALIGHT);
                output.accept(Moditems.ORANGELIGHT);
                output.accept(Moditems.PINKLIGHT);
                output.accept(Moditems.PURPLELIGHT);
                output.accept(Moditems.REDLIGHT);
                output.accept(Moditems.WHITELIGHT);
                output.accept(Moditems.YELLOWLIGHT);
                output.accept(ModBlocks.BLACK_DEEPBRICK);
                output.accept(ModBlocks.BLUE_DEEPBRICK);
                output.accept(ModBlocks.BROWN_DEEPBRICK);
                output.accept(ModBlocks.CYAN_DEEPBRICK);
                output.accept(ModBlocks.DARKGRAY_DEEPBRICK);
                output.accept(ModBlocks.GREEN_DEEPBRICK);
                output.accept(ModBlocks.LIGHTBLUE_DEEPBRICK);
                output.accept(ModBlocks.LIGHTGRAY_DEEPBRICK);
                output.accept(ModBlocks.LIME_DEEPBRICK);
                output.accept(ModBlocks.MAGENTA_DEEPBRICK);
                output.accept(ModBlocks.ORANGE_DEEPBRICK);
                output.accept(ModBlocks.PINK_DEEPBRICK);
                output.accept(ModBlocks.PURPLE_DEEPBRICK);
                output.accept(ModBlocks.RED_DEEPBRICK);
                output.accept(ModBlocks.WHITE_DEEPBRICK);
                output.accept(ModBlocks.YELLOW_DEEPBRICK);
                output.accept(Moditems.LIGHTTOOL);
            }).build());

    public static void  register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register((eventBus));
    }
}
