package net.ryuzaki.arcanecraftmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.ryuzaki.arcanecraftmod.ArcaneCraftMod;
import net.ryuzaki.arcanecraftmod.item.ModItemGroup;

public class ModBlocks {
    public static final Block PENUMBRACITE_ORE = registerBlock("penumbracite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE)
                    .strength(4f, 6f)
                    .requiresTool()
                    .luminance(3),
            UniformIntProvider.create(3,7)),
            ModItemGroup.ARCANECRAFT);

    public static final Block UMBRACITE_ORE = registerBlock("umbracite_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE)
                    .strength(6f, 10f)
                    .requiresTool()
                    .luminance(2),
            UniformIntProvider.create(5,9)),
            ModItemGroup.ARCANECRAFT);

    public static final Block RAW_PENUMBRACITE_BLOCK = registerBlock("raw_penumbracite_block",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .strength(5f, 8f)
                    .requiresTool()
                    .luminance(3)),
            ModItemGroup.ARCANECRAFT);

    public static final Block RAW_UMBRACITE_BLOCK = registerBlock("raw_umbracite_block",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .strength(7f, 12f)
                    .requiresTool()
                    .luminance(2)),
            ModItemGroup.ARCANECRAFT);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(ArcaneCraftMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(block));
        return Registry.register(Registries.ITEM, new Identifier(ArcaneCraftMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        ArcaneCraftMod.LOGGER.debug("Registering Mod Blocks for " + ArcaneCraftMod.MOD_ID);
    }
}
