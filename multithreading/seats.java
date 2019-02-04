class seats implements Runnable
{
int avail=3;
int wanted;

seats(int i)
{
	wanted=i;
}
public void run()
{
	synchronized(this)
	{
		String name=Thread.currentThread().getName();
		System.out.println(name);
		if(avail>=wanted)
		{
			avail=avail-wanted;
			System.out.println("tickets bought");
		}
	    else
	    {
	    	System.out.println("insufficient seats");
	    }
	}
}
public static void main(String args[])
{
	seats s=new seats(2);
	Thread t1=new Thread(s);
	Thread t2=new Thread(s);
	t1.setName("thread-1");
	t1.setName("thread-2");
	t1.start();
	t2.start();
}
}