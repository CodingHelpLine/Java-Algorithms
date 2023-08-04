## Java Array Based Stack Implementation

* Stack is a linear Data Structure.
* Stack is a LIFO (Last in First out) or FILO (First in Last Out).
* Operations of Push & Pop Occur only on One End. 

### Usage:
* Infix  to Postfix conversion
* Undo the Mechanism to store commands or Instructions

### Methods
* Push(): Push an element at Top of the stack. 
* Pop(): Pop or remove an element from the top of the stack. 
* Peek(): Look at the top element of the Stack. 
* isEmpty(): Check if the Stack is Empty 
* Print(): Print the Stack to see its State. 
* Size(): Total Number of elements stored in the Stack. 
* isFull(): To check if the stack is full. 

### Stack Complexity
* Push(): Array-based Stack push function complexity is O(1). This can be O(N) in case the element is pushed at the beginning of the Array. Otherwise, if pushed at the end of the Array the complexity is O(1)
* Pop(): Array-based Stack pop function complexity is O(1). This complexity will be O(N) (shift elements) in case the element is removed from the beginning of the Array. In case removed from the end of the array, complexity will be O(1)
* Peek(): Array-based Stack peek function complexity is O(1).
* Space complexity: O(N) N is the number of elements in the Array. 