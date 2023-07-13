public class Client {
    public static void main(String[] args) {

            IcreamIngredients ig = new Vanila_Scoop(
                    new StrawBerry_Scoop(
                            new DarkCone(
                                    new ChocolteSyrup(
                                            new OrangeCone()
                                    ))));

            System.out.println(ig.getCost());
            System.out.println(ig.getDescription());
        }
}
