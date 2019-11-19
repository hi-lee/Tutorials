
class RangeClass {
	int[] makeRange (int lower, int upper) {
		int arr[] = new int[ (upper - lower) + 1 ]; //정수 겸 배열형, 개수니까 +1(~부터 ~까지)
		for(int i=0; i<arr.length; i++) {
			arr[i] = lower++;
		}
		return arr;
	}
	public static void main(String arg[]) {  
		int theArray[];
		RangeClass aRange = new RangeClass(); //메인메소드는 객체를 생성해야 호출이 가능 
		int low = 1, high = 10;
		theArray = aRange.makeRange(low,  high);
		System.out.print("The array: [");
		for(int i = 0; i < theArray.length; i++){
			System.out.print(theArray[i] + " ");
		}
		System.out.println("]");
	}
	
}
