
public class Utility {
	public static <T> GenericClass<T> gmove(T t){ //genericmethod
		GenericClass<T> gt = new GenericClass<T> ();
		gt.setTparam(t);	//값설정
		return gt;	//GenericClass리턴
	}
}
