import java.util.*;

class ArrayListEx7
{
	public static void main(String[] args) {
		ArrayList<String> arr1=new ArrayList<>();
		arr1.add("amey");
		arr1.add("vivek");
		arr1.add("ayush");
		arr1.add("vishal");
		arr1.add("ritik");
		arr1.add("hemant");
		arr1.add("manoday");
		arr1.add("piyush");

		System.out.println(arr1);

		for(int i=0;i<arr1.size();i++)
		{
			String name=arr1.get(i);
			int len=name.length();

			if(len==5)
			{
				System.out.println(name);
			}
		}

	}
}