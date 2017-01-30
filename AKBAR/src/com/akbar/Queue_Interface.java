package com.akbar;

import java.util.*;

public class Queue_Interface {
public static void main(String[] args) {
	Queue <Integer> queue= new LinkedList<>();
	queue.add(465);//will throw exception if it's over of declared size
	queue.offer(243);
	queue.add(134);
	queue.add(954);
	queue.add(465);
	
	//queue.remove(954);//will throw exception if list is empty
	queue.poll();
	
   for (Integer integer : queue) {
	System.out.println(integer);
   }
// to print first value
	System.out.println(queue.peek());
	
	Deque<Integer> deque=new ArrayDeque<>();
	deque.addLast(345);
	deque.addFirst(123);
	deque.push(23);
	deque.peekFirst();
	deque.peekLast();
	System.out.println(deque);
	deque.pop();
	System.out.println(deque);
//	for (Integer i : deque) {
//		System.out.println(i);
//		
//	}
	
	Stack stack= new Stack();
	stack.push(45);
	stack.push(65);
	stack.push(94);
	System.out.println(stack);
	stack.pop();
	System.out.println(stack);
	//last in---first out
}
}
