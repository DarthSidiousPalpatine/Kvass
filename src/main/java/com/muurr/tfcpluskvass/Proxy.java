package com.muurr.tfcpluskvass;

import com.dunk.tfc.api.TFCItems;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

public class Proxy {
	public void registerItems()
	{
		GameRegistry.registerItem(ItemSetup.kvass, ItemSetup.kvass.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.sbiten, ItemSetup.sbiten.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.syrup, ItemSetup.syrup.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.tarhun, ItemSetup.tarhun.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.gogolmogol, ItemSetup.gogolmogol.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.gogolmogolbowl, ItemSetup.gogolmogolbowl.getUnlocalizedName());
		
		//Teas
		GameRegistry.registerItem(ItemSetup.tea, ItemSetup.tea.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.kombucha, ItemSetup.kombucha.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.dyingkombucha, ItemSetup.dyingkombucha.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.teamushroom, ItemSetup.teamushroom.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.appletea, ItemSetup.appletea.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.lemontea, ItemSetup.lemontea.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.cherrytea, ItemSetup.cherrytea.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.blueberrytea, ItemSetup.blueberrytea.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.raspberrytea, ItemSetup.raspberrytea.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.strawberrytea, ItemSetup.strawberrytea.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.blackberrytea, ItemSetup.blackberrytea.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.cranberrytea, ItemSetup.cranberrytea.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.gooseberrytea, ItemSetup.gooseberrytea.getUnlocalizedName());
		
		//Compotes
		GameRegistry.registerItem(ItemSetup.applecompote, ItemSetup.applecompote.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.plumcompote, ItemSetup.plumcompote.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.strawberrycompote, ItemSetup.strawberrycompote.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.gooseberrycompote, ItemSetup.gooseberrycompote.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.blueberrycompote, ItemSetup.blueberrycompote.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.raspberrycompote, ItemSetup.raspberrycompote.getUnlocalizedName());

		//Morses
		GameRegistry.registerItem(ItemSetup.grapemors, ItemSetup.grapemors.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.agavemors, ItemSetup.agavemors.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.canemors, ItemSetup.canemors.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.applemors, ItemSetup.applemors.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.orangemors, ItemSetup.orangemors.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.lemonmors, ItemSetup.lemonmors.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.cherrymors, ItemSetup.cherrymors.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.plummors, ItemSetup.plummors.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.peachmors, ItemSetup.peachmors.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.datemors, ItemSetup.datemors.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.papayamors, ItemSetup.papayamors.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.figmors, ItemSetup.figmors.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.berrymors, ItemSetup.berrymors.getUnlocalizedName());

		//Kissels
		GameRegistry.registerItem(ItemSetup.kissel, ItemSetup.kissel.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.kisselbowl, ItemSetup.kisselbowl.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.fruitkissel, ItemSetup.fruitkissel.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.fruitkisselbowl, ItemSetup.fruitkisselbowl.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.berrykissel, ItemSetup.berrykissel.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.berrykisselbowl, ItemSetup.berrykisselbowl.getUnlocalizedName());
	}
	
