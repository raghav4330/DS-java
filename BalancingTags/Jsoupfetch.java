import java.util.Scanner;
import java.io.*;
 import java.io.IOException;
      import org.jsoup.Jsoup;
      import org.jsoup.nodes.Document;


class fetch
{
static Stack<String> ls=new LinkedStack<String>();
static Stack<Integer> ls2=new LinkedStack<Integer>();

static void findandchecktags(String str,int lineno) throws IncorrectHtmlTagFound
{
   int i,j,k,end,last,t;
   String s,ss,data;


   i=str.indexOf('<');
   while(i!=-1)
   {
		t=j=str.indexOf('>',i+1);
		k=str.indexOf(' ',i+1);
		if(j==-1)
		{
			i=str.indexOf('<',i+1);
			continue;
		}	   
		if(k!=-1 && k<j)
			j=k;
		s=str.substring(i+1,j);
		s=s.trim();
		//System.out.println(s);
		if(s.equals("title")||s.equals("h1"))
		{
			String rev="/"+s;
			end=str.indexOf(rev,j);
			System.out.println(j+" "+end);
			data=str.substring(t+1,end-1);
			System.out.println(data);
			j=end+rev.length();
			   
			//breakwords(data);
		}
			
		//System.out.println(s);
		i=str.indexOf('<',j+1);
   }
}
   
   public static void main(String args[]) throws FileNotFoundException
   {
   int c=1;
   String line="";
   Element a;
     try
     {
       Scanner ss=new Scanner(new File("html.txt"));
	
	     while(ss.hasNextLine())
	     {
	     String s=ss.nextLine();
	     line=line+s;
	     }
		 findandchecktags(line,c++);
	 }
	  catch(Exception e)
	 {
	 System.out.println(e);
	 }
	}
}.  