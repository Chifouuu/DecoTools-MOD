package com.chifou.decotools.tabs;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class MusicTabs extends CreativeModeTab {

    public MusicTabs(String l) {
        super(l);
    }

    @Override
    public ItemStack makeIcon() {
        return Items.NOTE_BLOCK.getDefaultInstance();
    }
}
