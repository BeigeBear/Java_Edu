package RealJava;

// Ȧ�� ����

public class p96_ch4_7 {

	public static void main(String[] args) {
		int i;
		System.out.println("1���� 100������ Ȧ��");
		for(i=1;i<=100;i++) {
			if(i%2!=0) {
				System.out.print(i+"\t");
			}
			if(i%10==0) {
				System.out.println();
			}
		}
	}
}
