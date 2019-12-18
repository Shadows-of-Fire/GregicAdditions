package gregicadditions.machines.multi.simple;

import codechicken.lib.raytracer.CuboidRayTraceResult;
import gregicadditions.blocks.GAMetalCasing;
import gregicadditions.client.ClientHandler;
import gregicadditions.item.GAMetaBlocks;
import gregicadditions.recipes.GARecipeMaps;
import gregtech.api.metatileentity.MetaTileEntity;
import gregtech.api.metatileentity.MetaTileEntityHolder;
import gregtech.api.metatileentity.multiblock.IMultiblockPart;
import gregtech.api.metatileentity.multiblock.MultiblockAbility;
import gregtech.api.multiblock.BlockPattern;
import gregtech.api.multiblock.FactoryBlockPattern;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.render.ICubeRenderer;
import gregtech.api.render.Textures;
import gregtech.common.blocks.BlockMetalCasing;
import gregtech.common.blocks.MetaBlocks;
import gregtech.common.metatileentities.multi.electric.MetaTileEntityElectricBlastFurnace;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagInt;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.stream.IntStream;

public class TileEntityLargeMultiUse extends LargeSimpleRecipeMapMultiblockController {

	private static final MultiblockAbility<?>[] ALLOWED_ABILITIES = {MultiblockAbility.IMPORT_ITEMS, MultiblockAbility.EXPORT_ITEMS, MultiblockAbility.IMPORT_FLUIDS, MultiblockAbility.EXPORT_FLUIDS, MultiblockAbility.INPUT_ENERGY};

	public RecipeMap<?> recipeMap;

	private static RecipeMap<?>[] possibleRecipe = new RecipeMap<?>[]{
			RecipeMaps.COMPRESSOR_RECIPES,
			RecipeMaps.LATHE_RECIPES,
			RecipeMaps.POLARIZER_RECIPES,
			RecipeMaps.FERMENTING_RECIPES,
			RecipeMaps.FLUID_EXTRACTION_RECIPES,
			RecipeMaps.EXTRACTOR_RECIPES,
			RecipeMaps.LASER_ENGRAVER_RECIPES,
			RecipeMaps.AUTOCLAVE_RECIPES,
			GARecipeMaps.REPLICATOR_RECIPES
	};
	private int pos = 0;


	public TileEntityLargeMultiUse(ResourceLocation metaTileEntityId, RecipeMap<?> recipeMap) {
		super(metaTileEntityId, recipeMap, 80, 350, 100, 2);
		this.recipeMap = recipeMap;
	}

	@Override
	public MetaTileEntity createMetaTileEntity(MetaTileEntityHolder holder) {
		return new TileEntityLargeMultiUse(metaTileEntityId, RecipeMaps.COMPRESSOR_RECIPES);
	}

	@Override
	protected BlockPattern createStructurePattern() {
		return FactoryBlockPattern.start()
				.aisle("XXX", "XXX", "XXX")
				.aisle("XXX", "X#X", "XXX")
				.aisle("XXX", "XSX", "XXX")
				.setAmountAtLeast('L', 9)
				.where('S', selfPredicate())
				.where('L', statePredicate(getCasingState()))
				.where('X', statePredicate(getCasingState()).or(abilityPartPredicate(ALLOWED_ABILITIES)))
				.where('C', MetaTileEntityElectricBlastFurnace.heatingCoilPredicate())
				.where('#', isAirPredicate())
				.build();
	}

	public IBlockState getCasingState() {
		return GAMetaBlocks.METAL_CASING.getState(GAMetalCasing.MetalCasingType.STABALLOY);
	}

	@Override
	public ICubeRenderer getBaseTexture(IMultiblockPart sourcePart) {
		return ClientHandler.STABALLOY;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, boolean advanced) {
		tooltip.add(I18n.format("gregtech.multiblock.large_multi_use"));
		tooltip.add(I18n.format("gregtech.multiblock.recipe", this.recipeMap.getLocalizedName()));
	}


	@Override
	protected void addDisplayText(List<ITextComponent> textList) {
		super.addDisplayText(textList);
		textList.add(new TextComponentTranslation("gregtech.multiblock.recipe", this.recipeMap.getLocalizedName()));
	}

	@Override
	public boolean onScrewdriverClick(EntityPlayer playerIn, EnumHand hand, EnumFacing facing, CuboidRayTraceResult hitResult) {
		boolean isEmpty = IntStream.range(0, getInputInventory().getSlots())
				.mapToObj(i -> getInputInventory().getStackInSlot(i))
				.allMatch(ItemStack::isEmpty);
		if (!isEmpty) {
			return false;
		}

		pos = ++pos % possibleRecipe.length;
		((LargeSimpleMultiblockRecipeLogic) (this.recipeMapWorkable)).recipeMap = possibleRecipe[pos];
		this.recipeMap = possibleRecipe[pos];

		return true;
	}

	@Override
	public NBTTagCompound writeToNBT(NBTTagCompound data) {
		super.writeToNBT(data);
		data.setTag("Recipe", new NBTTagInt(pos));
		return data;
	}

	@Override
	public void readFromNBT(NBTTagCompound data) {
		super.readFromNBT(data);
		this.pos = data.getInteger("Recipe");
		((LargeSimpleMultiblockRecipeLogic) (this.recipeMapWorkable)).recipeMap = possibleRecipe[pos];
		this.recipeMap = possibleRecipe[pos];
	}

}
