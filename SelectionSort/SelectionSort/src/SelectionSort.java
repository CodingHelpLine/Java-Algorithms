/**
 *
 * @author Programmer
 */
public class SelectionSort {
    
    // number of swaps
    private int numSwaps;
    
    // number of comparisons
    private int numComparisons;
    
    // Time
    private long startTime;
    private long endTime; 
    
    // Array to hold number
    private int array []; 
    
    // Fill Array Object
    private FillArray fillArray; 
    
    
    /**
     * 
     * @param min minimum value
     * @param max maximum value
     * @param size of array
     * @param sortCase  best, worst and average case
     */
    public SelectionSort(int min, int max, int size, Case sortCase) {
        startTime = System.currentTimeMillis();
        
        // allocation
        this.array = new int[size]; 
        
        // fill object
        this.fillArray = new FillArray();
        
        // Base on case we fill the array
        if(sortCase == Case.BestCase) { // sorted 1 - N
            this.fillArray.fillArray(array, false);
        } else if(sortCase == Case.WorstCase) {
            this.fillArray.fillArray(array, true);
        } else {
            this.fillArray.fillArray(array, min, max);
        }
    }
    
    /**
     * Selection sort to sort the array. 
     */
    public void sort() {
        int minIndex = 0; 
        
        // outer loop that must run N time
        for(int i=0; i<array.length; i++) {
            
            // store min index - assumption
            minIndex = i; 
            
            // Inner Loop - to find min item from unsorted array
            for(int j=i+1; j<array.length; j++) {
                
                // Compare - record
                this.numComparisons++;
                if(array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Very important - but this will run N time for 
            // each of case: Best, Worst and Average
            if(i != minIndex) { // this will avoid unnecessary swaps
                swap(i, minIndex);
            }
        }
        
        endTime = System.currentTimeMillis();
    }
    
    /**
     * Swap the elements and record number of swaps
     */
    public void swap(int x, int y) {
       this.numSwaps++;
       
       int temp = array[x];
       array[x] = array[y];
       array[y] = temp;
    }
    
    /**
     * Print the array
     */
    public void printArray() {
        this.fillArray.printArray(array);
    }
    
    /**
     * Get the number of swaps
     * 
     * @return swaps 
     */
    public int getSwaps() {
        return this.numSwaps;
    }
    
    /**
     * Get the number of comparisons
     * 
     * @return comparisons 
     */
    public int getComparisons() {
        return this.numComparisons;
    }
    
    /**
     * Time taken in ms
     * 
     * @return time  
     */
    public long getTime() {
        return endTime - startTime;
    }
}
