package net.fabricmc.stinga;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroup;
import net.fabricmc.stinga.items.StingaSword;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {


	public static final Item STINGA_SWORD =
			Registry.register(Registries.ITEM, new Identifier("stingamod", "stinga_sword"),
					new StingaSword(new FabricItemSettings()));

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("stingasword");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		//Registry.register(Registries.ITEM, new Identifier("stingasword", "stinga_sword"), STINGA_SWORD);


		//Adds Stinga Sword to the COMBAT ItemGroup *Not Finishes*
		//ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register()

		LOGGER.info("Hello Fabric world!");
	}
}
