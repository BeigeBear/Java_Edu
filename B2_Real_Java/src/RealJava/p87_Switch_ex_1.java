package RealJava;

public class p87_Switch_ex_1 {

	public static void main(String[] args) {
		int a = 20;
		switch ( a ) {
		case 10:
			System.out.println("10이다");
			break;
			
		case 20:
			System.out.println("20이다");
			break;
	
		case 30:
			System.out.println("30이다");
			break;
			
		default:
			System.out.println("그 이외의 값");
			break;
		}
	}
}