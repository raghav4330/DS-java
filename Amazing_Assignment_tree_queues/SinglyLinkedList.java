 public class SinglyLinkedList<E> {
  //---------------- nested Node class ----------------
  
private static class Node<E> {
 private E element1; // reference to the element stored at this node
  private E element2;
 private Node<E> next; // reference to the subsequent node in the list

public Node(E e,E f, Node<E> n) {
 element1 = e;
 element2 = f;
 next = n;
 
 }
 
public E getElement1( )
 { return element1; }

public E getElement2( )
 { return element2; }
 
 public Node<E> getNext( ) { return next; }
 
 public void setNext(Node<E> n) { next = n; }
 
 }                                    //----------- end of nested Node class -----------
 
                                     // instance variables of the SinglyLinkedList
 
 
 
 
 
 
 
 
 
 
 private Node<E> head = null; // head node of the list (or null if empty)
 private Node<E> tail = null; // last node of the list (or null if empty)
 private int size = 0;       // number of nodes in the list
 
 public SinglyLinkedList( ) { } // constructs an initially empty list
// access methods
 public int size( ) { return size; }
public boolean isEmpty( ) { return size == 0; }

public E first( int n) { // returns (but does not remove) the first element
 if (isEmpty( )) return null;
 if(n==1)
 return head.getElement1( );
else
  return head.getElement2();
 }
 
public E last( ) { // returns (but does not remove) the last element
 if (isEmpty( )) return null;
 return tail.getElement1( );
 }

 // update methods
 public void addFirst(E e,E f) { // adds element e to the front of the list
 head = new Node<E>(e,f, head); // create and link a new node
 if (size == 0)
 tail = head; // special case: new node becomes tail also
 size++;
 }
public void addLast(E e,E f) { // adds element e to the end of the list
 Node<E> newest = new Node<E>(e,f, null); // node will eventually be the tail
 if (isEmpty( ))
 head = newest; // special case: previously empty list
 else
 tail.setNext(newest); // new node after existing tail
 tail = newest; // new node becomes the tail
 size++;
 }
 
 public E removeFirst( ) { // removes and returns the first element
 if (isEmpty( )) return null; // nothing to remove
 E answer1 = head.getElement1( );
 E answer2 = head.getElement2( );
 head = head.getNext( ); // will become null if list had only one node
 size--;
 if (size == 0)
 tail = null; // special case as list is now empty
 return answer1;
 }
 
 public void display()
 {
	 if(isEmpty())
		 System.out.println("empty queue");
	 else
	 {
		 Node<E> n=head;
		 while(n!=null)
		 {
			 System.out.print(n.getElement2()+" ");
			 n=n.getNext();
		 }
	 }
        System.out.println();
  }
}
 