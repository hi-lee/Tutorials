
public class ShapeTest {
	public static void main(String [] args) {
		Rectangle rt = new Rectangle();
		Triangle tr = new Triangle();
		
		rt.setHeight(10);
		rt.setWidth(20);
		tr.setHeight(3);
		tr.setWidth(7);
		System.out.println("����(" + rt.width + "), " + "����(" + rt.height + ")�� ������� ���� : " + rt.getArea());
		System.out.println("�غ�(" + rt.width + "), " + "����(" + rt.height + ")�� ������� ���� : " + tr.getArea());
		
		Shape sp = rt;
		System.out.println("����(" + sp.width + "), " + "����(" + sp.height + ")�� ������� ���� : " + sp.getArea());
		sp = tr;
		System.out.println("�غ�(" + sp.width + "), " + "����(" + sp.height + ")�� ������� ���� : " + sp.getArea());
	}
}
