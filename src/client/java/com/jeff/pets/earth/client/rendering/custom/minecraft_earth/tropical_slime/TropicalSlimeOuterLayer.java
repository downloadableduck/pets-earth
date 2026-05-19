package com.jeff.pets.earth.client.rendering.custom.minecraft_earth.tropical_slime;

import com.jeff.pets.Utils;
import com.jeff.pets.earth.client.EarthUtils;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.monster.slime.SlimeModel;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.state.SlimeRenderState;
import net.minecraft.client.renderer.rendertype.RenderTypes;
import org.jetbrains.annotations.NotNull;

public class TropicalSlimeOuterLayer extends RenderLayer<@NotNull SlimeRenderState, @NotNull SlimeModel> {
    public static final ModelLayerLocation OUTER_LAYER_LOCATION = new ModelLayerLocation(Utils.withModNamespace("tropical_outer_layer"), "outer");
    private final SlimeModel model;

    public TropicalSlimeOuterLayer(RenderLayerParent<@NotNull SlimeRenderState, @NotNull SlimeModel> renderer, EntityRendererProvider.Context context) {
        super(renderer);
        this.model = new SlimeModel(context.bakeLayer(OUTER_LAYER_LOCATION));
    }

    public void submit(final @NotNull PoseStack poseStack, final SubmitNodeCollector submitNodeCollector, final int lightCoords, final SlimeRenderState state, final float yRot, final float xRot) {
        int overlayCoords = LivingEntityRenderer.getOverlayCoords(state, 0.0F);
        submitNodeCollector.order(1).submitModel(this.model, state, poseStack, RenderTypes.entityTranslucent(EarthUtils.withModNamespace("textures/entity/minecraft_earth/slime/tropical_slime.png")), lightCoords, overlayCoords, state.outlineColor, null);
    }
}
