import java.util.ArrayList;

/**
 * Created by Nitish on 8/22/2016.
 */
public class Hashmap {


    ArrayList<hashnode> array;


    Hashmap(int numberOfElements)
    {

        array= new ArrayList<>(numberOfElements);

        for(int i=0;i<numberOfElements;i++)
        {
            array.add(i,null);
        }

    }

    public int hashFunction(String input)
    {
        switch(input.charAt(0))
        {
            case 'a' : return 0;
            case 'b' : return 1;
            case 'c' : return 2;
            case 'd' : return 3;
            case 'e' : return 4;

            default:
                return -1;
        }
    }

    public void put(String key,String value)
    {
        hashnode tmpNode= array.get(hashFunction(key));
        if(tmpNode == null) {
            array.add(hashFunction(key), new hashnode(key,value));
        }
        else
        {
            hashnode current=tmpNode;
            if(current.key.equals(key)) {
                current.value = value;
                return;
            }
            while(current.next!=null)
            {
                if(current.key.equals(key))
                {
                    current.value=value;
                    return;
                }
                current = current.next;
            }
            current.next=new hashnode(key,value);

        }
    }

    public String get(String key)
    {
        hashnode tmpNode= array.get(hashFunction(key));
        if(tmpNode == null)
        {
            return "No entry is there";
        }
        else
        {
            hashnode current = tmpNode;
            while(current!=null)
            {
                if(current.key.equals(key))
                {
                   System.out.println(current.key + "->"+current.value);
                }


                    current=current.next;
            }
            return "No entry is here";
        }

    }


    public void iterate()
    {
        int count=0;
        System.out.print("size : " + array.size());
        for(hashnode node : array)
        {
            System.out.println(count);
            hashnode current=node;
            while(current!=null)
            {
                System.out.print(current.key + "->" + current.value + "||");
                current=current.next;
            }
            System.out.println();
            count++;
        }
    }


    public static void main(String[] args)
    {
        Hashmap map=new Hashmap(5);
        map.put("abc","abc");
        map.put("abc","nitish");
        map.put("abc","bbc");
        map.put("cbc","cbc");
        map.put("dbc","dbc");
        map.put("ebc","ebc");
        map.put("cbc","cbc");
        map.put("ebc","ebc");
        map.put("bbc","abc");
        map.iterate();
        map.get("abc");
    }

}

class hashnode
{
    String key;
    String value;
    hashnode next;

    public hashnode(String key,String value)
    {
        this.key=key;
        this.value=value;
        this.next=null;
    }




}
