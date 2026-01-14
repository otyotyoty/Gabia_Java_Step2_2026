package chapter14.stack;

import java.util.Stack;

public class StackTest_01 {

	public static void main(String[] args) {
		
		Object obj;
		
		Stack<Object> st = new Stack<>();
		
		if(st.empty()) {
			for(int i=0;i<3;i++) {
				st.push(new String("Hi"+i));
				System.out.println("입력 " + i + "번째: " + st.peek());
			}
		}
		
		System.out.println("현재 출력 데이터: " + st.pop());
		System.out.println("peek: " + st.peek());
		System.out.println();
		System.out.println("현재 출력 데이터: " + st.pop());
		System.out.println("peek: " + st.peek());
		System.out.println();
		
		st.push(new String("everybody"));
		System.out.println("peek: " + st.peek());
		
		
		
	}
}
