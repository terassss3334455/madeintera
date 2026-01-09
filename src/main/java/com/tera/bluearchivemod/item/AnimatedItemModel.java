package com.tera.bluearchivemod.item;

import com.tera.bluearchivemod.BluearchiveMod;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

@SuppressWarnings("removal")
public class AnimatedItemModel extends GeoModel<AnimatedItem> {

    @Override
    public ResourceLocation getModelResource(AnimatedItem animatable) {
        return new ResourceLocation(
                BluearchiveMod.MOD_ID,
                "geo/archive_menu.geo.json"
        );
    }

    @Override
    public ResourceLocation getTextureResource(AnimatedItem animatable) {
        return new ResourceLocation(
                BluearchiveMod.MOD_ID,
                "textures/item/archive_menu.png"
        );
    }

    @Override
    public ResourceLocation getAnimationResource(AnimatedItem animatable) {
        return new ResourceLocation(
                BluearchiveMod.MOD_ID,
                "animations/archive_menu.animation.json"
        );
    }
}