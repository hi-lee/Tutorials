//EX07_01
public class Stack<T> {
	int position;
	Object[] stck;
	public Stack() {
		position = 0;
		stck = new Object[20]; //0���� 19���� 20���� �� ����
	}
//	���ÿ� ��� ����
	public void push(T item) {
		if(position==20)
			return;
		stck[position] = item;
		position++;
	}
//	���ÿ� ��� ������
	public T pop() {
		if(position == 0)
			return null;
		position --;
		return (T) stck[position];
	}
}
