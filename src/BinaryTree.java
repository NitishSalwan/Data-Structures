import sun.reflect.generics.tree.Tree;

/**
 * Created by Nitish on 8/24/2016.
 */
public class BinaryTree {

    static TreeNode root;

    BinaryTree(int data)
    {
        root=new TreeNode(data);
    }


    public boolean remove(int value) {
        if (root == null)
            return false;
        else {
            if (root.getData() == value) {
                TreeNode auxRoot = new TreeNode(0);
                auxRoot.setLeft(root);
                boolean result = root.remove(value, auxRoot);
                root = auxRoot.getLeft();
                return result;
            } else {
                return root.remove(value, null);
            }
        }
    }








    void add(TreeNode node,int data)
    {

        if(node!=null)
        {
            if(node.getData()>data)
            {
                if(node.getLeft()==null)
                  node.setLeft(new TreeNode(data));
                else
                    add(node.getLeft(),data);
            }
            else
            {
                if(node.getRight()==null)
                    node.setRight(new TreeNode(data));
                else
                    add(node.getRight(),data);
            }
        }

    }

    void iterate(TreeNode node)
    {
        if(node!=null) {

            iterate(node.getLeft());
            System.out.println(node.getData());
            iterate(node.getRight());
        }
    }


    public static void main(String[] args)
    {
        BinaryTree ob1 =new BinaryTree(34);
        ob1.add(BinaryTree.root,45);
        ob1.add(BinaryTree.root,50);
        ob1.add(BinaryTree.root,23);
        ob1.add(BinaryTree.root,56);
        ob1.add(BinaryTree.root,12);
        ob1.add(BinaryTree.root,32);
        ob1.iterate(BinaryTree.root);
        ob1.remove(23);
        System.out.println();
        ob1.iterate(BinaryTree.root);
    }


}
