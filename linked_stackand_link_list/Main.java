class Main
{
public static void main(String args[])
{
list<Integer> l=new linked_list<Integer>();
l.create_list(5);
l.create_list(3);
l.create_list(0);
l.display();
linked_stack<Integer> ls=new linked_stack<Integer>();
ls.push(5);
ls.push(9);
ls.push(0);
ls.display();
}
}