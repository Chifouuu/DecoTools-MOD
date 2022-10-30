package com.chifou.decotools.tabs;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class OutdoorTabs extends CreativeModeTab {
    public OutdoorTabs(String l) {
        super(l);
    }

    @Override
    public ItemStack makeIcon() {
        return Items.BAMBOO.getDefaultInstance();
    }
}
