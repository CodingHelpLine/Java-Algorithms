
/**
 * The <code>Node</code> Class that will manage the data and reference to the
 * next node. 
 * 
 * @author CodingHelpLine
 * WEB: http://codinghelpline.org
 */
public class Node {
    
    private int data;           // data
    private Node next;          // keep reference to next node. 
    
    /**
     * Constructor to create a Node with a data assigned to the instance field. 
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
