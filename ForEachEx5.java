import java.util.*;

class ForEachEx5
{
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		for(int i=1;i<=15;i++)
			list.add(i);

		list.forEach(ele->System.out.println(ele+" : "+ele*ele));
	}
}