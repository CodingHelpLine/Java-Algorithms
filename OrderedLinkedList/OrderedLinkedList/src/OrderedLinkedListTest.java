/**
 * Singly Ordered Linked List Test. 
 * 
 * @author Programmer
 */
public class OrderedLinkedListTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OrderedList list = new OrderedList();
        
        System.out.println("Adding 4 at the back of List");
        list.add(4);
        System.out.println("Size of List: " + list.size());
        System.out.println("List is Now:");
        list.print();
        
        System.out.println("\nAdding 11 at the back of List");
        list.add(11);
        System.out.println("Size of List: " + list.size());
        System.out.println("List is Now:");
        list.print();
        
        System.out.println("\nAdding 10 at the back of List");
        list.add(10);
        System.out.println("Size of List: " + list.size());
        System.out.println("List is Now:");
        list.print();

        System.out.println("\nAdding 7 at the front of List");
        list.add(7);
        System.out.println("Size of List: " + list.size());
        System.out.println("List is Now:");
        list.print();
        
        System.out.println("\nAdding 9 at the front of List");
        list.add(9);
        System.out.println("Size of List: " + list.size());
        System.out.println("List is Now:");
        list.print();
        
        System.out.println("\nAdding 1 at the front of List");
        list.add(1);
        System.out.println("Size of List: " + list.size());
        System.out.println("List is Now:");
        list.print();
        
        // Testing Remove
        System.out.println("\nRemove 1 from the List");
        list.remove(1);
        System.out.println("Size of List: " + list.size());
        System.out.println("List is Now:");
        list.print();
        
        System.out.println("\nRemove 4 from the List");
        list.remove(4);
        System.out.println("Size of List: " + list.size());
        System.out.println("List is Now:");
        list.print();
        
        System.out.println("\nRemove 10 from the List");
        list.remove(10);
        System.out.println("Size of List: " + list.size());
        System.out.println("List is Now:");
        list.print();
        
        System.out.println("\nRemove 11 from the List");
        list.remove(11);
        System.out.println("Size of List: " + list.size());
        System.out.println("List is Now:");
        list.print();
        
        System.out.println("\nRemove 9 from the List");
        list.remove(9);
        System.out.println("Size of List: " + list.size());
        System.out.println("List is Now:");
        list.print();
        
        System.out.println("\nRemove 7 from the List");
        list.remove(7);
        System.out.println("Size of List: " + list.size());
        System.out.println("List is Now:");
        list.print();
    }
}
