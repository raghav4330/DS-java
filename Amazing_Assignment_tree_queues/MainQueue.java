
 import java.util.*;

enum language
{
   C,Cplusplus,java,python;
}

class MainQueue<E>
{
int maxsubqueues;
 ArrayList <SubQueue<String>> aL;
 SubQueue<String> sQ;  //FOR SubQueue //or  Queue<String> sQ
 Queue<String> lq=new LinkedQueue<String>();
 
MainQueue(int n)
{
	maxsubqueues=n;
    aL=new ArrayList<SubQueue<String>>(n);
}


void addinSubqueue(int sq)
{
	if(sq<maxsubqueues)
	   {
	       sQ=new SubQueue<String>();
	       aL.add(sQ);
	       sQ.enque(lq.topname(),lq.toplang());
		   sQ.splitFurther();
	       lq.deque();
		   System.out.print("\n Subqueue"+sq+" stime: "+sQ.stime+": ");
		   sQ.display();
	   }
	   else
	   {
		   int j=(aL.get(0)).stime,t=0 ; 
		   for(int i=1;i<maxsubqueues;i++)
			{
				if((aL.get(i)).stime<j)
				{
					j=(aL.get(i)).stime;
					t=i;
				}
			}
			
	       sQ=aL.get(t);
           sQ.enque(lq.topname(),lq.toplang());
		   sQ.splitFurther();
		   lq.deque();
		   System.out.print("\n Subqueue"+t+" stime: "+sQ.stime+": ");
		   sQ.display();
	   }
}

int getVal()
{
   Random rand = new Random();
   int rand_int1 = rand.nextInt(4);
   return  rand_int1; 
}

void addinMainqueue()
{
	 int i=0,sh,sq=0;
	 while(i<20)
	 {
	   sh=getVal();
	   language lang=language.values()[sh];
	   switch(lang)
	   {
	       case C:
	       lq.enque("raghav","C"); 
	       break;
	       
	       case Cplusplus:
	       lq.enque("raghav","C++"); 
	       break;
	       
	       case java:
	       lq.enque("raghav","java"); 
	       break;
	       
	       case python:
	       lq.enque("raghav","python"); 
	       break;
	   }
	   addinSubqueue(sq);
	   sq++;
	   i++;
	 }
	 lq.display();
 }
 
 public static void main(String args[])
 {
	 MainQueue mq=new MainQueue(4);
	 mq.addinMainqueue();
 }
}