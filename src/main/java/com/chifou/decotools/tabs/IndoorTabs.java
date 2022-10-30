package com.chifou.decotools.tabs;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class IndoorTabs extends CreativeModeTab {


    public IndoorTabs(String l) {
        super(l);
    }

    @Override
    public ItemStack makeIcon() {
        return Items.BIRCH_STAIRS.getDefaultInstance();
    }
}
