import java.util.LinkedList;

class LinkedListEx1<E>
{  
	Node<E> head;
	Node<E> tail;
	int indx;
	private class Node<E>
	{
       E ele;
       Node<E> next;

       public Node(E ele)
       {
       	this.ele=ele;
       }
    }

    public void add(E ele)
    {
    	Node<E> newNode=new Node<>(ele);
    	if(indx==0)
    	{
    		head=newNode;
    		tail=newNode;
    	}
    	else{
    		tail.next=newNode;
    		tail=newNode;
    	}
    	indx++;
    }

    public String toString()
    {
    	String data="[";
    	if(indx==0)return "[]";
    	else{
    		Node<E> currNode=head;
    		for(int i=0;i<indx-1;i++)
    		{
    			data+=currNode.ele+", ";
    			currNode=currNode.next;
    		}
    		data+=currNode.ele;
    	}

    	return data+"]";
    }

    public void addFirst(E ele)
    {
    	Node<E> newNode=new Node<>(ele);
    	if(indx==0)
    	{
    		head=newNode;
    		tail=newNode;
    	}
    	else{
    		newNode.next=head;
    		head=newNode;
    	}
    	indx++;
    }
	public static void main(String[] args) {
		LinkedListEx1<Integer> ll1=new LinkedListEx1<>();
		
		ll1.add(10);
		ll1.add(20);
		ll1.add(30);
		ll1.add(40);
        
		System.out.println(ll1);

		ll1.addFirst(1000);

		System.out.println(ll1);


		
	}
}