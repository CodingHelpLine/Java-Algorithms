/**
 *
 * @author Programmer
 */
public class BubbleSortTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // 3 things
        final int MIN = 1; 
        final int MAX = 100; 
        final int SIZE = 10; 
        
        // fill the array
        FillArray fillArray = new FillArray();
        
        // declare arrays
        int arrayOne [] = new int[SIZE]; 
        
        // FILL IT
        //fillArray.fillArray(arrayOne, MIN, MAX);
        fillArray.fillArray(arrayOne);
        // Bubble sort Object
        BubbleSort bubbleSort = new BubbleSort(arrayOne); 
        
        // lets print it
        System.out.println("Unsorted Array:");
        fillArray.printArray(bubbleSort.getArray());
        
        // Call function to sort
        bubbleSort.bubbleSort();
        
        System.out.println("\nSorted Array:");
        fillArray.printArray(bubbleSort.getArray());
        
        System.out.println("\nStatistics:");
        System.out.printf("Number of comparisions: %d%n", bubbleSort.getComparisons());
        System.out.printf("Number of Swaps: %d%n", bubbleSort.getSwaps());
        System.out.printf("Time Taken to Sort: %d m/s%n", bubbleSort.getTime());
 
        System.out.println("\nOptimized Bubble Sort:");
        // Bubble sort Object
        OptimizedBubbleSort sort = new OptimizedBubbleSort(arrayOne); 
        
        // lets print it
        System.out.println("Unsorted Array:");
        fillArray.printArray(sort.getArray());
        
        // Call function to sort
        sort.bubbleSort();
        
        System.out.println("\nSorted Array:");
        fillArray.printArray(sort.getArray());
        
        System.out.println("\nStatistics:");
        System.out.printf("Number of comparisions: %d%n", sort.getComparisons());
        System.out.printf("Number of Swaps: %d%n", sort.getSwaps());
        System.out.printf("Time Taken to Sort: %d m/s%n", sort.getTime());
    }
}
