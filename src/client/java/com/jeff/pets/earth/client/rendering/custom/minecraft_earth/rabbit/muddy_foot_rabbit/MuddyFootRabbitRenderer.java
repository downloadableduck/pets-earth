package com.jeff.pets.earth.client.rendering.custom.minecraft_earth.rabbit.muddy_foot_rabbit;

import com.jeff.pets.Utils;
import com.jeff.pets.earth.client.EarthUtils;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.rabbit.AbstractRabbitRenderer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.Identifier;

public class MuddyFootRabbitRenderer extends AbstractRabbitRenderer {

    public static final ModelLayerLocation MUDDY_FOOT_RABBIT_LOCATION = Utils.createModelLayer("muddy_foot_rabbit");
    private static final Identifier TEXTURE = EarthUtils.withModNamespace("textures/entity/minecraft_earth/rabbit/muddy_foot_rabbit.png");

    public MuddyFootRabbitRenderer(EntityRendererProvider.Context context) {
        super(context, MUDDY_FOOT_RABBIT_LOCATION, TEXTURE);
    }
}
