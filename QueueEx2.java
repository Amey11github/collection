import java.util.*;

class QueueEx2
{
	public static void main(String[] args) {
		Queue<Integer> que=new PriorityQueue<>();
		que.add(10);
		que.add(20);
		que.add(30);
		que.add(40);
		que.add(50);
		que.add(60);

		System.out.println(que);

		System.out.println(que.offer(70))


	}
}