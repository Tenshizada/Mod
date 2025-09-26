package com.tenshi.tenshisadditions.item;

import com.tenshi.tenshisadditions.TenshisAdditions;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TenshisAdditions.MOD_ID);

    public static final DeferredItem<Item> ALVES = ITEMS.register("alves",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> UNIVERSALWRENCH = ITEMS.register("universalwrench",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
