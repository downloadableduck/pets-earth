package com.jeff.pets.earth.client.rendering.custom.minecraft_earth.chicken;

import com.jeff.pets.mob.vanilla.passive.ClientChicken;
import com.jeff.pets.client.rendering.PetRenderer;
import com.jeff.pets.client.rendering.vanilla.chicken.ClientChickenModel;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.ChickenRenderState;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.client.Central.CONFIG;

public abstract class AbstractChickenRenderer extends PetRenderer<ClientChicken, ChickenRenderState, ClientChickenModel> {

    private final Identifier texture;

    public AbstractChickenRenderer(EntityRendererProvider.Context context, Identifier texture, ModelLayerLocation location) {
        super(context, new ClientChickenModel(context.bakeLayer(location)), 0.75f);
        this.texture = texture;
    }

    @Override
    public @NotNull Identifier getTextureLocation(@NotNull ChickenRenderState state) {
        return texture;
    }

    @Override
    protected void scale(ChickenRenderState state, @NotNull PoseStack poseStack) {
        if (CONFIG.isBaby) {
            poseStack.scale(0.5f, 0.5f, 0.5f);
        }
    }

    @Override
    public @NotNull ChickenRenderState createRenderState() {
        return new ChickenRenderState();
    }
}
