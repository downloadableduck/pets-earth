package com.jeff.pets.earth.client.rendering.custom.minecraft_earth.chicken.gold_crested_chicken;

import com.jeff.pets.client.Utils;
import com.jeff.pets.earth.client.EarthUtils;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.chicken.AbstractChickenRenderer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.Identifier;

public class GoldCrestedChickenRenderer extends AbstractChickenRenderer {

    public static final ModelLayerLocation GOLD_CRESTED_CHICKEN_LOCATION = EarthUtils.createModelLayer("gold_crested_chicken");
    private static final Identifier TEXTURE = EarthUtils.withModNamespace("textures/entity/minecraft_earth/chicken/gold_crested_chicken.png");

    public GoldCrestedChickenRenderer(EntityRendererProvider.Context context) {
        super(context, TEXTURE, GOLD_CRESTED_CHICKEN_LOCATION);
    }
}
