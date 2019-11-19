import java.util.*;

public class QueueTextEx {
	public static void main(String[] args) {
		Queue<QueueDTO> waitQ = new LinkedList<>();	//자료형:QueueDTO
		// LinkedList<QueueDTO> waitQ = new LinkedList<>();

		waitQ.offer(new QueueDTO("입출금", 1));	//FIFO
		waitQ.offer(new QueueDTO("대출", 2));
		waitQ.offer(new QueueDTO("입출금", 3));
		waitQ.offer(new QueueDTO("상담", 4));

		// while(waitQ.isEmpty())
		while (waitQ.peek() != null) { //peek,element: 첫번째값만 가져옴 계속 같은 값만 나옴
			QueueDTO queue = waitQ.poll(); //poll: 값을 한개씩 넣어주고 없어짐->자료를 한번 쓰고 버릴 용도로 사용
			switch (queue.operation) {
			case "입출금":
				System.out.println(queue.number + " 번 " + queue.operation + " 창구로 오세요");
				break;
			case "대출":
				System.out.println(queue.number + " 번 " + queue.operation + " 창구로 오세요");
				break;
			default:
				System.out.println(queue.number + " 번 " + queue.operation + " 창구로 오세요");
				break;
			}
		}
	}
}
