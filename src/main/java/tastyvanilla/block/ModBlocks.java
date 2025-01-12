package tastyvanilla.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import tastyvanilla.TastyVanilla;


public class ModBlocks {

    //NEW BLOCKS
    public static final Block SALT_BLOCK = registerBlock("salt_block",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TastyVanilla.MOD_ID,"salt_block")))
                    .strength(0.75f)
                    .sounds(BlockSoundGroup.CALCITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.WHITE_GRAY)
                    .allowsSpawning(Blocks::never)));

    public static final Block SUGAR_BLOCK = registerBlock("sugar_block",
            new Block(AbstractBlock.Settings.create()
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(TastyVanilla.MOD_ID,"sugar_block")))
                    .strength(0.75f)
                    .sounds(BlockSoundGroup.CALCITE)
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .mapColor(MapColor.TERRACOTTA_WHITE)
                    .allowsSpawning(Blocks::never)));


    //--------------------------//

    //Register Block Method

    private static Block registerBlockWithoutBlockItem(String name,Block block){
        return Registry.register(Registries.BLOCK, Identifier.of(TastyVanilla.MOD_ID,name),block);
    }

    private static Block registerBlock(String name,Block block){
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK, Identifier.of(TastyVanilla.MOD_ID,name),block);
    }


    //Register Block Item Method
    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(TastyVanilla.MOD_ID,name),
                new BlockItem(block, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(TastyVanilla.MOD_ID, name)))));
    }

    //--------------------------//

    //Register Block Initializer
    public static void registerModBlocks() {
        TastyVanilla.LOGGER.info("Registering Mod Blocks for" + TastyVanilla.MOD_ID);

        //--------------------------//

        //NEW BLOCK IN BUILDING BLOCKS
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries ->
                fabricItemGroupEntries.add(ModBlocks.SALT_BLOCK));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries ->
                fabricItemGroupEntries.add(ModBlocks.SUGAR_BLOCK));
    }
}
