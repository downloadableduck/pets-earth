package com.jeff.pets.earth.client.rendering.custom.minecraft_earth.chicken.skewbald_chicken;

import com.jeff.pets.client.Utils;
import com.jeff.pets.earth.client.EarthUtils;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.chicken.AbstractChickenRenderer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.Identifier;

public class SkewbaldChickenRenderer extends AbstractChickenRenderer {

    public static final ModelLayerLocation SKEWBALD_CHICKEN_RENDERER = EarthUtils.createModelLayer("skewbald_chicken");
    private static final Identifier TEXTURE = EarthUtils.withModNamespace("textures/entity/minecraft_earth/chicken/skewbald_chicken.png");

    public SkewbaldChickenRenderer(EntityRendererProvider.Context context) {
        super(context, TEXTURE, SKEWBALD_CHICKEN_RENDERER);
    }
}
