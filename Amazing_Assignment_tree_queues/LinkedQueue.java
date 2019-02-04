
public class LinkedQueue<E> implements Queue<E> 
{	
private SinglyLinkedList<E> list = new SinglyLinkedList<E>( ); // an empty list

 public int size( ) { return list.size( ); }

 public boolean isEmpty( ) { return list.isEmpty( ); }

 public void enque(E element1,E element2) { list.addLast(element1,element2); }

 public E deque( ) { return list.removeFirst( ); }

 public E topname( ) { return list.first(1); }
 public E toplang( ) { return list.first(2); }
public void display()
{
	list.display();
}
 
 }
 
 
 