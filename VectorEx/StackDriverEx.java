import java.util.*;

class StackEx<E>
{
	E[] arr;
	static final int INITIAL_CAPACITY=10;
	int indx;

	StackEx()
	{
		super();
		arr=(E[])new Object[INITIAL_CAPACITY];
	}
	StackEx(int capacity)
	{
		super();
		arr=(E[])new Object[capacity];
	}

	public int getCapcity(int oldCap)
	{
		return oldCap*2;
	}

	public int size()
	{
		return indx;
	}

	public int capacity()
	{
		return arr.length;
	}

	public E push(E ele)
	{
		if(indx==arr.length)
		{
			E [] newArr=(E[]) new Object[getCapcity(arr.length)];
			for(int i=0;i<indx;i++)
			{
				newArr[i]=arr[i];
			}
			arr=newArr;
		}
		arr[indx]=ele;
		indx++;
		return ele;
	}

	public String toString()
	{
		String data="[";
		if(indx==0) return "[]";
		else{
			for(int i=0;i<size()-1;i++)
			{
				data+=arr[i]+", ";
			}
			data+=arr[size()-1]+"]";
		}

		return data;
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

class StackDriverEx
{
	public static void main(String[] args) {
		StackEx<Integer> stack=new StackEx();
		System.out.println("empty() : "+stack.empty());
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		stack.push(80);
		stack.push(90);
		stack.push(100);
		System.out.println("size() : "+stack.size());
		stack.push(110);
		stack.push(120);
		stack.push(130);
		stack.push(140);
		stack.push(150);
		stack.push(160);
		System.out.println("size() : "+stack.size());

		System.out.println(stack);

		stack.pop();
		System.out.println("after pop() : "+stack);
		System.out.println("empty() : "+stack.empty());

		System.out.println("peek() : "+stack.peek());

		System.out.println("search(20) :"+stack.search(20));

	}
}