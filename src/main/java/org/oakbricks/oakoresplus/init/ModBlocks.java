package org.oakbricks.oakoresplus.init;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.oakbricks.oakoresplus.block.EndPurpiOre;

import static org.oakbricks.oakores.OakOres.MOD_ID;

public class ModBlocks {

    public static final Block END_PURPI_ORE = new EndPurpiOre(FabricBlockSettings.of(Material.STONE));

    public static void blockInit() {

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "end_purpi_ore"), END_PURPI_ORE);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "end_purpi_ore"), new BlockItem(END_PURPI_ORE, new Item.Settings().group(ItemGroup.MISC)));

    }

}
