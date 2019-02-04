 public class SinglyLinkedList<E> {
  //---------------- nested Node class ----------------
  
private static class Node<E> {
 private E element; // reference to the element stored at this node
private Node<E> next; // reference to the subsequent node in the list
private Node<E> prev;

public Node(E e, Node<E> n,Node<E> p) 
{
 element = e;
 next = n;
 prev=p;
 }
 
public E getElement( )
 { return element; }
 
 public Node<E> getNext( ) { return next; }
 public Node<E> getPrev( ) { return prev; }
 
 public void setNext(Node<E> n) { next = n; }
 public void setPrev(Node<E> p) { prev = p; }
 
 }

										//----------- end of nested Node class -----------
                                        // instance variables of the SinglyLinkedList
										
										
										
										
 
 private Node<E> head = null; // head node of the list (or null if empty)
 private Node<E> tail = null; // last node of the list (or null if empty)
 private int size = 0; // number of nodes in the list
 
 public SinglyLinkedList( ) { } // constructs an initially empty list
// access methods
 public int size( ) { return size; }
public boolean isEmpty( ) { return size == 0; }

public E first( ) { // returns (but does not remove) the first element
 if (isEmpty( )) return null;
 return head.getElement( );
 }
 
public E last( ) { // returns (but does not remove) the last element
 if (isEmpty( )) return null;
 return tail.getElement( );
 }

 // update methods
 public void addFirst(E e) { // adds element e to the front of the list
 head = new Node<E>(e, head,null); // create and link a new node
 if (size == 0)
 tail = head; // special case: new node becomes tail also
else
{
	Node<E> t=head.getNext();
	t.setPrev(head);
}
 size++;
 }
public void addLast(E e) { // adds element e to the end of the list

 Node<E> newest = new Node<E>(e, null,null); // node will eventually be the tail
 if (isEmpty( ))
 head = newest; // special case: previously empty list
 else
 {
     tail.setNext(newest); // new node after existing tail
	 newest.setPrev(tail);
 }
 tail = newest; // new node becomes the tail
 size++;
 }
 
 public E removeFirst( ) { // removes and returns the first element
 if (isEmpty( )) return null; // nothing to remove
 E answer = head.getElement( );
 head = head.getNext( ); // will become null if list had only one node
 size--;
 if (size == 0)
   tail = null; // special case as list is now empty
else
	head.setPrev(null);
 return answer;
 }
 
 public E removeLast()
 {
	 if(isEmpty())
		 return null;
	 E answer=tail.getElement();
	 tail=tail.getPrev();
	 size--;
	 if(size==0)
	 head=null;
    else
		tail.setNext(null);
	return answer;
 }
 
 public void display()
 {
	 System.out.println();
	 Node<E> t=head;
	 if(t==null)
		 System.out.println("empty queue");
	 else
	 {
		 while(t!=null)
		 {
			 System.out.print(t.getElement()+" ");
			 t=t.getNext();	 
		 }
		 System.out.println();
	 }
 }
}
 