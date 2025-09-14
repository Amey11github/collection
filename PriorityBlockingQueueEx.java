import java.util.*;
import java.util.concurrent.*;

class PriorityBlockingQueueEx
{
	public static void main(String[] args) {
		Queue<Integer> q=new PriorityBlockingQueue<>(10);

		for(int i=1;i<=25;i++)
		{
			q.add(i);
		}
		System.out.println(q);
		System.out.println(q.size());
		
	}
}