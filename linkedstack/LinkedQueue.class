public class LinkedStack<E> implements Stack<E> 
{
private SinglyLinkedList<E> list = new SinglyLinkedList<E>( ); // an empty list
 public LinkedStack( ) { } // new stack relies on the initially empty list
 public int size( ) { return list.size( ); }

 public boolean isEmpty( ) { return list.isEmpty( ); }

 public void push(E element) { list.addFirst(element); }

 public E top( ) { return list.first( ); }

 public E pop( ) { return list.removeFirst( ); }
 public static void main(String args[])
 {
     Stack<Integer> ls=new LinkedStack<Integer>();
	 ls.push(5);
	 System.out.println(ls.top());
 }
 }