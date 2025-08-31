import java.util.*;

class ListExample1
{
	public static void main(String[] args) {
		List <Integer> list1 = new ArrayList<>();

		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(60);

		System.out.println(list1);

		list1.add(2,90);//1
	    //-----------------------------------------------------

		System.out.println("add(int indx, E ele)"+list1);

		Collection<Integer> col1= new ArrayList<>();
		col1.add(110);
		col1.add(120);
		col1.add(130);
		col1.add(140);

		System.out.println(col1);

		list1.addAll(3,col1);//2
		System.out.println("addAll(int indx , collection col)"+list1);
		//-----------------------------------------------------

		list1.remove(3);//3

		System.out.println("remove(int indx)"+list1);
		//-----------------------------------------------------


		int ele=list1.get(4);//4

		System.out.println("get(int indx ) : "+ele);
		//-----------------------------------------------------


		list1.set(3,678);//5

		System.out.println("set(int indx, E ele) : "+list1);
		//-----------------------------------------------------


		int indx=list1.indexOf(130);//6

		System.out.println("indexOf(Object obj) : "+indx);
		//-----------------------------------------------------

        list1.add(9,30);
		int lindx=list1.lastIndexOf(30);

		System.out.println(list1);//7

		System.out.println("lastIndexOf(Object obj) : "+lindx);
		//-----------------------------------------------------

        System.out.println("subList(int fromIndx , int toIndx) : "+(list1.subList(2,5)));//8

		//-----------------------------------------------------
	}
}