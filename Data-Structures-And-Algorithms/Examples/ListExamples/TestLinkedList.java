public class TestLinkedList<E>  {
    private Node<E> head;
    private Node<E> tail;
    private int size;
  
    private class Node<E> {
        private E data;
        private Node<E> next;
    
        private Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
  
        private Node(E data) {
            this(data, null);
        }

        private Node() {
            this(null, null);
        }
    }

    public TestLinkedList() {
        this.head = new Node<>();
        tail = head;
        this.size = 0;
    }
    
    /**
    * Adds a new element to the end of the linked list.
    * @param data the element to be added to the end of the list
    */
    public void addLast(E data) {
        tail.next = new Node<>(data);
        tail = tail.next;
        size++;
    }
    
    
 }
