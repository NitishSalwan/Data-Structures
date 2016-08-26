/**
 * Created by Nitish on 8/22/2016.
 */
public class Queue {

    Linkedlist queue;

    Queue()
    {
        queue= new Linkedlist();
    }

    public void enqueue(int data)
    {
        queue.addAtTail(data);
    }

    public void dequeue(int data)
    {
        System.out.println(queue.deleteAtHead());
    }

    public void peek()
    {
        System.out.println(queue.headElement());
    }

    public int poll()
    {
        int element=queue.deleteAtHead();
        System.out.println(element);
        return element;
    }



}
