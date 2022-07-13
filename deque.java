//adding deleteing elements in deque.
package Exam;
import java.util.*;
public class deque
{

	public static void main(String[] args)
	{
		Deque<String> deque = new LinkedList<String>();
		deque.add("Car");
		deque.add("Bike");
		System.out.println(deque);
		deque.addFirst("Bus");
		System.out.println(deque);
		deque.addLast("Lorry");
		System.out.println(deque);
		deque.push("Truck");
		System.out.println(deque);
		deque.offerFirst("Tractor");
		System.out.println(deque);
		System.out.println(deque.pop());
		System.out.println(deque);
		System.out.println(deque.poll());
		System.out.println(deque);
		System.out.println(deque.pollFirst());
		System.out.println(deque);
		System.out.println(deque.pollLast());
		System.out.println(deque);
	}

}
