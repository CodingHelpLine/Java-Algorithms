
/**
 * Node class 
 * 
 * @author Programmer
 */
public class Node {
    
    private int data; 
    private Node next;      // this is reference to next node object
    
    public Node() {
        data = 0; 
        next = null; 
    }
    
    public Node(int data) {
        this.data = data;
        this.next = null; 
    }
    
    public int getData() {
        return this.data;
    }
    
    public void setData(int data) {
        this.data = data;
    }
    
    public void setNext(Node next) {
        this.next = next; 
    }
    
    public Node getNext() {
        return this.next;
    }
}
