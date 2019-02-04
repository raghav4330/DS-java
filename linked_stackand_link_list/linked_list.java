class node<e>
{
e data;
node next;
}
class linked_list<e> implements list<e>
{
    node head=null;
	node tail=null;
    node create(e data)
    {
    node<e> temp=new node<e>();
    temp.data=data;
    temp.next=null;
    return temp;
    }
	
    public void create_list(e data)
    {
         //node<e> temp;
         if(head==null)
         {
         head=create(data);
         tail=head;
         }
         else
         {
         node <e>temp=create(data);
         tail.next=temp;
         tail=temp;
		 }
    }
	public void display()
	{
	     node t=head;
	     while(t!=null)
	     {
	     System.out.println(t.data);
	     t=t.next;
	     }
	}
}
