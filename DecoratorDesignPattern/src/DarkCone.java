public class DarkCone implements IcreamIngredients{

    IcreamIngredients ig;

    public DarkCone(IcreamIngredients ig)
    {
        this.ig = ig;
    }

    public  DarkCone(){

    }
    @Override
    public double getCost() {
        if(ig != null)
        {
            return ig.getCost() + 10;
        }
        return 40;
    }

    @Override
    public String getDescription() {

        if(ig != null)
        {
            return ig.getDescription() + " , " + "Dark Cone";
        }

        return "Orange Cone";
    }
}
