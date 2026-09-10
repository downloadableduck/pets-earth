package com.jeff.pets.earth.client.mixin;

import com.jeff.pets.client.Utils;
import com.jeff.pets.earth.PetsEarth;
import com.jeff.pets.earth.mob.custom.minecraft_earth.cow.MinecraftEarthCow;
import com.jeff.pets.earth.mob.custom.minecraft_earth.pig.MinecraftEarthPig;
import com.jeff.pets.earth.mob.custom.minecraft_earth.sheep.MinecraftEarthSheep;
import com.jeff.pets.mob.AbstractPet;
import com.jeff.pets.mob.vanilla.hostile.ClientSlime;
import com.jeff.pets.mob.vanilla.hostile.ClientZombie;
import com.jeff.pets.mob.vanilla.neutral.ClientIronGolem;
import com.jeff.pets.mob.vanilla.neutral.ClientLlama;
import com.jeff.pets.mob.vanilla.neutral.ClientSpider;
import com.jeff.pets.mob.vanilla.neutral.ClientWolf;
import com.jeff.pets.mob.vanilla.passive.ClientCat;
import com.jeff.pets.mob.vanilla.passive.ClientChicken;
import com.jeff.pets.mob.vanilla.passive.ClientRabbit;
import com.jeff.pets.mob.vanilla.passive.ClientSnowGolem;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static com.jeff.pets.client.Central.CONFIG;
import static com.jeff.pets.earth.client.PetsEarthClient.EARTH_CONFIG;

@Mixin(Utils.class)
public class UtilsMixin {
    @Inject(at = @At("HEAD"), method = "setActivePetName")
    private static void earth$setActivePetName(String name, CallbackInfo ci) {
        switch (CONFIG.activePet) {
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
            case "amber_chicken" -> EARTH_CONFIG.amberChickenName = name;
            case "bronzed_chicken" -> EARTH_CONFIG.bronzedChickenName = name;
            case "cluckshroom" -> EARTH_CONFIG.cluckshroomName = name;
            case "fancy_chicken" -> EARTH_CONFIG.fancyChickenName = name;
            case "gold_crested_chicken" -> EARTH_CONFIG.goldCrestedChickenName = name;
            case "midnight_chicken" -> EARTH_CONFIG.midnightChickenName = name;
            case "skewbald_chicken" -> EARTH_CONFIG.skewbaldChickenName = name;
            case "stormy_chicken" -> EARTH_CONFIG.stormyChickenName = name;
            case "bold_striped_rabbit" -> EARTH_CONFIG.boldStripedRabbitName = name;
            case "freckled_rabbit" -> EARTH_CONFIG.freckledRabbitName = name;
            case "harelequin_rabbit" -> EARTH_CONFIG.harelequinRabbitName = name;
            case "muddy_foot_rabbit" -> EARTH_CONFIG.muddyFootRabbitName = name;
            case "vested_rabbit" -> EARTH_CONFIG.vestedRabbitName = name;
            case "melon_golem" -> EARTH_CONFIG.melonGolemName = name;
            case "bouldering_zombie" -> EARTH_CONFIG.boulderingZombieName = name;
            case "lobber_zombie" -> EARTH_CONFIG.lobberZombieName = name;
            case "skeleton_wolf" -> EARTH_CONFIG.skeletonWolfName = name;
            case "bone_spider" -> EARTH_CONFIG.boneSpiderName = name;
        }
    }

