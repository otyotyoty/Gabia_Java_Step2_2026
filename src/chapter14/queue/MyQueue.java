package chapter14.queue;

import java.util.ArrayList;

public class MyQueue {

	private ArrayList<String> arrayQueue = new ArrayList<>();
	
	
	public void enQueue(String data) {
		arrayQueue.add(data);
	}

	public String deQueue() {
		if(arrayQueue.isEmpty()) {
			System.out.println("큐가 비어있습니다.");
			return null;
		}
		return arrayQueue.remove(0);
	}

	@Override
	public String toString() {
//		return "MyQueue [arrayQueue=" + arrayQueue + "]";
		return arrayQueue.toString();
	}

}
