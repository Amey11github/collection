import java.util.*;

class ArrayListEx1
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> arr1=new ArrayList<>();
		arr1.add(10);
		arr1.add(20);
		arr1.add(90);
		arr1.add(40);
		arr1.add(50);

		System.out.println(arr1);

		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;

		for(int i=0;i<arr1.size();i++)
		{
			int ele=arr1.get(i);
			if(ele>max)
				max=ele;
		    
		    if(ele<min)
		    	min=ele;
	    }
	      System.out.println("max : "+max);
	      System.out.println("min : "+min);
    }
}