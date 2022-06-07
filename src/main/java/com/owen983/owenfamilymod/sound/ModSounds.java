package com.owen983.owenfamilymod.sound;

import com.owen983.owenfamilymod.OwenFamilyMod;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {

    public static SoundEvent SONGS_OF_THE_HILLS = registerSoundEvent("songs_of_the_hills");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(OwenFamilyMod.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

}
