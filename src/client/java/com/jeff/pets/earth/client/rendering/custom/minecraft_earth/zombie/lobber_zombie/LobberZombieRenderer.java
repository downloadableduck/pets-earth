package com.jeff.pets.earth.client.rendering.custom.minecraft_earth.zombie.lobber_zombie;

import com.jeff.pets.earth.client.EarthUtils;
import com.jeff.pets.earth.client.rendering.custom.minecraft_earth.zombie.bouldering_zombie.BoulderingZombieModel;
import com.jeff.pets.mob.vanilla.hostile.ClientZombie;
import com.jeff.pets.client.rendering.PetRenderer;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.ZombieRenderState;
import net.minecraft.resources.Identifier;
import org.jetbrains.annotations.NotNull;

import static com.jeff.pets.client.Central.CONFIG;

public class LobberZombieRenderer extends PetRenderer<ClientZombie, ZombieRenderState, LobberZombieModel> {

    public static final ModelLayerLocation LOBBER_ZOMBIE_LOCATION = EarthUtils.createModelLayer("lobber_zombie");

    public LobberZombieRenderer(EntityRendererProvider.Context context) {
        super(context, new LobberZombieModel(context.bakeLayer(LOBBER_ZOMBIE_LOCATION)), 0.75f);
    }

    @Override
    protected void scale(@NotNull ZombieRenderState livingEntityRenderState, @NotNull PoseStack poseStack) {
        if (CONFIG.isBaby) {
            poseStack.scale(0.5f, 0.5f, 0.5f);
        }
    }

    @Override
    public @NotNull Identifier getTextureLocation(@NotNull ZombieRenderState state) {
        return EarthUtils.withModNamespace("textures/entity/minecraft_earth/zombie/lobber_zombie.png");
    }

    @Override
    public @NotNull ZombieRenderState createRenderState() {
        return new ZombieRenderState();
    }
}
