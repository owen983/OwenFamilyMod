package com.owen983.owenfamilymod;

import com.owen983.owenfamilymod.block.ModBlocks;
import com.owen983.owenfamilymod.item.ModItems;
import com.owen983.owenfamilymod.util.ModLootTableModifiers;
import com.owen983.owenfamilymod.util.ModRegistries;
import com.owen983.owenfamilymod.villager.ModVillagers;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class OwenFamilyMod implements ModInitializer {

    public static final String MOD_ID = "owenfamilymod";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        LOGGER.info("Hello Fabric world!");
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModVillagers.setupPOIs();
        ModRegistries.registerModStuffs();
        ModLootTableModifiers.modifyLootTables();

    }
}
