 import java.util.*;

public class SubQueue<E> implements Queue<E> 
{	

int stime=0 ;

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
 
 
 
    ArrayList<FurtherSubQueue<E>> aL=new ArrayList<FurtherSubQueue<E>>();
	FurtherSubQueue<E> fsq;
    int max_furthersubqueue=2;
    int size=0;
 
 
 void splitFurther()
	{
		int y,s;
		
		if(size<max_furthersubqueue)
		{
			for(int i=0;i<size;i++)
			{
				if((aL.get(i)).time==0 || (aL.get(i)).free==true)
				{
					fsq=aL.get(i);
			       fsq.enque(topname(),toplang());
				   E lang=toplang();
			       deque();
				   
				   System.out.print("\n"+i+": ");
			       y=fsq.checkpaper(lang);
			       
			       //stime=
		           fsq.display();
				   
				   return;
				}
			}
				
					
			fsq=new FurtherSubQueue<E>();
			aL.add(fsq);
			fsq.enque(topname(),toplang());
			E lang=toplang();
			deque();
			
			System.out.print("\n"+size+": ");
			y=fsq.checkpaper(lang);
			
		    fsq.display();
			size++;
			if(size==max_furthersubqueue)
			{
				s=(aL.get(0)).time;
				for(int h=0;h<max_furthersubqueue;h++)
				{
					if(s<(aL.get(h)).time)
					  {
						  s=(aL.get(0)).time;
					  }
				}
				stime=s;	
			}
			
		}
		else
		{
			System.out.println("hello\n");
			int j=(aL.get(0)).time=0,t=0;
			s=j;
			for(int i=1;i<max_furthersubqueue;i++)
			{
				if((aL.get(i)).time<j)
				{
					s=j;
					j=(aL.get(i)).time;
					t=i;
				}
				else if((aL.get(i)).time<s)
					s=(aL.get(i)).time;
				
			}
			
			fsq=aL.get(t);
			fsq.enque(topname(),toplang());
			E lang=toplang();
			deque();
			System.out.print("\n"+t+": ");
			j=j+fsq.checkpaper(lang);
			
			stime = (s<j?s:j);
		    fsq.display();
			size++;
			
		}
	}
}
 
 
 