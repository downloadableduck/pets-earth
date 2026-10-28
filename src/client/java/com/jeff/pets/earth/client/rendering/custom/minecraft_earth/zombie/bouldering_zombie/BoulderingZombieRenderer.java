package com.jeff.pets.earth.client.rendering.custom.minecraft_earth.zombie.bouldering_zombie;

import com.jeff.pets.client.Utils;
import com.jeff.pets.earth.client.EarthUtils;
import com.jeff.pets.mob.vanilla.hostile.ClientZombie;
import com.jeff.pets.client.rendering.PetRenderer;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.ZombieRenderState;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.client.Central.CONFIG;

public class BoulderingZombieRenderer extends PetRenderer<ClientZombie, ZombieRenderState, BoulderingZombieModel> {

    public static final ModelLayerLocation BOULDERING_ZOMBIE_LOCATION = EarthUtils.createModelLayer("bouldering_zombie");

    public BoulderingZombieRenderer(EntityRendererProvider.Context context) {
        super(context, new BoulderingZombieModel(context.bakeLayer(BOULDERING_ZOMBIE_LOCATION)), 0.75f);
    }

    @Override
    protected void scale(@NotNull ZombieRenderState livingEntityRenderState, @NotNull PoseStack poseStack) {
        if (CONFIG.isBaby) {
            poseStack.scale(0.5f, 0.5f, 0.5f);
        }
    }

    @Override
    public @NotNull Identifier getTextureLocation(@NotNull ZombieRenderState state) {
        return EarthUtils.withModNamespace("textures/entity/minecraft_earth/zombie/bouldering_zombie.png");
    }

    @Override
    public @NotNull ZombieRenderState createRenderState() {
        return new ZombieRenderState();
    }
}
