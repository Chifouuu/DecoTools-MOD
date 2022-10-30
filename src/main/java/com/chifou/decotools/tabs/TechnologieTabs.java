package com.chifou.decotools.tabs;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class TechnologieTabs extends CreativeModeTab {

    public TechnologieTabs(String l) {
        super(l);
    }

    @Override
    public ItemStack makeIcon() {
        return Items.REDSTONE.getDefaultInstance();
    }
}
