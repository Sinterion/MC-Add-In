package net.minecraft.src;

public class RecipesCrafting
{
    /**
     * Adds the crafting recipes to the CraftingManager.
     */
    public void addRecipes(CraftingManager par1CraftingManager)
    {
        par1CraftingManager.func_92103_a(new ItemStack(Block.chest), new Object[] {"###", "# #", "###", '#', Block.planks});
        par1CraftingManager.func_92103_a(new ItemStack(Block.chestTrapped), new Object[] {"#-", '#', Block.chest, '-', Block.tripWireSource});
        par1CraftingManager.func_92103_a(new ItemStack(Block.enderChest), new Object[] {"###", "#E#", "###", '#', Block.obsidian, 'E', Item.eyeOfEnder});
        par1CraftingManager.func_92103_a(new ItemStack(Block.furnaceIdle), new Object[] {"###", "# #", "###", '#', Block.cobblestone});
        par1CraftingManager.func_92103_a(new ItemStack(Block.workbench), new Object[] {"##", "##", '#', Block.planks});
        par1CraftingManager.func_92103_a(new ItemStack(Block.sandStone), new Object[] {"##", "##", '#', Block.sand});
        par1CraftingManager.func_92103_a(new ItemStack(Block.sandStone, 4, 2), new Object[] {"##", "##", '#', Block.sandStone});
        par1CraftingManager.func_92103_a(new ItemStack(Block.sandStone, 1, 1), new Object[] {"#", "#", '#', new ItemStack(Block.stoneSingleSlab, 1, 1)});
        par1CraftingManager.func_92103_a(new ItemStack(Block.blockNetherQuartz, 1, 1), new Object[] {"#", "#", '#', new ItemStack(Block.stoneSingleSlab, 1, 7)});
        par1CraftingManager.func_92103_a(new ItemStack(Block.blockNetherQuartz, 2, 2), new Object[] {"#", "#", '#', new ItemStack(Block.blockNetherQuartz, 1, 0)});
        par1CraftingManager.func_92103_a(new ItemStack(Block.stoneBrick, 4), new Object[] {"##", "##", '#', Block.stone});
        par1CraftingManager.func_92103_a(new ItemStack(Block.fenceIron, 16), new Object[] {"###", "###", '#', Item.ingotIron});
        par1CraftingManager.func_92103_a(new ItemStack(Block.thinGlass, 16), new Object[] {"###", "###", '#', Block.glass});
        par1CraftingManager.func_92103_a(new ItemStack(Block.redstoneLampIdle, 1), new Object[] {" R ", "RGR", " R ", 'R', Item.redstone, 'G', Block.glowStone});
        par1CraftingManager.func_92103_a(new ItemStack(Block.beacon, 1), new Object[] {"GGG", "GSG", "OOO", 'G', Block.glass, 'S', Item.netherStar, 'O', Block.obsidian});
        par1CraftingManager.func_92103_a(new ItemStack(Block.mobSpawner, 1), new Object[] {"GGG", "GSG", "GGG", 'G', Block.glass, 'S', Block.blockSteel});
        par1CraftingManager.func_92103_a(new ItemStack(Block.netherBrick, 1), new Object[] {"NN", "NN", 'N', Item.field_94584_bZ});
    }
}
