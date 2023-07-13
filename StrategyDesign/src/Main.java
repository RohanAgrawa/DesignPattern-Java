// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        GoogleMap g = new GoogleMap();
        try {
            g.path("BIKE");
        }
        catch (Exception e)
        {
            System.out.println("Enter valid input");
        }
    }
}