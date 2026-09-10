package com.jeff.pets.earth.client.mixin;

import com.jeff.pets.client.PetsConfigScreen;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(PetsConfigScreen.class)
public class ConfigScreenMixin {
    /*@Inject(at = @At("HEAD"), method = "lambda$getModConfigScreenFactory$4", cancellable = true)
    private static void addCustomEntitySpecies(PetsConfig CONFIG, CallbackInfoReturnable<Enum<?>> cir) {
        if (Arrays.stream(Vals.getVals()).anyMatch(Predicate.isEqual(CONFIG.activePet))) {
            cir.setReturnValue(EarthPetsList.valueOf(CONFIG.activePet));
        }
    }

    @Inject(at = @At("HEAD"), method = "lambda$getModConfigScreenFactory$8", cancellable = true)
    private static void addCustomEntitySkin(PetsConfig CONFIG, CallbackInfoReturnable<Enum<?>> cir) {
        if (Arrays.stream(Vals.getVals()).anyMatch(Predicate.isEqual(CONFIG.activePet))) {
            cir.setReturnValue(EarthPetsList.valueOf(CONFIG.activePet));
        }
    }
    @Inject(at = @At("HEAD"), method = "lambda$getModConfigScreenFactory$6", cancellable = true)
    private static void addEntityNames(PetsConfig CONFIG, CallbackInfoReturnable<String> cir) {
        switch(CONFIG.activePet) {
            case "flecked_sheep" -> cir.setReturnValue(EARTH_CONFIG.fleckedSheepName);
            case "fuzzy_sheep" -> cir.setReturnValue(EARTH_CONFIG.fuzzySheepName);
            case "horned_sheep" -> cir.setReturnValue(EARTH_CONFIG.hornedSheepName);
            case "inky_sheep" -> cir.setReturnValue(EARTH_CONFIG.inkySheepName);
            case "long_nosed_sheep" -> cir.setReturnValue(EARTH_CONFIG.longNosedSheepName);
            case "patched_sheep" -> cir.setReturnValue(EARTH_CONFIG.patchedSheepName);
            case "rainbow_sheep" -> cir.setReturnValue(EARTH_CONFIG.rainbowSheepName);
            case "rocky_sheep" -> cir.setReturnValue(EARTH_CONFIG.rockySheepName);
            case "mottled_pig" -> cir.setReturnValue(EARTH_CONFIG.mottledPigName);
            case "muddy_pig" -> cir.setReturnValue(EARTH_CONFIG.muddyPigName);
            case "pale_pig" -> cir.setReturnValue(EARTH_CONFIG.palePigName);
            case "piebald_pig" -> cir.setReturnValue(EARTH_CONFIG.piebaldPigName);
            case "pink_footed_pig" -> cir.setReturnValue(EARTH_CONFIG.pinkFootedPigName);
            case "sooty_pig" -> cir.setReturnValue(EARTH_CONFIG.sootyPigName);
            case "spotted_pig" -> cir.setReturnValue(EARTH_CONFIG.spottedPigName);
            case "albino_cow" -> cir.setReturnValue(EARTH_CONFIG.albinoCowName);
            case "ashen_cow" -> cir.setReturnValue(EARTH_CONFIG.ashenCowName);
            case "cookie_cow" -> cir.setReturnValue(EARTH_CONFIG.cookieCowName);
            case "cream_cow" -> cir.setReturnValue(EARTH_CONFIG.creamCowName);
            case "dairy_cow" -> cir.setReturnValue(EARTH_CONFIG.dairyCowName);
            case "moobloom" -> cir.setReturnValue(EARTH_CONFIG.moobloomName);
            case "moolip" -> cir.setReturnValue(EARTH_CONFIG.moolipName);
            case "pinto_cow" -> cir.setReturnValue(EARTH_CONFIG.pintoCowName);
            case "sunset_cow" -> cir.setReturnValue(EARTH_CONFIG.sunsetCowName);
            case "umbra_cow" -> cir.setReturnValue(EARTH_CONFIG.umbraCowName);
            case "wooly_cow" -> cir.setReturnValue(EARTH_CONFIG.woolyCowName);
            case "tropical_slime" -> cir.setReturnValue(EARTH_CONFIG.tropicalSlimeName);
            case "jolly_llama" -> cir.setReturnValue(EARTH_CONFIG.jollyLlamaName);
            case "dyed_cat" -> cir.setReturnValue(EARTH_CONFIG.dyedCatName);
            case "furnace_golem" -> cir.setReturnValue(EARTH_CONFIG.furnaceGolemName);
            case "melon_golem" -> cir.setReturnValue(EARTH_CONFIG.melonGolemName);
            case "lobber_zombie" -> cir.setReturnValue(EARTH_CONFIG.lobberZombieName);
            case "bouldering_zombie" -> cir.setReturnValue(EARTH_CONFIG.boulderingZombieName);
            case "skeleton_wolf" -> cir.setReturnValue(EARTH_CONFIG.skeletonWolfName);
            case "bone_spider" -> cir.setReturnValue(EARTH_CONFIG.boneSpiderName);
        }
    }
    @Inject(at = @At("HEAD"), method = "lambda$getModConfigScreenFactory$7")
    private static void setEntityName(String activePet, PetsConfig CONFIG, String name, CallbackInfo ci) {
        switch(CONFIG.activePet) {
            case "flecked_sheep" -> EARTH_CONFIG.fleckedSheepName = name;
            case "fuzzy_sheep" -> EARTH_CONFIG.fuzzySheepName = name;
            case "horned_sheep" -> EARTH_CONFIG.hornedSheepName = name;
            case "inky_sheep" -> EARTH_CONFIG.inkySheepName = name;
            case "long_nosed_sheep" -> EARTH_CONFIG.longNosedSheepName = name;
            case "patched_sheep" -> EARTH_CONFIG.patchedSheepName = name;
            case "rainbow_sheep" -> EARTH_CONFIG.rainbowSheepName = name;
            case "rocky_sheep" -> EARTH_CONFIG.rockySheepName = name;
            case "mottled_pig" -> EARTH_CONFIG.mottledPigName = name;
            case "muddy_pig" -> EARTH_CONFIG.muddyPigName = name;
            case "pale_pig" -> EARTH_CONFIG.palePigName = name;
            case "piebald_pig" -> EARTH_CONFIG.piebaldPigName = name;
            case "pink_footed_pig" -> EARTH_CONFIG.pinkFootedPigName = name;
            case "sooty_pig" -> EARTH_CONFIG.sootyPigName = name;
            case "spotted_pig" -> EARTH_CONFIG.spottedPigName = name;
            case "albino_cow" -> EARTH_CONFIG.albinoCowName = name;
            case "ashen_cow" -> EARTH_CONFIG.ashenCowName = name;
            case "cookie_cow" -> EARTH_CONFIG.cookieCowName = name;
            case "cream_cow" -> EARTH_CONFIG.creamCowName = name;
            case "dairy_cow" -> EARTH_CONFIG.dairyCowName = name;
            case "moobloom" -> EARTH_CONFIG.moobloomName = name;
            case "moolip" -> EARTH_CONFIG.moolipName = name;
            case "pinto_cow" -> EARTH_CONFIG.pintoCowName = name;
            case "sunset_cow" -> EARTH_CONFIG.sunsetCowName = name;
            case "umbra_cow" -> EARTH_CONFIG.umbraCowName = name;
            case "wooly_cow" -> EARTH_CONFIG.woolyCowName = name;
            case "tropical_slime" -> EARTH_CONFIG.tropicalSlimeName = name;
            case "jolly_llama" -> EARTH_CONFIG.jollyLlamaName = name;
            case "dyed_cat" -> EARTH_CONFIG.dyedCatName = name;
            case "furnace_golem" -> EARTH_CONFIG.furnaceGolemName = name;
            case "melon_golem" -> EARTH_CONFIG.melonGolemName = name;
            case "bouldering_zombie" -> EARTH_CONFIG.boulderingZombieName = name;
            case "lobber_zombie" -> EARTH_CONFIG.lobberZombieName = name;
            case "skeleton_wolf" -> EARTH_CONFIG.skeletonWolfName = name;
            case "bone_spider" -> EARTH_CONFIG.boneSpiderName = name;
        }
        AutoConfig.getConfigHolder(EarthConfig.class).save();
    }*/
}
