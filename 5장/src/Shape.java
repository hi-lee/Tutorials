
public abstract class Shape {
	protected int x, y, width, height;
	public void setX(int newX) {
		x = newX;
	}
	public void setY(int newY) {
		y = newY;
	}
	public void setWidth(int newWidth) {
		width = newWidth;
	}
	public void setHeight(int newHeight) {
		height = newHeight;
	}
	public abstract float getArea();
	
//	public abstract int getTest(); -> �޼ҵ带 ���������� ���-> Ŭ������ abstract�� �پ�� ��밡��
}
