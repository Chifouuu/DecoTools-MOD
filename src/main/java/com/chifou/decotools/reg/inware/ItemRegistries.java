package com.chifou.decotools.reg.inware;

import com.chifou.decotools.DecoTools;
import com.chifou.decotools.reg.inware.BlockRegistries;
import com.chifou.decotools.utils.Reference;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistries {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Reference.MOD_ID);

    public static final RegistryObject<Item> CHAIR_ITEM = ITEMS.register("chair_item", () -> new BlockItem(BlockRegistries.CHAIR_BLOCK.get(), new Item.Properties().tab(DecoTools.indoorTabs)));

    //Blocks tables
    public static final RegistryObject<Item> SPRUCETABLE_ITEM = ITEMS.register
            ("sprucetable_item", () -> new BlockItem(BlockRegistries.SPRUCE_TABLE.get(), new Item.Properties().tab(DecoTools.indoorTabs)));
    public static final RegistryObject<Item> OAKTABLE_ITEM = ITEMS.register
            ("oaktable_item", () -> new BlockItem(BlockRegistries.OAK_TABLE.get(), new Item.Properties().tab(DecoTools.indoorTabs)));
    public static final RegistryObject<Item> BENCH_ITEM = ITEMS.register
            ("bench_item", () -> new BlockItem(BlockRegistries.BENCH.get(), new Item.Properties().tab(DecoTools.outdoorTabs)));
    public static final RegistryObject<Item> BAREL_ITEM = ITEMS.register
            ("barel_item", () -> new BlockItem(BlockRegistries.BAREL.get(), new Item.Properties().tab(DecoTools.indoorTabs)));
    public static final RegistryObject<Item> LAPTOP_ITEM = ITEMS.register
            ("laptop_item", () -> new BlockItem(BlockRegistries.LAPTOP.get(), new Item.Properties().tab(DecoTools.technologieTabs)));
    public static final RegistryObject<Item> SCREEN_ITEM = ITEMS.register
            ("screen_item", () -> new BlockItem(BlockRegistries.SCREEN.get(), new Item.Properties().tab(DecoTools.technologieTabs)));
    public static final RegistryObject<Item> LEFTSCREEN_ITEM = ITEMS.register
            ("leftscreen_item", () -> new BlockItem(BlockRegistries.LEFT_SCREEN.get(), new Item.Properties().tab(DecoTools.technologieTabs)));
    public static final RegistryObject<Item> RIGHTSCREEN_ITEM = ITEMS.register
            ("rightscreen_item", () -> new BlockItem(BlockRegistries.RIGHT_SCREEN.get(), new Item.Properties().tab(DecoTools.technologieTabs)));
    public static final RegistryObject<Item> PIANO_ITEM = ITEMS.register
            ("piano_item", () -> new BlockItem(BlockRegistries.PIANO.get(), new Item.Properties().tab(DecoTools.musicTabs)));
    public static final RegistryObject<Item> COMPUTER_ITEM = ITEMS.register
            ("computer_item", () -> new BlockItem(BlockRegistries.COMPUTER.get(), new Item.Properties().tab(DecoTools.technologieTabs)));
}
