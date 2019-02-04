class C extends Thread
{
   public void run()
   {
	   for(int i=0;i<10;i++)
		   System.out.println("thread1 in class C "+i);
   }
   public static void main(String args[])
   {
   C t1=new C(); 
   t1.start();
   }
}