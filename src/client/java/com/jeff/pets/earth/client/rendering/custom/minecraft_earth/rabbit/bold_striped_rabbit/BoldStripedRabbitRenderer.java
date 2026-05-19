package com.jeff.pets.earth.client.rendering.custom.minecraft_earth.rabbit.bold_striped_rabbit;

import com.jeff.pets.Utils;
import com.jeff.pets.earth.client.EarthUtils;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.rabbit.AbstractRabbitRenderer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.Identifier;

public class BoldStripedRabbitRenderer extends AbstractRabbitRenderer {

    public static final ModelLayerLocation BOLD_STRIPED_RABBIT_LOCATION = Utils.createModelLayer("bold_striped_rabbit");
    private static final Identifier TEXTURE = EarthUtils.withModNamespace("textures/entity/minecraft_earth/rabbit/bold_striped_rabbit.png");

    public BoldStripedRabbitRenderer(EntityRendererProvider.Context context) {
        super(context, BOLD_STRIPED_RABBIT_LOCATION, TEXTURE);
    }
}
