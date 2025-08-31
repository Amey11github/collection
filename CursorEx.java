import java.util.*;

class CursorEx
{
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(100);
		list.add("hello");
		list.add(78);
		list.add(false);
		list.add(89.90);
		list.add(89);
		list.add('a');
		list.add("world");

		System.out.println(list);

		Iterator iter = list.iterator();

		while(iter.hasNext())
		{

			if(!(iter.next() instanceof Integer))
			{
				iter.remove();
			}
			
		}

		System.out.println(list);


	}
}