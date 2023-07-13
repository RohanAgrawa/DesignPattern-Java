public class Client {
    public static void main(String[] args) {
        System.out.println("I am the main class");

        Adder ad = new Adder();

        ScalerThread t1 = new ScalerThread(ad);

        t1.start();

        Subtractor st = new Subtractor();

        ScalerThread t2 = new ScalerThread(st);

        t2.start();
    }
}
