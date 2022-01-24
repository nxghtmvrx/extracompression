package nxghtmvrx.extracompression;

import net.fabricmc.api.ModInitializer;
//import java.util.function.Function
//import net.fabricmc.fabric.api.block.FabricBlockSettings;
//import net.fabricmc.fabric.api.item.FabricItemSettings;
//import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.block.Material;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;

public class extracompression implements ModInitializer {
        public static final Block COMPRESSED_DIRT1 = new Block(Block.Settings.of(Material.STONE).strength(4.0f));
        public static final Block COMPRESSED_DIRT2 = new Block(Block.Settings.of(Material.STONE).strength(4.0f));
        public static final Block COMPRESSED_DIRT3 = new Block(Block.Settings.of(Material.STONE).strength(4.0f));
        public static final Block COMPRESSED_DIRT4 = new Block(Block.Settings.of(Material.STONE).strength(4.0f));
        public static final Block COMPRESSED_DIRT5 = new Block(Block.Settings.of(Material.STONE).strength(4.0f));

        public static final Block COMPRESSED_COBBLESTONE1 = new Block(Block.Settings.of(Material.STONE).strength(4.0f));
        public static final Block COMPRESSED_COBBLESTONE2 = new Block(Block.Settings.of(Material.STONE).strength(4.0f));
        public static final Block COMPRESSED_COBBLESTONE3 = new Block(Block.Settings.of(Material.STONE).strength(4.0f));
        public static final Block COMPRESSED_COBBLESTONE4 = new Block(Block.Settings.of(Material.STONE).strength(4.0f));
        public static final Block COMPRESSED_COBBLESTONE5 = new Block(Block.Settings.of(Material.STONE).strength(4.0f));

        public static final Block COMPRESSED_GRAVEL1 = new Block(Block.Settings.of(Material.STONE).strength(4.0f));
        public static final Block COMPRESSED_GRAVEL2 = new Block(Block.Settings.of(Material.STONE).strength(4.0f));
        public static final Block COMPRESSED_GRAVEL3 = new Block(Block.Settings.of(Material.STONE).strength(4.0f));
        public static final Block COMPRESSED_GRAVEL4 = new Block(Block.Settings.of(Material.STONE).strength(4.0f));
        public static final Block COMPRESSED_GRAVEL5 = new Block(Block.Settings.of(Material.STONE).strength(4.0f));

        public static final Block COMPRESSED_SAND1 = new Block(Block.Settings.of(Material.STONE).strength(4.0f));
        public static final Block COMPRESSED_SAND2 = new Block(Block.Settings.of(Material.STONE).strength(4.0f));
        public static final Block COMPRESSED_SAND3 = new Block(Block.Settings.of(Material.STONE).strength(4.0f));
        public static final Block COMPRESSED_SAND4 = new Block(Block.Settings.of(Material.STONE).strength(4.0f));
        public static final Block COMPRESSED_SAND5 = new Block(Block.Settings.of(Material.STONE).strength(4.0f));

        public static final Block COMPRESSED_NETHERRACK1 = new Block(Block.Settings.of(Material.STONE).strength(4.0f));
        public static final Block COMPRESSED_NETHERRACK2 = new Block(Block.Settings.of(Material.STONE).strength(4.0f));
        public static final Block COMPRESSED_NETHERRACK3 = new Block(Block.Settings.of(Material.STONE).strength(4.0f));
        public static final Block COMPRESSED_NETHERRACK4 = new Block(Block.Settings.of(Material.STONE).strength(4.0f));
        public static final Block COMPRESSED_NETHERRACK5 = new Block(Block.Settings.of(Material.STONE).strength(4.0f));

        public static final Block COMPRESSED_ENDSTONE1 = new Block(Block.Settings.of(Material.STONE).strength(4.0f));
        public static final Block COMPRESSED_ENDSTONE2 = new Block(Block.Settings.of(Material.STONE).strength(4.0f));
        public static final Block COMPRESSED_ENDSTONE3 = new Block(Block.Settings.of(Material.STONE).strength(4.0f));
        public static final Block COMPRESSED_ENDSTONE4 = new Block(Block.Settings.of(Material.STONE).strength(4.0f));
        public static final Block COMPRESSED_ENDSTONE5 = new Block(Block.Settings.of(Material.STONE).strength(4.0f));

