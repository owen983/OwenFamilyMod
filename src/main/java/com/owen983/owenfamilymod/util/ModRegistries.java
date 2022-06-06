package com.owen983.owenfamilymod.util;

import com.owen983.owenfamilymod.OwenFamilyMod;
import com.owen983.owenfamilymod.villager.ModVillagers;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.enchantment.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.registry.Registry;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class ModRegistries {
    private static float chance;

    public static void registerModStuffs() {
        OwenFamilyMod.LOGGER.info("in registerModStuffs for " + OwenFamilyMod.MOD_ID);
        registerCustomTrades();
    }

    private static void registerCustomTrades() {

        registerBeeKeeperLevel1Trades();

        registerBeeKeeperLevel2Trades();

        registerBeeKeeperLevel3Trades();

        registerBeeKeeperLevel4Trades();

        registerBeeKeeperLevel5Trades();

    }

    private static void registerBeeKeeperLevel5Trades() {

        TradeOfferHelper.registerVillagerOffers(ModVillagers.BEEKEEPER, 5,
                factories -> {
                    factories.add((entity, random) ->
                            new TradeOffer(new ItemStack(Items.EMERALD, 13),
                                    new ItemStack(Items.AZURE_BLUET, 1),
                                    6, 4, 0.23f));
                    factories.add((entity, random) ->
                            new TradeOffer(new ItemStack(Items.EMERALD, 2),
                                    new ItemStack(Items.SUNFLOWER, 1),
                                    7, 5, 0.93f));
                });
    }

    private static void registerBeeKeeperLevel4Trades() {

        Random shears_randomizer = new Random();
        Float decider = shears_randomizer.nextFloat();
        ItemStack shears_to_enchant = new ItemStack(Items.SHEARS, 1);

        if (decider >= 0.8f){
            shears_to_enchant.addEnchantment(Enchantments.UNBREAKING, 3);
        }else if (decider >= 0.3f){
            shears_to_enchant.addEnchantment(Enchantments.MENDING, 1);
        }else {
            shears_to_enchant.addEnchantment(Enchantments.UNBREAKING, 3);
            shears_to_enchant.addEnchantment(Enchantments.MENDING, 1);
        }

        TradeOfferHelper.registerVillagerOffers(ModVillagers.BEEKEEPER, 4,
                factories -> {
                    factories.add((entity, random) ->
                            new TradeOffer(new ItemStack(Items.EMERALD, 9),
                                    shears_to_enchant,
                                    8, 5, 0.35f));
                    factories.add((entity, random) ->
                            new TradeOffer(new ItemStack(Items.EMERALD, 7),
                                    new ItemStack(Items.BEE_NEST, 1),
                                    8, 2, 0.72f));
                });
    }

    private static void registerBeeKeeperLevel3Trades() {

        TradeOfferHelper.registerVillagerOffers(ModVillagers.BEEKEEPER, 3,
                factories -> {
                    factories.add((entity, random) ->
                            new TradeOffer(new ItemStack(Items.SUGAR, 13),
                                    new ItemStack(Items.EMERALD, 2),
                                    6, 6, 0.51f));
                    factories.add((entity, random) ->
                            new TradeOffer(new ItemStack(Items.BONE_MEAL, 15),
                                    new ItemStack(Items.EMERALD, 4),
                                    6, 8, 0.44f));
                    factories.add((entity, random) ->
                            new TradeOffer(new ItemStack(Items.HONEY_BLOCK, 8),
                                    new ItemStack(Items.EMERALD, 1),
                                    6, 1, 0.61f));
                });
    }

    private static void registerBeeKeeperLevel2Trades() {

        TradeOfferHelper.registerVillagerOffers(ModVillagers.BEEKEEPER, 2,
                factories -> {
                    factories.add((entity, random) ->
                            new TradeOffer(new ItemStack(Items.OAK_PLANKS, 7),
                                    new ItemStack(Items.EMERALD, 2),
                                    6, 4, 0.99f));
                    factories.add((entity, random) ->
                            new TradeOffer(new ItemStack(Items.EMERALD, 13),
                                    new ItemStack(Items.GLASS_BOTTLE, 4),
                                    8, 5, 0.78f));
                    factories.add((entity, random) ->
                            new TradeOffer(new ItemStack(Items.EMERALD, 4),
                                    new ItemStack(Items.CAMPFIRE, 1),
                                    8, 4, 0.32f));
                });
    }

    private static void registerBeeKeeperLevel1Trades() {


        TradeOfferHelper.registerVillagerOffers(ModVillagers.BEEKEEPER, 1,
                factories -> {
                    factories.add((entity, random) ->
                            new TradeOffer(new ItemStack(Items.HONEYCOMB, 3),
                                    new ItemStack(Items.EMERALD, 1),
                                    6, 3, 0.42f));
                    factories.add((entity, random) ->
                            new TradeOffer(new ItemStack(Items.CHARCOAL, 8),
                                    new ItemStack(Items.EMERALD, 1),
                                    6, 8, 0.31f));
                    factories.add((entity, random) ->
                            new TradeOffer(new ItemStack(Items.STICK, 15),
                                    new ItemStack(Items.EMERALD, 1),
                                    8, 5, 0.87f));
                    factories.add((entity, random) ->
                            new TradeOffer(new ItemStack(Items.EMERALD, 7),
                                    new ItemStack(Items.SHEARS, 1),
                                    8, 5, 0.75f));
                });


    }
}
