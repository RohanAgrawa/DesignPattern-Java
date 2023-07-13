public class ChocolteSyrup  implements IcreamIngredients{

    IcreamIngredients ig;

    public ChocolteSyrup(IcreamIngredients ig)
    {
        this.ig = ig;
    }


    @Override
    public double getCost() {

        return ig.getCost() + 50;
    }

    @Override
    public String getDescription() {

        return ig.getDescription() + " , " + "Chocolate Syrup";
    }
}
