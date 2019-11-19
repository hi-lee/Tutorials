import java.util.*;
public class LinkedListTestEx {
	public static void main(String[] args) {
		LinkedList<String> llist = new LinkedList<>();
		ArrayList<String> alist = new ArrayList<>();
		
		long sttime;
		long endtime;
		long calctime;
		
		llist.add("end");
		alist.add("end");
		
		sttime = System.nanoTime();
		for (int x=0; x<5000; x++) {
			llist.add(0, String.valueOf(x));
		}
		endtime = System.nanoTime();
		calctime = endtime - sttime;
		System.out.println("LinkedList ��ü ���� ���� �ð� : " + "\t" + calctime + " ns");
							//LinkedList�� ���� �ð��� ��������� ������
		sttime = System.nanoTime();
		for(int x=0; x<5000; x++) {
			alist.add(0, String.valueOf(x));
		}
		endtime = System.nanoTime();
		calctime = endtime - sttime;
		System.out.println("ArrayList ��ü ���� ���� �ð� : "+ "\t" + calctime + " ns");
	}
}
