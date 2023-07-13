import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        Adder ad = new Adder(x, y);

        ScalerThread st = new ScalerThread(ad);
        st.start();
    }
}
