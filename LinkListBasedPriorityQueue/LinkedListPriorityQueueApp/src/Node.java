
/**
 * The <code>Node</code> class will represent the Link between the nodes of the
 * Priority Queue that based on linked list. 
 *
 * @author CodingHelpLine
 * Web: https://codinghelpline.org 
 */
public class Node {

    // Store event here
    private Event event; 
    
    // Next Pointer of the node
    private Node next; 
    
    /**
     * Default Constructor to initialize the Objects of Node class with
     * default values. 
     * 
     * @param event to store
     */
    public Node(Event event) {
        this.event  = event; 
        this.next = null; 
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
