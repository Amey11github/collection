import java.util.*;

class ForEachEx4
{
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		list.forEach(ele->System.out.println(ele));

	}
}