    @ModifyReturnValue(at = @At("RETURN"), method = "getActivePetName")
    private static String getActivePetName(String original) {
        return switch (CONFIG.activePet) {
            case "flecked_sheep" -> EARTH_CONFIG.fleckedSheepName;
            case "fuzzy_sheep" -> EARTH_CONFIG.fuzzySheepName;
            case "horned_sheep" -> EARTH_CONFIG.hornedSheepName;
            case "inky_sheep" -> EARTH_CONFIG.inkySheepName;
            case "long_nosed_sheep" -> EARTH_CONFIG.longNosedSheepName;
            case "patched_sheep" -> EARTH_CONFIG.patchedSheepName;
            case "rainbow_sheep" -> EARTH_CONFIG.rainbowSheepName;
            case "rocky_sheep" -> EARTH_CONFIG.rockySheepName;
            case "mottled_pig" -> EARTH_CONFIG.mottledPigName;
            case "muddy_pig" -> EARTH_CONFIG.muddyPigName;
            case "pale_pig" -> EARTH_CONFIG.palePigName;
            case "piebald_pig" -> EARTH_CONFIG.piebaldPigName;
            case "pink_footed_pig" -> EARTH_CONFIG.pinkFootedPigName;
            case "sooty_pig" -> EARTH_CONFIG.sootyPigName;
            case "spotted_pig" -> EARTH_CONFIG.spottedPigName;
            case "albino_cow" -> EARTH_CONFIG.albinoCowName;
            case "ashen_cow" -> EARTH_CONFIG.ashenCowName;
            case "cookie_cow" -> EARTH_CONFIG.cookieCowName;
            case "cream_cow" -> EARTH_CONFIG.creamCowName;
            case "dairy_cow" -> EARTH_CONFIG.dairyCowName;
            case "moobloom" -> EARTH_CONFIG.moobloomName;
            case "moolip" -> EARTH_CONFIG.moolipName;
            case "pinto_cow" -> EARTH_CONFIG.pintoCowName;
            case "sunset_cow" -> EARTH_CONFIG.sunsetCowName;
            case "umbra_cow" -> EARTH_CONFIG.umbraCowName;
            case "wooly_cow" -> EARTH_CONFIG.woolyCowName;
            case "tropical_slime" -> EARTH_CONFIG.tropicalSlimeName;
            case "jolly_llama" -> EARTH_CONFIG.jollyLlamaName;
            case "dyed_cat" -> EARTH_CONFIG.dyedCatName;
            case "furnace_golem" -> EARTH_CONFIG.furnaceGolemName;
            case "amber_chicken" -> EARTH_CONFIG.amberChickenName;
            case "bronzed_chicken" -> EARTH_CONFIG.bronzedChickenName;
            case "cluckshroom" -> EARTH_CONFIG.cluckshroomName;
            case "fancy_chicken" -> EARTH_CONFIG.fancyChickenName;
            case "gold_crested_chicken" -> EARTH_CONFIG.goldCrestedChickenName;
            case "midnight_chicken" -> EARTH_CONFIG.midnightChickenName;
            case "skewbald_chicken" -> EARTH_CONFIG.skewbaldChickenName;
            case "stormy_chicken" -> EARTH_CONFIG.stormyChickenName;
            case "bold_striped_rabbit" -> EARTH_CONFIG.boldStripedRabbitName;
            case "freckled_rabbit" -> EARTH_CONFIG.freckledRabbitName;
            case "harelequin_rabbit" -> EARTH_CONFIG.harelequinRabbitName;
            case "muddy_foot_rabbit" -> EARTH_CONFIG.muddyFootRabbitName;
            case "vested_rabbit" -> EARTH_CONFIG.vestedRabbitName;
            case "melon_golem" -> EARTH_CONFIG.melonGolemName;
            case "bouldering_zombie" -> EARTH_CONFIG.boulderingZombieName;
            case "lobber_zombie" -> EARTH_CONFIG.lobberZombieName;
            case "skeleton_wolf" -> EARTH_CONFIG.skeletonWolfName;
            case "bone_spider" -> EARTH_CONFIG.boneSpiderName;
            default -> original;
        };
    }

