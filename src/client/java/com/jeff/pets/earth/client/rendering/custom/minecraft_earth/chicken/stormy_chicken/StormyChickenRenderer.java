package com.jeff.pets.earth.client.rendering.custom.minecraft_earth.chicken.stormy_chicken;

import com.jeff.pets.client.Utils;
import com.jeff.pets.earth.client.EarthUtils;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.chicken.AbstractChickenRenderer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.Identifier;

public class StormyChickenRenderer extends AbstractChickenRenderer {

    public static final ModelLayerLocation STORMY_CHICKEN_LOCATION = EarthUtils.createModelLayer("stormy_chicken");
    private static final Identifier TEXTURE = EarthUtils.withModNamespace("textures/entity/minecraft_earth/chicken/stormy_chicken.png");

    public StormyChickenRenderer(EntityRendererProvider.Context context) {
        super(context, TEXTURE, STORMY_CHICKEN_LOCATION);
    }
}
