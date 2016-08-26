/**
 * Created by Nitish on 8/22/2016.
 */
public class Linkedlist {

    Node head = null;
    int length=0;
    Node tail=null;


    public int headElement()
    {
        return head.getData();
    }

    public void addAtHead(int data)
    {
        Node element = new Node(data);
        if(head==null) {
            head = element;
            tail = element;
        }
        else
        {
            element.setNext(head);
            head=element;
        }
        length++;
    }

    public void addAtTail(int data)
    {

        Node element = new Node(data);
        if(head==null) {
            head = element;
            tail = element;
        }
        else
        {
            Node current = tail;
            current.setNext(element);
            tail=element;
        }

    }



    public void insertAt(int pos,int data)
    {
        Node current=head;
        Node element= new Node(data);
        int counter=0;

        if(pos==0)
        {
            if(head!=null)
            {
                element.setNext(head);
                head=element;
            }
            else
            {
                head=element;
            }
        length++;
        }
        else if((pos>0) && (current!=null) ) {

                while (counter != (pos - 1)) {
                    current = current.getNext();
                    counter++;
                }

                element.setNext(current.getNext());
                current.setNext(element);
        length++;
        }
        else
        {
            System.out.println("Index out of bound");
        }


    }

    public int find(int data)
    {
        int position=0;

        if(head==null)
        {
            System.out.println("List is Empty");
            return -1;
        }
        else
        {
            Node current;
            current = head;
            while(current!=null)
            {
                if(current.getData()==data)
                {
                    return position;
                }
                else
                {
                    current=current.getNext();
                }
            }
        }
       return -1;
    }



    /*
    public int delete(int data)
    {

        if(head==null)
        {
            System.out.println("List is Empty");
            return -1;
        }
        else
        {
            Node current;
            current = head;
            int tempNode;
            if((current.getData() == data) && (current.getNext()==null))
            {
                if(current == tail)
                {
                    tail= null;
                }
                tempNode= current.getData();
                head=current.getNext();
                length--;

                return tempNode;
            }
            while(current.getNext()!=null)
            {
                if(current.getNext().getData()==data)
                {


                    tempNode=current.getNext().getData();
                    current.setNext(current.getNext().getNext());
                    length--;
                    return tempNode;
                }
                else
                {
                    current=current.getNext();
                }
            }
        }

        return -1;
    }

    */

    public int deleteAtHead()
    {
        int tempNode;
        if(head==null)
        {
           System.out.println("List Empty");
            return -1;

        }
        else
        {
            tempNode=head.getData();
            head=head.getNext();
            return tempNode;
        }
    }

    public void print()
    {
        Node current=head;
        while(current!=null)
        {
            System.out.println(current.getData());
            current=current.getNext();
        }
    }





    public static void main(String[] args){
        Linkedlist list=new Linkedlist();
        list.addAtHead(45);
        list.addAtHead(46);
        list.addAtHead(47);
        list.print();
        System.out.println();
        list.insertAt(3,49);
        list.print();
        System.out.println();

        list.addAtTail(90);
        list.print();

        list.deleteAtHead();
        list.print();
        System.out.println();
        list.deleteAtHead();
        list.print();
        System.out.println();
        list.deleteAtHead();
        list.print();

    }


}

