class Main
{
public static void main(String args[])
{
Runnable r1=new A();
Thread t1=new Thread(r1);
Thread t2=new Thread(new B()); 
t1.start();
t2.start();
}
}