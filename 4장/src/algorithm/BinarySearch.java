package algorithm;

public class BinarySearch {
	int k;
	private int[] numData;

	public BinarySearch() {
		setData(100);
	}

	public BinarySearch(int num) {
		setData(num);
	}

	public BinarySearch(int num, int k) { // �������
		this.k = k;
		setData(num);
	}

	public void setData(int num) {
		numData = new int[num];
		for (int i = 0; i < numData.length; i++) {
			numData[i] = i + 1;
		}

	}

	public void bSearch() {
		int l = 0, h = numData.length - 1, m, cnt = 0;
		boolean fd = false;
		while (true) {
			cnt++;
			m = (l + h) / 2;
			if (numData[m] == k) {
				fd = true;
				break;
			} else {
				if (numData[m] > k)
					h = m - 1;
				else
					l = m + 1;
				if (h < l)
					break;
			}
		}
		System.out.println(cnt + "�� �ݺ�");
		if (fd) {
			System.out.println("ã�� �ڷ�� " + (m + 1) + "��° ��ġ�� �ֽ��ϴ�.");

		} else {
			System.out.println("�ڷᰡ �������� �ʽ��ϴ�.");
		}

	}

	public void bSearch(int k) {
		int l=0, h=numData.length-1, m, cnt =0;
		boolean fd = false;
		while(true) {
			cnt++;
			m=(l+h)/2;
			if(numData[m] ==k) {
				fd = true;
				break;
			}else {
				if(numData[m]>k) h=m-1;
				else l=m+1;
				if(h<1) break;
			}
		}
		System.out.println(cnt+"�� �ݺ�");
			if(fd) {
				System.out.println("ã�� �ڷ��" + (m+1)+"��° ��ġ�� �ֽ��ϴ�.");
			}else{
				System.out.println("�ڷᰡ �������� �ʽ��ϴ�.");
			}
	

	
	}
}
