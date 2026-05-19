package com.jeff.pets.earth.client.rendering.custom.minecraft_earth.chicken.midnight_chicken;

import com.jeff.pets.Utils;
import com.jeff.pets.earth.client.EarthUtils;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.chicken.AbstractChickenRenderer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.Identifier;

public class MidnightChickenRenderer extends AbstractChickenRenderer {

    public static final ModelLayerLocation MIDNIGHT_CHICKEN_LOCATION = Utils.createModelLayer("midnight_chicken");
    private static final Identifier TEXTURE = EarthUtils.withModNamespace("textures/entity/minecraft_earth/chicken/midnight_chicken.png");

    public MidnightChickenRenderer(EntityRendererProvider.Context context) {
        super(context, TEXTURE, MIDNIGHT_CHICKEN_LOCATION);
    }
}
