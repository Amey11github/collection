import java.util.*;

class CollectionEx
{
	public static void main(String[] args) {

      ArrayList<Integer> list=new ArrayList<>();
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(10);
      list.add(50);
      list.add(60);

      System.out.println(list);

      Collections.reverse(list);//1
      System.out.println("After reverse(list) : "+list);

      Collections.replaceAll(list,10,100);//2
      System.out.println("replaceAll() : "+list);

      Collections.shuffle(list);//3
      System.out.println("shuffle() : "+list);

      Collections.swap(list,1,3);//4
      System.out.println("After swap(list,1,3)"+list);

      Collections.rotate(list,3);//5
      System.out.println("list after rotate() : "+list);

      System.out.println("max() :"+Collections.min(list));//6
      System.out.println("min() :"+Collections.max(list));//7

      // Collections.fill(list,100);//8
      // System.out.println("fill() : "+list);

      ArrayList<Integer> list2=new ArrayList<>();
      list2.add(1);
      list2.add(2);
      list2.add(3);
      list2.add(4);
      list2.add(5);
      list2.add(6);

      System.out.println("Before copy() : "+list2);

      Collections.copy(list2,list);//9
      System.out.println("After list2 copy() : "+list2);
      System.out.println("After list copy () :"+list);		
	}
}