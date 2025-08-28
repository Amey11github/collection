//Enumeration cursor

import java.util.*;

class CursorEx2
{
	public static void main(String[] args) {
       
       Vector<Integer> vec=new Vector<>();
       vec.addElement(10);
       vec.addElement(20);
       vec.addElement(30);
       vec.addElement(40);
       vec.addElement(50);
       vec.addElement(60);

       System.out.println(vec);

       Enumeration<Integer> cursor=vec.elements();

       while(cursor.hasMoreElements())
       {
       	System.out.println(cursor.nextElement());
       }

       System.out.println(vec);



	}
}