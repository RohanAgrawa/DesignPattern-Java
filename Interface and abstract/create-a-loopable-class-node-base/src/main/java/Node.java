import java.util.Iterator;

// write your code here
public class Node implements Iterable <Node> {


    int data;
    Node next;

    public Node(int data)
    {
        this.data = data;
    }

    public Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
    public Iterator <Node> iterator()
    {
        Iterator<Node> obj = new genericIterator(this);
        return  obj;
    }
}



class genericIterator implements  Iterator<Node>{

    Node root;

    public genericIterator(Node root)
    {
        this.root = root;
    }

    public boolean hasNext()
    {
        if(root == null)
        {
            return false;
        }

        return true;
    }

    public Node next()
    {
        Node fr = root;
        root = root.next;
        return fr;
    }
}