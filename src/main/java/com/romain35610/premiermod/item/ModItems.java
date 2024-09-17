package com.romain35610.premiermod.item;

import com.romain35610.premiermod.PremierMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PremierMod.MOD_ID);

    public static final RegistryObject<Item> RED_EMERALD = ITEMS.register("red_emerald",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RED_EMERALD_SHARD =ITEMS.register("red_emerald_shard",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
