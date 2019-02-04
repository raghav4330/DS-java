import java.util.Timer; 
import java.util.TimerTask;

public class FurtherSubQueue<E> extends TimerTask implements Queue<E> 
{	
int time=0;
boolean free=true;
int k=0;
Timer timer = new Timer(); 
TimerTask task;

private SinglyLinkedList<E> list = new SinglyLinkedList<E>( ); // an empty list

class times
{
	final static int c= 2;
	final static int cplus= 2;
	final static int java= 6;
	final static int python= 8;
}
      
	  
	  FurtherSubQueue()
	  {
		  task = this;
	  }
      
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
	  
	  int get_time(E lang)
	  {
		  if(lang.equals("C"))
			return times.c; 
		else if(lang.equals("C++"))
			return times.cplus;
		else if(lang.equals("java"))
			return times.java;
		else if(lang.equals("python"))
			return times.python;
		else return -1;
	  }
	  
	  int checkpaper(E lang)
	  { 
      free=false;	  
	    if(time==0 || k==0)
	    {
		  k=get_time(toplang());
		  time=time+k;
		
		  checking();
	    }
		else
			time=time+get_time(lang);
		
		System.out.println(lang+"time:"+time+"   ");
		return time;
	  }
	  
	  void checking()
	  {
		  timer.schedule(task, 0000,1000);
		  
	  }
	  
	  public void run() 
	{ 
	      time--;
		  k--;
	//System.out.println("checking "+k+"\n");
		if(time==0)
		{
			deque();
			free=true;
			this.cancel();
			System.out.println("checked all\n");
		}
		if(k==0 && time!=0)
		{
			System.out.println(toplang()+" checked\n");
			deque();
			k=get_time(toplang());
		}
	} 
}
 
 
 