package ThisIsJava;

public class p124_For_Multiplication_Table_ex {

	public static void main(String[] args) {
		for(int m=2; m<=9; m++) {
			System.out.println("*** "+ m + "�� ***");
			for(int n = 1; n<=9; n++) {
				System.out.println(m +" x "+n+" = "+ (m*n));
			}
		}

	}

}
