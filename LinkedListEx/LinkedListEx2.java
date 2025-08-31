import java.util.LinkedList;

class MyLinkedList2<E>
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

	public String toString()
	{
		String data="[";
		if(indx==0)return "[]";
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
		Node<E> newNode=new Node<>(ele);
		if(head==null)
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

	public void addFirst(E ele)
	{
		Node<E> newNode=new Node<>(ele);
		if(head==null)
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

	public void addLast(E ele)
	{
		add(ele);
	}
	public int size()
	{
		return indx;
	}

}
class LinkedListEx2
{
	public static void main(String[] args) {
		MyLinkedList2<Integer> mll=new MyLinkedList2<>();
		mll.add(10);
		mll.add(20);
		mll.add(30);
		mll.add(40);

		System.out.println(mll);

		mll.addFirst(100);

		System.out.println(mll);

		
	}
}