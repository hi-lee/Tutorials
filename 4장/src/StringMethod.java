
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
		
		System.out.println("mystr1�� ����Ǿ��ִ� " + mystr1 +"�� ���ڱ��̴� " + alength);
		System.out.println("mystr2�� ����Ǿ��ִ� " + mystr2 +"�� ���ڱ��̴� " + blength);
		System.out.println("mystr1�� 5��° �ε����� �ִ� ���ڴ� " + achar);
		System.out.println("mystr2dml 10��° �ε����� �ִ� ���ڴ� " + bchar);
		System.out.println("mystr1�� ����� ���ڸ� �빮�ڷ� �ٲ� : " + mystr1.toUpperCase());
		System.out.println("mystr2�� ����� ������ a�� A�� �ٲ� : " + mystr2.replace('a', 'A'));
		System.out.println("mystr1�� ����� ���ڿ��� mystr4�� ����� ���ڿ��� ���� ��(��ҹ��ڱ���) : " + mystr1.contentEquals(mystr4));
		System.out.println("mystr1�� ����� ���ڿ��� mystr4�� ����� ���ڿ� ���� ��(��ҹ��� ���� ����) : " + mystr1.equalsIgnoreCase(mystr4));
		System.out.println("concat()�޼ҵ带 ����Ͽ� mystr1�� mystr2 ���̱� : " + mystr1.concat(mystr2) );
		System.out.println("mystr1�� ù���ں��� 4���� ��� : " + mystr1.substring(0,4)); //0:�ε�����ġ, 4:����
		System.out.println("mystr1�� 6��° ���ں��� ������ ���(powerful): " + mystr1.substring(5)); //5:������ġ
		System.out.println("mystr1�� �� ���� ������ 'a'�� ��ġ : " + mystr1.indexOf('a')); //0���� ���� Ja - 01
		System.out.println("mystr1�� �� ���߿� ������ 'a'�� ��ġ : " + mystr1.lastIndexOf('a')); //Java - 0123
		System.out.println("mystr1�� 5�� ���ں��� �������� ���� : " + mystr1.substring(4).length()); 
		System.out.println("mystr1�� 5�� ���ں��� �������� ���� trim()��� : " + mystr1.substring(4).trim().length());
		
	}
}