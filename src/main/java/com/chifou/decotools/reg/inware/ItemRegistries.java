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
}
