/**
 * Created by Nitish on 8/24/2016.
 */
public class TreeNode {

    private int data;
    private TreeNode left;
    private TreeNode right;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    TreeNode(int data)
    {
        setData(data);
        setLeft(null);
        setRight(null);
    }
    public boolean remove(int value, TreeNode parent) {
        if (value < this.getData()) {
            if (getLeft() !=null)
                return left.remove(value, this);
            else
                return false;
        } else if (value > this.getData()) {
            if (right != null)
                return right.remove(value, this);
            else
                return false;
        } else {
            if (left != null && right != null) {
                this.setData(right.minValue());
                right.remove(this.getData(), this);
            } else if (parent.left == this) {
                parent.left = (left != null) ? left : right;
            } else if (parent.right == this) {
                parent.right = (left != null) ? left : right;
            }
            return true;
        }
    }

    public int minValue()
    {
        if (left == null)
            return getData();
        else
            return left.minValue();
    }



}
