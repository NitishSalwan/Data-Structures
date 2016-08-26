/**
 * Created by Nitish on 8/23/2016.
 */
public class DoublyNode {

    private String data;
    private DoublyNode forward;
    private DoublyNode previous;

    DoublyNode(String element)
    {
        this.setData(element);
        this.setForward(null);
        this.setPrevious(null);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public DoublyNode getForward() {
        return forward;
    }

    public void setForward(DoublyNode forward) {
        this.forward = forward;
    }

    public DoublyNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyNode previous) {
        this.previous = previous;
    }
}
