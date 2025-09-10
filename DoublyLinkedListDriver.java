import java.util.*;

class DLLEx<E>
{
	Node<E> head;
	Node<E> tail;
	int indx;

	class Node<E>
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
				return "[]";
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
	public void add(E ele)
	{
		Node<E> newNode=new Node<E>(tail,ele);
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

	public E remove(int indx)
	{
		Node<E> currNode=head;
		for(int i=0;i<indx-1;i++)
		{
			currNode=currNode.next;
		}
		E temp=currNode.ele;
		currNode.prev.next=currNode.next;
		currNode.next.prev=currNode.prev;
		this.indx--;
		return temp;
	}

	
	public int size()
	{
		return indx;
	}
}

class DoublyLinkedListDriver
{
	public static void main(String[] args) {
		DLLEx<Integer> dll=new DLLEx<Integer>();
		dll.add(10);
		dll.add(20);
		dll.add(30);
		dll.add(40);
		dll.add(50);
		dll.add(60);

		System.out.println(dll);

		System.out.println(dll.remove(2));
		System.out.println(dll);
		System.out.println(dll.remove(4));
		System.out.println(dll);

		
	}
}