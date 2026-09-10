package com.jeff.pets.earth.client.mixin;

import com.jeff.pets.client.Central;
import com.jeff.pets.client.PetsConfig;
import com.jeff.pets.client.Utils;
import com.jeff.pets.client.network.NetworkManager;
import com.jeff.pets.earth.client.EarthConfig;
import com.jeff.pets.earth.client.EarthUtils;
import com.jeff.pets.earth.client.Vals;
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
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;
import me.shedaniel.autoconfig.AutoConfig;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Predicate;

import static com.jeff.pets.client.Central.CONFIG;
import static com.jeff.pets.earth.client.PetsEarthClient.EARTH_CONFIG;

@Mixin(Central.class)
public class CentralMixin {
    private static MinecraftEarthSheep fleckedSheep;
    private static MinecraftEarthSheep fuzzySheep;
    private static MinecraftEarthSheep inkySheep;
    private static MinecraftEarthSheep longNosedSheep;
    private static MinecraftEarthSheep patchedSheep;
    private static MinecraftEarthSheep rainbowSheep;
    private static MinecraftEarthSheep rockySheep;
    private static MinecraftEarthSheep hornedSheep;
    private static MinecraftEarthPig mottledPig;
    private static MinecraftEarthPig muddyPig;
    private static MinecraftEarthPig palePig;
    private static MinecraftEarthPig piebaldPig;
    private static MinecraftEarthPig pinkFootedPig;
    private static MinecraftEarthPig sootyPig;
    private static MinecraftEarthPig spottedPig;
    private static MinecraftEarthCow albinoCow;
    private static MinecraftEarthCow ashenCow;
    private static MinecraftEarthCow cookieCow;
    private static MinecraftEarthCow creamCow;
    private static MinecraftEarthCow dairyCow;
    private static MinecraftEarthCow moobloom;
    private static MinecraftEarthCow moolip;
    private static MinecraftEarthCow pintoCow;
    private static MinecraftEarthCow sunsetCow;
    private static MinecraftEarthCow umbraCow;
    private static MinecraftEarthCow woolyCow;
    private static ClientSlime tropicalSlime;
    private static ClientLlama jollyLlama;
    private static ClientCat dyedCat;
    private static ClientIronGolem furnaceGolem;
    private static ClientChicken amberChicken;
    private static ClientChicken bronzedChicken;
    private static ClientChicken cluckshroom;
    private static ClientChicken fancyChicken;
    private static ClientChicken goldCrestedChicken;
    private static ClientChicken midnightChicken;
    private static ClientChicken skewbaldChicken;
    private static ClientChicken stormyChicken;
    private static ClientRabbit boldStripedRabbit;
    private static ClientRabbit freckledRabbit;
    private static ClientRabbit harelequinRabbit;
    private static ClientRabbit muddyFootRabbit;
    private static ClientRabbit vestedRabbit;
    private static ClientSnowGolem melonGolem;
    private static ClientZombie boulderingZombie;
    private static ClientZombie lobberZombie;
    private static ClientWolf skeletonWolf;
    private static ClientSpider boneSpider;

    @Unique
    private static void spawnEntity(CommandContext<FabricClientCommandSource> context, AbstractPet entity, String activePet) {
        Utils.setActivePet(entity, activePet);
        AutoConfig.getConfigHolder(PetsConfig.class).save();
        context.getSource().sendFeedback(Component.literal("§b[PetsMod] §aYour active pet has been switched to " + activePet.replace("_", " ")));
        Central.despawnPet();
        Central.summonPet();
        NetworkManager.get().broadcastGeneral(Minecraft.getInstance().player.getStringUUID(), CONFIG.petOn, CONFIG.activePet, Utils.getActivePetName(), Utils.getActivePetSkin(), CONFIG.isBaby);
    }
    
