
/**
 * The <code>Node</code> will represents a Node within the Linked List Set. 
 *
 * @author CodingHelpLine
 * Web: http://codinghelpline.org 
 */
public class Node {

    // Data field
    private int data; 
    
    // Reference to next node
    private Node next; 
    
    /**
     * Constructor to setup the node with data to hold. 
     * 
     * @param data 
     */
    public Node(int data) {
        this.data = data;
        this.next = null; 
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
}
