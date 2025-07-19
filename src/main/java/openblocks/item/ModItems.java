package openblocks.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import openblocks.OpenBlocks;

public class ModItems {
    // Create a Deferred Register to hold Items which will all be registered under the "openblocks" namespace
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(OpenBlocks.MODID);

    // Creates a new food item with the id "openblocks:example_id", nutrition 1 and saturation 2
    public static final DeferredItem<Item> GLIDER_WING = ITEMS.register("glider_wing",
            () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> HANG_GLIDER = ITEMS.register("hang_glider",
            () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> GENERIC = ITEMS.register("generic",
            () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> LUGGAGE = ITEMS.register("luggage",
            () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> SONIC_GLASSES = ITEMS.register("sonic_glasses",
            () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> PENCIL_GLASSES = ITEMS.register("pencil_glasses",
            () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> CRAYON_GLASSES = ITEMS.register("crayon_glasses",
            () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> TECHNICOLOR_GLASSES = ITEMS.register("technicolor_glasses",
            () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> SERIOUS_GLASSES = ITEMS.register("serious_glasses",
            () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> CRANE_CONTROL = ITEMS.register("crane_control",
            () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> CRANE_BACKPACK = ITEMS.register("crane_backpack",
            () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> SLIMALYZER = ITEMS.register("slimalyzer",
            () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> XP_BUCKET = ITEMS.register("xp_bucket",
            () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> SLEEPING_BAG = ITEMS.register("sleeping_bag",
            () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> PAINT_BRUSH = ITEMS.register("paint_brush",
            () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> STENCIL = ITEMS.register("stencil",
            () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> SQUEEGEE = ITEMS.register("squeegee",
            () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> HEIGHT_MAP = ITEMS.register("height_map",
            () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> EMPTY_MAP = ITEMS.register("empty_map",
            () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> CARTOGRAPHER = ITEMS.register("cartographer",
            () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> TASTY_CLAY = ITEMS.register("tasty_clay",
            () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> GOLDEN_EYE = ITEMS.register("golden_eye",
            () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> GENERIC_UNSTACKABLE = ITEMS.register("generic_unstackable",
            () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> CURSOR = ITEMS.register("cursor",
            () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> INFO_BOOK = ITEMS.register("info_book",
            () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> DEV_NULL = ITEMS.register("dev_null",
            () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> SPONGE_ON_A_STICK = ITEMS.register("sponge_on_a_stick",
            () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> EPIC_ERASER = ITEMS.register("epic_eraser",
            () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> WRENCH = ITEMS.register("wrench",
            () -> new Item( new Item.Properties()));
    public static final DeferredItem<Item> GLYPH = ITEMS.register("glyph",
            () -> new Item( new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
