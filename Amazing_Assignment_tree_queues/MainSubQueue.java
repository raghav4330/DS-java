 import java.util.*;

class MainSubQueue<E>
{
	ArrayList<FurtherSubQueue<String>> aL=new ArrayList<FurtherSubQueue<String>>();
	FurtherSubQueue<String> fsq;
	int max_furthersubqueue=2;
    int size=0;
	
	void splitFurther(SubQueue<String> sq)
	{
		if(size<max_furthersubqueue)
		{
			fsq=new FurtherSubQueue<String>();
			aL.add(fsq);
			fsq.enque(sq.topname(),sq.toplang());
			sq.deque();
			
			System.out.println("\n"+size+": ");
		    fsq.display();
			size++;
			
		}
		else
		{
			fsq=aL.get(size%max_furthersubqueue);
			fsq.enque(sq.topname(),sq.toplang());
			sq.deque();
			
			System.out.println("\n"+size%max_furthersubqueue+": ");
		    fsq.display();
			size++;
			
		}
	}
}