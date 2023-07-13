import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator  implements Callable <Integer> {

    public Node root;
    ExecutorService es;
    public TreeSizeCalculator(Node root, ExecutorService es)
    {
        this.root = root;
        this.es = es;
    }


    @Override
    public Integer call() throws Exception {

        if(root == null)
        {
            return 0;
        }


        TreeSizeCalculator left = new TreeSizeCalculator(root.left, es);

        Future <Integer> l = es.submit(left);

        TreeSizeCalculator right = new TreeSizeCalculator(root.right, es);

        Future <Integer> r = es.submit(right);
        int x = l.get() + r.get() + 1;
        es.shutdown();
        return x;
    }

}
