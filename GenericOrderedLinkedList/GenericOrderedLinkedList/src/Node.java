
/**
 * The <code>Node</code> class represents individual node within
 * the linked list. Encapsulates data and reference to the next
 * node in the linked list. 
 * 
 * @author CodingHelpLine
 * Website: http://codinghelpline.org
 */
public class Node<T extends Comparable<T>> {
    // instance fields
    private T data;
    private Node<T> next; 
    
    /**
     * Instantiate node object
     * 
     * @param data 
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
