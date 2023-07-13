public class StrawBerry_Scoop implements IcreamIngredients{

    IcreamIngredients ig;

    public StrawBerry_Scoop(IcreamIngredients ig)
    {
        this.ig = ig;
    }


    @Override
    public double getCost() {

        return ig.getCost() + 30;
    }

    @Override
    public String getDescription() {

        return ig.getDescription() + " , " + "Straw Berry Scoop";
    }
}
