import java.util.*;

class SetEx
{
	public static void main(String[] args) {
		Set<Integer> set1=new HashSet<>();
		set1.add(10);
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(null);

		System.out.println(set1);
	}
}