	@Override
	public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier("extracompression", "compressed_dirt1"), COMPRESSED_DIRT1);
        Registry.register(Registry.BLOCK, new Identifier("extracompression", "compressed_dirt2"), COMPRESSED_DIRT2);
        Registry.register(Registry.BLOCK, new Identifier("extracompression", "compressed_dirt3"), COMPRESSED_DIRT3);
        Registry.register(Registry.BLOCK, new Identifier("extracompression", "compressed_dirt4"), COMPRESSED_DIRT4);
        Registry.register(Registry.BLOCK, new Identifier("extracompression", "compressed_dirt5"), COMPRESSED_DIRT5);
        Registry.register(Registry.ITEM, new Identifier("extracompression", "compressed_dirt1"), new BlockItem(COMPRESSED_DIRT1, new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier("extracompression", "compressed_dirt2"), new BlockItem(COMPRESSED_DIRT2, new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier("extracompression", "compressed_dirt3"), new BlockItem(COMPRESSED_DIRT3, new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier("extracompression", "compressed_dirt4"), new BlockItem(COMPRESSED_DIRT4, new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier("extracompression", "compressed_dirt5"), new BlockItem(COMPRESSED_DIRT5, new Item.Settings().group(ItemGroup.MATERIALS)));

        Registry.register(Registry.BLOCK, new Identifier("extracompression", "compressed_cobblestone1"), COMPRESSED_COBBLESTONE1);
        Registry.register(Registry.BLOCK, new Identifier("extracompression", "compressed_cobblestone2"), COMPRESSED_COBBLESTONE2);
        Registry.register(Registry.BLOCK, new Identifier("extracompression", "compressed_cobblestone3"), COMPRESSED_COBBLESTONE3);
        Registry.register(Registry.BLOCK, new Identifier("extracompression", "compressed_cobblestone4"), COMPRESSED_COBBLESTONE4);
        Registry.register(Registry.BLOCK, new Identifier("extracompression", "compressed_cobblestone5"), COMPRESSED_COBBLESTONE5);
        Registry.register(Registry.ITEM, new Identifier("extracompression", "compressed_cobblestone1"), new BlockItem(COMPRESSED_COBBLESTONE1, new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier("extracompression", "compressed_cobblestone2"), new BlockItem(COMPRESSED_COBBLESTONE2, new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier("extracompression", "compressed_cobblestone3"), new BlockItem(COMPRESSED_COBBLESTONE3, new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier("extracompression", "compressed_cobblestone4"), new BlockItem(COMPRESSED_COBBLESTONE4, new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier("extracompression", "compressed_cobblestone5"), new BlockItem(COMPRESSED_COBBLESTONE5, new Item.Settings().group(ItemGroup.MATERIALS)));

        Registry.register(Registry.BLOCK, new Identifier("extracompression", "compressed_gravel1"), COMPRESSED_GRAVEL1);
        Registry.register(Registry.BLOCK, new Identifier("extracompression", "compressed_gravel2"), COMPRESSED_GRAVEL2);
        Registry.register(Registry.BLOCK, new Identifier("extracompression", "compressed_gravel3"), COMPRESSED_GRAVEL3);
        Registry.register(Registry.BLOCK, new Identifier("extracompression", "compressed_gravel4"), COMPRESSED_GRAVEL4);
        Registry.register(Registry.BLOCK, new Identifier("extracompression", "compressed_gravel5"), COMPRESSED_GRAVEL5);
        Registry.register(Registry.ITEM, new Identifier("extracompression", "compressed_gravel1"), new BlockItem(COMPRESSED_GRAVEL1, new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier("extracompression", "compressed_gravel2"), new BlockItem(COMPRESSED_GRAVEL2, new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier("extracompression", "compressed_gravel3"), new BlockItem(COMPRESSED_GRAVEL3, new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier("extracompression", "compressed_gravel4"), new BlockItem(COMPRESSED_GRAVEL4, new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier("extracompression", "compressed_gravel5"), new BlockItem(COMPRESSED_GRAVEL5, new Item.Settings().group(ItemGroup.MATERIALS)));

        Registry.register(Registry.BLOCK, new Identifier("extracompression", "compressed_sand1"), COMPRESSED_SAND1);
        Registry.register(Registry.BLOCK, new Identifier("extracompression", "compressed_sand2"), COMPRESSED_SAND2);
        Registry.register(Registry.BLOCK, new Identifier("extracompression", "compressed_sand3"), COMPRESSED_SAND3);
        Registry.register(Registry.BLOCK, new Identifier("extracompression", "compressed_sand4"), COMPRESSED_SAND4);
        Registry.register(Registry.BLOCK, new Identifier("extracompression", "compressed_sand5"), COMPRESSED_SAND5);
        Registry.register(Registry.ITEM, new Identifier("extracompression", "compressed_sand1"), new BlockItem(COMPRESSED_SAND1, new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier("extracompression", "compressed_sand2"), new BlockItem(COMPRESSED_SAND2, new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier("extracompression", "compressed_sand3"), new BlockItem(COMPRESSED_SAND3, new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier("extracompression", "compressed_sand4"), new BlockItem(COMPRESSED_SAND4, new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier("extracompression", "compressed_sand5"), new BlockItem(COMPRESSED_SAND5, new Item.Settings().group(ItemGroup.MATERIALS)));

        Registry.register(Registry.BLOCK, new Identifier("extracompression", "compressed_netherrack1"), COMPRESSED_NETHERRACK1);
        Registry.register(Registry.BLOCK, new Identifier("extracompression", "compressed_netherrack2"), COMPRESSED_NETHERRACK2);
        Registry.register(Registry.BLOCK, new Identifier("extracompression", "compressed_netherrack3"), COMPRESSED_NETHERRACK3);
        Registry.register(Registry.BLOCK, new Identifier("extracompression", "compressed_netherrack4"), COMPRESSED_NETHERRACK4);
        Registry.register(Registry.BLOCK, new Identifier("extracompression", "compressed_netherrack5"), COMPRESSED_NETHERRACK5);
        Registry.register(Registry.ITEM, new Identifier("extracompression", "compressed_netherrack1"), new BlockItem(COMPRESSED_NETHERRACK1, new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier("extracompression", "compressed_netherrack2"), new BlockItem(COMPRESSED_NETHERRACK2, new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier("extracompression", "compressed_netherrack3"), new BlockItem(COMPRESSED_NETHERRACK3, new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier("extracompression", "compressed_netherrack4"), new BlockItem(COMPRESSED_NETHERRACK4, new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier("extracompression", "compressed_netherrack5"), new BlockItem(COMPRESSED_NETHERRACK5, new Item.Settings().group(ItemGroup.MATERIALS)));

        Registry.register(Registry.BLOCK, new Identifier("extracompression", "compressed_endstone1"), COMPRESSED_ENDSTONE1);
        Registry.register(Registry.BLOCK, new Identifier("extracompression", "compressed_endstone2"), COMPRESSED_ENDSTONE2);
        Registry.register(Registry.BLOCK, new Identifier("extracompression", "compressed_endstone3"), COMPRESSED_ENDSTONE3);
        Registry.register(Registry.BLOCK, new Identifier("extracompression", "compressed_endstone4"), COMPRESSED_ENDSTONE4);
        Registry.register(Registry.BLOCK, new Identifier("extracompression", "compressed_endstone5"), COMPRESSED_ENDSTONE5);
        Registry.register(Registry.ITEM, new Identifier("extracompression", "compressed_endstone1"), new BlockItem(COMPRESSED_ENDSTONE1, new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier("extracompression", "compressed_endstone2"), new BlockItem(COMPRESSED_ENDSTONE2, new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier("extracompression", "compressed_endstone3"), new BlockItem(COMPRESSED_ENDSTONE3, new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier("extracompression", "compressed_endstone4"), new BlockItem(COMPRESSED_ENDSTONE4, new Item.Settings().group(ItemGroup.MATERIALS)));
        Registry.register(Registry.ITEM, new Identifier("extracompression", "compressed_endstone5"), new BlockItem(COMPRESSED_ENDSTONE5, new Item.Settings().group(ItemGroup.MATERIALS)));

	}
}
