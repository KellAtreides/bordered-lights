package com.kellatreides.borderedlights.item;

import com.kellatreides.borderedlights.BorderedLights;
import com.kellatreides.borderedlights.item.custom.LightToolItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class Moditems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(BorderedLights.MODID);

    public static final DeferredItem<Item> BLACKLIGHT = ITEMS.register("blacklight", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BLUELIGHT = ITEMS.register("bluelight", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> BROWNLIGHT = ITEMS.register("brownlight", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CYANLIGHT = ITEMS.register("cyanlight", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DARKGRAYLIGHT = ITEMS.register("darkgraylight", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GREENLIGHT = ITEMS.register("greenlight", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LIMELIGHT = ITEMS.register("limelight", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LIGHTBLUELIGHT = ITEMS.register("lightbluelight", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LIGHTGRAYLIGHT = ITEMS.register("lightgraylight", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MAGENTALIGHT = ITEMS.register("magentalight", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> ORANGELIGHT = ITEMS.register("orangelight", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PINKLIGHT = ITEMS.register("pinklight", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PURPLELIGHT = ITEMS.register("purplelight", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> REDLIGHT = ITEMS.register("redlight", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> WHITELIGHT = ITEMS.register("whitelight", () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> YELLOWLIGHT = ITEMS.register("yellowlight", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> LIGHTTOOL = ITEMS.register("lighttool", () -> new LightToolItem(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
