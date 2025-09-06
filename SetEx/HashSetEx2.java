//Write a Java program to create a HashSet of integers and perform the following: add elements, remove an element, and check if a particular element exists.

import java.util.*;

class HashSetEx2
{
	public static void main(String[] args) {
      HashSet<Integer> set =new HashSet<>();
      set.add(10);
      set.add(20);		
      set.add(30);		
      set.add(40);		
      set.add(50);

      System.out.println(set);

      set.remove(50);

      System.out.println(set);		

      System.out.println(set.contains(30));

	}
}