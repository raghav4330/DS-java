class Main
{
	public static void main(String args[])
 {
     Dequeue<Integer> lq=new LinkedDequeue<Integer>();
	 lq.addLast(5);
	 lq.addFirst(3);
	 lq.addFirst(7);
	 lq.display();
	 System.out.println(lq.first());
	 lq.removeLast();
	 System.out.println("size="+lq.size());
	 lq.removeLast();
	 lq.display();
	 lq.removeFirst();
	 lq.display();
	 lq.addFirst(8);
	 lq.display();
	 lq.isEmpty();
	 System.out.println(lq.last());
	 //System.out.println(lq.top());
 }
}