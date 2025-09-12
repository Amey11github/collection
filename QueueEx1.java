import java.util.*;

class QueueEx1
{
	public static void main(String[] args) {

		Queue<Integer> que=new PriorityQueue<>();

		for(int i=10;i<=190;i+=10)
			que.add(i);


		System.out.println(que);

		System.out.println("add() : "+que.add(200));
		System.out.println("offer() : "+que.offer(210));
		que.offer(220);
		System.out.println(que);
		System.out.println();

		System.out.println("remove() : "+que.remove());
		System.out.println(que);
		System.out.println("poll() : "+que.poll());
		System.out.println(que);
		System.out.println();	

		System.out.println("element() : "+que.element());
		System.out.println(que);
		System.out.println("peek() : "+que.peek());
		System.out.println(que);
	}
}