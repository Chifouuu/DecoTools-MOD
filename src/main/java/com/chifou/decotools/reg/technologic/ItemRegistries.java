package com.chifou.decotools.reg.technologic;

import com.chifou.decotools.DecoTools;
import com.chifou.decotools.utils.Reference;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistries {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);


    public static final RegistryObject<Item> LAPTOP_ITEM = ITEMS.register
            ("laptop_item", () -> new BlockItem(BlockRegistries.LAPTOP.get(), new Item.Properties().tab(DecoTools.technologieTabs)));
    public static final RegistryObject<Item> SCREEN_ITEM = ITEMS.register
            ("screen_item", () -> new BlockItem(BlockRegistries.SCREEN.get(), new Item.Properties().tab(DecoTools.technologieTabs)));
    public static final RegistryObject<Item> LEFTSCREEN_ITEM = ITEMS.register
            ("leftscreen_item", () -> new BlockItem(BlockRegistries.LEFT_SCREEN.get(), new Item.Properties().tab(DecoTools.technologieTabs)));
    public static final RegistryObject<Item> RIGHTSCREEN_ITEM = ITEMS.register
            ("rightscreen_item", () -> new BlockItem(BlockRegistries.RIGHT_SCREEN.get(), new Item.Properties().tab(DecoTools.technologieTabs)));
}
