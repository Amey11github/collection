import java.util.*;

class Stack1<E>
{
	E [] arr;
	static final int INITIAL_CAPACITY=10;
	int indx;

	Stack1()
	{
		super();
		arr=(E[])new Object[INITIAL_CAPACITY];
	}

	Stack1(int capacity)
	{
		super();
		arr=(E[]) new Object[capacity];
	}

	public String toString()
	{
		String data="[";
		if(indx==0)
		{
			return "[]";
		}
		else{
			for(int i=0;i<size()-1;i++)
			{
				data+=arr[i]+", ";
			}
			data+=arr[size()-1]+"]";
		}

		return data;
	}

	public E push(E ele)
	{
		if(indx==arr.length)
		{
			E[] newArr=(E[])new Object[arr.length*2];
			for(int i=0;i<arr.length;i++)
			{
				newArr[i]=arr[i];
			}
			arr=newArr;
		}
		else{
			arr[indx++]=ele;
		}

		return ele;
	}

	public E pop()
	{
		E temp=arr[size()-1];
		arr[size()-1]=null;
		indx--;

		return temp;
	}

	public E peek()
	{
		return arr[size()-1];
	}

	public int size()
	{
		return indx;
	}

	public boolean empty()
	{
		return indx==0;
	}

	public int search(E ele)
	{
		for(int i=size()-1,offset=0;i>=0;i--,offset++)
		{
			if(arr[i].equals(ele))
			{
				return offset;
			}
		}

		return -1;
	}
}


class StackDriverExPrac
{
	public static void main(String[] args) {

		Stack1<Integer> stack=new Stack1<>();
		System.out.println("empty() : "+stack.empty());
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		stack.push(500);
		stack.push(600);
		stack.push(700);
		stack.push(800);

		System.out.println("after push() : "+stack);

		System.out.println("empty() : "+stack.empty());

		stack.pop();
		stack.pop();

		System.out.println("after pop() : "+stack);

		System.out.println("peek() : "+stack.peek());

		System.out.println("search(200) : "+stack.search(200));
	}
}