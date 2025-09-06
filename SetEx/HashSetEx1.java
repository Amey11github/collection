import java.util.*;

class HashSetEx1
{
	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<>();
		System.out.println("isEmpty() : "+set.isEmpty());
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(60);

		System.out.println(set);

		System.out.println(set.remove(20));
		System.out.println("remove(20) : "+set);

		System.out.println("size() : "+set.size());

		System.out.println("isEmpty() : "+set.isEmpty());

		System.out.println("contains(30) : "+set.contains(30));

		set.clear();
		System.out.println("after clear() : "+set);

	}
}