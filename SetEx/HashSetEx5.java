import java.util.*;

class HashSetEx5
{
	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);

		System.out.println(set);

		set.clear();

		System.out.println(set);

	}
}