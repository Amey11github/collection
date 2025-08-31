import java.util.LinkedList;

class NoSuchIndexFoundException extends RuntimeException
{
	NoSuchIndexFoundException(String desc)
	{
		super(desc);
	}
}

class MyIndexOutOfBoundsException extends RuntimeException
{
	public MyIndexOutOfBoundsException(String desc)
	{
		super(desc);
	}

}

class MyLinkedList<E>
{
	Node<E> head;
	Node<E> tail;
	int indx;

	private class Node<E>{
        E ele;
		Node<E> next;

		public Node(E ele)
		{
			this.ele=ele;
		}
	}

	public String toString()//1
	{
		String data="[";
		if(indx==0) return "[]";
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

	public void add(E ele)//2
	{
		Node<E> newNode=new Node<>(ele);

		if(indx==0)
		{
			head=newNode;
			tail=newNode;
		}
		else{
			// Node<E> currNode=head;
			// while(currNode.next!=null)
			// {
			// 	currNode=currNode.next;
			// }
			// currNode.next=newNode;
			// tail=newNode;
			tail.next = newNode; 
            tail = newNode;
		}
		indx++;
	}



	public void addFirst(E ele)//3
	{
		Node<E> newNode=new Node<>(ele);
		newNode.next=head;
		head=newNode;
		if(indx==0)
		{
			tail=newNode;
		}
		indx++;
	}

	public void addLast(E ele)//4
	{
		add(ele);
	}

	public E get(int indx)//5
	{
		if(indx<0 || indx>=size())
		{
			throw new MyIndexOutOfBoundsException("Index : "+indx+", size : "+size());
		}
		Node<E> currNode = head;
		for(int i=0;i<indx;i++)
		{
			currNode=currNode.next;
		}
		return currNode.ele;
	}

	public E set(int indx,E ele)//6
	{
		if(indx<0 || indx>=size())
		{
			throw new MyIndexOutOfBoundsException("Index : "+indx+", size : "+size());
		}
		Node<E> currNode=head;
		for(int i=0;i<indx;i++)
		{
			currNode=currNode.next;
		}
		E temp=currNode.ele;
		currNode.ele=ele;
		return temp;
	}

	public E getFirst()//7
	{
		if(indx==0)
		{
			throw new NoSuchIndexFoundException("");
		}
		return head.ele;
	}

	public E getLast()//8
	{
		if(indx==0)
		{
			throw new NoSuchIndexFoundException("");
		}
		return tail.ele;
	}

	public E removeFirst()//9
	{
		if(indx==0)
		{
			throw new NoSuchIndexFoundException("");
		}
		E temp=head.ele;
		head=head.next;
		if(indx==1)tail=null;
		indx--;

		return temp;
	}

	public E removeLast()//10
	{
		
		if(indx==0)
		{
			throw new NoSuchIndexFoundException("");
		}
		E temp = tail.ele;
		if(indx==1)
		{
			head=tail=null;
		}
		
		Node<E> currNode = head;
	    for(int i=0; i<indx-2; i++)
	    {
	        currNode = currNode.next;
	    }

	    currNode.next=null;
	    tail = currNode;   
	    if(indx==1)head=null;  
	    indx--;

		return temp;

	}

	public int size()//11
	{
		return indx;
	}


	public boolean contains(E el )//12
	{
		Node<E> check=head;

		for(int i=0;i<indx;i++)
		{
			E ele1=check.ele;
			if(ele1.equals(el))
			{
				return true;
			}
			check=check.next;
		}

		return false;
	}              

	public void clear()//13
	{
		head=tail=null;
		indx=0;
	}

	public void add(int indx,E ele)//14
	{
		if(indx<0 || indx>size())
		{
			throw new MyIndexOutOfBoundsException("Index : "+indx+", size : "+size());
		}
		Node<E> newNode=new Node<>(ele);
		if(indx==0)
		{
			addFirst(ele);
			return;
		}
		else if(indx==size())
		{
			addLast(ele);
			return;
		}
		Node<E> currNode=head;
		for(int i=0;i<indx-1;i++)
		{
			currNode=currNode.next;
		}
		Node<E> currNode2= currNode.next;
		currNode.next=newNode;
		newNode.next=currNode2;
		this.indx++;
	}

	public int indexOf(E ele)//15
	{
		Node<E> currNode=head;

		for(int i=0;i<size();i++)
		{
			if(ele.equals(currNode.ele))
			{
				return i;
			}
			currNode=currNode.next;
		}
		return -1;
	}

	public int lastIndexOf(E ele)//16
	{
      Node<E> currNode=head;
      int lastIndex=-1;
      for(int i=0;i<size();i++)
      {
           if(ele.equals(currNode.ele))
           {
           	lastIndex=i;
           }
           currNode=currNode.next;
      }
      return lastIndex;
	}
	
}

class MyLinkedListDriver
{
	public static void main(String[] args) {
		MyLinkedList<Integer> ll=new MyLinkedList<>();
		ll.add(10);//1
		ll.add(20);
		ll.add(30);
		ll.add(999);
		ll.add(989);
		ll.add(999);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		System.out.println(ll);

		ll.addFirst(1000);//2
		System.out.println(ll);

		System.out.println("getFirst() : "+ll.getFirst());

		System.out.println("getLast() : "+ll.getLast());

		System.out.println("removeFirst() : "+ll.removeFirst());
		System.out.println(ll);
		System.out.println("removeLast() : "+ll.removeLast());
		System.out.println(ll);

		System.out.println("addLast() : ");
		ll.addLast(900);
		System.out.println(ll);

		System.out.println(ll.contains(999));

		// ll.clear();
		System.out.println(ll);
		System.out.println(ll.indexOf(999));
		System.out.println(ll.lastIndexOf(999));

	}
}