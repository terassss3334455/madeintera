package com.tera.bluearchivemod.item;

import com.tera.bluearchivemod.BluearchiveMod;
import com.tera.bluearchivemod.bluearchiveitems;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(
        modid = BluearchiveMod.MOD_ID,
        bus = Mod.EventBusSubscriber.Bus.MOD,
        value = Dist.CLIENT
)
public class ClientItemRenderers {

    private static class RegisterItemRenderersEvent {
        public void register(Item item, AnimatedItemRenderer animatedItemRenderer) {

        }
    }
}