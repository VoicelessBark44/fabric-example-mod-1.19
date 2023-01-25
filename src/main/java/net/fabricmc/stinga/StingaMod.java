package net.fabricmc.stinga;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.stinga.item.ModItemGroup;
import net.fabricmc.stinga.item.ModItems;
import net.fabricmc.stinga.item.StingaSword;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StingaMod implements ModInitializer {

	public static final String MOD_ID = "stingamod";
	public static final Logger LOGGER = LoggerFactory.getLogger("stingasword");

	/*public static final Item STINGA_SWORD =
			Registry.register(Registries.ITEM, new Identifier("stingamod", "stinga_sword"),
					new StingaSword(new FabricItemSettings())); */

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
	}
}
