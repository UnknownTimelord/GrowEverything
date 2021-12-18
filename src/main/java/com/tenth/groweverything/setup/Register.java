package com.tenth.groweverything.setup;

import com.tenth.groweverything.GrowEverything;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Register {

    public static CreativeModeTab GE_TAB = new CreativeModeTab("Grow Everything") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(GOLDEN_POTATO.get());
        }
    };

    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GrowEverything.MOD_ID);
    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static RegistryObject<Item> GOLDEN_POTATO = ITEMS.register("golden_potato", ()-> new Item(new Item.Properties().tab(GE_TAB)));
}
