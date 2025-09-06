import java.util.*;

class HashSetEx6
{
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<>();
		set.add("delhi");
		set.add("mumbai");
		set.add("pune");
		set.add("nashik");
		set.add("akola");

		System.out.println(set);

		System.out.println(set.contains("delhi"));
	}
}