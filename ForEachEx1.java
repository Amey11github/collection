import java.util.*;

class ForEachEx1
{
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,20,30,40,50,60);
		System.out.println(list);

		list.stream().forEach(ele->System.out.println(ele));
	}
}