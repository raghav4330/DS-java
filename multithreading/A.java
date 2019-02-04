class A implements Runnable
{
   public void run()
   {
	   for(int i=0;i<10;i++)
		   System.out.println("thread1 in class A "+i);
   }
}