	public void registerFluids()
	{
		FluidRegistry.registerFluid(ItemSetup.KVASS);
		FluidRegistry.registerFluid(ItemSetup.UNCOOKEDKVASS);
		setupFluidDrinks(ItemSetup.KVASS, 1000, ItemSetup.kvass, TFCItems.glassBottle);
		FluidRegistry.registerFluid(ItemSetup.SBITEN);
		setupFluidDrinks(ItemSetup.SBITEN, 1000, ItemSetup.sbiten, TFCItems.glassBottle);
		FluidRegistry.registerFluid(ItemSetup.SYRUP);
		setupFluidDrinks(ItemSetup.SYRUP, 1000, ItemSetup.syrup, TFCItems.glassBottle);
		FluidRegistry.registerFluid(ItemSetup.TARHUN);
		setupFluidDrinks(ItemSetup.TARHUN, 1000, ItemSetup.tarhun, TFCItems.glassBottle);
		FluidRegistry.registerFluid(ItemSetup.GOGOLMOGOL);
		setupFluidDrinks(ItemSetup.GOGOLMOGOL, 1000, ItemSetup.gogolmogol, TFCItems.glassBottle);
		setupFluidDrinks(ItemSetup.GOGOLMOGOL, 500, ItemSetup.gogolmogolbowl, 0, TFCItems.potteryBowl, 1);
		
		//Teas
		FluidRegistry.registerFluid(ItemSetup.TEA);
		setupFluidDrinks(ItemSetup.TEA, 1000, ItemSetup.kvass, TFCItems.glassBottle);
		FluidRegistry.registerFluid(ItemSetup.TEAMUSHROOM);
		setupFluidDrinks(ItemSetup.TEAMUSHROOM, 1000, ItemSetup.teamushroom, TFCItems.glassBottle);
		FluidRegistry.registerFluid(ItemSetup.APPLETEA);
		setupFluidDrinks(ItemSetup.APPLETEA, 1000, ItemSetup.appletea, TFCItems.glassBottle);
		FluidRegistry.registerFluid(ItemSetup.LEMONTEA);
		setupFluidDrinks(ItemSetup.LEMONTEA, 1000, ItemSetup.lemontea, TFCItems.glassBottle);
		FluidRegistry.registerFluid(ItemSetup.CHERRYTEA);
		setupFluidDrinks(ItemSetup.CHERRYTEA, 1000, ItemSetup.cherrytea, TFCItems.glassBottle);
		FluidRegistry.registerFluid(ItemSetup.BLUEBERRYTEA);
		setupFluidDrinks(ItemSetup.BLUEBERRYTEA, 1000, ItemSetup.blueberrytea, TFCItems.glassBottle);
		FluidRegistry.registerFluid(ItemSetup.RASPBERRYTEA);
		setupFluidDrinks(ItemSetup.RASPBERRYTEA, 1000, ItemSetup.raspberrytea, TFCItems.glassBottle);
		FluidRegistry.registerFluid(ItemSetup.STRAWBERRYTEA);
		setupFluidDrinks(ItemSetup.STRAWBERRYTEA, 1000, ItemSetup.strawberrytea, TFCItems.glassBottle);
		FluidRegistry.registerFluid(ItemSetup.BLACKBERRYTEA);
		setupFluidDrinks(ItemSetup.BLACKBERRYTEA, 1000, ItemSetup.blackberrytea, TFCItems.glassBottle);
		FluidRegistry.registerFluid(ItemSetup.CRANBERRYTEA);
		setupFluidDrinks(ItemSetup.CRANBERRYTEA, 1000, ItemSetup.cranberrytea, TFCItems.glassBottle);
		FluidRegistry.registerFluid(ItemSetup.GOOSEBERRYTEA);
		setupFluidDrinks(ItemSetup.GOOSEBERRYTEA, 1000, ItemSetup.gooseberrytea, TFCItems.glassBottle);
		
		//Compotes
		FluidRegistry.registerFluid(ItemSetup.APPLECOMPOTE);
		setupFluidDrinks(ItemSetup.APPLECOMPOTE, 1000, ItemSetup.applecompote, TFCItems.glassBottle);
		FluidRegistry.registerFluid(ItemSetup.PLUMCOMPOTE);
		setupFluidDrinks(ItemSetup.PLUMCOMPOTE, 1000, ItemSetup.plumcompote, TFCItems.glassBottle);
		FluidRegistry.registerFluid(ItemSetup.STRAWBERRYCOMPOTE);
		setupFluidDrinks(ItemSetup.STRAWBERRYCOMPOTE, 1000, ItemSetup.strawberrycompote, TFCItems.glassBottle);
		FluidRegistry.registerFluid(ItemSetup.GOOSEBERRYCOMPOTE);
		setupFluidDrinks(ItemSetup.GOOSEBERRYCOMPOTE, 1000, ItemSetup.gooseberrycompote, TFCItems.glassBottle);
		FluidRegistry.registerFluid(ItemSetup.BLUEBERRYCOMPOTE);
		setupFluidDrinks(ItemSetup.BLUEBERRYCOMPOTE, 1000, ItemSetup.blueberrycompote, TFCItems.glassBottle);
		FluidRegistry.registerFluid(ItemSetup.RASPBERRYCOMPOTE);
		setupFluidDrinks(ItemSetup.RASPBERRYCOMPOTE, 1000, ItemSetup.raspberrycompote, TFCItems.glassBottle);

		//Morses
		FluidRegistry.registerFluid(ItemSetup.GRAPEMORS);
		setupFluidDrinks(ItemSetup.GRAPEMORS, 1000, ItemSetup.grapemors, TFCItems.glassBottle);
		FluidRegistry.registerFluid(ItemSetup.AGAVEMORS);
		setupFluidDrinks(ItemSetup.AGAVEMORS, 1000, ItemSetup.agavemors, TFCItems.glassBottle);
		FluidRegistry.registerFluid(ItemSetup.CANEMORS);
		setupFluidDrinks(ItemSetup.CANEMORS, 1000, ItemSetup.canemors, TFCItems.glassBottle);
		FluidRegistry.registerFluid(ItemSetup.APPLEMORS);
		setupFluidDrinks(ItemSetup.APPLEMORS, 1000, ItemSetup.applemors, TFCItems.glassBottle);
		FluidRegistry.registerFluid(ItemSetup.ORANGEMORS);
		setupFluidDrinks(ItemSetup.ORANGEMORS, 1000, ItemSetup.orangemors, TFCItems.glassBottle);
		FluidRegistry.registerFluid(ItemSetup.LEMONMORS);
		setupFluidDrinks(ItemSetup.LEMONMORS, 1000, ItemSetup.lemonmors, TFCItems.glassBottle);
		FluidRegistry.registerFluid(ItemSetup.CHERRYMORS);
		setupFluidDrinks(ItemSetup.CHERRYMORS, 1000, ItemSetup.cherrymors, TFCItems.glassBottle);
		FluidRegistry.registerFluid(ItemSetup.PLUMMORS);
		setupFluidDrinks(ItemSetup.PLUMMORS, 1000, ItemSetup.plummors, TFCItems.glassBottle);
		FluidRegistry.registerFluid(ItemSetup.PEACHMORS);
		setupFluidDrinks(ItemSetup.PEACHMORS, 1000, ItemSetup.peachmors, TFCItems.glassBottle);
		FluidRegistry.registerFluid(ItemSetup.DATEMORS);
		setupFluidDrinks(ItemSetup.DATEMORS, 1000, ItemSetup.datemors, TFCItems.glassBottle);
		FluidRegistry.registerFluid(ItemSetup.PAPAYAMORS);
		setupFluidDrinks(ItemSetup.PAPAYAMORS, 1000, ItemSetup.papayamors, TFCItems.glassBottle);
		FluidRegistry.registerFluid(ItemSetup.FIGMORS);
		setupFluidDrinks(ItemSetup.FIGMORS, 1000, ItemSetup.figmors, TFCItems.glassBottle);
		FluidRegistry.registerFluid(ItemSetup.BERRYMORS);
		setupFluidDrinks(ItemSetup.BERRYMORS, 1000, ItemSetup.berrymors, TFCItems.glassBottle);

		//Kissels
		FluidRegistry.registerFluid(ItemSetup.KISSEL);
		setupFluidDrinks(ItemSetup.KISSEL, 1000, ItemSetup.kissel, TFCItems.glassBottle);
		setupFluidDrinks(ItemSetup.KISSEL, 500, ItemSetup.kisselbowl, 0, TFCItems.potteryBowl, 1);
		FluidRegistry.registerFluid(ItemSetup.FRUITKISSEL);
		setupFluidDrinks(ItemSetup.FRUITKISSEL, 1000, ItemSetup.fruitkissel, TFCItems.glassBottle);
		setupFluidDrinks(ItemSetup.FRUITKISSEL, 500, ItemSetup.fruitkisselbowl, 0, TFCItems.potteryBowl, 1);
		FluidRegistry.registerFluid(ItemSetup.BERRYKISSEL);
		setupFluidDrinks(ItemSetup.BERRYKISSEL, 1000, ItemSetup.berrykissel, TFCItems.glassBottle);
		setupFluidDrinks(ItemSetup.BERRYKISSEL, 500, ItemSetup.berrykisselbowl, 0, TFCItems.potteryBowl, 1);
	}
	
