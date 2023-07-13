public class OrangeCone implements IcreamIngredients{

    IcreamIngredients ig;

    public OrangeCone(IcreamIngredients ig)
    {
        this.ig = ig;
    }

    public  OrangeCone(){

    }
    @Override
    public double getCost() {
        if(ig != null)
        {
            return ig.getCost() + 10;
        }
        return 10;
    }

    @Override
    public String getDescription() {

        if(ig != null)
        {
            return ig.getDescription() + " , " + "Orange Cone";
        }

        return "Orange Cone";
    }
}
