import java.util.Scanner;
import java.io.*;


class IncorrectHtmlTagFound extends Exception
{
    String found,required;
	int line;
	IncorrectHtmlTagFound(String f,String r,int l)
	{
	found=f;
	required=r;
	line=l;
	
	found="</"+found+">";
	required="</"+required+">";
	}
	public String toString()
	{
	return ("Incorrect Html Tag Found :"+line+"\nFound:"+found+"\nrequired:"+required);
	}
}
class TagsNotFound extends Exception
{
    static Stack<String> ls;
	static Stack<Integer> ls2;
	TagsNotFound(Stack<String> ls,Stack<Integer> ls2)
	{
		this.ls=ls;
		this.ls2=ls2;
	}
	public String toString()
	{
	String s="Closing Tags not found Exception for:\n";
	String ss=ls.pop();
	while(ss!=null)
    {
	s=s+ss+" at line "+ls2.pop();
	ss=ls.pop();
	s=s+"\n";
	}
	return s;
	}
}


class fetch
{
static Stack<String> ls=new LinkedStack<String>();
static Stack<Integer> ls2=new LinkedStack<Integer>();

static void findandchecktags(String str,int lineno) throws IncorrectHtmlTagFound
{
   int i,j,k;
   String s,ss;
   i=str.indexOf('<');
   while(i!=-1)
   {
   j=str.indexOf('>',i+1);
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
   if(s.charAt(0)=='/')
   {
   ss=s.substring(1);
   ss=ss.trim();
   //System.out.println(ss);
   if(ss.equals(ls.top()))
     {
	 ls.pop();
	 ls2.pop();
	 }
    else
      throw new IncorrectHtmlTagFound(ss,ls.top(),ls2.top());
   }
   else if(s.equals("br"))
   {}
   else
   {
   ls.push(s);
   ls2.push(lineno);
   }
   
   ls.display();
   System.out.println();
   i=str.indexOf('<',j+1);
   }
}
   
   public static void main(String args[]) throws FileNotFoundException
   {
   int c=1;
     try
     {
       Scanner ss=new Scanner(new File("html.txt"));
	
	   try
	   {
	     while(ss.hasNextLine())
	     {
	     String line=ss.nextLine();
	     findandchecktags(line,c++);
	     }
	   }
	   catch(IncorrectHtmlTagFound e)
	   {
	   System.out.println(e);
	   }
	   
	   try{
	   if(ls.isEmpty()==false)
	     throw new TagsNotFound(ls,ls2);
	   }catch(TagsNotFound t)
	     {System.out.println(t);}
		 
	   ss.close();
	 }
	 catch(Exception e)
	 {
	 System.out.println(e);
	 }
   }
}