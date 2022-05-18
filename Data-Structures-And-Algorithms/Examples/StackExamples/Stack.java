public interface Stack<E> {

/**
*   True if there are no elements in the stack, false otherwise.
*   @return true if there are no elements in the stack, false otherwise
*/
    default boolean isEmpty() {
      return size() == 0;
    }
    
/**
*   The number of elements in the stack.
*   @return the number of elements in the stack
*/
    int size();

/**
*   Returns the top element of the stack.
*   @return the top element in the stack
*   @throws EmptyCollectionException stack must not be empty
*/
    E peek();
    
/**
*   Adds an element to the top of the stack.
*   @param element an element to place at the top of the stack
*   @return true if element successfully pushed, false otherwise
*/
    boolean push(E element);
    
/**
*   Removes the top element of the stack.
*   @return the element at the top of the stack
*   @throws EmptyCollectionException stack must not be empty
*/
    E pop();
    
/**
*   Removes all elements from the stack.
*   @return true if all elements successfully removed, false otherwise
*/
    default boolean clear() {
      while (!isEmpty()) pop();
      return true;
    }
    
}