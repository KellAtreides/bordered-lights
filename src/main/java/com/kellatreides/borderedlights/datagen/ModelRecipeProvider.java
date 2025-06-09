package com.kellatreides.borderedlights.datagen;

import com.kellatreides.borderedlights.block.ModBlocks;
import com.kellatreides.borderedlights.item.Moditems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModelRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModelRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACK_DEEPBRICK.get(), 3)
                .pattern("DDD")
                .pattern("LLL")
                .pattern("DDD")
                .define('D', Ingredient.of(Items.DEEPSLATE_BRICK_SLAB))
                .define('L', Moditems.BLACKLIGHT.get())
                .unlockedBy("has_blacklight", has(Moditems.BLACKLIGHT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BROWN_DEEPBRICK.get(), 3)
                .pattern("DDD")
                .pattern("LLL")
                .pattern("DDD")
                .define('D', Ingredient.of(Items.DEEPSLATE_BRICK_SLAB))
                .define('L', Moditems.BROWNLIGHT.get())
                .unlockedBy("has_brownlight", has(Moditems.BROWNLIGHT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLUE_DEEPBRICK.get(), 3)
                .pattern("DDD")
                .pattern("LLL")
                .pattern("DDD")
                .define('D', Ingredient.of(Items.DEEPSLATE_BRICK_SLAB))
                .define('L', Moditems.BLUELIGHT.get())
                .unlockedBy("has_bluelight", has(Moditems.BLUELIGHT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CYAN_DEEPBRICK.get(), 3)
                .pattern("DDD")
                .pattern("LLL")
                .pattern("DDD")
                .define('D', Ingredient.of(Items.DEEPSLATE_BRICK_SLAB))
                .define('L', Moditems.CYANLIGHT.get())
                .unlockedBy("has_cyanlight", has(Moditems.CYANLIGHT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.DARKGRAY_DEEPBRICK.get(), 3)
                .pattern("DDD")
                .pattern("LLL")
                .pattern("DDD")
                .define('D', Ingredient.of(Items.DEEPSLATE_BRICK_SLAB))
                .define('L', Moditems.DARKGRAYLIGHT.get())
                .unlockedBy("has_darkgraylight", has(Moditems.DARKGRAYLIGHT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GREEN_DEEPBRICK.get(), 3)
                .pattern("DDD")
                .pattern("LLL")
                .pattern("DDD")
                .define('D', Ingredient.of(Items.DEEPSLATE_BRICK_SLAB))
                .define('L', Moditems.GREENLIGHT.get())
                .unlockedBy("has_greenlight", has(Moditems.GREENLIGHT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHTBLUE_DEEPBRICK.get(), 3)
                .pattern("DDD")
                .pattern("LLL")
                .pattern("DDD")
                .define('D', Ingredient.of(Items.DEEPSLATE_BRICK_SLAB))
                .define('L', Moditems.LIGHTBLUELIGHT.get())
                .unlockedBy("has_lightbluelight", has(Moditems.LIGHTBLUELIGHT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIGHTGRAY_DEEPBRICK.get(), 3)
                .pattern("DDD")
                .pattern("LLL")
                .pattern("DDD")
                .define('D', Ingredient.of(Items.DEEPSLATE_BRICK_SLAB))
                .define('L', Moditems.LIGHTGRAYLIGHT.get())
                .unlockedBy("has_lightgraylight", has(Moditems.LIGHTGRAYLIGHT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LIME_DEEPBRICK.get(), 3)
                .pattern("DDD")
                .pattern("LLL")
                .pattern("DDD")
                .define('D', Ingredient.of(Items.DEEPSLATE_BRICK_SLAB))
                .define('L', Moditems.LIMELIGHT.get())
                .unlockedBy("has_limelight", has(Moditems.LIMELIGHT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.MAGENTA_DEEPBRICK.get(), 3)
                .pattern("DDD")
                .pattern("LLL")
                .pattern("DDD")
                .define('D', Ingredient.of(Items.DEEPSLATE_BRICK_SLAB))
                .define('L', Moditems.MAGENTALIGHT.get())
                .unlockedBy("has_magentalight", has(Moditems.MAGENTALIGHT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ORANGE_DEEPBRICK.get(), 3)
                .pattern("DDD")
                .pattern("LLL")
                .pattern("DDD")
                .define('D', Ingredient.of(Items.DEEPSLATE_BRICK_SLAB))
                .define('L', Moditems.ORANGELIGHT.get())
                .unlockedBy("has_orangelight", has(Moditems.ORANGELIGHT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PINK_DEEPBRICK.get(), 3)
                .pattern("DDD")
                .pattern("LLL")
                .pattern("DDD")
                .define('D', Ingredient.of(Items.DEEPSLATE_BRICK_SLAB))
                .define('L', Moditems.PINKLIGHT.get())
                .unlockedBy("has_pinklight", has(Moditems.PINKLIGHT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PURPLE_DEEPBRICK.get(), 3)
                .pattern("DDD")
                .pattern("LLL")
                .pattern("DDD")
                .define('D', Ingredient.of(Items.DEEPSLATE_BRICK_SLAB))
                .define('L', Moditems.PURPLELIGHT.get())
                .unlockedBy("has_purplelight", has(Moditems.PURPLELIGHT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RED_DEEPBRICK.get(), 3)
                .pattern("DDD")
                .pattern("LLL")
                .pattern("DDD")
                .define('D', Ingredient.of(Items.DEEPSLATE_BRICK_SLAB))
                .define('L', Moditems.REDLIGHT.get())
                .unlockedBy("has_redlight", has(Moditems.REDLIGHT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.WHITE_DEEPBRICK.get(), 3)
                .pattern("DDD")
                .pattern("LLL")
                .pattern("DDD")
                .define('D', Ingredient.of(Items.DEEPSLATE_BRICK_SLAB))
                .define('L', Moditems.WHITELIGHT.get())
                .unlockedBy("has_whitelight", has(Moditems.WHITELIGHT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.YELLOW_DEEPBRICK.get(), 3)
                .pattern("DDD")
                .pattern("LLL")
                .pattern("DDD")
                .define('D', Ingredient.of(Items.DEEPSLATE_BRICK_SLAB))
                .define('L', Moditems.YELLOWLIGHT.get())
                .unlockedBy("has_yellowlight", has(Moditems.YELLOWLIGHT)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Moditems.BLACKLIGHT.get(), 9)
                .pattern(" D ")
                .pattern("GRG")
                .pattern(" G ")
                .define('D', Ingredient.of(Items.BLACK_DYE))
                .define('G', Ingredient.of(Items.GLOWSTONE_DUST))
                .define('R', Ingredient.of(Items.REDSTONE))
                .unlockedBy("has_blackdye", has(Items.BLACK_DYE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Moditems.BLUELIGHT.get(), 9)
                .pattern(" D ")
                .pattern("GRG")
                .pattern(" G ")
                .define('D', Ingredient.of(Items.BLUE_DYE))
                .define('G', Ingredient.of(Items.GLOWSTONE_DUST))
                .define('R', Ingredient.of(Items.REDSTONE))
                .unlockedBy("has_bluedye", has(Items.BLUE_DYE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Moditems.BROWNLIGHT.get(), 9)
                .pattern(" D ")
                .pattern("GRG")
                .pattern(" G ")
                .define('D', Ingredient.of(Items.BROWN_DYE))
                .define('G', Ingredient.of(Items.GLOWSTONE_DUST))
                .define('R', Ingredient.of(Items.REDSTONE))
                .unlockedBy("has_browndye", has(Items.BROWN_DYE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Moditems.DARKGRAYLIGHT.get(), 9)
                .pattern(" D ")
                .pattern("GRG")
                .pattern(" G ")
                .define('D', Ingredient.of(Items.GRAY_DYE))
                .define('G', Ingredient.of(Items.GLOWSTONE_DUST))
                .define('R', Ingredient.of(Items.REDSTONE))
                .unlockedBy("has_darkgraydye", has(Items.GRAY_DYE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Moditems.CYANLIGHT.get(), 9)
                .pattern(" D ")
                .pattern("GRG")
                .pattern(" G ")
                .define('D', Ingredient.of(Items.CYAN_DYE))
                .define('G', Ingredient.of(Items.GLOWSTONE_DUST))
                .define('R', Ingredient.of(Items.REDSTONE))
                .unlockedBy("has_cyandye", has(Items.CYAN_DYE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Moditems.GREENLIGHT.get(), 9)
                .pattern(" D ")
                .pattern("GRG")
                .pattern(" G ")
                .define('D', Ingredient.of(Items.GREEN_DYE))
                .define('G', Ingredient.of(Items.GLOWSTONE_DUST))
                .define('R', Ingredient.of(Items.REDSTONE))
                .unlockedBy("has_greendye", has(Items.GREEN_DYE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Moditems.LIGHTBLUELIGHT.get(), 9)
                .pattern(" D ")
                .pattern("GRG")
                .pattern(" G ")
                .define('D', Ingredient.of(Items.LIGHT_BLUE_DYE))
                .define('G', Ingredient.of(Items.GLOWSTONE_DUST))
                .define('R', Ingredient.of(Items.REDSTONE))
                .unlockedBy("has_lightbluedye", has(Items.LIGHT_BLUE_DYE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Moditems.LIGHTGRAYLIGHT.get(), 9)
                .pattern(" D ")
                .pattern("GRG")
                .pattern(" G ")
                .define('D', Ingredient.of(Items.LIGHT_GRAY_DYE))
                .define('G', Ingredient.of(Items.GLOWSTONE_DUST))
                .define('R', Ingredient.of(Items.REDSTONE))
                .unlockedBy("has_lightgraydye", has(Items.LIGHT_GRAY_DYE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Moditems.LIMELIGHT.get(), 9)
                .pattern(" D ")
                .pattern("GRG")
                .pattern(" G ")
                .define('D', Ingredient.of(Items.LIME_DYE))
                .define('G', Ingredient.of(Items.GLOWSTONE_DUST))
                .define('R', Ingredient.of(Items.REDSTONE))
                .unlockedBy("has_limedye", has(Items.LIME_DYE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Moditems.MAGENTALIGHT.get(), 9)
                .pattern(" D ")
                .pattern("GRG")
                .pattern(" G ")
                .define('D', Ingredient.of(Items.MAGENTA_DYE))
                .define('G', Ingredient.of(Items.GLOWSTONE_DUST))
                .define('R', Ingredient.of(Items.REDSTONE))
                .unlockedBy("has_magentadye", has(Items.MAGENTA_DYE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Moditems.ORANGELIGHT.get(), 9)
                .pattern(" D ")
                .pattern("GRG")
                .pattern(" G ")
                .define('D', Ingredient.of(Items.ORANGE_DYE))
                .define('G', Ingredient.of(Items.GLOWSTONE_DUST))
                .define('R', Ingredient.of(Items.REDSTONE))
                .unlockedBy("has_orangedye", has(Items.ORANGE_DYE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Moditems.PINKLIGHT.get(), 9)
                .pattern(" D ")
                .pattern("GRG")
                .pattern(" G ")
                .define('D', Ingredient.of(Items.PINK_DYE))
                .define('G', Ingredient.of(Items.GLOWSTONE_DUST))
                .define('R', Ingredient.of(Items.REDSTONE))
                .unlockedBy("has_pinkdye", has(Items.PINK_DYE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Moditems.PURPLELIGHT.get(), 9)
                .pattern(" D ")
                .pattern("GRG")
                .pattern(" G ")
                .define('D', Ingredient.of(Items.PURPLE_DYE))
                .define('G', Ingredient.of(Items.GLOWSTONE_DUST))
                .define('R', Ingredient.of(Items.REDSTONE))
                .unlockedBy("has_purpledye", has(Items.PURPLE_DYE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Moditems.REDLIGHT.get(), 9)
                .pattern(" D ")
                .pattern("GRG")
                .pattern(" G ")
                .define('D', Ingredient.of(Items.RED_DYE))
                .define('G', Ingredient.of(Items.GLOWSTONE_DUST))
                .define('R', Ingredient.of(Items.REDSTONE))
                .unlockedBy("has_reddye", has(Items.RED_DYE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Moditems.WHITELIGHT.get(), 9)
                .pattern(" D ")
                .pattern("GRG")
                .pattern(" G ")
                .define('D', Ingredient.of(Items.WHITE_DYE))
                .define('G', Ingredient.of(Items.GLOWSTONE_DUST))
                .define('R', Ingredient.of(Items.REDSTONE))
                .unlockedBy("has_whitedye", has(Items.WHITE_DYE)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Moditems.YELLOWLIGHT.get(), 9)
                .pattern(" D ")
                .pattern("GRG")
                .pattern(" G ")
                .define('D', Ingredient.of(Items.YELLOW_DYE))
                .define('G', Ingredient.of(Items.GLOWSTONE_DUST))
                .define('R', Ingredient.of(Items.REDSTONE))
                .unlockedBy("has_yellowdye", has(Items.YELLOW_DYE)).save(recipeOutput);
    }
}
