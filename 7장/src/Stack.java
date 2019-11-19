//EX07_01
public class Stack<T> {
	int position;
	Object[] stck;
	public Stack() {
		position = 0;
		stck = new Object[20]; //0부터 19까지 20개의 값 가능
	}
//	스택에 요소 저장
	public void push(T item) {
		if(position==20)
			return;
		stck[position] = item;
		position++;
	}
//	스택에 요소 꺼내옴
	public T pop() {
		if(position == 0)
			return null;
		position --;
		return (T) stck[position];
	}
}
