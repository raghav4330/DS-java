public class CircularLinkedList<E> extends SinglyLinkedList<E>
{
    public void addLast(E e)
    { // adds element e to the end of the list
   Node<E> newest = new Node<E>(e, head); // node will eventually be the tail
   if (isEmpty( ))
   head = newest; // special case: previously empty list
   else
   tail.setNext(newest); // new node after existing tail
   
   tail = newest; // new node becomes the tail
   size++;
   }
   
  public E removeFirst( )
  { // removes and returns the first element
 if (isEmpty( ))
    return null; // nothing to remove
 
 E answer = head.getElement( );
 head = head.getNext( ); // will become null if list had only one node
 tail.setNext(head);
 size--;
 if (size == 0)
 {
 head=null;
 tail = null; // special case as list is now empty
 }
 return answer;
 }
}