package com.muurr.tfcpluskvass;

import com.dunk.tfc.Core.FluidBaseTFC;
import com.dunk.tfc.Core.TFCTabs;
import com.dunk.tfc.Food.ItemFoodTFC;
import com.dunk.tfc.Items.ItemTerra;
import com.dunk.tfc.api.TFCBlocks;
import com.dunk.tfc.api.TFCFluids;
import com.dunk.tfc.api.TFCItems;
import com.dunk.tfc.api.Crafting.BarrelLiquidToLiquidRecipe;
import com.dunk.tfc.api.Crafting.BarrelManager;
import com.dunk.tfc.api.Crafting.BarrelRecipe;
import com.dunk.tfc.api.Enums.EnumFoodGroup;
import com.dunk.tfc.api.Enums.EnumSize;
import com.dunk.tfc.api.Enums.EnumWeight;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class ItemSetup extends TFCItems{
	
	public static Item kvass;
	public static final Fluid KVASS = new FluidBaseTFC("kvass").setBaseColor(0x40130a);
	public static final Fluid UNCOOKEDKVASS = new FluidBaseTFC("uncookedkvass").setBaseColor(0xc7610f);
	public static Item sbiten;
	public static final Fluid SBITEN = new FluidBaseTFC("sbiten").setBaseColor(0xea811b);
	public static Item syrup;
	public static final Fluid SYRUP = new FluidBaseTFC("syrup").setBaseColor(0xbda062);
	public static Item tarhun;
	public static final Fluid TARHUN = new FluidBaseTFC("tarhun").setBaseColor(0x009e10);
	public static Item gogolmogol;
	public static Item gogolmogolbowl;
	public static final Fluid GOGOLMOGOL = new FluidBaseTFC("gogolmogol").setBaseColor(0xc2cb9d);
	
	//Teas
	public static Item tea;
	public static final Fluid TEA = new FluidBaseTFC("tea").setBaseColor(0x752b16);
	public static Item kombucha;
	public static Item dyingkombucha;
	public static Item teamushroom;
	public static final Fluid TEAMUSHROOM = new FluidBaseTFC("teamushroom").setBaseColor(0xd73f00);
	public static Item appletea;
	public static final Fluid APPLETEA = new FluidBaseTFC("appletea").setBaseColor(0xc23b04);
	public static Item lemontea;
	public static final Fluid LEMONTEA = new FluidBaseTFC("lemontea").setBaseColor(0xdaad58);
	public static Item cherrytea;
	public static final Fluid CHERRYTEA = new FluidBaseTFC("cherrytea").setBaseColor(0xd91e29);
	public static Item blueberrytea;
	public static final Fluid BLUEBERRYTEA = new FluidBaseTFC("blueberrytea").setBaseColor(0xd91e29);
	public static Item raspberrytea;
	public static final Fluid RASPBERRYTEA = new FluidBaseTFC("raspberrytea").setBaseColor(0xd91e29);
	public static Item strawberrytea;
	public static final Fluid STRAWBERRYTEA = new FluidBaseTFC("strawberrytea").setBaseColor(0xd91e29);
	public static Item blackberrytea;
	public static final Fluid BLACKBERRYTEA = new FluidBaseTFC("blackberrytea").setBaseColor(0xd91e29);
	public static Item cranberrytea;
	public static final Fluid CRANBERRYTEA = new FluidBaseTFC("cranberrytea").setBaseColor(0xd91e29);
	public static Item gooseberrytea;
	public static final Fluid GOOSEBERRYTEA = new FluidBaseTFC("gooseberrytea").setBaseColor(0xd91e29);

	//Compotes
	public static Item applecompote;
	public static final Fluid APPLECOMPOTE = new FluidBaseTFC("applecompote").setBaseColor(0x998450);
	public static Item plumcompote;
	public static final Fluid PLUMCOMPOTE = new FluidBaseTFC("plumcompote").setBaseColor(0xb82a1d);
	public static Item strawberrycompote;
	public static final Fluid STRAWBERRYCOMPOTE = new FluidBaseTFC("strawberrycompote").setBaseColor(0xf2682e);
	public static Item gooseberrycompote;
	public static final Fluid GOOSEBERRYCOMPOTE = new FluidBaseTFC("gooseberrycompote").setBaseColor(0x77803d);
	public static Item blueberrycompote;
	public static final Fluid BLUEBERRYCOMPOTE = new FluidBaseTFC("blueberrycompote").setBaseColor(0x3e2534);
	public static Item raspberrycompote;
	public static final Fluid RASPBERRYCOMPOTE = new FluidBaseTFC("raspberrycompote").setBaseColor(0x93001b);
	
	//Morses
	public static Item grapemors;
	public static final Fluid GRAPEMORS = new FluidBaseTFC("grapemors").setBaseColor(0xDAB3EB);
	public static Item agavemors;
	public static final Fluid AGAVEMORS = new FluidBaseTFC("agavemors").setBaseColor(0xE0EFE1);
	public static Item canemors;
	public static final Fluid CANEMORS = new FluidBaseTFC("canemors").setBaseColor(0xE0EFE1);
	public static Item applemors;
	public static final Fluid APPLEMORS = new FluidBaseTFC("applemors").setBaseColor(0xF1E3AD);
	public static Item orangemors;
	public static final Fluid ORANGEMORS = new FluidBaseTFC("orangemors").setBaseColor(0xF1D599);
	public static Item lemonmors;
	public static final Fluid LEMONMORS = new FluidBaseTFC("lemonmors").setBaseColor(0xFFFFCD);
	public static Item cherrymors;
	public static final Fluid CHERRYMORS = new FluidBaseTFC("cherrymors").setBaseColor(0xF1ADC4);
	public static Item plummors;
	public static final Fluid PLUMMORS = new FluidBaseTFC("plummors").setBaseColor(0xF1E3E8);
	public static Item peachmors;
	public static final Fluid PEACHMORS = new FluidBaseTFC("peachmors").setBaseColor(0xF1DAD3);
	public static Item datemors;
	public static final Fluid DATEMORS = new FluidBaseTFC("datemors").setBaseColor(0xDCC1CB);
	public static Item papayamors;
	public static final Fluid PAPAYAMORS = new FluidBaseTFC("papayamors").setBaseColor(0xECFFB6);
	public static Item figmors;
	public static final Fluid FIGMORS = new FluidBaseTFC("figmors").setBaseColor(0xFFAFC4);
	public static Item berrymors;
	public static final Fluid BERRYMORS = new FluidBaseTFC("berrymors").setBaseColor(0xECCADB);
	
	//Kissels
	public static Item kissel;
	public static Item kisselbowl;
	public static final Fluid KISSEL = new FluidBaseTFC("kissel").setBaseColor(0xede7d4);
	public static Item fruitkissel;
	public static Item fruitkisselbowl;
	public static final Fluid FRUITKISSEL = new FluidBaseTFC("fruitkissel").setBaseColor(0xc9b47d);
	public static Item berrykissel;
	public static Item berrykisselbowl;
	public static final Fluid BERRYKISSEL = new FluidBaseTFC("berrykissel").setBaseColor(0x983d3c);
	
	public static void setup()
	{
		kvass = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Grain).setCalories(0.25f).setWaterRestoreRatio(1.5f).setHeatProtection(600).setColdProtection(0).setUnlocalizedName("Kvass").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) kvass);
		sbiten = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Fruit).setCalories(0.500f).setWaterRestoreRatio(0.500f).setHeatProtection(150).setColdProtection(900).setUnlocalizedName("Sbiten").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) sbiten);
		syrup = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Fruit).setCalories(1f).setWaterRestoreRatio(0.15f).setHeatProtection(0).setColdProtection(300).setUnlocalizedName("Syrup").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) syrup);
		tarhun = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Vegetable).setCalories(0.1f).setWaterRestoreRatio(1.5f).setHeatProtection(300).setColdProtection(0).setUnlocalizedName("Tarhun").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) tarhun);
		gogolmogol = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Protein).setCalories(1f).setWaterRestoreRatio(0.25f).setHeatProtection(0).setColdProtection(300).setUnlocalizedName("Gogol-Mogol").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) gogolmogol);
		gogolmogolbowl = new ProperItemDrink(500, 3).setFoodGroup(EnumFoodGroup.Protein).setCalories(1f).setWaterRestoreRatio(0.25f).setHeatProtection(0).setColdProtection(300).setUnlocalizedName("Bowl of Gogol-Mogol").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) gogolmogolbowl);
		
		//Teas
		tea = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Vegetable).setCalories(0.1f).setWaterRestoreRatio(1f).setHeatProtection(300).setColdProtection(300).setUnlocalizedName("Tea").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) tea);
		kombucha = new ItemTerra().setWeight(EnumWeight.LIGHT).setSize(EnumSize.SMALL).setUnlocalizedName("Kombucha").setTextureName("Kombucha");
		dyingkombucha = new ItemTerra().setWeight(EnumWeight.LIGHT).setSize(EnumSize.SMALL).setUnlocalizedName("Dying Kombucha").setTextureName("Dying Kombucha");
		teamushroom = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Grain).setCalories(0.25f).setWaterRestoreRatio(0.750f).setHeatProtection(600).setColdProtection(600).setUnlocalizedName("Tea Mushroom").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) teamushroom);
		appletea = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Vegetable).setCalories(0.2f).setWaterRestoreRatio(1.250f).setHeatProtection(450).setColdProtection(450).setUnlocalizedName("Apple Tea").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) appletea);
		lemontea = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Vegetable).setCalories(0.2f).setWaterRestoreRatio(1.250f).setHeatProtection(450).setColdProtection(450).setUnlocalizedName("Lemon Tea").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) lemontea);
		cherrytea = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Vegetable).setCalories(0.2f).setWaterRestoreRatio(1.250f).setHeatProtection(450).setColdProtection(450).setUnlocalizedName("Cherry Tea").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) cherrytea);
		blueberrytea = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Vegetable).setCalories(0.2f).setWaterRestoreRatio(1.250f).setHeatProtection(450).setColdProtection(450).setUnlocalizedName("Blueberry Tea").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) blueberrytea);
		raspberrytea = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Vegetable).setCalories(0.2f).setWaterRestoreRatio(1.250f).setHeatProtection(450).setColdProtection(450).setUnlocalizedName("Raspberry Tea").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) raspberrytea);
		strawberrytea = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Vegetable).setCalories(0.2f).setWaterRestoreRatio(1.250f).setHeatProtection(450).setColdProtection(450).setUnlocalizedName("Strawberry Tea").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) strawberrytea);
		blackberrytea = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Vegetable).setCalories(0.2f).setWaterRestoreRatio(1.250f).setHeatProtection(450).setColdProtection(450).setUnlocalizedName("Blackberry Tea").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) blackberrytea);
		cranberrytea = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Vegetable).setCalories(0.2f).setWaterRestoreRatio(1.250f).setHeatProtection(450).setColdProtection(450).setUnlocalizedName("Cranberry Tea").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) cranberrytea);
		gooseberrytea = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Vegetable).setCalories(0.2f).setWaterRestoreRatio(1.250f).setHeatProtection(450).setColdProtection(450).setUnlocalizedName("Gooseberry Tea").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) gooseberrytea);
		
		//Compotes
		applecompote = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Fruit).setCalories(0.750f).setWaterRestoreRatio(1.5f).setHeatProtection(400).setColdProtection(0).setUnlocalizedName("Apple Compote").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) applecompote);
		plumcompote = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Fruit).setCalories(0.750f).setWaterRestoreRatio(1.5f).setHeatProtection(400).setColdProtection(0).setUnlocalizedName("Plum Compote").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) plumcompote);
		strawberrycompote = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Fruit).setCalories(0.750f).setWaterRestoreRatio(1.5f).setHeatProtection(400).setColdProtection(0).setUnlocalizedName("Strawberry Compote").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) strawberrycompote);
		gooseberrycompote = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Fruit).setCalories(0.750f).setWaterRestoreRatio(1.5f).setHeatProtection(400).setColdProtection(0).setUnlocalizedName("Gooseberry Compote").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) gooseberrycompote);
		blueberrycompote = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Fruit).setCalories(0.750f).setWaterRestoreRatio(1.5f).setHeatProtection(400).setColdProtection(0).setUnlocalizedName("Blueberry Compote").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) blueberrycompote);
		raspberrycompote = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Fruit).setCalories(0.750f).setWaterRestoreRatio(1.5f).setHeatProtection(400).setColdProtection(0).setUnlocalizedName("Raspberry Compote").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) raspberrycompote);
		
		//Morses
		grapemors = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Fruit).setCalories(0.750f).setWaterRestoreRatio(1f).setHeatProtection(1200).setColdProtection(0).setUnlocalizedName("Grape Mors").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) grapemors);
		agavemors = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Fruit).setCalories(0.750f).setWaterRestoreRatio(1f).setHeatProtection(1200).setColdProtection(0).setUnlocalizedName("Agave Mors").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) agavemors);
		canemors = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Fruit).setCalories(0.750f).setWaterRestoreRatio(1f).setHeatProtection(1200).setColdProtection(0).setUnlocalizedName("Cane Mors").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) canemors);
		applemors = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Fruit).setCalories(0.750f).setWaterRestoreRatio(1f).setHeatProtection(1200).setColdProtection(0).setUnlocalizedName("Apple Mors").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) applemors);
		orangemors = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Fruit).setCalories(0.750f).setWaterRestoreRatio(1f).setHeatProtection(1200).setColdProtection(0).setUnlocalizedName("Orange Mors").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) orangemors);
		lemonmors = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Fruit).setCalories(0.750f).setWaterRestoreRatio(1f).setHeatProtection(1200).setColdProtection(0).setUnlocalizedName("Lemon Mors").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) lemonmors);
		cherrymors = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Fruit).setCalories(0.750f).setWaterRestoreRatio(1f).setHeatProtection(1200).setColdProtection(0).setUnlocalizedName("Cherry Mors").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) cherrymors);
		plummors = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Fruit).setCalories(0.750f).setWaterRestoreRatio(1f).setHeatProtection(1200).setColdProtection(0).setUnlocalizedName("Plum Mors").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) plummors);
		peachmors = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Fruit).setCalories(0.750f).setWaterRestoreRatio(1f).setHeatProtection(1200).setColdProtection(0).setUnlocalizedName("Peach Mors").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) peachmors);
		datemors = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Fruit).setCalories(0.750f).setWaterRestoreRatio(1f).setHeatProtection(1200).setColdProtection(0).setUnlocalizedName("Date Mors").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) datemors);
		papayamors = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Fruit).setCalories(0.750f).setWaterRestoreRatio(1f).setHeatProtection(1200).setColdProtection(0).setUnlocalizedName("Papaya Mors").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) papayamors);
		figmors = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Fruit).setCalories(0.750f).setWaterRestoreRatio(1f).setHeatProtection(1200).setColdProtection(0).setUnlocalizedName("Fig Mors").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) figmors);
		berrymors = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Fruit).setCalories(0.750f).setWaterRestoreRatio(1f).setHeatProtection(1200).setColdProtection(0).setUnlocalizedName("Berry Mors").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) berrymors);
		
		//Kisels
		kissel = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Fruit).setCalories(1.500f).setWaterRestoreRatio(0.750f).setHeatProtection(0).setColdProtection(800).setUnlocalizedName("Kissel").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) kissel);
		kisselbowl = new ProperItemDrink(500, 3).setFoodGroup(EnumFoodGroup.Fruit).setCalories(1.500f).setWaterRestoreRatio(0.750f).setHeatProtection(0).setColdProtection(800).setUnlocalizedName("Kissel Bowl").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) kisselbowl);
		fruitkissel = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Fruit).setCalories(1.750f).setWaterRestoreRatio(0.750f).setHeatProtection(0).setColdProtection(1200).setUnlocalizedName("Fruit Kissel").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) fruitkissel);
		fruitkisselbowl = new ProperItemDrink(500, 3).setFoodGroup(EnumFoodGroup.Fruit).setCalories(1.750f).setWaterRestoreRatio(0.750f).setHeatProtection(0).setColdProtection(1200).setUnlocalizedName("Fruit Kissel Bowl").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) fruitkisselbowl);
		berrykissel = new ProperItemDrink(1000).setFoodGroup(EnumFoodGroup.Fruit).setCalories(1.750f).setWaterRestoreRatio(0.750f).setHeatProtection(0).setColdProtection(1200).setUnlocalizedName("Berry Kissel").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) berrykissel);
		berrykisselbowl = new ProperItemDrink(500, 3).setFoodGroup(EnumFoodGroup.Fruit).setCalories(1.750f).setWaterRestoreRatio(0.750f).setHeatProtection(0).setColdProtection(1200).setUnlocalizedName("Berry Kissel Bowl").setCreativeTab(TFCTabs.TFC_FOODS);
		drinks.add((ProperItemDrink) berrykisselbowl);
	}
	
	public static void setuprecipes()
	{
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.ryeBread), 30), new FluidStack(TFCFluids.FRESHWATER, 500), null, new FluidStack(UNCOOKEDKVASS, 500), 300, 50));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.sugar), 30), new FluidStack(UNCOOKEDKVASS, 500), null, new FluidStack(KVASS, 500), 1200, 600));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(new ItemStack(TFCItems.woadLeaves, 5, 0), new FluidStack(TFCFluids.HONEY, 500), null, new FluidStack(SBITEN, 500), 0, 100));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.sugar), 60), new FluidStack(TFCFluids.FRESHWATER, 500), null, new FluidStack(SYRUP, 500), 0, 300));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(new ItemStack(TFCItems.woadLeaves, 5, 0), new FluidStack(SYRUP, 500), null, new FluidStack(TARHUN, 500), 300, 50));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(gogolmogolbowl), new ItemStack(TFCItems.potteryBowl, 1, 1), ItemFoodTFC.createTag(new ItemStack(TFCItems.egg), 20), ItemFoodTFC.createTag(new ItemStack(TFCItems.sugar), 20)));
		
		//Teas
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(new ItemStack(TFCItems.woadLeaves, 5, 0), new FluidStack(TFCFluids.FRESHWATER, 500), null, new FluidStack(TEA, 500), 0, 100));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.sugar), 180), new FluidStack(TEA, 5000), new ItemStack(dyingkombucha, 1, 0), new FluidStack(TEAMUSHROOM, 5000)).setMinTechLevel(0).setSealedRecipe(true).setRemovesLiquid(false).setSealTime(4800));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(kombucha, 1, 0), new FluidStack(TFCFluids.FRESHWATER, 5000), new ItemStack(dyingkombucha, 1, 0), new FluidStack(TEAMUSHROOM, 5000)).setMinTechLevel(0).setSealedRecipe(true).setRemovesLiquid(false).setSealTime(240));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(dyingkombucha, 1, 0), new FluidStack(TFCFluids.FRESHWATER, 5000), null, new FluidStack(TEAMUSHROOM, 5000)).setMinTechLevel(0).setSealedRecipe(true).setRemovesLiquid(false).setSealTime(240));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(dyingkombucha, 1, 0), new FluidStack(SYRUP, 500), new ItemStack(kombucha, 1, 0), new FluidStack(TFCFluids.FRESHWATER, 500)).setMinTechLevel(0).setSealedRecipe(true).setRemovesLiquid(true).setSealTime(60));
		BarrelManager.getInstance().addRecipe(new BarrelRecipe(new ItemStack(kombucha, 1, 0), new FluidStack(SYRUP, 2500), new ItemStack(kombucha, 2, 0), new FluidStack(TFCFluids.FRESHWATER, 2500)).setMinTechLevel(0).setSealedRecipe(true).setRemovesLiquid(true).setSealTime(120));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.greenApple), 30), new FluidStack(TEA, 500), null, new FluidStack(APPLETEA, 500), 0, 100));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.redApple), 30), new FluidStack(TEA, 500), null, new FluidStack(APPLETEA, 500), 0, 100));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.lemon), 30), new FluidStack(TEA, 500), null, new FluidStack(LEMONTEA, 500), 0, 100));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.cherry), 30), new FluidStack(TEA, 500), null, new FluidStack(CHERRYTEA, 500), 0, 100));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.blueberry), 30), new FluidStack(TEA, 500), null, new FluidStack(BLUEBERRYTEA, 500), 0, 100));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.raspberry), 30), new FluidStack(TEA, 500), null, new FluidStack(RASPBERRYTEA, 500), 0, 100));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.strawberry), 30), new FluidStack(TEA, 500), null, new FluidStack(STRAWBERRYTEA, 500), 0, 100));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.blackberry), 30), new FluidStack(TEA, 500), null, new FluidStack(BLACKBERRYTEA, 500), 0, 100));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.cranberry), 30), new FluidStack(TEA, 500), null, new FluidStack(CRANBERRYTEA, 500), 0, 100));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.gooseberry), 30), new FluidStack(TEA, 500), null, new FluidStack(GOOSEBERRYTEA, 500), 0, 100));
		
		//Compotes
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.greenApple), 30), new FluidStack(SYRUP, 500), null, new FluidStack(APPLECOMPOTE, 500), 0, 500));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.redApple), 30), new FluidStack(SYRUP, 500), null, new FluidStack(APPLECOMPOTE, 500), 0, 500));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.plum), 30), new FluidStack(SYRUP, 500), null, new FluidStack(PLUMCOMPOTE, 500), 0, 500));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.strawberry), 30), new FluidStack(SYRUP, 500), null, new FluidStack(STRAWBERRYCOMPOTE, 500), 0, 500));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.gooseberry), 30), new FluidStack(SYRUP, 500), null, new FluidStack(GOOSEBERRYCOMPOTE, 500), 0, 500));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.blueberry), 30), new FluidStack(SYRUP, 500), null, new FluidStack(BLUEBERRYCOMPOTE, 500), 0, 500));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.raspberry), 30), new FluidStack(SYRUP, 500), null, new FluidStack(RASPBERRYCOMPOTE, 500), 0, 500));
		
		//Morses
		BarrelManager.getInstance()
		.addRecipe(new BarrelLiquidToLiquidRecipe(new FluidStack(TFCFluids.GRAPEJUICE, 500), new FluidStack(SYRUP, 500), new FluidStack(GRAPEMORS, 1000))
		.setSealTime(240).setSealedRecipe(false).setMinTechLevel(0).setRemovesLiquid(false));
		BarrelManager.getInstance()
		.addRecipe(new BarrelLiquidToLiquidRecipe(new FluidStack(TFCFluids.AGAVEJUICE, 500), new FluidStack(SYRUP, 500), new FluidStack(AGAVEMORS, 1000))
		.setSealTime(240).setSealedRecipe(false).setMinTechLevel(0).setRemovesLiquid(false));
		BarrelManager.getInstance()
		.addRecipe(new BarrelLiquidToLiquidRecipe(new FluidStack(TFCFluids.CANEJUICE, 500), new FluidStack(SYRUP, 500), new FluidStack(CANEMORS, 1000))
		.setSealTime(240).setSealedRecipe(false).setMinTechLevel(0).setRemovesLiquid(false));
		BarrelManager.getInstance()
		.addRecipe(new BarrelLiquidToLiquidRecipe(new FluidStack(TFCFluids.APPLEJUICE, 500), new FluidStack(SYRUP, 500), new FluidStack(APPLEMORS, 1000))
		.setSealTime(240).setSealedRecipe(false).setMinTechLevel(0).setRemovesLiquid(false));
		BarrelManager.getInstance()
		.addRecipe(new BarrelLiquidToLiquidRecipe(new FluidStack(TFCFluids.ORANGEJUICE, 500), new FluidStack(SYRUP, 500), new FluidStack(ORANGEMORS, 1000))
		.setSealTime(240).setSealedRecipe(false).setMinTechLevel(0).setRemovesLiquid(false));
		BarrelManager.getInstance()
		.addRecipe(new BarrelLiquidToLiquidRecipe(new FluidStack(TFCFluids.LEMONJUICE, 500), new FluidStack(SYRUP, 500), new FluidStack(LEMONMORS, 1000))
		.setSealTime(240).setSealedRecipe(false).setMinTechLevel(0).setRemovesLiquid(false));
		BarrelManager.getInstance()
		.addRecipe(new BarrelLiquidToLiquidRecipe(new FluidStack(TFCFluids.CHERRYJUICE, 500), new FluidStack(SYRUP, 500), new FluidStack(CHERRYMORS, 1000))
		.setSealTime(240).setSealedRecipe(false).setMinTechLevel(0).setRemovesLiquid(false));
		BarrelManager.getInstance()
		.addRecipe(new BarrelLiquidToLiquidRecipe(new FluidStack(TFCFluids.PLUMJUICE, 500), new FluidStack(SYRUP, 500), new FluidStack(PLUMMORS, 1000))
		.setSealTime(240).setSealedRecipe(false).setMinTechLevel(0).setRemovesLiquid(false));
		BarrelManager.getInstance()
		.addRecipe(new BarrelLiquidToLiquidRecipe(new FluidStack(TFCFluids.PEACHJUICE, 500), new FluidStack(SYRUP, 500), new FluidStack(PEACHMORS, 1000))
		.setSealTime(240).setSealedRecipe(false).setMinTechLevel(0).setRemovesLiquid(false));
		BarrelManager.getInstance()
		.addRecipe(new BarrelLiquidToLiquidRecipe(new FluidStack(TFCFluids.DATEJUICE, 500), new FluidStack(SYRUP, 500), new FluidStack(DATEMORS, 1000))
		.setSealTime(240).setSealedRecipe(false).setMinTechLevel(0).setRemovesLiquid(false));
		BarrelManager.getInstance()
		.addRecipe(new BarrelLiquidToLiquidRecipe(new FluidStack(TFCFluids.PAPAYAJUICE, 500), new FluidStack(SYRUP, 500), new FluidStack(PAPAYAMORS, 1000))
		.setSealTime(240).setSealedRecipe(false).setMinTechLevel(0).setRemovesLiquid(false));
		BarrelManager.getInstance()
		.addRecipe(new BarrelLiquidToLiquidRecipe(new FluidStack(TFCFluids.FIGJUICE, 500), new FluidStack(SYRUP, 500), new FluidStack(FIGMORS, 1000))
		.setSealTime(240).setSealedRecipe(false).setMinTechLevel(0).setRemovesLiquid(false));
		BarrelManager.getInstance()
		.addRecipe(new BarrelLiquidToLiquidRecipe(new FluidStack(TFCFluids.BERRYJUICE, 500), new FluidStack(SYRUP, 500), new FluidStack(BERRYMORS, 1000))
		.setSealTime(240).setSealedRecipe(false).setMinTechLevel(0).setRemovesLiquid(false));
		
		//Kissels
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.ryeGround), 30), new FluidStack(SYRUP, 500), null, new FluidStack(KISSEL, 500), 300, 500));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.barleyGround), 30), new FluidStack(SYRUP, 500), null, new FluidStack(KISSEL, 500), 300, 500));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.cornmealGround), 30), new FluidStack(SYRUP, 500), null, new FluidStack(KISSEL, 500), 300, 500));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.oatGround), 30), new FluidStack(SYRUP, 500), null, new FluidStack(KISSEL, 500), 300, 500));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.riceGround), 30), new FluidStack(SYRUP, 500), null, new FluidStack(KISSEL, 500), 300, 500));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.wheatGround), 30), new FluidStack(SYRUP, 500), null, new FluidStack(KISSEL, 500), 300, 500));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.greenApple), 30), new FluidStack(KISSEL, 500), null, new FluidStack(FRUITKISSEL, 500), 300, 50));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.redApple), 30), new FluidStack(KISSEL, 500), null, new FluidStack(FRUITKISSEL, 500), 300, 50));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.plum), 30), new FluidStack(KISSEL, 500), null, new FluidStack(FRUITKISSEL, 500), 300, 50));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.peach), 30), new FluidStack(KISSEL, 500), null, new FluidStack(FRUITKISSEL, 500), 300, 00));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.lemon), 30), new FluidStack(KISSEL, 500), null, new FluidStack(FRUITKISSEL, 500), 300, 50));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.orange), 30), new FluidStack(KISSEL, 500), null, new FluidStack(FRUITKISSEL, 500), 300, 50));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.cherry), 30), new FluidStack(KISSEL, 500), null, new FluidStack(FRUITKISSEL, 500), 300, 50));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.banana), 30), new FluidStack(KISSEL, 500), null, new FluidStack(FRUITKISSEL, 500), 300, 50));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.fig), 30), new FluidStack(KISSEL, 500), null, new FluidStack(FRUITKISSEL, 500), 300, 50));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.papaya), 30), new FluidStack(KISSEL, 500), null, new FluidStack(FRUITKISSEL, 500), 300, 50));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.date), 30), new FluidStack(KISSEL, 500), null, new FluidStack(FRUITKISSEL, 500), 300, 50));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.blackberry), 30), new FluidStack(KISSEL, 500), null, new FluidStack(BERRYKISSEL, 500), 300, 50));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.blueberry), 30), new FluidStack(KISSEL, 500), null, new FluidStack(BERRYKISSEL, 500), 300, 50));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.bunchberry), 30), new FluidStack(KISSEL, 500), null, new FluidStack(BERRYKISSEL, 500), 300, 50));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.cloudberry), 30), new FluidStack(KISSEL, 500), null, new FluidStack(BERRYKISSEL, 500), 300, 50));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.cranberry), 30), new FluidStack(KISSEL, 500), null, new FluidStack(BERRYKISSEL, 500), 300, 50));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.elderberry), 30), new FluidStack(KISSEL, 500), null, new FluidStack(BERRYKISSEL, 500), 300, 50));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.gooseberry), 30), new FluidStack(KISSEL, 500), null, new FluidStack(BERRYKISSEL, 500), 300, 50));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.raspberry), 30), new FluidStack(KISSEL, 500), null, new FluidStack(BERRYKISSEL, 500), 300, 50));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.snowberry), 30), new FluidStack(KISSEL, 500), null, new FluidStack(BERRYKISSEL, 500), 300, 50));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.strawberry), 30), new FluidStack(KISSEL, 500), null, new FluidStack(BERRYKISSEL, 500), 300, 50));
		BarrelManager.getInstance().addRecipe(new ProperBarrelFireRecipe(ItemFoodTFC.createTag(new ItemStack(TFCItems.melonSlice), 30), new FluidStack(KISSEL, 500), null, new FluidStack(BERRYKISSEL, 500), 300, 50));
	}
}