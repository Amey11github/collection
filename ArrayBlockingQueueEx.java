import java.util.concurrent.*;
import java.util.*;

class ArrayBlockingQueueEx
{
	public static void main(String[] args) {
		Queue<Integer> q=new ArrayBlockingQueue(10);
		for(int i=1;i<=10;i++)
		{
			q.add(i);
		}

		System.out.println(q);

		Queue<Integer> q1=new ArrayBlockingQueue(20);
		for(int i=1;i<=25;i++)
		{
			q1.add(i);
		}

		System.out.println(q1);


	}
}