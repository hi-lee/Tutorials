
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
	
//	public abstract int getTest(); -> 메소드를 선택적으로 사용-> 클래스에 abstract가 붙어야 사용가능
}
