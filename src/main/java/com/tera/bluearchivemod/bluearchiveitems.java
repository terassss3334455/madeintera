package com.tera.bluearchivemod;

import com.tera.bluearchivemod.item.AnimatedItem;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class bluearchiveitems {

    // レジストリの作成
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BluearchiveMod.MOD_ID);

    // アニメーション付きアイテム
    public static final RegistryObject<Item> ARCHIVE_MENU =
            ITEMS.register(
                    "archive_menu",
                    () -> new AnimatedItem(new Item.Properties())
            );

    // 登録処理
    public static void registerItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}