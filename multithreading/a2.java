class a2 implements Runnable
{

public void run()
{

		String name=Thread.currentThread().getName();
	 System.out.println(name+" started");
		 for(int i=0;i<10;i++)
		  System.out.println(name);
}
public static void main(String args[])
{

	ThreadGroup tg=new ThreadGroup("First");
	Thread t1=new Thread(tg,new a1(),"f1");
	Thread t2=new Thread(tg,new a1(),"f2");
	
	ThreadGroup tg2=new ThreadGroup(tg,"second");
	Thread t3=new Thread(tg2,new a2(),"f3");
	t1.start();
	t2.start();
	t3.start();
	System.out.println(tg2.getParent());
	System.out.println(tg.activeCount());
	System.out.println(tg2.activeCount());
	
}
}