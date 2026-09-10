package com.jeff.pets.earth.client.rendering.custom.minecraft_earth.chicken.bronzed_chicken;

import com.jeff.pets.client.Utils;
import com.jeff.pets.earth.client.EarthUtils;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.chicken.AbstractChickenRenderer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.Identifier;

public class BronzedChickenRenderer extends AbstractChickenRenderer {

    public static final ModelLayerLocation BRONZED_CHICKEN_LOCATION = Utils.createModelLayer("bronzed_chicken");
    private static final Identifier TEXTURE = EarthUtils.withModNamespace("textures/entity/minecraft_earth/chicken/bronzed_chicken.png");

    public BronzedChickenRenderer(EntityRendererProvider.Context context) {
        super(context, TEXTURE, BRONZED_CHICKEN_LOCATION);
    }
}
