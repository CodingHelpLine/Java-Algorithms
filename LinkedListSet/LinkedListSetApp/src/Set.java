
/**
 * The <code>Set</code> class implements Linked List based Set Data Structure. 
 *
 * @author CodingHelpLine
 * Web: http://codinghelpline.org 
 */
public class Set {

    // add head of the Sent 
    private Node head; 
    
    // count of elements
    private int count; 
    
    /**
     * Initialize Empty Set
     */
    public Set() {
        this.head = null; 
        count = 0; 
    }
    
    /////////////////////////////////////////////////////////////////////
    ////               Basic Function                                ////
    /////////////////////////////////////////////////////////////////////
    
    // Add Function
    public boolean add(int value) {
        
        // create node
        Node node = new Node(value); 
        
        // Case 1: Empty Set
        if(this.isEmpty()) {
            head = node; 
            count++;
            return true; 
        }
        
        // Case 2: Data exist, don't add
        // Manage the uniqueness of elements
        if(find(value)) {
            return false; 
        }
        
        // insert at the end of set
        Node current = head; 
        while(current.getNext() != null) {
            current = current.getNext();
        }
        
        current.setNext(node);
        count++;
        return true; 
    }
    
    
    // Remove Function
    public boolean remove(int value) {
        
        // If empty, return false - nothing to remove
        if(this.isEmpty()) {
            return false; 
        }
        
        // If it is head node
        if(head.getData() == value) {
            head = head.getNext();
            count--;
            return true; 
        }
        
        // somewhere between the set
        Node current = head, pre = null; 
        
        while(current != null) {
            
            // Find the node
            if(current.getData() == value) {
                
                // pre's next will become current's next
                pre.setNext(current.getNext());
                count--;
                return true; 
            }
            
            // update pointers
            pre = current; 
            current = current.getNext();
        }
        
        // end of function, value doesn't exist
        return false; 
    }
    
    // Size function
    public int size() {
        return count; 
    }
    
    // Find Function
    public boolean find(int value) {
        
        // if empty, return false
        if(this.isEmpty()) {
            return false; 
        }
        
        Node current = head; 
        
        // move till the end of set
        while(current != null) {
            
            // if exist
            if(current.getData() == value) {
                return true; 
            }
            
            current = current.getNext();
        }
        
        // reach here - value not found
        return false; 
    }
    
    // isEmpty function
    public boolean isEmpty() {
        return head == null; 
    }
    
    // Print function
    public void print() {
        
        // if empty
        if(this.isEmpty()) {
            System.out.println("This Set is Empty");
            return;
        }
        
        // print set like [1, 2, 3, 4]
        
        Node current = head; 
        
        System.out.printf("[%d", current.getData());
        
        current = current.getNext();
        
        while(current != null) {
            System.out.printf(", %d", current.getData());
            current = current.getNext();
        }
        
        System.out.println("]");
    }
    
    /////////////////////////////////////////////////////////////////////
    ////               Set Function                                  ////
    /////////////////////////////////////////////////////////////////////
    
    // Union of two sets
    public Set union(Set B) {
        
        // Create new Set
        Set newSet = new Set(); 
        
        // Iterate and insert all elements of current set
        // into new set
        Node current = head; 
        while(current != null) {
            newSet.add(current.getData()); 
            current = current.getNext();
        }
        
        // Insert all the elements from Set B
        // No need to check for duplicate because Add function 
        // handles it already. 
        current = B.head; 
        while(current != null) {
            newSet.add(current.getData()); // it will add only if not already there
            current = current.getNext(); 
        }
        
        return newSet; 
        
    }
    
    
    // Intersection of two sets
    public Set intersection(Set B) {
        
        // Create new set
        Set newSet = new Set(); 
        
        // loop all the elements of first set
        // if that element exist in Set B, take it to add into new set
        Node current = head; 
        while(current != null) {
            
            // check it is in B also
            if(B.find(current.getData())) {
                newSet.add(current.getData());
            }
            
            current = current.getNext(); 
        }
        
        return newSet; // 
        
    }
    
    // difference of two sets
    // Return A-B
    // A = {1, 2, 3}
    // B = {3, 5, 7}
    // A - B = {1, 2}
    public Set difference(Set B) {
        
        // Declare new set
        Set newSet = new Set(); 
        
        // loop for the Set a elements
        Node current = head; 
        while(current != null) {
            // if element doesn't exist in B, take it and add to new set
            if(!B.find(current.getData())) {
                newSet.add(current.getData());
            }
            
            current = current.getNext();
        }
        
        return newSet; 
    }
    
    // Complement of a Set
    // How it works
    // Current set is Universal Set: {1, 2, 3, 4, 5, 6}
    // Set A = {1, 2, 5}
    // Complement A will be: {3, 4, 6}
    public Set complement(Set A) {
        
        // create new set
        Set newSet = new Set();
        
        // Loop elements from the set A
        Node current = head; 
        while(current != null) {
            
            // element doesn't exist in A, add it to Complement set
            if(!A.find(current.getData())) {
                newSet.add(current.getData());
            }
            current = current.getNext();
        }
        
        return newSet; 
    }
    
    // are two sets disjoint?
    // Check if current set and Set B are disjoint
    // DisJoint are the sets, that have no common element
    // A = {1, 3, 5}
    // B = {2, 4, 6} 
    // They disjoint - no common element
    public boolean isDisjoint(Set B) {
        
        Node current = head; 
        
        while(current != null) {
            
            // if element exist in B, they are not disjoint
            if(B.find(current.getData())) {
                return false; 
            }
            
            current = current.getNext();
        }
        
        // Reach here, these sets are disjoint. 
        return true; 
    }
    
    
    // If Set B is proper subset of of B
    // A proper subset is a set whose all the elements exist within 
    // other set
    public boolean isProperSubset(Set B) {
        
        Node current = B.head; 
        while(current != null) {
            if(!find(current.getData())) {
                return false; // indicate not a subset
            }
            current = current.getNext();
        }
        
        // The Set B is proper subset of A. 
        return true; 
    }
}
    
    
    
    