public class LinkedQueue<E> implements CircularQueue<E> 
{
private CircularLinkedList<E> list = new CircularLinkedList<E>( ); // an empty list
 public LinkedQueue( ) { } // new stack relies on the initially empty list
 public int size( ) { return list.size( ); }

 public boolean isEmpty( ) { return list.isEmpty( ); }

 public void enque(E element) { list.addLast(element); }

 public E deque( ) { return list.removeFirst( ); }

 public E top( ) { return list.first( ); }
 public static void main(String args[])
 {
     CircularQueue<Integer> lq=new LinkedQueue<Integer>();
	 lq.enque(5);
	 lq.enque(55);
	 lq.enque(50);
	 System.out.println(lq.top());
 }
 }