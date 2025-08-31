import java.util.*;

class CursorEx4
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

		ListIterator<Integer> cursor = list.listIterator();

		System.out.println("forward traversing : ");

		while(cursor.hasNext())
		{
			System.out.println(cursor.nextIndex()+":"+cursor.next());
		}

		System.out.println("backward traversing : ");

		while(cursor.hasPrevious())
		{
			System.out.println(cursor.previousIndex()+":"+cursor.previous());
		}

		System.out.println("after remove odd elements : ");

		while(cursor.hasNext())
		{
			if(!(cursor.next()%2==0))
			{
				cursor.remove();
			}
		}
		System.out.println(list);

		System.out.println("after set(30) : ");

		while(cursor.hasPrevious())
		{
			if(cursor.previous().equals(4))
			{
				cursor.set(30);
			}
		}
		System.out.println(list);

        System.out.println("after add(40) : ");
		cursor.add(40);//adds at starts because pointer at previous
		System.out.println(list);

		while(cursor.hasNext())
		{
			cursor.next();

		}
		cursor.add(50);//adds at end because pointer at next
		System.out.println(list);


	}
}