    @ModifyReturnValue(method = "getPet", at = @At("RETURN"))
    private static AbstractPet earth$getPet(AbstractPet original) {
        ClientLevel world = Minecraft.getInstance().level;
        return switch(CONFIG.activePet) {
            case "flecked_sheep" -> new MinecraftEarthSheep(PetsEarth.FLECKED_SHEEP, world);
            case "fuzzy_sheep" -> new MinecraftEarthSheep(PetsEarth.FUZZY_SHEEP, world);
            case "horned_sheep" -> new MinecraftEarthSheep(PetsEarth.HORNED_SHEEP, world);
            case "inky_sheep" -> new MinecraftEarthSheep(PetsEarth.INKY_SHEEP, world);
            case "long_nosed_sheep" -> new MinecraftEarthSheep(PetsEarth.LONG_NOSED_SHEEP, world);
            case "patched_sheep" -> new MinecraftEarthSheep(PetsEarth.PATCHED_SHEEP, world);
            case "rainbow_sheep" -> new MinecraftEarthSheep(PetsEarth.RAINBOW_SHEEP, world);
            case "rocky_sheep" -> new MinecraftEarthSheep(PetsEarth.ROCKY_SHEEP, world);
            case "mottled_pig" -> new MinecraftEarthPig(PetsEarth.MOTTLED_PIG, world);
            case "muddy_pig" -> new MinecraftEarthPig(PetsEarth.MUDDY_PIG, world);
            case "pale_pig" -> new MinecraftEarthPig(PetsEarth.PALE_PIG, world);
            case "piebald_pig" -> new MinecraftEarthPig(PetsEarth.PIEBALD_PIG, world);
            case "pink_footed_pig" -> new MinecraftEarthPig(PetsEarth.PINK_FOOTED_PIG, world);
            case "sooty_pig" -> new MinecraftEarthPig(PetsEarth.SOOTY_PIG, world);
            case "spotted_pig" -> new MinecraftEarthPig(PetsEarth.SPOTTED_PIG, world);
            case "albino_cow" -> new MinecraftEarthCow(PetsEarth.ALBINO_COW, world);
            case "ashen_cow" -> new MinecraftEarthCow(PetsEarth.ASHEN_COW, world);
            case "cookie_cow" -> new MinecraftEarthCow(PetsEarth.COOKIE_COW, world);
            case "cream_cow" -> new MinecraftEarthCow(PetsEarth.CREAM_COW, world);
            case "dairy_cow" -> new MinecraftEarthCow(PetsEarth.DAIRY_COW, world);
            case "moobloom" -> new MinecraftEarthCow(PetsEarth.MOOBLOOM, world);
            case "moolip" -> new MinecraftEarthCow(PetsEarth.MOOLIP, world);
            case "pinto_cow" -> new MinecraftEarthCow(PetsEarth.PINTO_COW, world);
            case "sunset_cow" -> new MinecraftEarthCow(PetsEarth.SUNSET_COW, world);
            case "umbra_cow" -> new MinecraftEarthCow(PetsEarth.UMBRA_COW, world);
            case "wooly_cow" -> new MinecraftEarthCow(PetsEarth.WOOLY_COW, world);
            case "tropical_slime" -> new ClientSlime(PetsEarth.TROPICAL_SLIME, world);
            case "jolly_llama" -> new ClientLlama(PetsEarth.JOLLY_LLAMA, world);
            case "dyed_cat" -> new ClientCat(PetsEarth.DYED_CAT, world);
            case "furnace_golem" -> new ClientIronGolem(PetsEarth.FURNACE_GOLEM, world);
            case "amber_chicken" -> new ClientChicken(PetsEarth.AMBER_CHICKEN, world);
            case "bronzed_chicken" -> new ClientChicken(PetsEarth.BRONZED_CHICKEN, world);
            case "cluckshroom" -> new ClientChicken(PetsEarth.CLUCKSHROOM, world);
            case "fancy_chicken" -> new ClientChicken(PetsEarth.FANCY_CHICKEN, world);
            case "gold_crested_chicken" -> new ClientChicken(PetsEarth.GOLD_CRESTED_CHICKEN, world);
            case "midnight_chicken" -> new ClientChicken(PetsEarth.MIDNIGHT_CHICKEN, world);
            case "skewbald_chicken" -> new ClientChicken(PetsEarth.SKEWBALD_CHICKEN, world);
            case "stormy_chicken" -> new ClientChicken(PetsEarth.STORMY_CHICKEN, world);
            case "bold_striped_rabbit" -> new ClientRabbit(PetsEarth.BOLD_STRIPED_RABBIT, world);
            case "freckled_rabbit" -> new ClientRabbit(PetsEarth.FRECKLED_RABBIT, world);
            case "harelequin_rabbit" -> new ClientRabbit(PetsEarth.HARELEQUIN_RABBIT, world);
            case "muddy_foot_rabbit" -> new ClientRabbit(PetsEarth.MUDDY_FOOT_RABBIT, world);
            case "vested_rabbit" -> new ClientRabbit(PetsEarth.VESTED_RABBIT, world);
            case "melon_golem" -> new ClientSnowGolem(PetsEarth.MELON_GOLEM, world);
            case "bouldering_zombie" -> new ClientZombie(PetsEarth.BOULDERING_ZOMBIE, world);
            case "lobber_zombie" -> new ClientZombie(PetsEarth.LOBBER_ZOMBIE, world);
            case "skeleton_wolf" -> new ClientWolf(PetsEarth.SKELETON_WOLF, world);
            case "bone_spider" -> new ClientSpider(PetsEarth.BONE_SPIDER, world);
            default -> original;
        };
    }
}

