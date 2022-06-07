package com.owen983.owenfamilymod.block;

import com.owen983.owenfamilymod.OwenFamilyMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BeehiveBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block OWEN_BEEKEEPER_BLOCK = registerBlock("owen_beekeeper_block",
            new BeehiveBlock(FabricBlockSettings.copyOf(Blocks.BEEHIVE)),
            ItemGroup.MISC);

    private static Block registerBlock(String name, Block block, ItemGroup itemGroup){
        registerBlockItem(name, block, itemGroup);
        return Registry.register(Registry.BLOCK, new Identifier(OwenFamilyMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(OwenFamilyMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }
    public static void registerModBlocks(){
        OwenFamilyMod.LOGGER.info("registering ModBlocks for " + OwenFamilyMod.MOD_ID);
    }


}
