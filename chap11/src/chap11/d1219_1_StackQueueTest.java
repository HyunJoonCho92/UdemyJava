package chap11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class d1219_1_StackQueueTest {

	public static void main(String[] args) {
		
		Stack st = new Stack(); //동적크기. 중복 저장, 마지막 저장 데이터를 우선 조회
		
		st.push(1);
		st.push(2);
		st.push(3);
		
		while(!st.isEmpty()) {
			System.out.println(st.pop()); // 꼭대기 조회 후 삭제
		}
		
//		System.out.println(st.peek()); // 꼭대기 조회
//		System.out.println(st.pop());
//		System.out.println(st.pop());
//		System.out.println(st.pop());
		
		System.out.println("=====================================");
		Queue qu = new LinkedList(); //동적크기. 중복 저장, 가장 처음 저장데이터를 우선 조회
		qu.offer(1);
		qu.offer(2);
		qu.offer(3);
		
		while(!qu.isEmpty()) {
			System.out.println(qu.poll());
		}
		
		
	}

}
