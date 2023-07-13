import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.*;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService es = Executors.newFixedThreadPool(1);

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        ArrayCreator a = new ArrayCreator(n);

        Future<ArrayList<Integer>> promise= es.submit(a);

        ArrayList<Integer> ls = promise.get();

        System.out.println(ls.toString());

        es.shutdown();
    }
}
