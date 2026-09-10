package com.jeff.pets.earth.client.rendering.custom.minecraft_earth.skeleton_wolf;

import com.jeff.pets.client.Utils;
import com.jeff.pets.earth.client.EarthUtils;
import com.jeff.pets.mob.vanilla.neutral.ClientWolf;
import com.jeff.pets.client.rendering.PetRenderer;
import com.jeff.pets.client.rendering.vanilla.wolf.ClientWolfModel;
import com.jeff.pets.client.rendering.vanilla.wolf.ClientWolfRenderer;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.animal.wolf.AdultWolfModel;
import net.minecraft.client.model.animal.wolf.WolfModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.WolfRenderer;
import net.minecraft.client.renderer.entity.state.WolfRenderState;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.client.Central.CONFIG;

public class SkeletonWolfRenderer extends PetRenderer<ClientWolf, WolfRenderState, ClientWolfModel> {

    public static final ModelLayerLocation SKELETON_WOLF_LOCATION = Utils.createModelLayer("skeleton_wolf");

    public SkeletonWolfRenderer(EntityRendererProvider.Context context) {
        super(context, new ClientWolfModel(context.bakeLayer(ModelLayers.WOLF)), 0.75f);
    }

    @Override
    protected void scale(@NotNull WolfRenderState livingEntityRenderState, @NotNull PoseStack poseStack) {
        if (CONFIG.isBaby) {
            poseStack.scale(0.5f, 0.5f, 0.5f);
        }
    }

    @Override
    public @NotNull Identifier getTextureLocation(@NotNull WolfRenderState state) {
        return EarthUtils.withModNamespace("textures/entity/minecraft_earth/skeleton_wolf.png");
    }

    @Override
    public @NotNull WolfRenderState createRenderState() {
        return new WolfRenderState();
    }
}
