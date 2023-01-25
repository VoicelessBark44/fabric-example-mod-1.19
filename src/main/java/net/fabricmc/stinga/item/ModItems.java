package net.fabricmc.stinga.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.stinga.StingaMod;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item STINGA_SWORD = registerItem("stinga_sword",
            new SwordItem(ToolMaterials.DIAMOND, 10, 8F,
                    new FabricItemSettings().maxCount(1)));

    public static final Item STINGA_HELMET = registerItem("stinga_helmet",
            new ShieldItem(new FabricItemSettings()));

    public static final Item STINGA_CHEST_PIECE = registerItem("stinga_chest_piece",
            new Item(new FabricItemSettings()));

    public static final Item STINGA_LEGGINGS = registerItem("stinga_leggings",
            new Item(new FabricItemSettings()));

    public static final Item STINGA_BOOTS = registerItem("stinga_boots",
            new Item(new FabricItemSettings()));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(StingaMod.MOD_ID, name), item);
    }

    public static void addItemstoItemGroup() {
        /*addToItemGroup(ItemGroups.COMBAT, STINGA_SWORD);
        addToItemGroup(ItemGroups.COMBAT, STINGA_SHIELD);
        addToItemGroup(ItemGroups.COMBAT, STINGA_HELMET);
        addToItemGroup(ItemGroups.COMBAT, STINGA_CHEST_PIECE);
        addToItemGroup(ItemGroups.COMBAT, STINGA_LEGGINGS);
        addToItemGroup(ItemGroups.COMBAT, STINGA_BOOTS); */

        addToItemGroup(ModItemGroup.STINGA, STINGA_SWORD);
        //addToItemGroup(ModItemGroup.STINGA, STINGA_SHIELD);
        addToItemGroup(ModItemGroup.STINGA, STINGA_HELMET);
        addToItemGroup(ModItemGroup.STINGA, STINGA_CHEST_PIECE);
        addToItemGroup(ModItemGroup.STINGA, STINGA_LEGGINGS);
        addToItemGroup(ModItemGroup.STINGA, STINGA_BOOTS);
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        StingaMod.LOGGER.info("Register Mod Items for " + StingaMod.MOD_ID);

        addItemstoItemGroup();
    }
}
