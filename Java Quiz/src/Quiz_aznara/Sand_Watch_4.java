package Quiz_aznara;

// ����

public class Sand_Watch_4 {

	public static void main(String[] args) {
		
		for(int i = 5; i >=1; i--) {
			for(int j = 0; j < 5-i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k<= i; k++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
}