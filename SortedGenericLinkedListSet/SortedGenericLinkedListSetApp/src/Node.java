/**
 * The <code>Node</code> class represents a Generic Node in the Linked List and
 * used to implement the Generic Sorted Set. 
 *
 * @author CodingHelpLine
 * Web: https://codinghelpline.org 
 */
public class Node<T extends Comparable<T>> { 
    
    // some data field
    private T data; 
    
    // reference to the next node
    private Node<T> next; 
    
    /**
     * Default Constructor to initialize the Objects of Node class with
     * default values. 
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
