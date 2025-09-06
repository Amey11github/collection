import java.util.*;

class LinkedHashSetEx1
{
	public static void main(String[] args) {
		LinkedHashSet<Integer> set=new LinkedHashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);

		System.out.println(set);

		set.addFirst(100);
		System.out.print("after addFirst(100) : ");
		System.out.println(set);


        set.addLast(900);
		System.out.print("after addLast(900) : ");
		System.out.println(set);

		System.out.println("getFirst() : "+set.getFirst());

		System.out.println("getLast() : "+set.getLast());

		System.out.println("removeFirst() : "+set.removeFirst());
		System.out.println(set);

		System.out.println("removeLast() : "+set.removeLast());
        System.out.println(set);

        System.out.println("reversed() : "+set.reversed());


		
	}
}