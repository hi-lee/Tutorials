
public class ShapeTest {
	public static void main(String [] args) {
		Rectangle rt = new Rectangle();
		Triangle tr = new Triangle();
		
		rt.setHeight(10);
		rt.setWidth(20);
		tr.setHeight(3);
		tr.setWidth(7);
		System.out.println("가로(" + rt.width + "), " + "세로(" + rt.height + ")인 사격형의 넓이 : " + rt.getArea());
		System.out.println("밑변(" + rt.width + "), " + "높이(" + rt.height + ")인 삼격형의 넓이 : " + tr.getArea());
		
		Shape sp = rt;
		System.out.println("가로(" + sp.width + "), " + "세로(" + sp.height + ")인 사격형의 넓이 : " + sp.getArea());
		sp = tr;
		System.out.println("밑변(" + sp.width + "), " + "높이(" + sp.height + ")인 삼격형의 넓이 : " + sp.getArea());
	}
}