	@Inject(at = @At("HEAD"), method = "lambda$createPetSpeciesCommand$1", cancellable = true)
	private void init(CommandContext<FabricClientCommandSource> context, CallbackInfoReturnable<Integer> cir) {
        String species = StringArgumentType.getString(context, "species");
        if (Objects.equals(species, "flecked sheep") || Objects.equals(species, "flecked_sheep")) {
            spawnEntity(context, fleckedSheep, "flecked_sheep");
        } else if (Objects.equals(species, "fuzzy sheep") || Objects.equals(species, "fuzzy_sheep")) {
            spawnEntity(context, fuzzySheep, "fuzzy_sheep");
        } else if (Objects.equals(species, "horned sheep") || Objects.equals(species, "horned_sheep")) {
            spawnEntity(context, hornedSheep, "horned_sheep");
        } else if (Objects.equals(species, "inky sheep") || Objects.equals(species, "inky_sheep")) {
            spawnEntity(context, inkySheep, "inky_sheep");
        } else if (Objects.equals(species, "long nosed sheep") || Objects.equals(species, "long_nosed_sheep")) {
            spawnEntity(context, longNosedSheep, "long_nosed_sheep");
        } else if (Objects.equals(species, "patched sheep") || Objects.equals(species, "patched_sheep")) {
            spawnEntity(context, patchedSheep, "patched_sheep");
        } else if (Objects.equals(species, "rainbow sheep") || Objects.equals(species, "rainbow_sheep")) {
            spawnEntity(context, rainbowSheep, "rainbow_sheep");
        } else if (Objects.equals(species, "rocky sheep") || Objects.equals(species, "rocky_sheep")) {
            spawnEntity(context, rockySheep, "rocky_sheep");
        } else if (Objects.equals(species, "mottled pig") || Objects.equals(species, "mottled_pig")) {
            spawnEntity(context, mottledPig, "mottled_pig");
        } else if (Objects.equals(species, "muddy pig") || Objects.equals(species, "muddy_pig")) {
            spawnEntity(context, muddyPig, "muddy_pig");
        } else if (Objects.equals(species, "pale pig") || Objects.equals(species, "pale_pig")) {
            spawnEntity(context, palePig, "pale_pig");
        } else if (Objects.equals(species, "piebald pig") || Objects.equals(species, "piebald_pig")) {
            spawnEntity(context, piebaldPig, "piebald_pig");
        } else if (Objects.equals(species, "pink footed pig") || Objects.equals(species, "pink_footed_pig")) {
            spawnEntity(context, pinkFootedPig, "pink_footed_pig");
        } else if (Objects.equals(species, "sooty pig") || Objects.equals(species, "sooty_pig")) {
            spawnEntity(context, sootyPig, "sooty_pig");
        } else if (Objects.equals(species, "spotted pig") || Objects.equals(species, "spotted_pig")) {
            spawnEntity(context, spottedPig, "spotted_pig");
        } else if (Objects.equals(species, "albino cow") || Objects.equals(species, "albino_cow")) {
            spawnEntity(context, albinoCow, "albino_cow");
        } else if (Objects.equals(species, "ashen cow") || Objects.equals(species, "ashen_cow")) {
            spawnEntity(context, ashenCow, "ashen_cow");
        } else if (Objects.equals(species, "cookie cow") || Objects.equals(species, "cookie_cow")) {
            spawnEntity(context, cookieCow, "cookie_cow");
        } else if (Objects.equals(species, "cream cow") || Objects.equals(species, "cream_cow")) {
            spawnEntity(context, creamCow, "cream_cow");
        } else if (Objects.equals(species, "dairy cow") || Objects.equals(species, "dairy_cow")) {
            spawnEntity(context, dairyCow, "dairy_cow");
        } else if (Objects.equals(species, "moobloom")) {
            spawnEntity(context, moobloom, "moobloom");
        } else if (Objects.equals(species, "moolip")) {
            spawnEntity(context, moolip, "moolip");
        } else if (Objects.equals(species, "pinto cow") || Objects.equals(species, "pinto_cow")) {
            spawnEntity(context, pintoCow, "pinto_cow");
        } else if (Objects.equals(species, "sunset cow") || Objects.equals(species, "sunset_cow")) {
            spawnEntity(context, sunsetCow, "sunset_cow");
        } else if (Objects.equals(species, "umbra cow") || Objects.equals(species, "umbra_cow")) {
            spawnEntity(context, umbraCow, "umbra_cow");
        } else if (Objects.equals(species, "wooly cow") || Objects.equals(species, "wooly_cow")) {
            spawnEntity(context, woolyCow, "wooly_cow");
        } else if (Objects.equals(species, "tropical slime") || Objects.equals(species, "tropical_slime")) {
            spawnEntity(context, tropicalSlime, "tropical_slime");
        } else if (Objects.equals(species, "jolly llama") || Objects.equals(species, "jolly_llama")) {
            spawnEntity(context, jollyLlama, "jolly_llama");
        } else if (Objects.equals(species, "dyed cat") || Objects.equals(species, "dyed_cat")) {
            spawnEntity(context, dyedCat, "dyed_cat");
        } else if (Objects.equals(species, "furnace golem") || Objects.equals(species, "furnace_golem")) {
            spawnEntity(context, furnaceGolem, "furnace_golem");
        } else if (Objects.equals(species, "amber chicken") || Objects.equals(species, "amber_chicken")) {
            spawnEntity(context, amberChicken, "amber_chicken");
        } else if (Objects.equals(species, "bronzed chicken") || Objects.equals(species, "bronzed_chicken")) {
            spawnEntity(context, bronzedChicken, "bronzed_chicken");
        } else if (Objects.equals(species, "cluckshroom")) {
            spawnEntity(context, cluckshroom, "cluckshroom");
        } else if (Objects.equals(species, "fancy chicken") || Objects.equals(species, "fancy_chicken")) {
            spawnEntity(context, fancyChicken, "fancy_chicken");
        } else if (Objects.equals(species, "gold crested chicken") || Objects.equals(species, "gold_crested_chicken")) {
            spawnEntity(context, goldCrestedChicken, "gold_crested_chicken");
        } else if (Objects.equals(species, "midnight chicken") || Objects.equals(species, "midnight_chicken")) {
            spawnEntity(context, midnightChicken, "midnight_chicken");
        } else if (Objects.equals(species, "skewbald chicken") || Objects.equals(species, "skewbald_chicken")) {
            spawnEntity(context, skewbaldChicken, "skewbald_chicken");
        } else if (Objects.equals(species, "stormy chicken") || Objects.equals(species, "stormy_chicken")) {
            spawnEntity(context, stormyChicken, "stormy_chicken");
        } else if (Objects.equals(species, "bold striped rabbit") || Objects.equals(species, "bold_striped_rabbit")) {
            spawnEntity(context, boldStripedRabbit, "bold_striped_rabbit");
        } else if (Objects.equals(species, "freckled rabbit") || Objects.equals(species, "freckled_rabbit")) {
            spawnEntity(context, freckledRabbit, "freckled_rabbit");
        } else if (Objects.equals(species, "harelequin rabbit") || Objects.equals(species, "harelequin_rabbit")) {
            spawnEntity(context, harelequinRabbit, "harelequin_rabbit");
        } else if (Objects.equals(species, "muddy foot rabbit") || Objects.equals(species, "muddy_foot_rabbit")) {
            spawnEntity(context, muddyFootRabbit, "muddy_foot_rabbit");
        } else if (Objects.equals(species, "vested rabbit") || Objects.equals(species, "vested_rabbit")) {
            spawnEntity(context, vestedRabbit, "vested_rabbit");
        } else if (Objects.equals(species, "melon golem") || Objects.equals(species, "melon_golem")) {
            spawnEntity(context, melonGolem, "melon_golem");
        } else if (Objects.equals(species, "bouldering zombie") || Objects.equals(species, "bouldering_zombie")) {
            spawnEntity(context, boulderingZombie, "bouldering_zombie");
        } else if (Objects.equals(species, "lobber zombie") || Objects.equals(species, "lobber_zombie")) {
            spawnEntity(context, lobberZombie, "lobber_zombie");
        } else if (Objects.equals(species, "skeleton wolf") || Objects.equals(species, "skeleton_wolf")) {
            spawnEntity(context, skeletonWolf, "skeleton_wolf");
        } else if (Objects.equals(species, "bone spider") || Objects.equals(species, "bone_spider")) {
            spawnEntity(context, boneSpider, "bone_spider");
        }
        AutoConfig.getConfigHolder(PetsConfig.class).save();
        if (Arrays.stream(Vals.getVals()).anyMatch(Predicate.isEqual(species)) || Arrays.stream(Vals.getLowercaseVals()).anyMatch(Predicate.isEqual(species))) {
            cir.setReturnValue(1);
        }
    }
    @Inject(at = @At("HEAD"), method = "summonPet")
    private static void summonPet(CallbackInfo ci) {
        ClientLevel world = Minecraft.getInstance().level;
        fleckedSheep = new MinecraftEarthSheep(PetsEarth.FLECKED_SHEEP, world);
        fuzzySheep = new MinecraftEarthSheep(PetsEarth.FUZZY_SHEEP, world);
        hornedSheep = new MinecraftEarthSheep(PetsEarth.HORNED_SHEEP, world);
        inkySheep = new MinecraftEarthSheep(PetsEarth.INKY_SHEEP, world);
        longNosedSheep = new MinecraftEarthSheep(PetsEarth.LONG_NOSED_SHEEP, world);
        patchedSheep = new MinecraftEarthSheep(PetsEarth.PATCHED_SHEEP, world);
        rainbowSheep = new MinecraftEarthSheep(PetsEarth.RAINBOW_SHEEP, world);
        rockySheep = new MinecraftEarthSheep(PetsEarth.ROCKY_SHEEP, world);
        mottledPig = new MinecraftEarthPig(PetsEarth.MOTTLED_PIG, world);
        muddyPig = new MinecraftEarthPig(PetsEarth.MUDDY_PIG, world);
        palePig = new MinecraftEarthPig(PetsEarth.PALE_PIG, world);
        piebaldPig = new MinecraftEarthPig(PetsEarth.PIEBALD_PIG, world);
        pinkFootedPig = new MinecraftEarthPig(PetsEarth.PINK_FOOTED_PIG, world);
        sootyPig = new MinecraftEarthPig(PetsEarth.SOOTY_PIG, world);
        spottedPig = new MinecraftEarthPig(PetsEarth.SPOTTED_PIG, world);
        albinoCow = new MinecraftEarthCow(PetsEarth.ALBINO_COW, world);
        ashenCow = new MinecraftEarthCow(PetsEarth.ASHEN_COW, world);
        cookieCow = new MinecraftEarthCow(PetsEarth.COOKIE_COW, world);
        creamCow = new MinecraftEarthCow(PetsEarth.CREAM_COW, world);
        dairyCow = new MinecraftEarthCow(PetsEarth.DAIRY_COW, world);
        moobloom = new MinecraftEarthCow(PetsEarth.MOOBLOOM, world);
        moolip = new MinecraftEarthCow(PetsEarth.MOOLIP, world);
        pintoCow = new MinecraftEarthCow(PetsEarth.PINTO_COW, world);
        sunsetCow = new MinecraftEarthCow(PetsEarth.SUNSET_COW, world);
        umbraCow = new MinecraftEarthCow(PetsEarth.UMBRA_COW, world);
        woolyCow = new MinecraftEarthCow(PetsEarth.WOOLY_COW, world);
        tropicalSlime = new ClientSlime(PetsEarth.TROPICAL_SLIME, world);

        jollyLlama = new ClientLlama(PetsEarth.JOLLY_LLAMA, world);
        dyedCat = new ClientCat(PetsEarth.DYED_CAT, world);
        furnaceGolem = new ClientIronGolem(PetsEarth.FURNACE_GOLEM, world);

        amberChicken = new ClientChicken(PetsEarth.AMBER_CHICKEN, world);
        bronzedChicken = new ClientChicken(PetsEarth.BRONZED_CHICKEN, world);
        cluckshroom = new ClientChicken(PetsEarth.CLUCKSHROOM, world);
        fancyChicken = new ClientChicken(PetsEarth.FANCY_CHICKEN, world);
        goldCrestedChicken = new ClientChicken(PetsEarth.GOLD_CRESTED_CHICKEN, world);
        midnightChicken = new ClientChicken(PetsEarth.MIDNIGHT_CHICKEN, world);
        skewbaldChicken = new ClientChicken(PetsEarth.SKEWBALD_CHICKEN, world);
        stormyChicken = new ClientChicken(PetsEarth.STORMY_CHICKEN, world);

        boldStripedRabbit = new ClientRabbit(PetsEarth.BOLD_STRIPED_RABBIT, world);
        freckledRabbit = new ClientRabbit(PetsEarth.FRECKLED_RABBIT, world);
        harelequinRabbit = new ClientRabbit(PetsEarth.HARELEQUIN_RABBIT, world);
        muddyFootRabbit = new ClientRabbit(PetsEarth.MUDDY_FOOT_RABBIT, world);
        vestedRabbit = new ClientRabbit(PetsEarth.VESTED_RABBIT, world);

        melonGolem = new ClientSnowGolem(PetsEarth.MELON_GOLEM, world);
        boulderingZombie = new ClientZombie(PetsEarth.BOULDERING_ZOMBIE, world);
        lobberZombie = new ClientZombie(PetsEarth.LOBBER_ZOMBIE, world);
        skeletonWolf = new ClientWolf(PetsEarth.SKELETON_WOLF, world);
        boneSpider = new ClientSpider(PetsEarth.BONE_SPIDER, world);

        if (Objects.equals(CONFIG.activePet, "flecked_sheep")) {
            Utils.summonPet(fleckedSheep, EARTH_CONFIG.fleckedSheepName);
        } else if (Objects.equals(CONFIG.activePet, "fuzzy_sheep")) {
            Utils.summonPet(fuzzySheep, EARTH_CONFIG.fuzzySheepName);
        } else if (Objects.equals(CONFIG.activePet, "horned_sheep")) {
            Utils.summonPet(hornedSheep, EARTH_CONFIG.hornedSheepName);
        } else if (Objects.equals(CONFIG.activePet, "inky_sheep")) {
            Utils.summonPet(inkySheep, EARTH_CONFIG.inkySheepName);
        } else if (Objects.equals(CONFIG.activePet, "long_nosed_sheep")) {
            Utils.summonPet(longNosedSheep, EARTH_CONFIG.longNosedSheepName);
        } else if (Objects.equals(CONFIG.activePet, "patched_sheep")) {
            Utils.summonPet(patchedSheep, EARTH_CONFIG.patchedSheepName);
        } else if (Objects.equals(CONFIG.activePet, "rainbow_sheep")) {
            Utils.summonPet(rainbowSheep, EARTH_CONFIG.rainbowSheepName);
        } else if (Objects.equals(CONFIG.activePet, "rocky_sheep")) {
            Utils.summonPet(rockySheep, EARTH_CONFIG.rockySheepName);
        } else if (Objects.equals(CONFIG.activePet, "mottled_pig")) {
            Utils.summonPet(mottledPig, EARTH_CONFIG.mottledPigName);
        } else if (Objects.equals(CONFIG.activePet, "muddy_pig")) {
            Utils.summonPet(muddyPig, EARTH_CONFIG.muddyPigName);
        } else if (Objects.equals(CONFIG.activePet, "pale_pig")) {
            Utils.summonPet(palePig, EARTH_CONFIG.palePigName);
        } else if (Objects.equals(CONFIG.activePet, "piebald_pig")) {
            Utils.summonPet(piebaldPig, EARTH_CONFIG.piebaldPigName);
        } else if (Objects.equals(CONFIG.activePet, "pink_footed_pig")) {
            Utils.summonPet(pinkFootedPig, EARTH_CONFIG.pinkFootedPigName);
        } else if (Objects.equals(CONFIG.activePet, "sooty_pig")) {
            Utils.summonPet(sootyPig, EARTH_CONFIG.sootyPigName);
        } else if (Objects.equals(CONFIG.activePet, "spotted_pig")) {
            Utils.summonPet(spottedPig, EARTH_CONFIG.spottedPigName);
        } else if (Objects.equals(CONFIG.activePet, "albino_cow")) {
            Utils.summonPet(albinoCow, EARTH_CONFIG.albinoCowName);
        } else if (Objects.equals(CONFIG.activePet, "ashen_cow")) {
            Utils.summonPet(ashenCow, EARTH_CONFIG.ashenCowName);
        } else if (Objects.equals(CONFIG.activePet, "cookie_cow")) {
            Utils.summonPet(cookieCow, EARTH_CONFIG.cookieCowName);
        } else if (Objects.equals(CONFIG.activePet, "cream_cow")) {
            Utils.summonPet(creamCow, EARTH_CONFIG.creamCowName);
        } else if (Objects.equals(CONFIG.activePet, "dairy_cow")) {
            Utils.summonPet(dairyCow, EARTH_CONFIG.dairyCowName);
        } else if (Objects.equals(CONFIG.activePet, "moobloom")) {
            Utils.summonPet(moobloom, EARTH_CONFIG.moobloomName);
        } else if (Objects.equals(CONFIG.activePet, "moolip")) {
            Utils.summonPet(moolip, EARTH_CONFIG.moolipName);
        } else if (Objects.equals(CONFIG.activePet, "pinto_cow")) {
            Utils.summonPet(pintoCow, EARTH_CONFIG.pintoCowName);
        } else if (Objects.equals(CONFIG.activePet, "sunset_cow")) {
            Utils.summonPet(sunsetCow, EARTH_CONFIG.sunsetCowName);
        } else if (Objects.equals(CONFIG.activePet, "umbra_cow")) {
            Utils.summonPet(umbraCow, EARTH_CONFIG.umbraCowName);
        } else if (Objects.equals(CONFIG.activePet, "wooly_cow")) {
            Utils.summonPet(woolyCow, EARTH_CONFIG.woolyCowName);
        } else if (Objects.equals(CONFIG.activePet, "tropical_slime")) {
            Utils.summonPet(tropicalSlime, EARTH_CONFIG.tropicalSlimeName);
        } else if (Objects.equals(CONFIG.activePet, "jolly_llama")) {
            Utils.summonPet(jollyLlama, EARTH_CONFIG.jollyLlamaName);
        } else if (Objects.equals(CONFIG.activePet, "dyed_cat")) {
            Utils.summonPet(dyedCat, EARTH_CONFIG.dyedCatName);
        } else if (Objects.equals(CONFIG.activePet, "furnace_golem")) {
            Utils.summonPet(furnaceGolem, EARTH_CONFIG.furnaceGolemName);
        } else if (Objects.equals(CONFIG.activePet, "amber_chicken")) {
            Utils.summonPet(amberChicken, EARTH_CONFIG.amberChickenName);
        } else if (Objects.equals(CONFIG.activePet, "bronzed_chicken")) {
            Utils.summonPet(bronzedChicken, EARTH_CONFIG.bronzedChickenName);
        } else if (Objects.equals(CONFIG.activePet, "cluckshroom")) {
            Utils.summonPet(cluckshroom, EARTH_CONFIG.cluckshroomName);
        } else if (Objects.equals(CONFIG.activePet, "fancy_chicken")) {
            Utils.summonPet(fancyChicken, EARTH_CONFIG.fancyChickenName);
        } else if (Objects.equals(CONFIG.activePet, "gold_crested_chicken")) {
            Utils.summonPet(goldCrestedChicken, EARTH_CONFIG.goldCrestedChickenName);
        } else if (Objects.equals(CONFIG.activePet, "midnight_chicken")) {
            Utils.summonPet(midnightChicken, EARTH_CONFIG.midnightChickenName);
        } else if (Objects.equals(CONFIG.activePet, "skewbald_chicken")) {
            Utils.summonPet(skewbaldChicken, EARTH_CONFIG.skewbaldChickenName);
        } else if (Objects.equals(CONFIG.activePet, "stormy_chicken")) {
            Utils.summonPet(stormyChicken, EARTH_CONFIG.stormyChickenName);
        } else if (Objects.equals(CONFIG.activePet, "bold_striped_rabbit")) {
            Utils.summonPet(boldStripedRabbit, EARTH_CONFIG.boldStripedRabbitName);
        } else if (Objects.equals(CONFIG.activePet, "freckled_rabbit")) {
            Utils.summonPet(freckledRabbit, EARTH_CONFIG.freckledRabbitName);
        } else if (Objects.equals(CONFIG.activePet, "harelequin_rabbit")) {
            Utils.summonPet(harelequinRabbit, EARTH_CONFIG.harelequinRabbitName);
        } else if (Objects.equals(CONFIG.activePet, "muddy_foot_rabbit")) {
            Utils.summonPet(muddyFootRabbit, EARTH_CONFIG.muddyFootRabbitName);
        } else if (Objects.equals(CONFIG.activePet, "vested_rabbit")) {
            Utils.summonPet(vestedRabbit, EARTH_CONFIG.vestedRabbitName);
        } else if (Objects.equals(CONFIG.activePet, "melon_golem")) {
            Utils.summonPet(melonGolem, EARTH_CONFIG.melonGolemName);
        }  else if (Objects.equals(CONFIG.activePet, "bouldering_zombie")) {
            Utils.summonPet(boulderingZombie, EARTH_CONFIG.boulderingZombieName);
        } else if (Objects.equals(CONFIG.activePet, "lobber_zombie")) {
            Utils.summonPet(lobberZombie, EARTH_CONFIG.lobberZombieName);
        } else if (Objects.equals(CONFIG.activePet, "skeleton_wolf")) {
            Utils.summonPet(skeletonWolf, EARTH_CONFIG.skeletonWolfName);
        } else if (Objects.equals(CONFIG.activePet, "bone_spider")) {
            Utils.summonPet(boneSpider, EARTH_CONFIG.boneSpiderName);
        }
    }

