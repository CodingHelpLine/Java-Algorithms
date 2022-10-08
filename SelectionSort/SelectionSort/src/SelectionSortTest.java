/**
 *
 * @author Programmer
 */
public class SelectionSortTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        // Constants
        final int MIN = 1; 
        final int MAX = 5000; 
        final int SIZE = 5000; 
        
        // Best Case Scenario
        SelectionSort best = new SelectionSort(MIN, MAX, SIZE, Case.BestCase);
        
        // output
        System.out.println("\nBest Case Scenarios:");
        System.out.println("Before Sorting:");
        best.printArray();
        
        // Do the sorting here
        best.sort();
        
        System.out.println("\nAfter Sorting:");
        best.printArray();
        System.out.printf("Number of Comparisons: %d%n", best.getComparisons());
        System.out.printf("Number of Swaps: %d%n", best.getSwaps());
        System.out.printf("Time Taken: %d milliseconds%n", best.getTime());
        
        
        // Worst Case Scenario
        SelectionSort worst = new SelectionSort(MIN, MAX, SIZE, 
                Case.WorstCase);
        
        // output
        System.out.println("\nWorst Case Scenarios:");
        System.out.println("Before Sorting:");
        worst.printArray();
        
        // Do the sorting here
        worst.sort();
        
        System.out.println("\nAfter Sorting:");
        worst.printArray();
        System.out.printf("Number of Comparisons: %d%n", worst.getComparisons());
        System.out.printf("Number of Swaps: %d%n", worst.getSwaps());
        System.out.printf("Time Taken: %d milliseconds%n", worst.getTime());


        // Worst Case Scenario
        SelectionSort average = new SelectionSort(MIN, MAX, SIZE, 
                Case.AverageCase);
        
        // output
        System.out.println("\nAverage Case Scenarios:");
        System.out.println("Before Sorting:");
        average.printArray();
        
        // Do the sorting here
        average.sort();
        
        System.out.println("\nAfter Sorting:");
        average.printArray();
        System.out.printf("Number of Comparisons: %d%n", average.getComparisons());
        System.out.printf("Number of Swaps: %d%n", average.getSwaps());
        System.out.printf("Time Taken: %d milliseconds%n", average.getTime());

    }
    
}
