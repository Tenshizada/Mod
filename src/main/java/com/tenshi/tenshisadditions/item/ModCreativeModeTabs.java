package com.tenshi.tenshisadditions.item;

import com.tenshi.tenshisadditions.TenshisAdditions;
import com.tenshi.tenshisadditions.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;

import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.awt.*;
import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TenshisAdditions.MOD_ID);

    public static final Supplier<CreativeModeTab> TENSHISADDITIONS_ITEMS_TAB = CREATIVE_MODE_TAB.register("tenshisadditions_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALVES.get()))
            .title(Component.translatable("creativetab.tenshisadditions.alves_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ALVES);
                        output.accept(ModItems.UNIVERSALWRENCH);

                    }).build());

    public static final Supplier<CreativeModeTab> ALVES_BLOCK_TAB = CREATIVE_MODE_TAB.register("tenshisadditions_block_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ALVES_BLOCK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(TenshisAdditions.MOD_ID, "tenshisadditions_items_tab"))
                    .title(Component.translatable("creativetab.tenshisadditions.alves_block"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ALVES_BLOCK);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