    @Inject(at = @At("HEAD"), method = "despawnPet")
    private static void despawnPet(CallbackInfo ci) {
        Utils.despawnEntity(fleckedSheep);
        Utils.despawnEntity(fuzzySheep);
        Utils.despawnEntity(hornedSheep);
        Utils.despawnEntity(inkySheep);
        Utils.despawnEntity(longNosedSheep);
        Utils.despawnEntity(patchedSheep);
        Utils.despawnEntity(rainbowSheep);
        Utils.despawnEntity(rockySheep);
        Utils.despawnEntity(mottledPig);
        Utils.despawnEntity(muddyPig);
        Utils.despawnEntity(palePig);
        Utils.despawnEntity(piebaldPig);
        Utils.despawnEntity(pinkFootedPig);
        Utils.despawnEntity(sootyPig);
        Utils.despawnEntity(spottedPig);
        Utils.despawnEntity(albinoCow);
        Utils.despawnEntity(ashenCow);
        Utils.despawnEntity(cookieCow);
        Utils.despawnEntity(creamCow);
        Utils.despawnEntity(dairyCow);
        Utils.despawnEntity(moobloom);
        Utils.despawnEntity(moolip);
        Utils.despawnEntity(pintoCow);
        Utils.despawnEntity(sunsetCow);
        Utils.despawnEntity(umbraCow);
        Utils.despawnEntity(woolyCow);
        Utils.despawnEntity(tropicalSlime);
        Utils.despawnEntity(jollyLlama);
        Utils.despawnEntity(dyedCat);
        Utils.despawnEntity(furnaceGolem);
        Utils.despawnEntity(amberChicken);
        Utils.despawnEntity(bronzedChicken);
        Utils.despawnEntity(cluckshroom);
        Utils.despawnEntity(fancyChicken);
        Utils.despawnEntity(goldCrestedChicken);
        Utils.despawnEntity(midnightChicken);
        Utils.despawnEntity(skewbaldChicken);
        Utils.despawnEntity(stormyChicken);
        Utils.despawnEntity(boldStripedRabbit);
        Utils.despawnEntity(freckledRabbit);
        Utils.despawnEntity(harelequinRabbit);
        Utils.despawnEntity(muddyFootRabbit);
        Utils.despawnEntity(vestedRabbit);
        Utils.despawnEntity(melonGolem);
        Utils.despawnEntity(boulderingZombie);
        Utils.despawnEntity(lobberZombie);
        Utils.despawnEntity(skeletonWolf);
        Utils.despawnEntity(boneSpider);
    }

