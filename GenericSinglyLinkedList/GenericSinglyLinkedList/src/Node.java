
/**
 * Implementation of Generic Node Class. 
 * 
 * @author CodingHelpLine
 * Website: http://codinghelpline.org 
 */
public class Node<T> {
    
    // data to store
    private T data;
    
    // reference to the next
    private Node<T> next; 
    
    // constructor to setup the Object
    public Node() {
        data = null; 
        next = null; 
    }
    
    /**
     * Instantiate object of Node class. 
     * 
     * @param data to store within this node object.  
     */
    public Node(T data) {
        this.data = data; 
        this.next = null; 
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
