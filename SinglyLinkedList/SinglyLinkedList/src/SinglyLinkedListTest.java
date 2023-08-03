
/**
 * Test the Linked List Functions. 
 * 
 * @author Programmer
 */
public class SinglyLinkedListTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List list = new List();
        
        System.out.println("Adding 4 at the back of List");
        list.addBack(4);
        System.out.println("Size of List: " + list.size());
        System.out.println("List is Now:");
        list.print();
        
        System.out.println("\nAdding 5 at the back of List");
        list.addBack(5);
        System.out.println("Size of List: " + list.size());
        System.out.println("List is Now:");
        list.print();
        
        System.out.println("\nAdding 6 at the back of List");
        list.addBack(6);
        System.out.println("Size of List: " + list.size());
        System.out.println("List is Now:");
        list.print();

        System.out.println("\nAdding 3 at the front of List");
        list.addFront(3);
        System.out.println("Size of List: " + list.size());
        System.out.println("List is Now:");
        list.print();
        
        System.out.println("\nAdding 2 at the front of List");
        list.addFront(2);
        System.out.println("Size of List: " + list.size());
        System.out.println("List is Now:");
        list.print();
        
        System.out.println("\nAdding 1 at the front of List");
        list.addFront(1);
        System.out.println("Size of List: " + list.size());
        System.out.println("List is Now:");
        list.print();
        
        // Testing Remove
        System.out.println("\nRemove 1 from the List");
        list.remove(1);
        System.out.println("Size of List: " + list.size());
        System.out.println("List is Now:");
        list.print();
        
        System.out.println("\nRemove 6 from the List");
        list.remove(6);
        System.out.println("Size of List: " + list.size());
        System.out.println("List is Now:");
        list.print();
        
        System.out.println("\nRemove 4 from the List");
        list.remove(4);
        System.out.println("Size of List: " + list.size());
        System.out.println("List is Now:");
        list.print();
        
        System.out.println("\nRemove 3 from the List");
        list.remove(3);
        System.out.println("Size of List: " + list.size());
        System.out.println("List is Now:");
        list.print();
        
        System.out.println("\nRemove 5 from the List");
        list.remove(5);
        System.out.println("Size of List: " + list.size());
        System.out.println("List is Now:");
        list.print();
        
        System.out.println("\nRemove 2 from the List");
        list.remove(2);
        System.out.println("Size of List: " + list.size());
        System.out.println("List is Now:");
        list.print();
    }
    
}
