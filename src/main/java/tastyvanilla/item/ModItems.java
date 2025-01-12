package tastyvanilla.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import tastyvanilla.TastyVanilla;

public class ModItems {

    //COOKIES
    public static final Item COOKIE_APPLE = registerItem("cookie_apple", new Item(new Item.Settings().food(ModFoodComponents.COOKIE_APPLE).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"cookie_apple")))));
    public static final Item COOKIE_CARROT = registerItem("cookie_carrot", new Item(new Item.Settings().food(ModFoodComponents.COOKIE_CARROT).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"cookie_carrot")))));
    public static final Item COOKIE_GLOW_BERRY = registerItem("cookie_glow_berry", new Item(new Item.Settings().food(ModFoodComponents.COOKIE_GLOW_BERRY).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"cookie_glow_berry")))));
    public static final Item COOKIE_HONEY = registerItem("cookie_honey", new Item(new Item.Settings().food(ModFoodComponents.COOKIE_HONEY).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"cookie_honey")))));
    public static final Item COOKIE_OATMEAL = registerItem("cookie_oatmeal", new Item(new Item.Settings().food(ModFoodComponents.COOKIE_OATMEAL).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"cookie_oatmeal")))));
    public static final Item COOKIE_POPPY_SEED = registerItem("cookie_poppy_seed", new Item(new Item.Settings().food(ModFoodComponents.COOKIE_POPPY_SEED).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"cookie_poppy_seed")))));
    public static final Item COOKIE_PUMPKIN = registerItem("cookie_pumpkin", new Item(new Item.Settings().food(ModFoodComponents.COOKIE_PUMPKIN).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"cookie_pumpkin")))));
    public static final Item COOKIE_SPIDER_EYE = registerItem("cookie_spider_eye", new Item(new Item.Settings().food(ModFoodComponents.COOKIE_SPIDER_EYE).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"cookie_spider_eye")))));
    public static final Item COOKIE_SUGAR = registerItem("cookie_sugar", new Item(new Item.Settings().food(ModFoodComponents.COOKIE_SUGAR).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"cookie_sugar")))));
    public static final Item COOKIE_SUNFLOWER_SEED = registerItem("cookie_sunflower_seed", new Item(new Item.Settings().food(ModFoodComponents.COOKIE_SUNFLOWER_SEED).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"cookie_sunflower_seed")))));
    public static final Item COOKIE_SWEET_BERRY = registerItem("cookie_sweet_berry", new Item(new Item.Settings().food(ModFoodComponents.COOKIE_SWEET_BERRY).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"cookie_sweet_berry")))));

    //BREAD INGREDIENTS
    public static final Item BUTTER = registerItem("butter", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"butter")))));
    public static final Item FLOUR = registerItem("flour", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"flour")))));
    public static final Item SALT = registerItem("salt", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"salt")))));
    public static final Item YEAST = registerItem("yeast", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"yeast")))));

    //BREAD DOUGHS
    public static final Item DOUGH_BAGUEL = registerItem("dough_baguel", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"dough_baguel")))));
    public static final Item DOUGH_BAGUETTE = registerItem("dough_baguette", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"dough_baguette")))));
    public static final Item DOUGH_BAKED_BREAD = registerItem("dough_baked_bread", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"dough_baked_bread")))));
    public static final Item DOUGH_BROWNIE = registerItem("dough_brownie", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"dough_brownie")))));
    public static final Item DOUGH_CROISSANT = registerItem("dough_croissant", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"dough_croissant")))));
    public static final Item DOUGH_FLATBREAD = registerItem("dough_flatbread", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"dough_flatbread")))));
    public static final Item DOUGH_FOCACCIA = registerItem("dough_focaccia", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"dough_focaccia")))));
    public static final Item DOUGH_HONEY = registerItem("dough_honey", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"dough_honey")))));
    public static final Item DOUGH_MULTIGRAIN = registerItem("dough_multigrain", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"dough_multigrain")))));
    public static final Item DOUGH_PANCAKES = registerItem("dough_pancakes", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"dough_pancakes")))));
    public static final Item DOUGH_SOURDOUGH = registerItem("dough_sourdough", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"dough_sourdough")))));
    public static final Item DOUGH_SWEET_ROLL = registerItem("dough_sweet_roll", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"dough_sweet_roll")))));

    //BAKED BREAD
    public static final Item BREAD_BAGUEL = registerItem("bread_baguel", new Item(new Item.Settings().food(ModFoodComponents.BREAD_BAGUEL).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"bread_baguel")))));
    public static final Item BREAD_BAGUETTE = registerItem("bread_baguette", new Item(new Item.Settings().food(ModFoodComponents.BREAD_BAGUETTE).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"bread_baguette")))));
    public static final Item BREAD_BAKED = registerItem("bread_baked", new Item(new Item.Settings().food(ModFoodComponents.BREAD_BAKED).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"bread_baked")))));
    public static final Item BREAD_BROWNIE = registerItem("bread_brownie", new Item(new Item.Settings().food(ModFoodComponents.BREAD_BROWNIE).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"bread_brownie")))));
    public static final Item BREAD_CROISSANT = registerItem("bread_croissant", new Item(new Item.Settings().food(ModFoodComponents.BREAD_CROISSANT).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"bread_croissant")))));
    public static final Item BREAD_FLATBREAD = registerItem("bread_flatbread", new Item(new Item.Settings().food(ModFoodComponents.BREAD_FLATBREAD).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"bread_flatbread")))));
    public static final Item BREAD_FOCACCIA = registerItem("bread_focaccia", new Item(new Item.Settings().food(ModFoodComponents.BREAD_FOCACCIA).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"bread_focaccia")))));
    public static final Item BREAD_HONEY = registerItem("bread_honey", new Item(new Item.Settings().food(ModFoodComponents.BREAD_HONEY).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"bread_honey")))));
    public static final Item BREAD_MULTIGRAIN = registerItem("bread_multigrain", new Item(new Item.Settings().food(ModFoodComponents.BREAD_MULTIGRAIN).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"bread_multigrain")))));
    public static final Item BREAD_PANCAKES = registerItem("bread_pancakes", new Item(new Item.Settings().food(ModFoodComponents.BREAD_PANCAKES).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"bread_pancakes")))));
    public static final Item BREAD_SOURDOUGH = registerItem("bread_sourdough", new Item(new Item.Settings().food(ModFoodComponents.BREAD_SOURDOUGH).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"bread_sourdough")))));
    public static final Item BREAD_SWEET_ROLL = registerItem("bread_sweet_roll", new Item(new Item.Settings().food(ModFoodComponents.BREAD_SWEET_ROLL).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"bread_sweet_roll")))));

    //PIES
    public static final Item PIE_APPLE = registerItem("pie_apple", new Item(new Item.Settings().food(ModFoodComponents.PIE_APPLE).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"pie_apple")))));
    public static final Item PIE_CHICKEN = registerItem("pie_chicken", new Item(new Item.Settings().food(ModFoodComponents.PIE_CHICKEN).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"pie_chicken")))));
    public static final Item PIE_CHOCOLATE = registerItem("pie_chocolate", new Item(new Item.Settings().food(ModFoodComponents.PIE_CHOCOLATE).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"pie_chocolate")))));
    public static final Item PIE_CHORUS_FRUIT = registerItem("pie_chorus_fruit", new Item(new Item.Settings().food(ModFoodComponents.PIE_CHORUS_FRUIT).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"pie_chorus_fruit"))).food(FoodComponents.CHORUS_FRUIT)));
    public static final Item PIE_FISH = registerItem("pie_fish", new Item(new Item.Settings().food(ModFoodComponents.PIE_FISH).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"pie_fish")))));
    public static final Item PIE_GLOW_BERRY = registerItem("pie_glow_berry", new Item(new Item.Settings().food(ModFoodComponents.PIE_GLOW_BERRY).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"pie_glow_berry")))));
    public static final Item PIE_HONEY = registerItem("pie_honey", new Item(new Item.Settings().food(ModFoodComponents.PIE_HONEY).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"pie_honey")))));
    public static final Item PIE_MEAT = registerItem("pie_meat", new Item(new Item.Settings().food(ModFoodComponents.PIE_MEAT).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"pie_meat")))));
    public static final Item PIE_MELON = registerItem("pie_melon", new Item(new Item.Settings().food(ModFoodComponents.PIE_MELON).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"pie_melon")))));
    public static final Item PIE_MUSHROOM = registerItem("pie_mushroom", new Item(new Item.Settings().food(ModFoodComponents.PIE_MUSHROOM).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"pie_mushroom")))));
    public static final Item PIE_SHEPHERDS = registerItem("pie_shepherds", new Item(new Item.Settings().food(ModFoodComponents.PIE_SHEPHERDS).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"pie_shepherds")))));
    public static final Item PIE_SWEET_BERRY = registerItem("pie_sweet_berry", new Item(new Item.Settings().food(ModFoodComponents.PIE_SWEET_BERRY).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"pie_sweet_berry")))));
    public static final Item PIE_VEGETABLE = registerItem("pie_vegetable", new Item(new Item.Settings().food(ModFoodComponents.PIE_VEGETABLE).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TastyVanilla.MOD_ID,"pie_vegetable")))));

    //TUTORIAL CODE REGISTER
    private static Item registerItem (String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(TastyVanilla.MOD_ID, name), item);
    }

    //ITEM INITIALIZER
    public static void registerModItems(){
        TastyVanilla.LOGGER.info("Registering Mod Items for " + TastyVanilla.MOD_ID);

        //NEW ITEM IN FOOD AND DRINK
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries -> {

            //COOKIES
            fabricItemGroupEntries.add(COOKIE_APPLE);
            fabricItemGroupEntries.add(COOKIE_CARROT);
            fabricItemGroupEntries.add(COOKIE_GLOW_BERRY);
            fabricItemGroupEntries.add(COOKIE_HONEY);
            fabricItemGroupEntries.add(COOKIE_OATMEAL);
            fabricItemGroupEntries.add(COOKIE_POPPY_SEED);
            fabricItemGroupEntries.add(COOKIE_PUMPKIN);
            fabricItemGroupEntries.add(COOKIE_SPIDER_EYE);
            fabricItemGroupEntries.add(COOKIE_SUGAR);
            fabricItemGroupEntries.add(COOKIE_SUNFLOWER_SEED);
            fabricItemGroupEntries.add(COOKIE_SWEET_BERRY);

            //BAKED BREAD
            fabricItemGroupEntries.add(BREAD_BAGUEL);
            fabricItemGroupEntries.add(BREAD_BAGUETTE);
            fabricItemGroupEntries.add(BREAD_BAKED);
            fabricItemGroupEntries.add(BREAD_BROWNIE);
            fabricItemGroupEntries.add(BREAD_CROISSANT);
            fabricItemGroupEntries.add(BREAD_FLATBREAD);
            fabricItemGroupEntries.add(BREAD_FOCACCIA);
            fabricItemGroupEntries.add(BREAD_HONEY);
            fabricItemGroupEntries.add(BREAD_SOURDOUGH);
            fabricItemGroupEntries.add(BREAD_PANCAKES);
            fabricItemGroupEntries.add(BREAD_MULTIGRAIN);
            fabricItemGroupEntries.add(BREAD_SWEET_ROLL);


            //PIES
            fabricItemGroupEntries.add(PIE_APPLE);
            fabricItemGroupEntries.add(PIE_CHICKEN);
            fabricItemGroupEntries.add(PIE_CHOCOLATE);
            fabricItemGroupEntries.add(PIE_CHORUS_FRUIT);
            fabricItemGroupEntries.add(PIE_FISH);
            fabricItemGroupEntries.add(PIE_GLOW_BERRY);
            fabricItemGroupEntries.add(PIE_HONEY);
            fabricItemGroupEntries.add(PIE_MEAT);
            fabricItemGroupEntries.add(PIE_MELON);
            fabricItemGroupEntries.add(PIE_MUSHROOM);
            fabricItemGroupEntries.add(PIE_SHEPHERDS);
            fabricItemGroupEntries.add(PIE_SWEET_BERRY);
            fabricItemGroupEntries.add(PIE_VEGETABLE);

        });

        //NEW ITEM IN INGREDIENTS
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {

            //BREAD INGREDIENTS
            fabricItemGroupEntries.add(BUTTER);
            fabricItemGroupEntries.add(FLOUR);
            fabricItemGroupEntries.add(SALT);
            fabricItemGroupEntries.add(YEAST);

            //DOUGHS
            fabricItemGroupEntries.add(DOUGH_BAGUEL);
            fabricItemGroupEntries.add(DOUGH_BAGUETTE);
            fabricItemGroupEntries.add(DOUGH_BAKED_BREAD);
            fabricItemGroupEntries.add(DOUGH_BROWNIE);
            fabricItemGroupEntries.add(DOUGH_CROISSANT);
            fabricItemGroupEntries.add(DOUGH_FLATBREAD);
            fabricItemGroupEntries.add(DOUGH_FOCACCIA);
            fabricItemGroupEntries.add(DOUGH_HONEY);
            fabricItemGroupEntries.add(DOUGH_MULTIGRAIN);
            fabricItemGroupEntries.add(DOUGH_PANCAKES);
            fabricItemGroupEntries.add(DOUGH_SOURDOUGH);
            fabricItemGroupEntries.add(DOUGH_SWEET_ROLL);

        });

        //NEW ITEM IN NATURAL
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries -> {

        });

        }
}