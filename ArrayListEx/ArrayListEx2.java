import java.util.ArrayList;

class ArrayListEx2
{
	public static void main(String[] args) {
		ArrayList<String> arr1=new ArrayList<>();
		arr1.add("amey");
		arr1.add("vivek");
		arr1.add("vishal");
		arr1.add("hemant");
		arr1.add("aayush");
		arr1.add("ritik");

		System.out.println(arr1);

		String name="hemant";

		for(int i=0;i<arr1.size();i++)
		{
			String n1=arr1.get(i);
			if(n1.equals(name))
			{
				System.out.println(name+" found @ "+i);
				return;
			}
		}
		System.out.println(name+" not found");

	}
}