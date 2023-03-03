package adelina.topazindustrials;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("topazindustrials");
	public static final Block DIAMOND_VOID_PRODUCER = new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f));





	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		LOGGER.info("This is the TopazIndustrials!");

		Registry.register(Registries.BLOCK, new Identifier("topazindustrials","diamond_producer"),
				DIAMOND_VOID_PRODUCER);
		Registry.register(Registries.ITEM, new Identifier("topazindustrials","diamond_producer"),
				new BlockItem(DIAMOND_VOID_PRODUCER, new FabricItemSettings()));


	}
}