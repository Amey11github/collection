import java.util.*;

class HashSetEx3
{
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<>();
		set.add("amey");
		set.add("vivek");
		set.add("ayush");
		set.add("vishal");
		set.add("hemant");

		Iterator itr=set.iterator();

		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}