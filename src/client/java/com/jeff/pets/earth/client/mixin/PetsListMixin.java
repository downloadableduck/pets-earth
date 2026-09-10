package com.jeff.pets.earth.client.mixin;

import com.jeff.pets.client.enums.PetList;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;

import java.util.ArrayList;
import java.util.List;

@Mixin(PetList.class)
public enum PetsListMixin {
    albino_cow,
    bouldering_zombie,
    lobber_zombie,
    skeleton_wolf,
    bone_spider,
    melon_golem,
    amber_chicken,
    ashen_cow,
    bold_striped_rabbit,
    bronzed_chicken,
    cluckshroom,
    cookie_cow,
    cream_cow,
    dairy_cow,
    dyed_cat,
    fancy_chicken,
    flecked_sheep,
    freckled_rabbit,
    furnace_golem,
    fuzzy_sheep,
    gold_crested_chicken,
    harelequin_rabbit,
    horned_sheep,
    inky_sheep,
    jolly_llama,
    long_nosed_sheep,
    midnight_chicken,
    moobloom,
    moolip,
    mottled_pig,
    muddy_foot_rabbit,
    muddy_pig,
    pale_pig,
    patched_sheep,
    piebald_pig,
    pink_footed_pig,
    pinto_cow,
    rainbow_sheep,
    rocky_sheep,
    skewbald_chicken,
    sooty_pig,
    spotted_pig,
    stormy_chicken,
    sunset_cow,
    tropical_slime,
    umbra_cow,
    vested_rabbit,
    wooly_cow;

    @Shadow
    PetsListMixin() {
    }

    @ModifyReturnValue(at = @At("RETURN"), method = "getAllValues")
    private List<Enum> getAllValues(List<Enum> original) {
        List<Enum> list = List.of(
                albino_cow,
                bouldering_zombie,
                lobber_zombie,
                skeleton_wolf,
                bone_spider,
                melon_golem,
                amber_chicken,
                ashen_cow,
                bold_striped_rabbit,
                bronzed_chicken,
                cluckshroom,
                cookie_cow,
                cream_cow,
                dairy_cow,
                dyed_cat,
                fancy_chicken,
                flecked_sheep,
                freckled_rabbit,
                furnace_golem,
                fuzzy_sheep,
                gold_crested_chicken,
                harelequin_rabbit,
                horned_sheep,
                inky_sheep,
                jolly_llama,
                long_nosed_sheep,
                midnight_chicken,
                moobloom,
                moolip,
                mottled_pig,
                muddy_foot_rabbit,
                muddy_pig,
                pale_pig,
                patched_sheep,
                piebald_pig,
                pink_footed_pig,
                pinto_cow,
                rainbow_sheep,
                rocky_sheep,
                skewbald_chicken,
                sooty_pig,
                spotted_pig,
                stormy_chicken,
                sunset_cow,
                tropical_slime,
                umbra_cow,
                vested_rabbit,
                wooly_cow
        );
        ArrayList<Enum> arrayList = new ArrayList<>();
        arrayList.addAll(list);
        arrayList.addAll(original);
        return arrayList;
    }
}
