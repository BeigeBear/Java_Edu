package RealJava;

// for문 (제어문-반복문)
public class p93_if {

	public static void main(String[] args) {
		int i;
		for(i=1;i<6;i++) {
			System.out.println(i);
		}
	System.out.println("루프 밖에서i="+i);
	}
}

// < 출력 값 >
// 1
// 2
// 3
// 4
// 5
// 루프 밖에서i=6