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

class DoublyLL<E>
{
	Node<E> head;
	Node<E> tail;
	int indx;

	private class Node<E>
	{
		Node<E> prev;
		Node<E> next;
		E ele;
		
		Node(Node<E> prev,E ele)
		{
          this.prev=prev;
          this.ele=ele;
		}
	}

	public String toString()
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

	public int size()
	{
		return indx;
	}

	public void add(E ele)
	{
		Node<E> newNode =new Node<>(tail,ele);
		if(indx==0)
		{
           head=newNode;
           tail=newNode;
		}
		else{
			tail.next=newNode;
			newNode.prev=tail;
			tail=newNode;
		}
		indx++;
	}

	public void addFirst(E ele)
	{
		Node<E> newNode = new Node<>(null,ele);
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

	public E get(int indx)
	{
		if(indx<0 || indx>size())
		{
			throw new MyIndexOutOfBoundsException("Index "+indx+" ,size : "+size());
		}
		if(this.indx==0)
		{
			throw new NoSuchElementFoundException();
		}
		Node<E> currNode=head;
		if(indx==0)
		{
			return head.ele;
		}
		else{
			

			for(int i=0;i<indx;i++)
			{
				currNode=currNode.next;
			}

		}
		return currNode.ele;
	}

	public E remove(int indx)
	{
		
	}
}
class DLLEx
{
	public static void main(String[] args) {
		DoublyLL<Integer> dll=new DoublyLL<>();
		dll.add(10);
		dll.add(20);
		dll.add(30);
		dll.add(40);

		System.out.println(dll);

		dll.addFirst(100);
		dll.addFirst(200);
		dll.addFirst(300);

		System.out.println(dll);

		System.out.println(dll.get(0));
		System.out.println(dll.get(1));
		System.out.println(dll.get(dll.size()-1));
		System.out.println(dll.get(dll.size()-2));
		System.out.println(dll.get(10));



		
	}
}