package net.ryuzaki.arcanecraftmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.ryuzaki.arcanecraftmod.ArcaneCraftMod;

public class ModItems {
    public static final Item AQUARINE = registerItem("aquarine",
            new Item(new Item.Settings()), ModItemGroup.ARCANECRAFT);

    public static final Item CUT_AQUARINE = registerItem("cut_aquarine",
            new Item(new Item.Settings()), ModItemGroup.ARCANECRAFT);

    public static final Item ROUGESTONE = registerItem("rougestone",
            new Item(new Item.Settings()), ModItemGroup.ARCANECRAFT);

    public static final Item CUT_ROUGESTONE = registerItem("cut_rougestone",
            new Item(new Item.Settings()), ModItemGroup.ARCANECRAFT);

    public static final Item TERRITE = registerItem("territe",
            new Item(new Item.Settings()), ModItemGroup.ARCANECRAFT);

    public static final Item CUT_TERRITE = registerItem("cut_territe",
            new Item(new Item.Settings()), ModItemGroup.ARCANECRAFT);

    public static final Item LETHEUM = registerItem("letheum",
            new Item(new Item.Settings()), ModItemGroup.ARCANECRAFT);

    public static final Item CUT_LETHEUM = registerItem("cut_letheum",
            new Item(new Item.Settings()), ModItemGroup.ARCANECRAFT);

    public static final Item LAVENDATE = registerItem("lavendate",
            new Item(new Item.Settings()), ModItemGroup.ARCANECRAFT);

    public static final Item CUT_LAVENDATE = registerItem("cut_lavendate",
            new Item(new Item.Settings()), ModItemGroup.ARCANECRAFT);

    private static Item registerItem(String name, Item item, ItemGroup group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(ArcaneCraftMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ArcaneCraftMod.LOGGER.debug("Registering Mod Items for " + ArcaneCraftMod.MOD_ID);
    }
}
