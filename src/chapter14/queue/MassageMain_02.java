package chapter14.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MassageMain_02 {
	
	public static void main(String[] args) {
		
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		Message lee = new Message("sendMail", "이호준");

		messageQueue.offer(lee);
		messageQueue.offer(new Message("sendSNS","김지영"));
		messageQueue.offer(new Message("sendKakaoTalk","김민주"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			
			switch(message.command) {
			case "sendMail" : 
				System.out.println(message.to + "님에게 보냈습니다.");
				break;
			case "sendSNS" :
				System.out.println(message.to + "님에게 보냈습니다.");
				break;
			case "sendKakaoTalk" :
				System.out.println(message.to + "님에게 보냈습니다.");
				break;
			}
		}
		
	}

}
