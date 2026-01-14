package chapter14.stack;

import java.util.ArrayList;

class MyStack {
	
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	} //push
	
	public String pop() {
		int len = arrayStack.size();
		
		if(len == 0) {
			System.out.println("스택이 비어 있습니다.");
			return null;
		}
		return (arrayStack.remove(len - 1));
		} //pop

	@Override
	public String toString() {
//		return "MyStack [arrayStack=" + arrayStack + "]";
		return arrayStack.toString();
	}

}

public class StackTest_02 {
	
	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack); // System.out.println(stack.toString());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println(stack);
	}
}
