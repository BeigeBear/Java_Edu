package ThisIsJava;

public class p125_While_Sum_From_To_100_ex {

	public static void main(String[] args) {
		int sum = 0;
		
		int i = 1;
		
		while(i<=10000) {
			sum += i;
			i++;
		
		}
		System.out.println("1~" + (i-1) + " �� : "+ sum);
	}

}
