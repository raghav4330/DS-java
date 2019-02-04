public class LinkedQueue<E> implements Queue<E> 
{
private SinglyLinkedList<E> list = new SinglyLinkedList<E>( ); // an empty list
 public LinkedQueue( ) { } // new stack relies on the initially empty list
 public int size( ) { return list.size( ); }

 public boolean isEmpty( ) { return list.isEmpty( ); }

 public void enque(E element) { list.addLast(element); }

 public E deque( ) { return list.removeFirst( ); }

 public E top( ) { return list.first( ); }
 public static void main(String args[])
 {
     Queue<Integer> lq=new LinkedQueue<Integer>();
	 lq.enque(5);
	 System.out.println(lq.top());
 }
 }