import java.util.*;

class CollectionEx2
{
	public static void main(String[] args) {
		Collection<Integer> col=new ArrayList<>();
        
        System.out.println("add() : "+col.add(10));
		col.add(20);
		col.add(30);
		col.add(40);
		col.add(50);
		col.add(60);

		System.out.println(col);

		Collection<Integer> col2=new ArrayList<>();
		col2.add(10);
		col2.add(70);

		System.out.println("containsAll() : "+col.containsAll(col2)); //1


		System.out.println("isEmpty() : "+col.isEmpty());  //2

		System.out.println("addAll() : "+col.addAll(col2));  //3

		System.out.println(col);

		System.out.println("size() : "+col.size());  //4

		System.out.println("contains() : "+col.contains(10));  //5

		System.out.println("remove() : "+col.remove(10)); //6
		System.out.println(col);

		System.out.println("removeAll() : "+col.removeAll(col2));  //7
		System.out.println(col);

		col2.clear();
		System.out.println("clear() : "+col2);//8

		System.out.println("toArray() : "+col.toArray().toString());//9
        
        Collection<Integer> col3=new ArrayList<>();
        col3.add(20);
        col3.add(40);
        System.out.println(col3);
		System.out.println("retainAll() : "+col.retainAll(col3));  //10
		System.out.println(col);

		

	}
}