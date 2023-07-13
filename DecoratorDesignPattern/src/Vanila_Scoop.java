public class Vanila_Scoop implements IcreamIngredients{
    IcreamIngredients ig;

    public Vanila_Scoop(IcreamIngredients ig)
    {
        this.ig = ig;
    }


    @Override
    public double getCost() {

        return ig.getCost() + 70;
    }

    @Override
    public String getDescription() {

        return ig.getDescription() + " , " + "Vanilla Scoop";
    }
}
