class r2 implements Runnable
{
r1 r;
StringBuffer str1=new StringBuffer();
StringBuffer str2=new StringBuffer("class r2 ");

r2(r1 q)
{
	r=q;
}

public void run()
{
	String name=Thread.currentThread().getName();
		synchronized(this)
		{
			System.out.println(name);
         for(int i=0;i<5;i++)
		 {
			 r.str2.append(i);
			System.out.println(r.str2);
		 }
		}
		
}
public static void main(String args[])
{
	r1 r=new r1();
	r2 a=new r2(r);
	Thread t1=new Thread(r);
	Thread t2=new Thread(a);
	t1.setName("thread 1");
	t1.setName("thread 2");
	t2.setPriority(8);
	t1.start();
	t2.start();
	
}
}