package net.ryuzaki.arcanecraftmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.ryuzaki.arcanecraftmod.ArcaneCraftMod;

public class ModItemGroup {
    public static final ItemGroup ARCANECRAFT = FabricItemGroup.builder(new Identifier(ArcaneCraftMod.MOD_ID))
            .displayName(Text.literal("ArcaneCraft"))
            .icon(() -> new ItemStack(ModItems.CUT_ROUGESTONE))
            .build();
}
