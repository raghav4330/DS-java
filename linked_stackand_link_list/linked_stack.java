class node<e>
{
e data;
node<e> next;
}
class linked_stack<e> implements stack<e>
{
    node<e> head=null;
    node<e> create(e data)
    {
    node<e> temp=new node<e>();
    temp.data=data;
    temp.next=null;
    return temp;
    }
	
    public void push(e data)
    {
         //node<e> temp;
         node <e>temp=create(data);
		 temp.next=head;
		 head=temp;
	}
    
	
	public void display()
	{
	     node t=head;
		 if(head==null)
		    System.out.println(t.data);
		else
	     while(t!=null)
	     {
	     System.out.println(t.data);
	     t=t.next;
	     }
	}
	
	public e peek()
	{
	   if(head==null)
	    return null;
	else
	    return head.data;
	}
	
	public e pop()
	{
	   if(head==null)
	    return null;
	else
	  {
		 e n=head.data;
		 head=head.next;
		 return n;
	  }
	}
}
