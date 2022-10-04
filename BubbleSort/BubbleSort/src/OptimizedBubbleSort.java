
import java.util.Arrays;

/**
 *
 * @author Programmer
 */
public class OptimizedBubbleSort {
        // class fields
    private int array []; // to store elements
    private int numSwaps; // Number of Swaps to count
    private int numComparisons; // number of comparisons; 
    private long startTime;     // Start time of algorithm
    private long endTime;       // End time of algorithm
    
    /**
     * Constructor
     * 
     * @param array 
     */
    public OptimizedBubbleSort(int array []) {
        this.array = Arrays.copyOf(array, array.length); 
        numSwaps = 0; 
        numComparisons =0 ; 
    }
    
    public int getSwaps() {
        return this.numSwaps;
    }
    
    public int getComparisons() {
        return this.numComparisons;
    }
    
    public long getTime() {
        return this.endTime - this.startTime;
    }
    
    /**
     * Bubble Sort Algorithm
     */
    public void bubbleSort() {
        
        boolean flag = true; 
        
        // start time
        this.startTime = System.currentTimeMillis();
        
        // for passes
        for(int i=0; i<array.length && flag; i++) {
            
            // mean no more comparison or swap needed
            flag = false; 
            
            // for comparison and swapping
            for(int j=0; j<array.length - i - 1; j++) {
                
                // count comparisons
                this.numComparisons++;
                
                // Compare adjacent elements
                if(array[j] > array[j+1]) {
                    
                    flag = true; 
                    
                    // swap
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    
                    // increase swap
                    this.numSwaps++;
                }
            }
            
            // break statement here
            // Good programming pratice discourage use of break statement
        }
        
        // End time
        this.endTime = System.currentTimeMillis();
    } 
    
    public int [] getArray() {
        return this.array;
    }
}

