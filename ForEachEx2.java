import java.util.*;

class ForEachEx2
{
	public static void main(String[] args) 
	{
		List<String> list=Arrays.asList("nitin","aayush","vishal","nayan","vijay");
        list.stream().filter(ele->ele.contentEquals(new StringBuffer(ele).reverse())).forEach(ele->System.out.println(ele));

       List<String>opList= list.stream().filter(ele->ele.contentEquals(new StringBuffer(ele).reverse())).toList();
       System.out.println(opList);

	}
}