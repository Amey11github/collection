import java.util.ArrayList;

class ArrayListEx3
{
	public static void main(String[] args) {
		ArrayList<Integer> arr1=new ArrayList<>();
		arr1.add(10);
		arr1.add(20);
		arr1.add(30);
		arr1.add(40);
		arr1.add(50);
		arr1.add(60);
		arr1.add(70);
		arr1.add(80);
		arr1.add(90);
		arr1.add(100);

		System.out.println(arr1);

		int i=arr1.size()-1;
		while(i!=-1)
		{
			System.out.print(arr1.get(i)+" ");
			i--;
		}

	}
}