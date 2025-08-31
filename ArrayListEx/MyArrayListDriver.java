import java.util.*;

class MyArrayListIndexOutOfBoundException extends RuntimeException
{
		public MyArrayListIndexOutOfBoundException(String desc)
		{
			super(desc);
		}
}

class MyArrayList<E>
{
	public static final int DEFAULT_CAPACITY=10;

	E[] arr;
	public int indx;

	public MyArrayList()
	{
		this(DEFAULT_CAPACITY);
	}

	public MyArrayList(int capacity)
	{
		arr=(E[]) new Object[capacity];
	}

	public MyArrayList(MyArrayList coll)
	{
		arr=(E[]) new Object[coll.size()];

		for(int i=0;i<coll.size();i++)
		{
			arr[i]=(E)coll.get(i);
		}
	}

	@Override
	public String toString()//1
	{
		if(size()==0)
			return "[]";

		String data ="[";
		for(int i=0;i<size()-1;i++)
		{
			data+=arr[i]+", ";
		}
		data+=arr[indx-1]+"]";

		return data;
	}

	public int size()//2
	{
		return indx;
	}

	public boolean add(E element)//3
	{
		if(arr.length==size())
		{
			E[] newArr = (E[])new Object[getCapacity(arr.length)];
			for(int i=0;i<size();i++)
			{
				newArr[i]=arr[i];
			}
			arr=newArr;
		}
		arr[indx++]=element;
		return true;
	}

	public void add(int indx,E ele)//4
	{
		if(indx<0 || indx>=size())
		{
			throw new MyArrayListIndexOutOfBoundException("Index "+indx+" out of bounds for length "+size());
		}

		if(arr.length == size())
		{
			E[] newArr=(E[])new Object[getCapacity(arr.length)];
			for(int i=0;i<size();i++)
			{
				newArr[i]=arr[i];
			}
			arr = newArr;
		}

		for(int i=size()-1;i>=indx;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[indx]=ele;
		this.indx++;
	}

	public boolean addAll(MyArrayList coll)//5
	{
		boolean flag=false;
		for(int i=0;i<coll.size();i++)
		{
			if(add((E)coll.get(i)))
			{
				flag=true;
			}
		}

		return flag;
	}

	private int getCapacity(int oldCap)//6
	{
		return (int)(oldCap*1.5);
	}

	public boolean isEmpty()//7
	{
		return (size()!=0)? false : true;
	}

	public E get(int indx)//8
	{
		if(indx<0 || indx>=size())
		{
			throw new MyArrayListIndexOutOfBoundException("Index "+indx+" out of bounds for length "+size());
		}
		return arr[indx];
	}

	public E set(int indx,E element)//9
	{
		if(indx<0 || indx>=size())
		{
			throw new MyArrayListIndexOutOfBoundException("Index "+indx+" out of bounds for length "+size());
		}
		E temp = arr[indx];
		arr[indx]= element;
		return temp;
	}

	public void clear()//10
	{
		arr=(E[])new Object[arr.length];
		indx=0;
	}

	public boolean contains(E element)//11
	{
		for(int i=0;i<size();i++)
		{
			if(arr[i].equals(element)) return true;
		}

		return false;
	}

	public boolean containsAll(MyArrayList coll)//12
	{
		for(int i=0;i<coll.size();i++)
		{
			if(contains((E)coll.get(i)))
			{
				return true;
			}
		}

		return false;
	}

	public boolean remove(int indx)//13
	{
		if(indx<0 || indx>=size())
		{
			throw new MyArrayListIndexOutOfBoundException("Index "+indx+" out of bounds for length "+size());
		}

		for(int i=indx;i<size();i++)
		{
			arr[i]=arr[i+1];
		}
		this.indx--;
		return true;
	}

	public int indexOf(E element)//14
	{
		for(int i=0;i<size();i++)
		{
			if(arr[i].equals(element)) return i;
		}

		return -1;
	}

	public int lastIndexOf(E element)//15
	{
		for(int i=size()-1;i>=0;i--)
		{
			if(arr[i].equals(element)) return i;
		}

		return -1;
	}

	public boolean removeAll(MyArrayList coll)//16
	{
		boolean flag=false;
		for(int i=0;i<coll.size();i++)
		{
			int eleIndx=indexOf((E)coll.get(i));
			if(eleIndx!=-1)
			{
				if(remove(eleIndx)) flag = true;
			}
		}
		return flag;
	}

	public boolean retainAll(MyArrayList<E> coll) //17
	{
	    boolean retain = false;
	    int newIndx = 0;

	    for (int i = 0; i < size(); i++) {
	        if (coll.contains(arr[i])) {
	            arr[newIndx++] = arr[i];  
	        } else {
	            retain = true;          
	        }
	    }
	    
	    indx = newIndx;
	    return retain;
    }

}

class MyArrayListDriver
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		// ArrayList<Integer> list1=new ArrayList<>();
		// System.out.println(list1);

		MyArrayList<Integer> list2 = new MyArrayList<>();
		// System.out.println(list2);
		list2.add(10);//1
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(50);
		list2.add(60);
		list2.add(70);


		System.out.println(list2);

		MyArrayList<Integer> list3=new MyArrayList<>();
		list3.add(30);
		list3.add(50);
		list3.add(90);


		list2.retainAll(list3);
		System.out.println(list2);


		
	}
}