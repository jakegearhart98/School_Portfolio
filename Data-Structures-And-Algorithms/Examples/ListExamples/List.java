/**
* An interface specifying some basic list operations.
*
* @author Charley Sheaffer
* @version 3/6/2019
*
*/

public interface List<E> {

    /**
    *   @return the number of elements in the list
    */
    int size();

	/**
	*   Determines whether a given object is in the list.
	*   @param obj the object to look for in the list
	*   @return true, if the given object is in the list, false otherwise
	*/
    default boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }
    
    
    /**
    *   Finds the index of a given object.
    *   @param obj the object to look for in the list.
    *   @return the index of the object in the list or -1 if the object is not 
    *   in the list
    */
    int indexOf(Object obj);
    
    /**
    *   @precondition index is >= 0 and < size of the list
    *   @param index an index of an element in the list
    *   @return the element of the list at the given index
    *   @throws IndexOutOfBoundsException if the index is out of range
    */
    E get(int index);

    /**
    *   Adds a new element at the end of the list.
    *   @param element element to be added to the list
    *   @return true if element added, false otherwise
    */
    default boolean add(E element) {
        return add(size(), element);
    }
    

    /**
    *   Inserts a new element before a specified index.
    *   @precondition index is >= 0 and <= size of the list
    *   @param element element to be added to the list
    *   @param index index of the element in the list that this element 
    *       is to be inserted before
    *   @return true, if element added, false otherwise
    *   @throws IndexOutOfBoundsException if index is out of range
    */
	boolean add(int index, E element);

    /**
    *   Removes the specified element.
    *   @param element the element that is to be removed from the list
    *   @return true if the element exists and was removed, false if the 
    *   element was not present in the list
    */
    default boolean remove(Object obj) {
        int index = indexOf(obj);
        if (index == -1) return false;
        remove(index);
        return true;
    }
    

    /**
    *   Removes the element at a specified index.
    *   @precondition index is >= 0 and < size of the list
    *   @param index index of the element that is to be removed from the list
    *   @return the element at the index specified
    *   @throws IndexOutOfBoundsException
    */
    E remove(int index);

    /**
    *   Replaces the element at a specified index with the given element.
    *   @precondition index is >= 0 and < size of the list
    *   @param element element to place at the specified index
    *   @param index index of the element that is to be replaced
    *   @return the element that is being replaced
    *   @throws IndexOutOfBoundsException
    */
	E set(int index, E element);
	
	/**
	*   Removes all elements from the list
    *   @return true, if the clear succeeds, false otherwise
	*/
	default boolean clear() {
        while (!isEmpty()) {
            remove(0);
        }
        return true;
    }
	
	/**
	*   Determines whether there are any elements in the list
	*   @return true, if there are no elements in the list, false otherwise
	*/
    default boolean isEmpty() {
        return size() == 0;
    }

}


