package com.jeff.pets.earth.client.rendering.custom.minecraft_earth.rabbit;

import com.jeff.pets.mob.vanilla.passive.ClientRabbit;
import com.jeff.pets.rendering.PetRenderer;
import com.jeff.pets.rendering.vanilla.rabbit.ClientRabbitRenderer;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.RabbitRenderState;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.Central.CONFIG;

public class AbstractRabbitRenderer extends PetRenderer<ClientRabbit, RabbitRenderState, LegacyRabbitModel> {

    private final Identifier texture;

    public AbstractRabbitRenderer(EntityRendererProvider.Context context, ModelLayerLocation model, Identifier texture) {
        super(context, new LegacyRabbitModel(context.bakeLayer(model)), 0.75f);
        this.texture = texture;
    }

    @Override
    protected void scale(@NotNull RabbitRenderState livingEntityRenderState, @NotNull PoseStack poseStack) {
        if (CONFIG.isBaby) {
            poseStack.scale(0.5f, 0.5f, 0.5f);
        }
    }

    @Override
    public @NotNull Identifier getTextureLocation(@NotNull RabbitRenderState state) {
        return texture;
    }

    @Override
    public @NotNull RabbitRenderState createRenderState() {
        return new RabbitRenderState();
    }
}
