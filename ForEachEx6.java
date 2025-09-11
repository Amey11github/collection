import java.util.*;

class ForEachEx6
{
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		for(int i=1;i<=15;i++)
			list.add(i);

		list.stream().filter(ele->ele%2==0).forEach(ele->System.out.print(ele+" "));
	}
}