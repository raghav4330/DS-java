class r1 implements Runnable
{
StringBuffer str1=new StringBuffer();
StringBuffer str2=new StringBuffer();
r1()
{
	str1.append("String 1 ");
    str2.append("String 2 ");
}

public void run()
{
	synchronized(this)
	{
		String name=Thread.currentThread().getName();
		System.out.println(name);
		 for(int i=0;i<5;i++)
		 {
			 str1.append(i);
			System.out.println(str1);
		 }
		  
	}
}

}