package net.fabricmc.stinga.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.stinga.StingaMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {

    public static ItemGroup STINGA;

    public static void registerItemGroups() {
        STINGA = FabricItemGroup.builder(new Identifier(StingaMod.MOD_ID, "stinga"))
                .displayName(Text.translatable("itemgroup.stinga"))
                .icon(() -> new ItemStack(ModItems.STINGA_SWORD)).build();
    }

}
