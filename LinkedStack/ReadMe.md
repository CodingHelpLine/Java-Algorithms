## Java Link Based Stack Implementation

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

### Stack Complexity
* Push(): The complexity of push function is O(1) if stored at the beginning of the list. The complexity is O(N) if the element is stored at the end of the List. 
* Pop(): The complexity of the pop function is O(1) if removed from the beginning of the List. In case removed from the end Complexity will be O(N) or you have to add another pointer for the Tail nail to achieve O(1) 
* Peek(): If stored at the front of the list, peek is O(1). If stored at the end of the List, Peek complexity is O(N), or add another pointer (Tail) to achieve O(1) Complexity. 
* Space complexity: O(N) N is the number of elements in the Stack. 