package com.jeff.pets.earth.client;

import com.jeff.pets.client.Utils;
import net.minecraft.resources.Identifier;

import static com.jeff.pets.earth.PetsEarth.MOD_ID;

public class EarthUtils extends Utils {
    public static Identifier withModNamespace(String s) {
        return Identifier.fromNamespaceAndPath(MOD_ID, s);
    }
}
