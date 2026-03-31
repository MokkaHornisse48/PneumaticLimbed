package mod.mh48.pneumo;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.SharedProperties;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.level.block.Block;

public class PneumoRegistry {
	public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(PneumaticLimbed.MOD_ID);

	public static final BlockEntry<Block> EXAMPLE_BLOCK = REGISTRATE.block("example_block", Block::new)
			.initialProperties(SharedProperties::stone)
			.lang("Example block") // Generates the lang file
			.item() // Automatically creates the BlockItem
			.build() // Builds the item
			.register();

	public static void init() {
		// load the class and register everything
		//PneumaticLimbed.LOGGER.info("Registering blocks for " + PneumaticLimbed.NAME);
	}
}
