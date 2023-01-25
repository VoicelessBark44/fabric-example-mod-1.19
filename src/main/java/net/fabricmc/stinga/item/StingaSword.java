package net.fabricmc.stinga.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;

public class StingaSword extends Item {

    public StingaSword(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {

        playerEntity.playSound(SoundEvents.ENTITY_BEE_STING, 1.0F, 1.0F);

        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }


    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        //Basic Info
        tooltip.add(Text.translatable("The Sword of the God Stinga").formatted(Formatting.GOLD));
        tooltip.add(Text.translatable("One can hear the grace of the lord by activating the sword"));

    }

}
