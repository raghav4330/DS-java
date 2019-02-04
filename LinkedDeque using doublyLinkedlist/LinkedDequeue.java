public class LinkedDequeue<E> implements Dequeue<E> 
{
private SinglyLinkedList<E> list = new SinglyLinkedList<E>( ); // an empty list
 public LinkedDequeue( ) { } // new stack relies on the initially empty list
 public int size( ) { return list.size( ); }

 public boolean isEmpty( ) { return list.isEmpty( ); }

 public void addFirst(E element) { list.addFirst(element); }
 public void addLast(E element) { list.addLast(element); }

 public E removeFirst( ) { return list.removeFirst( ); }
 public E removeLast( ) { return list.removeLast( ); }

 public E first( ) { return list.first( ); }
  public E last( ) { return list.last( ); }
  
  public void display()
  {
	  list.display();
  }
 

 }