    /*@Inject(at = @At("HEAD"), method = "lambda$createPetNameCommand$1")
    private static void createPetNameCommand(CommandContext<?> context, CallbackInfoReturnable<Integer> cir) {
        String name = StringArgumentType.getString(context, "name");
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
        AutoConfig.getConfigHolder(EarthConfig.class).save();
    }*/

    @Inject(at = @At("HEAD"), method = "refreshPetNames")
    private static void refresh(CallbackInfo ci) {
        Utils.checkName("flecked_sheep", fleckedSheep, EARTH_CONFIG.fleckedSheepName);
        Utils.checkName("fuzzy_sheep", fuzzySheep, EARTH_CONFIG.fuzzySheepName);
        Utils.checkName("horned_sheep", hornedSheep, EARTH_CONFIG.hornedSheepName);
        Utils.checkName("inky_sheep", inkySheep, EARTH_CONFIG.inkySheepName);
        Utils.checkName("long_nosed_sheep", longNosedSheep, EARTH_CONFIG.longNosedSheepName);
        Utils.checkName("patched_sheep", patchedSheep, EARTH_CONFIG.patchedSheepName);
        Utils.checkName("rainbow_sheep", rainbowSheep, EARTH_CONFIG.rainbowSheepName);
        Utils.checkName("rocky_sheep", rockySheep, EARTH_CONFIG.rockySheepName);
        Utils.checkName("mottled_pig", mottledPig, EARTH_CONFIG.mottledPigName);
        Utils.checkName("muddy_pig", muddyPig, EARTH_CONFIG.muddyPigName);
        Utils.checkName("pale_pig", palePig, EARTH_CONFIG.palePigName);
        Utils.checkName("piebald_pig", piebaldPig, EARTH_CONFIG.piebaldPigName);
        Utils.checkName("pink_footed_pig", pinkFootedPig, EARTH_CONFIG.pinkFootedPigName);
        Utils.checkName("sooty_pig", sootyPig, EARTH_CONFIG.sootyPigName);
        Utils.checkName("spotted_pig", spottedPig, EARTH_CONFIG.spottedPigName);
        Utils.checkName("albino_cow", albinoCow, EARTH_CONFIG.albinoCowName);
        Utils.checkName("ashen_cow", ashenCow, EARTH_CONFIG.ashenCowName);
        Utils.checkName("cookie_cow", cookieCow, EARTH_CONFIG.cookieCowName);
        Utils.checkName("cream_cow", creamCow, EARTH_CONFIG.creamCowName);
        Utils.checkName("dairy_cow", dairyCow, EARTH_CONFIG.dairyCowName);
        Utils.checkName("moobloom", moobloom, EARTH_CONFIG.moobloomName);
        Utils.checkName("moolip", moolip, EARTH_CONFIG.moolipName);
        Utils.checkName("pinto_cow", pintoCow, EARTH_CONFIG.pintoCowName);
        Utils.checkName("sunset_cow", sunsetCow, EARTH_CONFIG.sunsetCowName);
        Utils.checkName("wooly_cow", woolyCow, EARTH_CONFIG.woolyCowName);
        Utils.checkName("umbra_cow", umbraCow, EARTH_CONFIG.umbraCowName);
        Utils.checkName("tropical_slime", tropicalSlime, EARTH_CONFIG.tropicalSlimeName);
        Utils.checkName("jolly_llama", jollyLlama, EARTH_CONFIG.jollyLlamaName);
        Utils.checkName("dyed_cat", dyedCat, EARTH_CONFIG.dyedCatName);
        Utils.checkName("furnace_golem", furnaceGolem, EARTH_CONFIG.furnaceGolemName);
        Utils.checkName("amber_chicken", amberChicken, EARTH_CONFIG.amberChickenName);
        Utils.checkName("bronzed_chicken", bronzedChicken, EARTH_CONFIG.bronzedChickenName);
        Utils.checkName("cluckshroom", cluckshroom, EARTH_CONFIG.cluckshroomName);
        Utils.checkName("fancy_chicken", fancyChicken, EARTH_CONFIG.fancyChickenName);
        Utils.checkName("gold_crested_chicken", goldCrestedChicken, EARTH_CONFIG.goldCrestedChickenName);
        Utils.checkName("midnight_chicken", midnightChicken, EARTH_CONFIG.midnightChickenName);
        Utils.checkName("skewbald_chicken", skewbaldChicken, EARTH_CONFIG.skewbaldChickenName);
        Utils.checkName("stormy_chicken", stormyChicken, EARTH_CONFIG.stormyChickenName);
        Utils.checkName("bold_striped_rabbit", boldStripedRabbit, EARTH_CONFIG.boldStripedRabbitName);
        Utils.checkName("freckled_rabbit", freckledRabbit, EARTH_CONFIG.freckledRabbitName);
        Utils.checkName("harelequin_rabbit", harelequinRabbit, EARTH_CONFIG.harelequinRabbitName);
        Utils.checkName("muddy_foot_rabbit", muddyFootRabbit, EARTH_CONFIG.muddyFootRabbitName);
        Utils.checkName("vested_rabbit", vestedRabbit, EARTH_CONFIG.vestedRabbitName);
        Utils.checkName("melon_golem", melonGolem, EARTH_CONFIG.melonGolemName);
        Utils.checkName("bouldering_zombie", boulderingZombie, EARTH_CONFIG.boulderingZombieName);
        Utils.checkName("lobber_zombie", lobberZombie, EARTH_CONFIG.lobberZombieName);
        Utils.checkName("skeleton_wolf", skeletonWolf, EARTH_CONFIG.skeletonWolfName);
        Utils.checkName("bone_spider", boneSpider, EARTH_CONFIG.boneSpiderName);
    }
}