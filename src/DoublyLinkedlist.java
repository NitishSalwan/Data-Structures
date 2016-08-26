/**
 * Created by Nitish on 8/23/2016.
 */
public class DoublyLinkedlist {

    DoublyNode head;
    DoublyNode tail;

    DoublyLinkedlist()
    {
        head=new DoublyNode(null);
        tail=new DoublyNode(null);

    }

    public void add(String data)
    {
        DoublyNode element = new DoublyNode(data);

        if(head.getForward()==null)
        {
            head.setForward(element);
            tail.setPrevious(element);
        }
        else
        {
           element.setPrevious(tail.getPrevious());
           tail.getPrevious().setForward(element);
            tail.setPrevious(element);
        }

    }


    public void remove(String data)
    {
        DoublyNode current = head;
        while(current.getForward()!=null)
        {
            if((head.getForward().getData().equals(data)) && (head.getForward().getForward()==null))
            {
               head.setForward(null);
                tail.setPrevious(null);
            }
            else if ((head.getForward().getData().equals(data))&& (head.getForward().getForward()!=null))
            {
                //head.getForward().getForward().setPrevious(head);

                head.setForward(head.getForward().getForward());
                head.getForward().setPrevious(null);

            }
            else if( (current.getForward().getData().equals(data))&& (current.getForward()!=head.getForward()) && (current.getForward()==tail.getPrevious()))
            {
                current.setForward(null);
                tail.setPrevious(current);

            }

            else if(current.getForward().getData().equals(data))
            {
                current.getForward().getForward().setPrevious(current);
                current.setForward(current.getForward().getForward());
            }
            else
            {
                current= current.getForward();
            }

        }
    }



    public void iterateHead()
    {
        DoublyNode current = head.getForward();
        while(current!=null)
        {
            System.out.println(current.getData());
            current = current.getForward();
        }
    }

    public void iterateTail()
    {
        DoublyNode current = tail.getPrevious();
        while(current!=null)
        {
            System.out.println(current.getData());
            current = current.getPrevious();
        }
    }




    public static void main(String[] args)
    {
        DoublyLinkedlist ob1= new DoublyLinkedlist();
        ob1.add("hum");
        ob1.add("tumhare");
        ob1.add("hain");
        ob1.add("sanam");
        ob1.iterateHead();
        System.out.println();
        ob1.iterateTail();
        ob1.remove("sanam");
        System.out.println();
        //ob1.iterateHead();
       ob1.iterateTail();
    }

}
