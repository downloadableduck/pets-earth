package com.jeff.pets.earth.client.rendering.custom.minecraft_earth.chicken.amber_chicken;

import com.jeff.pets.Utils;
import com.jeff.pets.earth.client.EarthUtils;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.chicken.AbstractChickenRenderer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.Identifier;

public class AmberChickenRenderer extends AbstractChickenRenderer {

    public static final ModelLayerLocation AMBER_CHICKEN_LOCATION = new ModelLayerLocation(Utils.withModNamespace("amber_chicken"), "main");
    private static final Identifier TEXTURE = EarthUtils.withModNamespace("textures/entity/minecraft_earth/chicken/amber_chicken.png");

    public AmberChickenRenderer(EntityRendererProvider.Context context) {
        super(context, TEXTURE, AMBER_CHICKEN_LOCATION);
    }
}
