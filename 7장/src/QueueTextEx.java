import java.util.*;

public class QueueTextEx {
	public static void main(String[] args) {
		Queue<QueueDTO> waitQ = new LinkedList<>();	//�ڷ���:QueueDTO
		// LinkedList<QueueDTO> waitQ = new LinkedList<>();

		waitQ.offer(new QueueDTO("�����", 1));	//FIFO
		waitQ.offer(new QueueDTO("����", 2));
		waitQ.offer(new QueueDTO("�����", 3));
		waitQ.offer(new QueueDTO("���", 4));

		// while(waitQ.isEmpty())
		while (waitQ.peek() != null) { //peek,element: ù��°���� ������ ��� ���� ���� ����
			QueueDTO queue = waitQ.poll(); //poll: ���� �Ѱ��� �־��ְ� ������->�ڷḦ �ѹ� ���� ���� �뵵�� ���
			switch (queue.operation) {
			case "�����":
				System.out.println(queue.number + " �� " + queue.operation + " â���� ������");
				break;
			case "����":
				System.out.println(queue.number + " �� " + queue.operation + " â���� ������");
				break;
			default:
				System.out.println(queue.number + " �� " + queue.operation + " â���� ������");
				break;
			}
		}
	}
}
