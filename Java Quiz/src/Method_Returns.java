
public class Method_Returns {
// 결과 값 반환 값 돌려주는 값
	public static void main(String[] args) {
		int result;
		result = adder(4, 5);
		
		System.out.println("4 + 5 = "+result);
		System.out.println("3.5 + 3.5 = "+square(3.5));
	}
	
//  adder 함수 설정
	public static int adder(int num1, int num2) {
		int addResult = num1 + num2;
		return addResult;
	}
	
//  square 함수 설정
	public static double square	(double num) {
		return num * num;
	}
}
