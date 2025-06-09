package com.kellatreides.borderedlights;

import com.kellatreides.borderedlights.block.ModBlocks;
import com.kellatreides.borderedlights.item.ModCreativeModeTabs;
import com.kellatreides.borderedlights.item.Moditems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(BorderedLights.MODID)
public class BorderedLights {
    public static final String MODID = "borderedlights";
    private static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public BorderedLights(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        ModCreativeModeTabs.register(modEventBus);

        Moditems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) { event.accept(Moditems.BLACKLIGHT); }
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) { event.accept(Moditems.BLUELIGHT); }
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) { event.accept(Moditems.BROWNLIGHT); }
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) { event.accept(Moditems.CYANLIGHT); }
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) { event.accept(Moditems.DARKGRAYLIGHT); }
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) { event.accept(Moditems.GREENLIGHT); }
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) { event.accept(Moditems.LIGHTBLUELIGHT); }
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) { event.accept(Moditems.LIGHTGRAYLIGHT); }
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) { event.accept(Moditems.LIMELIGHT); }
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) { event.accept(Moditems.MAGENTALIGHT); }
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) { event.accept(Moditems.ORANGELIGHT); }
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) { event.accept(Moditems.PINKLIGHT); }
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) { event.accept(Moditems.PURPLELIGHT); }
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) { event.accept(Moditems.REDLIGHT); }
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) { event.accept(Moditems.WHITELIGHT); }
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) { event.accept(Moditems.YELLOWLIGHT); }
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) { event.accept(Moditems.LIGHTTOOL); }
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) { event.accept(ModBlocks.BLACK_DEEPBRICK); }
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) { event.accept(ModBlocks.BLUE_DEEPBRICK); }
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) { event.accept(ModBlocks.BROWN_DEEPBRICK); }
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) { event.accept(ModBlocks.CYAN_DEEPBRICK); }
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) { event.accept(ModBlocks.DARKGRAY_DEEPBRICK); }
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) { event.accept(ModBlocks.GREEN_DEEPBRICK); }
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) { event.accept(ModBlocks.LIGHTBLUE_DEEPBRICK); }
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) { event.accept(ModBlocks.LIGHTGRAY_DEEPBRICK); }
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) { event.accept(ModBlocks.LIME_DEEPBRICK); }
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) { event.accept(ModBlocks.MAGENTA_DEEPBRICK); }
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) { event.accept(ModBlocks.ORANGE_DEEPBRICK); }
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) { event.accept(ModBlocks.PINK_DEEPBRICK); }
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) { event.accept(ModBlocks.PURPLE_DEEPBRICK); }
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) { event.accept(ModBlocks.RED_DEEPBRICK); }
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) { event.accept(ModBlocks.WHITE_DEEPBRICK); }
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) { event.accept(ModBlocks.YELLOW_DEEPBRICK); }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
        }
    }
}