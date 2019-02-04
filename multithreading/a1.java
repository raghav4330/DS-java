class a1 implements Runnable
{
StringBuffer str1=new StringBuffer();
StringBuffer str2=new StringBuffer();
a1()
{
	str1.append("String 1 ");
    str2.append("String 2 ");
}

public void run()
{
     String name=Thread.currentThread().getName();
	 System.out.println(name+" started");
	 //Sleep(100);
		 for(int i=0;i<10;i++)
		  System.out.println(name);
	
}

}