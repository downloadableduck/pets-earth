package com.jeff.pets.earth.client.rendering.custom.minecraft_earth.chicken.cluckshroom;

import com.jeff.pets.client.Utils;
import com.jeff.pets.earth.client.EarthUtils;
import com.jeff.pets.mob.vanilla.passive.ClientChicken;
import com.jeff.pets.client.rendering.PetRenderer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.ChickenRenderState;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

public class CluckshroomRenderer extends PetRenderer<ClientChicken, ChickenRenderState, CluckshroomModel> {

    public static final ModelLayerLocation CLUCKSHROOM_LOCATION = Utils.createModelLayer("cluckshroom");

    public CluckshroomRenderer(EntityRendererProvider.Context context) {
        super(context, new CluckshroomModel(context.bakeLayer(CLUCKSHROOM_LOCATION)), 0.75f);
    }

    @Override
    public @NotNull Identifier getTextureLocation(@NotNull ChickenRenderState state) {
        return EarthUtils.withModNamespace("textures/entity/minecraft_earth/chicken/cluckshroom.png");
    }

    @Override
    public @NotNull ChickenRenderState createRenderState() {
        return new ChickenRenderState();
    }
}
