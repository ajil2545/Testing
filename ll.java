//Program to remove all the elements from a linked list
package Exam;
import java.util.*;
public class linkedList {

	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(1);
		System.out.println(l);
		l.addLast(2);
		System.out.println(l);
		l.addFirst(3);
		System.out.println(l);
		l.offer(4);
		System.out.println(l);
		l.offerFirst(5);
		System.out.println(l);
		l.push(6);
		System.out.println(l);
		l.pop();
		System.out.println(l);
		l.poll();
		System.out.println(l);
		l.pollLast();
		System.out.println(l);
		l.pollFirst();
		System.out.println(l);
		l.clear();
		System.out.println(l);
	}

}
