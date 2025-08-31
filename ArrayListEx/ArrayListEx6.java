import java.util.*;

class ArrayListEx6
{
	public static void main(String[] args) {
		ArrayList<Integer> arr1=new ArrayList<>();
		arr1.add(90);
		arr1.add(80);
		arr1.add(99);
		arr1.add(89);
		arr1.add(97);
		arr1.add(60);

		System.out.println(arr1);

		arr1.sort(Collections.reverseOrder());

		for(int c=0;c<3;c++)
		{
			System.out.println("Top "+(c+1)+": "+arr1.get(c));
		}

	}
}