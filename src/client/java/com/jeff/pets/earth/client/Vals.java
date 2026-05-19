package com.jeff.pets.earth.client;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Vals {

    public static final String MOTTLED_PIG = "mottled_pig";
    public static final String MUDDY_PIG = "muddy_pig";
    public static final String PALE_PIG = "pale_pig";
    public static final String PIEBALD_PIG = "piebald_pig";
    public static final String PINK_FOOTED_PIG = "pink_footed_pig";
    public static final String SOOTY_PIG = "sooty_pig";
    public static final String SPOTTED_PIG = "spotted_pig";
    public static final String FLECKED_SHEEP = "flecked_sheep";
    public static final String FUZZY_SHEEP = "fuzzy_sheep";
    public static final String INKY_SHEEP = "inky_sheep";
    public static final String LONG_NOSED_SHEEP = "long_nosed_sheep";
    public static final String PATCHED_SHEEP = "patched_sheep";
    public static final String RAINBOW_SHEEP = "rainbow_sheep";
    public static final String ROCKY_SHEEP = "rocky_sheep";
    public static final String ALBINO_COW = "albino_cow";
    public static final String ASHEN_COW = "ashen_cow";
    public static final String COOKIE_COW = "cookie_cow";
    public static final String CREAM_COW = "cream_cow";
    public static final String DAIRY_COW = "dairy_cow";
    public static final String MOOBLOOM = "moobloom";
    public static final String MOOLIP = "moolip";
    public static final String PINTO_COW = "pinto_cow";
    public static final String SUNSET_COW = "sunset_cow";
    public static final String UNBRA_COW = "unbra_cow";
    public static final String WOOLY_COW = "wooly_cow";
    public static final String AMBER_CHICKEN = "amber_chicken";
    public static final String BRONZED_CHICKEN = "bronzed_chicken";
    public static final String CLUCKSHROOM = "cluckshroom";
    public static final String FANCY_CHICKEN = "fancy_chicken";
    public static final String GOLD_CRESTED_CHICKEN = "gold_crested_chicken";
    public static final String MIDNIGHT_CHICKEN = "midnight_chicken";
    public static final String SKEWBALD_CHICKEN = "skewbald_chicken";
    public static final String STORMY_CHICKEN = "stormy_chicken";
    public static final String BOLD_STRIPED_RABBIT = "bold_striped_rabbit";
    public static final String FRECKLED_RABBIT = "freckled_rabbit";
    public static final String HARELEQUIN_RABBIT = "harelequin_rabbit";
    public static final String MUDDY_FOOT_RABBIT = "muddy_foot_rabbit";
    public static final String VESTED_RABBIT = "vested_rabbit";
    public static final String JOLLY_LLAMA = "jolly_llama";
    public static final String FURNACE_GOLEM = "furnace_golem";
    public static final String HORNED_SHEEP = "horned_sheep";
    public static final String TROPICAL_SLIME = "tropical_slime";
    public static final String DYED_CAT = "dyed_cat";
    public static final String MELON_GOLEM = "melon_golem";
    public static final String LOBBER_ZOMBIE = "lobber_zombie";
    public static final String BOULDERING_ZOMBIE = "bouldering_zombie";
    public static final String SKELETON_WOLF = "skeleton_wolf";
    public static final String BONE_SPIDER = "bone_spider";

    public static String[] getVals() {
        List<String> vals = new ArrayList<>();
        Field[] fields = Vals.class.getDeclaredFields();
        for (Field field : fields) {
            try {
                 vals.add((String) field.get(null));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return vals.toArray(new String[0]);
    }

    public static String[] getLowercaseVals() {
        List<String> vals = new ArrayList<>();
        Field[] fields = Vals.class.getDeclaredFields();
        for (Field field : fields) {
            try {
                String string = (String) field.get(null);
                String fString = string.replace("_", " ");
                vals.add(fString);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return vals.toArray(new String[0]);
    }
}
