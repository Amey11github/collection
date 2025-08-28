//Iterator cursor

import java.util.*;

class CursorEx3
{
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);

		System.out.println(list);

		Iterator<Integer> cursor = list.iterator();

		while(cursor.hasNext())
		{
			System.out.println(cursor.next());
		}

		System.out.println(list);

		 cursor=list.iterator();// reinitialize cursor

		while(cursor.hasNext())
		{
			if(cursor.next()%2!=0)
			{
				cursor.remove();
			}
		}

		System.out.println(list);


		
	}
}