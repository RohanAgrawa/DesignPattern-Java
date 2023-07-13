import java.util.ArrayList;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable<ArrayList<Integer>> {


    public int n;
    public ArrayCreator(int n)
    {
        this.n = n;
    }

    @Override
    public ArrayList<Integer> call(){

        ArrayList<Integer> ls = new ArrayList<>();

        for (int i = 1; i <= n; i++)
        {
            ls.add(i);
        }

        return ls;
    }
}
