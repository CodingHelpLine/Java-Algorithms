
/**
 * Client code to test the Generic Singly Linked List. 
 * 
 * @author CodingHelpLine
 * Website: http://codinghelpline.org 
 */
public class GenericSinglyLinkedListTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Test with Integers
        List<Integer> intList = new List<>(); 
        
        // lets print state of list
        System.out.printf("Size of List: %d%n", intList.size());
        System.out.printf("Is List empty: %s%n", intList.isEmpty());
        
        // insert data
        System.out.println("Insert to front 4 to the list");
        intList.addFront(4);
        System.out.printf("Size of List: %d%n", intList.size());
        System.out.println("List is Now:");
        intList.print();
        System.out.println("");
        
        System.out.println("Insert to front 7 to the list");
        intList.addFront(7);
        System.out.printf("Size of List: %d%n", intList.size());
        System.out.println("List is Now:");
        intList.print();
        System.out.println("");
        
        System.out.println("Insert to Back 8 to the list");
        intList.addBack(8);
        System.out.printf("Size of List: %d%n", intList.size());
        System.out.println("List is Now:");
        intList.print();
        System.out.println("");
        
        System.out.println("Insert to Back 10 to the list");
        intList.addBack(10);
        System.out.printf("Size of List: %d%n", intList.size());
        System.out.println("List is Now:");
        intList.print();
        System.out.println("");
        
        // Test remove
        while(!intList.isEmpty()) {
            Integer x = intList.getFront();
            System.out.printf("Front Element: %d%n", x.intValue());
            intList.remove(x);
            System.out.printf("Size of List: %d%n", intList.size());
            System.out.println("List is Now:");
            intList.print();
            System.out.println("");
        }
        
        List<String> strList = new List<>(); 
        strList.addFront("John");
        strList.addBack("Marry");
        strList.addFront("Peter");
        strList.addBack("Smith");
        strList.print();
        
        // remove
        while(!strList.isEmpty()) {
            String str = strList.getFront();
            System.out.printf("Element at front: %s%n", str);
            strList.remove(str);
        }
    }    
}
