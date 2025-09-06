import java.util.*;

class LinkedListEx1<E>{
       Node<E> head;
       Node<E> tail;
       int indx;

       class Node<e>
       {
       	  E ele;
       	  Node<E> next;

       	  public Node(E ele)
       	  {
       	  	this.ele=ele;
       	  	this.next=next;
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

       public void add(E ele)
       {
       	Node<E> newNode=new Node<>(ele);
       	if(indx==0)
       	{
           head=newNode;
           tail=newNode;
       	}else{
       		tail.next=newNode;
       		tail=newNode;
       	}
       	indx++;
       }

       public void addFirst(E ele)
       {
       	Node<E> newNode=new Node<>(ele);
       	if(indx==0)
       	{
       		head=newNode;
       		tail=newNode;
       	}else{
       		newNode.next=head;
       		head=newNode;
       	}
       	indx++;
       }

       public void addLast(E ele)
       {
       	add(ele);
       }

       public E removeFirst()
       {
       	E temp=head.ele;
       	head=head.next;
       	indx--;
       	return temp;
       }

       public E removeLast()
       {
       	E temp=tail.ele;
       	Node<E> currNode=head;
       	for(int i=0;i<size()-2;i++)
       	{
       		currNode=currNode.next;
       	}
       	currNode.next=null;
       	tail=currNode;
       	indx--;

       	return temp;
       }

       public int size()
       {
       	return indx;
       }
}

class LinkedListExDriver
{
	public static void main(String[] args) {

		LinkedListEx1<Integer> list=new LinkedListEx1<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);

		list.addFirst(9000);
		System.out.println(list);

		list.removeFirst();
		System.out.println(list);

		list.removeLast();
		System.out.println(list);

		
	}
}