	private void registerFluidContainerHelper(Fluid fluid, int baseVolume, ItemStack baseItem, ItemStack baseContainer)
	{
		FluidContainerRegistry.registerFluidContainer(new FluidStack(fluid, baseVolume),baseItem, baseContainer);
		if(TFCItems.potteryDrinks != null && TFCItems.potteryDrinks.containsKey(baseItem.getUnlocalizedName()))
		{
			if(baseContainer != null && baseItem != null && baseContainer.getItem() == baseItem.getItem())
			{
				Item potteryVersion = TFCItems.potteryDrinks.get(baseItem.getUnlocalizedName());
				FluidContainerRegistry.registerFluidContainer(new FluidStack(fluid, baseVolume), new ItemStack(potteryVersion, 1, baseItem.getItemDamage()), new ItemStack(potteryVersion,1, baseContainer.getItemDamage()));
			}
			else if (baseContainer.getItem() == TFCItems.potteryJug)
			{
				FluidContainerRegistry.registerFluidContainer(new FluidStack(fluid, baseVolume), new ItemStack(TFCItems.potteryDrinks.get(baseItem.getUnlocalizedName()), 1, baseItem.getItemDamage()), new ItemStack(TFCItems.potteryJug,1, 1));
			}
			else
			{
				FluidContainerRegistry.registerFluidContainer(new FluidStack(fluid, baseVolume), new ItemStack(TFCItems.potteryDrinks.get(baseItem.getUnlocalizedName()), 1, baseItem.getItemDamage()), new ItemStack(TFCItems.potteryBowl,1, 1));
			}
			
		}
	}

	protected void setupFluidDrinks(Fluid fluid, int mB, Item drink, Item container)
	{
		int num = mB/50;
		registerFluidContainerHelper(fluid, /*mB - (i*50)*/50, new ItemStack(drink,1,num-1), new ItemStack(container));
		for(int i = 0; i < num-1; i++)
		{
			registerFluidContainerHelper(fluid, /*mB - (i*50)*/50, new ItemStack(drink,1,i),  new ItemStack(drink,1,i+1));
		}
	}
	
	protected void setupFluidDrinks(Fluid fluid, int mB, Item drink, int minDrinkDamage, Item container, int containerDamage)
	{
		int num = mB/50;
		registerFluidContainerHelper(fluid, /*mB - (i*50)*/50, new ItemStack(drink,1,minDrinkDamage + num-1), new ItemStack(container, 1, containerDamage));
		for(int i = 0; i < num-1; i++)
		{
			registerFluidContainerHelper(fluid, /*mB - (i*50)*/50, new ItemStack(drink,1,minDrinkDamage + i),  new ItemStack(drink,1,minDrinkDamage + i+1));
		}
	}
}
