package com.kellatreides.borderedlights.datagen;

import com.kellatreides.borderedlights.BorderedLights;
import com.kellatreides.borderedlights.item.Moditems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModitemsModelProvider extends ItemModelProvider {
    public ModitemsModelProvider(PackOutput output, ExistingFileHelper existingFileHelper){
        super(output, BorderedLights.MODID, existingFileHelper);
    }
    @Override
    protected void registerModels() {
        basicItem(Moditems.BLACKLIGHT.get());
        basicItem(Moditems.BLUELIGHT.get());
        basicItem(Moditems.BROWNLIGHT.get());
        basicItem(Moditems.CYANLIGHT.get());
        basicItem(Moditems.DARKGRAYLIGHT.get());
        basicItem(Moditems.GREENLIGHT.get());
        basicItem(Moditems.LIMELIGHT.get());
        basicItem(Moditems.LIGHTBLUELIGHT.get());
        basicItem(Moditems.LIGHTGRAYLIGHT.get());
        basicItem(Moditems.MAGENTALIGHT.get());
        basicItem(Moditems.ORANGELIGHT.get());
        basicItem(Moditems.PINKLIGHT.get());
        basicItem(Moditems.PURPLELIGHT.get());
        basicItem(Moditems.REDLIGHT.get());
        basicItem(Moditems.WHITELIGHT.get());
        basicItem(Moditems.YELLOWLIGHT.get());
        basicItem(Moditems.LIGHTTOOL.get());
    }
}
