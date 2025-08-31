import java.util.*;

class ArrayList8
{
	public static void main(String[] args) {
		ArrayList<Integer> arr1=new ArrayList<>();
		arr1.add(10);
		arr1.add(20);
		arr1.add(30);

		ArrayList<Integer> arr2=new ArrayList<>();
		arr2.add(40);
		arr2.add(50);
		arr2.add(60);

		ArrayList<Integer> arr3=new ArrayList<>();

		arr3.addAll(arr2);
		arr3.addAll(arr1);

		System.out.println(arr3);
		


		
	}
}