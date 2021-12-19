package com.tenth.groweverything.setup;

import com.tenth.groweverything.GrowEverything;
import com.tenth.groweverything.blocks.AppleBush;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Register {

    public static final CreativeModeTab GE_BLOCKS = new CreativeModeTab("groweverythingblocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(APPLE_BUSH.get());
        }
    };

    public static final CreativeModeTab GE_ITEMS = new CreativeModeTab("groweverythingitems") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(GOLDEN_STEAK.get());
        }
    };

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GrowEverything.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GrowEverything.MOD_ID);
    public static void init() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    // Golden Meat
    public static final RegistryObject<Item> GOLDEN_STEAK = ITEMS.register("golden_steak", ()-> new Item(new Item.Properties().tab(GE_ITEMS).food(Items.COOKED_BEEF.getFoodProperties())));
    public static final RegistryObject<Item> GOLDEN_SALMON = ITEMS.register("golden_salmon", ()-> new Item(new Item.Properties().tab(GE_ITEMS).food(Items.COOKED_SALMON.getFoodProperties())));
    public static final RegistryObject<Item> GOLDEN_RABBIT = ITEMS.register("golden_rabbit", ()-> new Item(new Item.Properties().tab(GE_ITEMS).food(Items.COOKED_RABBIT.getFoodProperties())));
    public static final RegistryObject<Item> GOLDEN_PORKCHOP = ITEMS.register("golden_porkchop", ()-> new Item(new Item.Properties().tab(GE_ITEMS).food(Items.COOKED_PORKCHOP.getFoodProperties())));
    public static final RegistryObject<Item> GOLDEN_MUTTON = ITEMS.register("golden_mutton", ()-> new Item(new Item.Properties().tab(GE_ITEMS).food(Items.COOKED_MUTTON.getFoodProperties())));
    public static final RegistryObject<Item> GOLDEN_COD = ITEMS.register("golden_cod", ()-> new Item(new Item.Properties().tab(GE_ITEMS).food(Items.COOKED_COD.getFoodProperties())));
    public static final RegistryObject<Item> GOLDEN_CHICKEN = ITEMS.register("golden_chicken", ()-> new Item(new Item.Properties().tab(GE_ITEMS).food(Items.COOKED_CHICKEN.getFoodProperties())));

    // Golden Fruit and Veggies
    public static final RegistryObject<Item> GOLDEN_MELON = ITEMS.register("golden_melon", ()-> new Item(new Item.Properties().tab(GE_ITEMS).food(Items.MELON_SLICE.getFoodProperties())));
    public static final RegistryObject<Item> GOLDEN_GLOW_BERRIES = ITEMS.register("golden_glow_berries", ()-> new Item(new Item.Properties().tab(GE_ITEMS).food(Items.GLOW_BERRIES.getFoodProperties())));
    public static final RegistryObject<Item> GOLDEN_BAKED_POTATO = ITEMS.register("golden_baked_potato", ()-> new Item(new Item.Properties().tab(GE_ITEMS).food(Items.BAKED_POTATO.getFoodProperties())));
    public static final RegistryObject<Item> GOLDEN_SWEET_BERRIES = ITEMS.register("golden_sweet_berries", ()-> new Item(new Item.Properties().tab(GE_ITEMS).food(Items.SWEET_BERRIES.getFoodProperties())));
    public static final RegistryObject<Item> GOLDEN_BEETROOT = ITEMS.register("golden_beetroot", ()-> new Item(new Item.Properties().tab(GE_ITEMS).food(Items.BEETROOT.getFoodProperties())));
    public static final RegistryObject<Item> GOLDEN_PUMPKIN_PIE = ITEMS.register("golden_pumpkin_pie", ()-> new Item(new Item.Properties().tab(GE_ITEMS).food(Items.PUMPKIN_PIE.getFoodProperties())));

    // Blocks
    public static final RegistryObject<Block> APPLE_BUSH = BLOCKS.register("apple_bush", ()-> new AppleBush(BlockBehaviour.Properties.of(Blocks.WHEAT.defaultBlockState().getMaterial()).noCollission().sound(SoundType.GRASS).strength(5.0f)));
    public static final RegistryObject<Item> APPLE_BUSH_ITEM = ITEMS.register("apple_bush", ()-> new BlockItem(APPLE_BUSH.get(), new Item.Properties().tab(GE_BLOCKS)));

}
