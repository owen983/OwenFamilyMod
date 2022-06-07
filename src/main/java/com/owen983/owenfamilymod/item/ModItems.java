package com.owen983.owenfamilymod.item;

import com.owen983.owenfamilymod.OwenFamilyMod;
import com.owen983.owenfamilymod.item.custom.ModMusicDiscItem;
import com.owen983.owenfamilymod.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item MUSIC_DISC_HILLS = registerItem("songs_of_the_hills",
            new ModMusicDiscItem(7, ModSounds.SONGS_OF_THE_HILLS,
                    new FabricItemSettings().group(ItemGroup.MISC).maxCount(1)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(OwenFamilyMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        OwenFamilyMod.LOGGER.info("registering mod items for " + OwenFamilyMod.MOD_ID);
    }
}
