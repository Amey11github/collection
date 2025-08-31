import java.util.*;

class NoSuchElementFoundException extends RuntimeException
{
	NoSuchElementFoundException()
	{

	}
}
class MyIndexOutOfBoundsException extends RuntimeException
{
	MyIndexOutOfBoundsException(String desc)
	{
		super(desc);
	}
}

class DoublyLinkedList<E>
{
	Node<E> head;
	Node<E> tail;
	int indx;

	private class Node<E>{
		Node<E> prev;
		Node<E> next;
		E ele;

		public Node(Node<E> prev, E ele)
		{
			this.prev=prev;
			this.ele=ele;
		}

	}

	public String toString()//1
	{
		String data="[";
		if(indx==0)
		{
			return "[]";
		}
		else{
			Node<E> currNode=head;
			for(int i=0;i<size()-1;i++)
			{
				data+=currNode.ele+", ";
				currNode=currNode.next;
			}
			data+=currNode.ele+"]";
		}
		return data;
	}

	public void add(E ele)//2
	{
		Node<E> newNode=new Node<>(tail,ele);
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

	public void addFirst(E ele)//3
	{
		Node<E> newNode=new Node<>(null,ele);
		if(indx==0)
		{
			head=newNode;
			tail=newNode;
		}
		else{
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
		indx++;
	}

	public int size()//4
	{
		return indx;
	}

	public void addLast(E ele)//5
	{
		add(ele);
	}

	public E removeFirst()//6
	{
		if(indx==0)
		{
			throw new NoSuchElementFoundException();
		}
		E temp=head.ele;

		if(indx == 1) {
	        head = null;
	        tail = null;
	    }
		else{
			head=head.next;
			head.prev=null;
		}
		indx--;
		return temp;
	}

	public E removeLast()//7
	{
		if(indx==0)
		{
			throw new NoSuchElementFoundException();
		}
		E temp=tail.ele;
		if(indx==1)
		{
           head=null;
           tail=null;
		}
		else{
			tail=tail.prev;
			tail.next=null;
		}
		indx--;

		return temp;

	}

	public E get(int indx)//8
	{
		if(indx<0 || indx>=size())
		{
			throw new MyIndexOutOfBoundsException("Index "+indx+" , size : "+size());
		}
		if(this.indx==0)
		{
			throw new MyIndexOutOfBoundsException("Index "+indx+" , size : "+size());
		}
		Node<E> currNode=head;
		for(int i=0;i<indx;i++)
		{
			currNode=currNode.next;
		}
		return currNode.ele;
	}

	public E remove(int indx)
	{
		Node<E> currNode=head;
		if(indx<0 || indx>=size())
		{
			throw new MyIndexOutOfBoundsException("Index "+indx+" , size : "+size());
		}
		if(this.indx==0)
		{
			throw new MyIndexOutOfBoundsException("Index "+indx+" , size : "+size());
		}
		if(indx==0)
		{
			return removeFirst();
		}
		else if(indx==size()-1)
		{
			return removeLast();
		}
		else{

			for(int i=0;i<indx;i++)
			{
				currNode=currNode.next;
			}
		}
		E temp=currNode.ele;
		currNode.prev.next=currNode.next;
		currNode.next.prev=currNode.prev;
		this.indx--;
        
        return temp;
	}

	public String reverseOrder()
	{
		Node<E> currNode=tail;
		String data="[";
		for(int i=size()-1;i>0;i--)
		{
           data+=currNode.ele+", ";
           currNode=currNode.prev;
		}
		data+=currNode.ele;

		return data+"]";
	}

	public int indexOf(E ele)
	{
		Node<E> currNode=head;
		for(int i=0;i<size();i++)
		{
			if((currNode.ele).equals(ele))
			{
				return i;
			}
			currNode=currNode.next;
		}
		return -1;
	}

	public int lastIndexOf(E ele)
	{
		Node<E> currNode=head;
		int lastIndx=-1;
		for(int i=0;i<size();i++)
		{
			if((currNode.ele).equals(ele))
			{
				lastIndx=i;
			}
			currNode=currNode.next;
		}
		return lastIndx;
	}
	
}

class DoublyLinkedListDriver{
	public static void main(String[] args) {
		DoublyLinkedList<Integer> dll=new DoublyLinkedList<>();
		dll.add(10);
		dll.add(20);
		dll.add(30);
		dll.add(40);
		dll.add(50);
		dll.add(10);
		System.out.println(dll);

		dll.addFirst(1000);
		dll.addFirst(2000);
		dll.addFirst(3000);
		System.out.println("addFirst() : "+dll);

		dll.addLast(9000000);

		System.out.println("addLast() : "+dll);

		System.out.println("removeFirst() : "+dll.removeFirst());
		System.out.println(dll);
		System.out.println("removeLast() : "+dll.removeLast());
		System.out.println(dll);
		System.out.println(dll.get(0));
		System.out.println(dll.get(dll.size()-1));
		System.out.println(dll.get(dll.size()-2));
		System.out.println(dll.remove(3));
		System.out.println(dll);
		System.out.println(dll.get(3));
		System.out.println(dll.reverseOrder());

		System.out.println(dll);

		System.out.println(dll.indexOf(30));
		System.out.println(dll.lastIndexOf(10));
	}
}