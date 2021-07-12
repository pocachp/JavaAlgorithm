package week04;

class Test {
	long sum (int[] a) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}

// 객체 생성 연습
public class bj15596_ksj {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		int[] arr = {1,2,3};
		System.out.println(t.sum(arr));
	}

}
