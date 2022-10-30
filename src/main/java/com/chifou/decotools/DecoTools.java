package com.chifou.decotools;

import com.chifou.decotools.reg.BlockRegistries;
import com.chifou.decotools.reg.ItemRegistries;
import com.chifou.decotools.tabs.IndoorTabs;
import com.chifou.decotools.tabs.OutdoorTabs;
import com.chifou.decotools.tabs.TechnologieTabs;
import com.chifou.decotools.utils.Reference;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Reference.MOD_ID)
public class DecoTools
{

    public static final CreativeModeTab indoorTabs = new IndoorTabs("Indoor Tab");
    public static final CreativeModeTab outdoorTabs = new OutdoorTabs("Outdoor Tab");
    public static final CreativeModeTab technologieTabs = new TechnologieTabs("Technologie Tab");

    public DecoTools()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        BlockRegistries.BLOCKS.register(modEventBus);
        ItemRegistries.ITEMS.register(modEventBus);


        MinecraftForge.EVENT_BUS.register(this);
    }
}
