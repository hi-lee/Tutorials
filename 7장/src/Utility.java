
public class Utility {
	public static <T> GenericClass<T> gmove(T t){ //genericmethod
		GenericClass<T> gt = new GenericClass<T> ();
		gt.setTparam(t);	//������
		return gt;	//GenericClass����
	}
}
