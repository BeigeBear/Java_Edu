import java.util.Scanner;

public class arr3 {

	public static void main(String[] args) {
//		변수 선언
		int i, sum = 0;
		float avg;
		
//		배열 입력
		int[] jumsu = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("5명의 수학 점수를 입력하시오");
		
		for (i = 0; i< jumsu.length; i++) {
			jumsu[i] = sc.nextInt();
		} 
		for (i = 0; i< jumsu.length; i++) {
			sum += jumsu[i];
		}
		
		
//		평균 구하기
		avg = (float)sum / 5;
		System.out.println("총점 = "+sum+", 평균 = "+ avg);

	}
}