/**
 * Implementation of the Generic Singly Linked List.
 * 
 * @author CodingHelpLine
 * Website: http://codinghelpline.org
 */
public class List<T> {
    
    // head of List class
    private Node<T> head; 
    
    // count variable
    private int count; 
    
    /**
     * Create an empty List
     */
    public List() {
        this.head = null; 
        this.count = 0; 
    }
    
    /**
     * Function to insert a new node with data to the front
     * of the linked list. 
     * 
     * @param data to store  
     */
    public void addFront(T data) {
        
        // Create new node
        Node<T> node = new Node<>(data);
        
        // if empty, store at head
        if(this.isEmpty()) {
            head = node; 
        } else { // if the list is not empty
            
            node.setNext(head);     // Set the head to the next pointer of 
            // new node. 
            
            head = node;                // make it first node
        }
        
        count++;
    }
    
    /**
     * Function to add the new node with data at the end of the List. 
     * 
     * @param data to store 
     */
    public void addBack(T data) {
        
        // check if empty
        if(this.isEmpty()) {
            this.addFront(data);
        } else { 
            
            // create new node
            Node<T> node = new Node<>(data);
            
            // means list is not empty
            // add to the end of the 
            
            Node<T> current = head; 
            
            // navigate to last node
            while(current.getNext() != null) {
                current = current.getNext();
            }
            
            // here we set the new node to next reference of last node
            current.setNext(node);
            
            count++;
        }
    }
    
    /**
     * Remove an element from the Linked List. 
     * 
     * @param data to remove - first occurrence
     * @return indicate operation is successful or failed 
     */
    public boolean remove(T data) {
        
        // Case 1: check if list is empty
        if(this.isEmpty()) {
            return false; 
        }
        
        // Case 2: Data exist at the front of the list. 
        if(head.getData().equals(data)) {
            
            // using equals: This will compare actual object with data inside it
            // using ==: this will only compare references not the actual object
            // == is good for instrinsic types: int, float, double, char etc
            // equals needed to be used for objects like Float, Integer, String, 
            
            head = head.getNext();
            count--; 
            return true; 
        } else {
            // node may exist between other nodes, or last node
            // navigate to find the node to remove
            Node<T> current = head;
            Node<T> pre = null; 
            
            while(current != null) {
                
                // check node data here
                if(current.getData().equals(data)) {
                    pre.setNext(current.getNext());  // skip the current node
                    count--;
                    return true; 
                }
                
                // update navigation pointers
                pre = current; 
                current = current.getNext();
            }
        }
        
        return false; // node not found with data
    }
    
    /**
     * Count the number of elements in list. 
     * 
     * @return number of nodes 
     */
    public int size() {
        return count;
    }
    
    /**
     * Display the List to screen. 
     */
    public void print() {
        
        if(this.isEmpty()) {
            System.out.println("List is Empty");
            return;
        }
        
        // print something like [1, 2, 3, 4, 5]
        
        System.out.print("[");
        
        if(!this.isEmpty()) {
            System.out.printf("%s", head.getData());
        }
        
        Node<T> current = head.getNext();
        
        while(current != null) {
            System.out.printf(", %s", current.getData());
            
            current = current.getNext();
        }
        
       System.out.println("]");
        
    }
    
    /**
     * Get the first element
     * 
     * @return first element 
     */
    public T getFront() {
        return head.getData();
    }
    
    /**
     * Check that List is empty. 
     * 
     * @return indicate if the list is empty 
     */
    public boolean isEmpty() {
        return head == null; 
    }
}
