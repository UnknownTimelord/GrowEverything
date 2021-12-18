package com.tenth.groweverything.setup;

import com.tenth.groweverything.GrowEverything;
import com.tenth.groweverything.blocks.AppleBush;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Register {

    public static final CreativeModeTab GE_TAB = new CreativeModeTab("groweverything") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(APPLE_BUSH_ITEM.get());
        }
    };

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GrowEverything.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GrowEverything.MOD_ID);
    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final RegistryObject<Block> APPLE_BUSH = BLOCKS.register("apple_bush", ()-> new AppleBush(BlockBehaviour.Properties.of(Blocks.WHEAT.defaultBlockState().getMaterial()).noCollission().sound(SoundType.GRASS).strength(5.0f)));
    public static final RegistryObject<Item> APPLE_BUSH_ITEM = ITEMS.register("apple_bush", ()-> new BlockItem(APPLE_BUSH.get(), new Item.Properties().tab(GE_TAB)));
}
