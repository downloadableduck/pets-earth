package com.jeff.pets.earth;

import com.jeff.pets.PetsInitializer;
import com.jeff.pets.earth.mob.custom.minecraft_earth.cow.MinecraftEarthCow;
import com.jeff.pets.earth.mob.custom.minecraft_earth.pig.MinecraftEarthPig;
import com.jeff.pets.earth.mob.custom.minecraft_earth.sheep.MinecraftEarthSheep;
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
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Function;

public class PetsEarth implements ModInitializer {
	public static final String MOD_ID = "pets-earth";

    public static final Block PINK_DAISY = register("pink_daisy", Block::new, BlockBehaviour.Properties.of().instabreak());
    public static final Block BUTTERCUP = register("buttercup", Block::new, BlockBehaviour.Properties.of().instabreak());
    public static final Block MELON_HEAD = register("melon_head", Block::new, BlockBehaviour.Properties.of());


    // This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    private static final ResourceKey<@NotNull EntityType<?>> RAINBOW_SHEEP_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "rainbow_sheep"));
    public static final EntityType<@NotNull MinecraftEarthSheep> RAINBOW_SHEEP = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "rainbow_sheep"),
            EntityType.Builder.of(MinecraftEarthSheep::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.9f, 1.3f)
                    .eyeHeight(1.3f)
                    .build(RAINBOW_SHEEP_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> FLECKED_SHEEP_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "flecked_sheep"));
    public static final EntityType<@NotNull MinecraftEarthSheep> FLECKED_SHEEP = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "flecked_sheep"),
            EntityType.Builder.of(MinecraftEarthSheep::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.9f, 1.3f)
                    .eyeHeight(1.3f)
                    .build(FLECKED_SHEEP_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> FUZZY_SHEEP_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "fuzzy_sheep"));
    public static final EntityType<@NotNull MinecraftEarthSheep> FUZZY_SHEEP = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "fuzzy_sheep"),
            EntityType.Builder.of(MinecraftEarthSheep::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.9f, 1.3f)
                    .eyeHeight(1.3f)
                    .build(FUZZY_SHEEP_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> INKY_SHEEP_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "inky_sheep"));
    public static final EntityType<@NotNull MinecraftEarthSheep> INKY_SHEEP = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "inky_sheep"),
            EntityType.Builder.of(MinecraftEarthSheep::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.9f, 1.3f)
                    .eyeHeight(1.3f)
                    .build(INKY_SHEEP_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> LONG_NOSED_SHEEP_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "long_nosed_sheep"));
    public static final EntityType<@NotNull MinecraftEarthSheep> LONG_NOSED_SHEEP = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "long_nosed_sheep"),
            EntityType.Builder.of(MinecraftEarthSheep::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.9f, 1.3f)
                    .eyeHeight(1.3f)
                    .build(LONG_NOSED_SHEEP_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> PATCHED_SHEEP_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "patched_sheep"));
    public static final EntityType<@NotNull MinecraftEarthSheep> PATCHED_SHEEP = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "patched_sheep"),
            EntityType.Builder.of(MinecraftEarthSheep::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.9f, 1.3f)
                    .eyeHeight(1.3f)
                    .build(PATCHED_SHEEP_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> ROCKY_SHEEP_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "rocky_sheep"));
    public static final EntityType<@NotNull MinecraftEarthSheep> ROCKY_SHEEP = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "rocky_sheep"),
            EntityType.Builder.of(MinecraftEarthSheep::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.9f, 1.3f)
                    .eyeHeight(1.3f)
                    .build(ROCKY_SHEEP_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> HORNED_SHEEP_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "horned_sheep"));
    public static final EntityType<@NotNull MinecraftEarthSheep> HORNED_SHEEP = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "horned_sheep"),
            EntityType.Builder.of(MinecraftEarthSheep::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.9f, 1.3f)
                    .eyeHeight(1.3f)
                    .build(HORNED_SHEEP_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> MOTTLED_PIG_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "mottled_pig"));
    public static final EntityType<@NotNull MinecraftEarthPig> MOTTLED_PIG = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "mottled_pig"),
            EntityType.Builder.of(MinecraftEarthPig::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.9f, 0.9f)
                    .eyeHeight(0.9f)
                    .build(MOTTLED_PIG_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> MUDDY_PIG_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "muddy_pig"));
    public static final EntityType<@NotNull MinecraftEarthPig> MUDDY_PIG = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "muddy_pig"),
            EntityType.Builder.of(MinecraftEarthPig::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.9f, 1.3f)
                    .eyeHeight(0.9f)
                    .build(MUDDY_PIG_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> PALE_PIG_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "pale_pig"));
    public static final EntityType<@NotNull MinecraftEarthPig> PALE_PIG = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "pale_pig"),
            EntityType.Builder.of(MinecraftEarthPig::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.9f, 0.9f)
                    .eyeHeight(0.9f)
                    .build(PALE_PIG_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> PIEBALD_PIG_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "piebald_pig"));
    public static final EntityType<@NotNull MinecraftEarthPig> PIEBALD_PIG = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "piebald_pig"),
            EntityType.Builder.of(MinecraftEarthPig::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.9f, 0.9f)
                    .eyeHeight(0.9f)
                    .build(PIEBALD_PIG_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> PINK_FOOTED_PIG_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "pink_footed_pig"));
    public static final EntityType<@NotNull MinecraftEarthPig> PINK_FOOTED_PIG = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "pink_footed_pig"),
            EntityType.Builder.of(MinecraftEarthPig::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.9f, 0.9f)
                    .eyeHeight(0.9f)
                    .build(PINK_FOOTED_PIG_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> SOOTY_PIG_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "sooty_pig"));
    public static final EntityType<@NotNull MinecraftEarthPig> SOOTY_PIG = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "sooty_pig"),
            EntityType.Builder.of(MinecraftEarthPig::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.9f, 0.9f)
                    .eyeHeight(0.9f)
                    .build(SOOTY_PIG_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> SPOTTED_PIG_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "spotted_pig"));
    public static final EntityType<@NotNull MinecraftEarthPig> SPOTTED_PIG = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "spotted_pig"),
            EntityType.Builder.of(MinecraftEarthPig::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.9f, 0.9f)
                    .eyeHeight(0.9f)
                    .build(SPOTTED_PIG_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> ALBINO_COW_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "albino_cow"));
    public static final EntityType<@NotNull MinecraftEarthCow> ALBINO_COW = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "albino_cow"),
            EntityType.Builder.of(MinecraftEarthCow::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.9f, 1.4f)
                    .eyeHeight(1.4f)
                    .build(ALBINO_COW_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> ASHEN_COW_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "ashen_cow"));
    public static final EntityType<@NotNull MinecraftEarthCow> ASHEN_COW = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "ashen_cow"),
            EntityType.Builder.of(MinecraftEarthCow::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.9f, 1.4f)
                    .eyeHeight(1.4f)
                    .build(ASHEN_COW_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> COOKIE_COW_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE, Identifier.fromNamespaceAndPath(MOD_ID, "cookie_cow"));
    public static final EntityType<@NotNull MinecraftEarthCow> COOKIE_COW = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "cookie_cow"),
            EntityType.Builder.of(MinecraftEarthCow::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.9f, 1.4f)
                    .eyeHeight(1.4f)
                    .build(COOKIE_COW_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> CREAM_COW_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "cream_cow"));
    public static final EntityType<@NotNull MinecraftEarthCow> CREAM_COW = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "cream_cow"),
            EntityType.Builder.of(MinecraftEarthCow::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.9f, 1.4f)
                    .eyeHeight(1.4f)
                    .build(CREAM_COW_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> DAIRY_COW_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "dairy_cow"));
    public static final EntityType<@NotNull MinecraftEarthCow> DAIRY_COW = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "dairy_cow"),
            EntityType.Builder.of(MinecraftEarthCow::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.9f, 1.4f)
                    .eyeHeight(1.4f)
                    .build(DAIRY_COW_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> MOOBLOOM_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "moobloom"));
    public static final EntityType<@NotNull MinecraftEarthCow> MOOBLOOM = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "moobloom"),
            EntityType.Builder.of(MinecraftEarthCow::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.9f, 1.4f)
                    .eyeHeight(1.4f)
                    .build(MOOBLOOM_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> MOOLIP_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "moolip"));
    public static final EntityType<@NotNull MinecraftEarthCow> MOOLIP = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "moolip"),
            EntityType.Builder.of(MinecraftEarthCow::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.9f, 1.4f)
                    .eyeHeight(1.4f)
                    .build(MOOLIP_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> PINTO_COW_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "pinto_cow"));
    public static final EntityType<@NotNull MinecraftEarthCow> PINTO_COW = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "pinto_cow"),
            EntityType.Builder.of(MinecraftEarthCow::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.9f, 1.4f)
                    .eyeHeight(1.4f)
                    .build(PINTO_COW_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> SUNSET_COW_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "sunset_cow"));
    public static final EntityType<@NotNull MinecraftEarthCow> SUNSET_COW = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "sunset_cow"),
            EntityType.Builder.of(MinecraftEarthCow::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.9f, 1.4f)
                    .eyeHeight(1.4f)
                    .build(SUNSET_COW_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> UMBRA_COW_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "umbra_cow"));
    public static final EntityType<@NotNull MinecraftEarthCow> UMBRA_COW = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "umbra_cow"),
            EntityType.Builder.of(MinecraftEarthCow::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.9f, 1.4f)
                    .eyeHeight(1.4f)
                    .build(UMBRA_COW_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> WOOLY_COW_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "wooly_cow"));
    public static final EntityType<@NotNull MinecraftEarthCow> WOOLY_COW = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "wooly_cow"),
            EntityType.Builder.of(MinecraftEarthCow::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.9f, 1.4f)
                    .eyeHeight(1.4f)
                    .build(WOOLY_COW_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> TROPICAL_SLIME_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "tropical_slime"));
    public static final EntityType<@NotNull ClientSlime> TROPICAL_SLIME = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "tropical_slime"),
            EntityType.Builder.of(ClientSlime::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.9f, 1.4f)
                    .eyeHeight(1.4f)
                    .build(TROPICAL_SLIME_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> JOLLY_LLAMA_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "jolly_llama"));
    public static final EntityType<@NotNull ClientLlama> JOLLY_LLAMA = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "jolly_llama"),
            EntityType.Builder.of(ClientLlama::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.9f, 1.87f)
                    .eyeHeight(1.87f)
                    .build(JOLLY_LLAMA_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> DYED_CAT_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "dyed_cat"));
    public static final EntityType<@NotNull ClientCat> DYED_CAT = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "dyed_cat"),
            EntityType.Builder.of(ClientCat::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.6f, 0.7f)
                    .eyeHeight(0.7f)
                    .build(DYED_CAT_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> FURNACE_GOLEM_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "furnace_golem"));
    public static final EntityType<@NotNull ClientIronGolem> FURNACE_GOLEM = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "furnace_golem"),
            EntityType.Builder.of(ClientIronGolem::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.6f, 0.7f)
                    .eyeHeight(0.7f)
                    .build(FURNACE_GOLEM_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> AMBER_CHICKEN_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "amber_chicken"));
    public static final EntityType<@NotNull ClientChicken> AMBER_CHICKEN = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "amber_chicken"),
            EntityType.Builder.of(ClientChicken::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.4f, 0.7f)
                    .eyeHeight(0.7f)
                    .build(AMBER_CHICKEN_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> BRONZED_CHICKEN_key =
            ResourceKey.create(Registries.ENTITY_TYPE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "bronzed_chicken"));
    public static final EntityType<@NotNull ClientChicken> BRONZED_CHICKEN = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "bronzed_chicken"),
            EntityType.Builder.of(ClientChicken::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.4f, 0.7f)
                    .eyeHeight(0.7f)
                    .build(BRONZED_CHICKEN_key)
    );

    private static final ResourceKey<@NotNull EntityType<?>> CLUCKSHROOM_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "cluckshroom"));
    public static final EntityType<@NotNull ClientChicken> CLUCKSHROOM = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "cluckshroom"),
            EntityType.Builder.of(ClientChicken::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.4f, 0.7f)
                    .eyeHeight(0.7f)
                    .build(CLUCKSHROOM_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> FANCY_CHICKEN_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "fancy_chicken"));
    public static final EntityType<@NotNull ClientChicken> FANCY_CHICKEN = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "fancy_chicken"),
            EntityType.Builder.of(ClientChicken::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.4f, 0.7f)
                    .eyeHeight(0.7f)
                    .build(FANCY_CHICKEN_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> GOLD_CRESTED_CHICKEN_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "gold_crested_chicken"));
    public static final EntityType<@NotNull ClientChicken> GOLD_CRESTED_CHICKEN = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "gold_crested_chicken"),
            EntityType.Builder.of(ClientChicken::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.4f, 0.7f)
                    .eyeHeight(0.7f)
                    .build(GOLD_CRESTED_CHICKEN_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> MIDNIGHT_CHICKEN_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "midnight_chicken"));
    public static final EntityType<@NotNull ClientChicken> MIDNIGHT_CHICKEN = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "midnight_chicken"),
            EntityType.Builder.of(ClientChicken::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.4f, 0.7f)
                    .eyeHeight(0.7f)
                    .build(MIDNIGHT_CHICKEN_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> SKEWBALD_CHICKEN_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "skewbald_chicken"));
    public static final EntityType<@NotNull ClientChicken> SKEWBALD_CHICKEN = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "skewbald_chicken"),
            EntityType.Builder.of(ClientChicken::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.4f, 0.7f)
                    .eyeHeight(0.7f)
                    .build(SKEWBALD_CHICKEN_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> STORMY_CHICKEN_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "stormy_chicken"));
    public static final EntityType<@NotNull ClientChicken> STORMY_CHICKEN = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "stormy_chicken"),
            EntityType.Builder.of(ClientChicken::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.4f, 0.7f)
                    .eyeHeight(0.7f)
                    .build(STORMY_CHICKEN_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> BOLD_STRIPED_RABBIT_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "bold_striped_rabbit"));
    public static final EntityType<@NotNull ClientRabbit> BOLD_STRIPED_RABBIT = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "bold_striped_rabbit"),
            EntityType.Builder.of(ClientRabbit::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.4f, 0.5f)
                    .eyeHeight(0.5f)
                    .build(BOLD_STRIPED_RABBIT_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> FRECKLED_RABBIT_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "freckled_rabbit"));
    public static final EntityType<@NotNull ClientRabbit> FRECKLED_RABBIT = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "freckled_rabbit"),
            EntityType.Builder.of(ClientRabbit::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.4f, 0.5f)
                    .eyeHeight(0.5f)
                    .build(FRECKLED_RABBIT_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> HARELEQUIN_RABBIT_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "harelequin_rabbit"));
    public static final EntityType<@NotNull ClientRabbit> HARELEQUIN_RABBIT = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "harelequin_rabbit"),
            EntityType.Builder.of(ClientRabbit::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.4f, 0.5f)
                    .eyeHeight(0.5f)
                    .build(HARELEQUIN_RABBIT_KEY)
    );

    /*private static final ResourceKey<@NotNull EntityType<?>> JUMBO_RABBIT_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "jumbo_rabbit"));
    public static final EntityType<@NotNull ClientRabbit> JUMBO_RABBIT = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "jumbo_rabbit"),
            EntityType.Builder.of(ClientRabbit::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.4f, 0.5f)
                    .eyeHeight(0.5f)
                    .build(JUMBO_RABBIT_KEY)
    );*/

    private static final ResourceKey<@NotNull EntityType<?>> MUDDY_FOOT_RABBIT_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "muddy_foot_rabbit"));
    public static final EntityType<@NotNull ClientRabbit> MUDDY_FOOT_RABBIT = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "muddy_foot_rabbit"),
            EntityType.Builder.of(ClientRabbit::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.4f, 0.5f)
                    .eyeHeight(0.5f)
                    .build(MUDDY_FOOT_RABBIT_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> VESTED_RABBIT_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "vested_rabbit"));
    public static final EntityType<@NotNull ClientRabbit> VESTED_RABBIT = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "vested_rabbit"),
            EntityType.Builder.of(ClientRabbit::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.4f, 0.5f)
                    .eyeHeight(0.5f)
                    .build(VESTED_RABBIT_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> MELON_GOLEM_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "melon_golem"));
    public static final EntityType<@NotNull ClientSnowGolem> MELON_GOLEM = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "melon_golem"),
            EntityType.Builder.of(ClientSnowGolem::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.7f, 1.9f)
                    .eyeHeight(1.9f)
                    .build(MELON_GOLEM_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> BOULDERING_ZOMBIE_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "bouldering_zombie"));
    public static final EntityType<@NotNull ClientZombie> BOULDERING_ZOMBIE = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "bouldering_zombie"),
            EntityType.Builder.of(ClientZombie::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.6f, 1.95f)
                    .eyeHeight(1.95f)
                    .build(BOULDERING_ZOMBIE_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> LOBBER_ZOMBIE_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "lobber_zombie"));
    public static final EntityType<@NotNull ClientZombie> LOBBER_ZOMBIE = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "lobber_zombie"),
            EntityType.Builder.of(ClientZombie::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.6f, 1.95f)
                    .eyeHeight(1.95f)
                    .build(LOBBER_ZOMBIE_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> SKELETON_WOLF_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "skeleton_wolf"));
    public static final EntityType<@NotNull ClientWolf> SKELETON_WOLF = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "skeleton_wolf"),
            EntityType.Builder.of(ClientWolf::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(0.6f, 0.85f)
                    .eyeHeight(0.85f)
                    .build(SKELETON_WOLF_KEY)
    );

    private static final ResourceKey<@NotNull EntityType<?>> BONE_SPIDER_KEY =
            ResourceKey.create(Registries.ENTITY_TYPE,
                    Identifier.fromNamespaceAndPath(MOD_ID, "bone_spider"));
    public static final EntityType<@NotNull ClientSpider> BONE_SPIDER = Registry.register(
            BuiltInRegistries.ENTITY_TYPE,
            Identifier.fromNamespaceAndPath(MOD_ID, "bone_spider"),
            EntityType.Builder.of(ClientSpider::new, MobCategory.AMBIENT)
                    .noSummon()
                    .sized(PetsInitializer.SPIDER.getWidth(), PetsInitializer.SPIDER.getHeight())
                    .eyeHeight(PetsInitializer.SPIDER.getDimensions().eyeHeight())
                    .build(BONE_SPIDER_KEY)
    );

	@Override
	public void onInitialize() {
        FabricDefaultAttributeRegistry.register(RAINBOW_SHEEP, MinecraftEarthSheep.createAttributes().build());
        FabricDefaultAttributeRegistry.register(FLECKED_SHEEP, MinecraftEarthSheep.createAttributes().build());
        FabricDefaultAttributeRegistry.register(FUZZY_SHEEP, MinecraftEarthSheep.createAttributes().build());
        FabricDefaultAttributeRegistry.register(INKY_SHEEP, MinecraftEarthSheep.createAttributes().build());
        FabricDefaultAttributeRegistry.register(LONG_NOSED_SHEEP, MinecraftEarthSheep.createAttributes().build());
        FabricDefaultAttributeRegistry.register(PATCHED_SHEEP, MinecraftEarthSheep.createAttributes().build());
        FabricDefaultAttributeRegistry.register(ROCKY_SHEEP, MinecraftEarthSheep.createAttributes().build());
        FabricDefaultAttributeRegistry.register(HORNED_SHEEP, MinecraftEarthSheep.createAttributes().build());
        FabricDefaultAttributeRegistry.register(MOTTLED_PIG, MinecraftEarthPig.createAttributes().build());
        FabricDefaultAttributeRegistry.register(MUDDY_PIG, MinecraftEarthPig.createAttributes().build());
        FabricDefaultAttributeRegistry.register(PALE_PIG, MinecraftEarthPig.createAttributes().build());
        FabricDefaultAttributeRegistry.register(PIEBALD_PIG, MinecraftEarthPig.createAttributes().build());
        FabricDefaultAttributeRegistry.register(PINK_FOOTED_PIG, MinecraftEarthPig.createAttributes().build());
        FabricDefaultAttributeRegistry.register(SOOTY_PIG, MinecraftEarthPig.createAttributes().build());
        FabricDefaultAttributeRegistry.register(SPOTTED_PIG, MinecraftEarthPig.createAttributes().build());
        FabricDefaultAttributeRegistry.register(ALBINO_COW, MinecraftEarthCow.createAttributes().build());
        FabricDefaultAttributeRegistry.register(ASHEN_COW, MinecraftEarthCow.createAttributes().build());
        FabricDefaultAttributeRegistry.register(COOKIE_COW, MinecraftEarthCow.createAttributes().build());
        FabricDefaultAttributeRegistry.register(CREAM_COW, MinecraftEarthCow.createAttributes().build());
        FabricDefaultAttributeRegistry.register(DAIRY_COW, MinecraftEarthCow.createAttributes().build());
        FabricDefaultAttributeRegistry.register(MOOBLOOM, MinecraftEarthCow.createAttributes().build());
        FabricDefaultAttributeRegistry.register(MOOLIP, MinecraftEarthCow.createAttributes().build());
        FabricDefaultAttributeRegistry.register(PINTO_COW, MinecraftEarthCow.createAttributes().build());
        FabricDefaultAttributeRegistry.register(SUNSET_COW, MinecraftEarthCow.createAttributes().build());
        FabricDefaultAttributeRegistry.register(UMBRA_COW, MinecraftEarthCow.createAttributes().build());
        FabricDefaultAttributeRegistry.register(WOOLY_COW, MinecraftEarthCow.createAttributes().build());
        FabricDefaultAttributeRegistry.register(TROPICAL_SLIME, ClientSlime.createAttributes().build());
        FabricDefaultAttributeRegistry.register(JOLLY_LLAMA, ClientLlama.createAttributes().build());
        FabricDefaultAttributeRegistry.register(DYED_CAT, ClientCat.createAttributes().build());
        FabricDefaultAttributeRegistry.register(FURNACE_GOLEM, ClientIronGolem.createAttributes().build());
        FabricDefaultAttributeRegistry.register(AMBER_CHICKEN, ClientChicken.createAttributes().build());
        FabricDefaultAttributeRegistry.register(BRONZED_CHICKEN, ClientChicken.createAttributes().build());
        FabricDefaultAttributeRegistry.register(CLUCKSHROOM, ClientChicken.createAttributes().build());
        FabricDefaultAttributeRegistry.register(FANCY_CHICKEN, ClientChicken.createAttributes().build());
        FabricDefaultAttributeRegistry.register(GOLD_CRESTED_CHICKEN, ClientChicken.createAttributes().build());
        FabricDefaultAttributeRegistry.register(MIDNIGHT_CHICKEN, ClientChicken.createAttributes().build());
        FabricDefaultAttributeRegistry.register(SKEWBALD_CHICKEN, ClientChicken.createAttributes().build());
        FabricDefaultAttributeRegistry.register(STORMY_CHICKEN, ClientChicken.createAttributes().build());
        FabricDefaultAttributeRegistry.register(BOLD_STRIPED_RABBIT, ClientRabbit.createAttributes().build());
        FabricDefaultAttributeRegistry.register(FRECKLED_RABBIT, ClientRabbit.createAttributes().build());
        FabricDefaultAttributeRegistry.register(HARELEQUIN_RABBIT, ClientRabbit.createAttributes().build());
        //FabricDefaultAttributeRegistry.register(JUMBO_RABBIT, ClientRabbit.createAttributes().build());
        FabricDefaultAttributeRegistry.register(MUDDY_FOOT_RABBIT, ClientRabbit.createAttributes().build());
        FabricDefaultAttributeRegistry.register(VESTED_RABBIT, ClientRabbit.createAttributes().build());
        FabricDefaultAttributeRegistry.register(MELON_GOLEM, ClientSnowGolem.createAttributes().build());
        FabricDefaultAttributeRegistry.register(BOULDERING_ZOMBIE, ClientZombie.createAttributes().build());
        FabricDefaultAttributeRegistry.register(LOBBER_ZOMBIE, ClientZombie.createAttributes().build());
        FabricDefaultAttributeRegistry.register(SKELETON_WOLF, ClientWolf.createAttributes().build());
        FabricDefaultAttributeRegistry.register(BONE_SPIDER, ClientSpider.createAttributes().build());

        // This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
	}
    /**
     * Helper method to register blocks. Used for the mooshroom and moolip's back flowers and nothing
     * else.
     */
    private static Block register(String name, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties settings) {
        ResourceKey<@NotNull Block> blockKey = keyOfBlock(name);
        Block block = blockFactory.apply(settings.setId(blockKey));
        ResourceKey<@NotNull Item> itemKey = keyOfItem(name);
        BlockItem blockItem = new BlockItem(block, new Item.Properties().setId(itemKey).useBlockDescriptionPrefix());
        Registry.register(BuiltInRegistries.ITEM, itemKey, blockItem);
        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
    }

    private static ResourceKey<@NotNull Block> keyOfBlock(String name) {
        return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MOD_ID, name));
    }

    private static ResourceKey<@NotNull Item> keyOfItem(String name) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MOD_ID, name));
    }
}