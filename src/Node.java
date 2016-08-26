/**
 * Created by Nitish on 8/22/2016.
 */
public class Node {

    private Node next;
    private int data;

    Node(int data)
    {
        setData(data);
        setNext(null);
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

}
