import java.util.*;

class ForEachEx3
{
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		for(int i=1;i<=15;i++)
			list.add(i);

		System.out.println(list);

		list.stream().filter(ele->ele%2==0).forEach(ele-> System.out.print(ele+" "));

		System.out.println();

        List<Integer>opList=list.stream().filter(ele->ele%2==0).toList();
        System.out.println(opList);
	}
}