
public class StringMethod {
	public static void main(String[] args) {
		int alength, blength;
		char achar, bchar;
		String mystr1 = new String("Java Powerful");
		String mystr2 = new String("Java Programming");
		String mystr3 = mystr1 + mystr2;
		String mystr4 = "java powerful";
		
		alength = mystr1.length();
		blength = mystr2.length();
		achar = mystr1.charAt(5);
		bchar = mystr2.charAt(10);
		
		System.out.println("mystr1에 저장되어있는 " + mystr1 +"의 문자길이는 " + alength);
		System.out.println("mystr2에 저장되어있는 " + mystr2 +"의 문자길이는 " + blength);
		System.out.println("mystr1의 5번째 인덱스에 있는 문자는 " + achar);
		System.out.println("mystr2dml 10번째 인덱스에 있는 문자는 " + bchar);
		System.out.println("mystr1의 저장된 문자를 대문자로 바꿈 : " + mystr1.toUpperCase());
		System.out.println("mystr2의 저장된 문자중 a를 A로 바꿈 : " + mystr2.replace('a', 'A'));
		System.out.println("mystr1에 저장된 문자열과 mystr4에 저장된 문자열의 값을 비교(대소문자구분) : " + mystr1.contentEquals(mystr4));
		System.out.println("mystr1에 저장된 문자열과 mystr4에 저장된 문자열 값을 비교(대소문자 구분 안함) : " + mystr1.equalsIgnoreCase(mystr4));
		System.out.println("concat()메소드를 사용하여 mystr1에 mystr2 붙이기 : " + mystr1.concat(mystr2) );
		System.out.println("mystr1의 첫글자부터 4글자 출력 : " + mystr1.substring(0,4)); //0:인덱스위치, 4:길이
		System.out.println("mystr1의 6번째 글자부터 끝까지 출력(powerful): " + mystr1.substring(5)); //5:시작위치
		System.out.println("mystr1에 젤 먼저 나오는 'a'의 위치 : " + mystr1.indexOf('a')); //0부터 시작 Ja - 01
		System.out.println("mystr1에 젤 나중에 나오는 'a'의 위치 : " + mystr1.lastIndexOf('a')); //Java - 0123
		System.out.println("mystr1의 5번 문자부터 끝까지의 길이 : " + mystr1.substring(4).length()); 
		System.out.println("mystr1의 5번 문자부터 끝까지의 길이 trim()사용 : " + mystr1.substring(4).trim().length());
		
	}
}