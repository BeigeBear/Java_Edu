package ThisIsJava;

public class P74_bit {
	
	public static void main(String[] args) {
		byte v1 = 10;
		int v2 = ~v1;
		
		System.out.println(v2); // 11
		
		
		byte v3 = 120;
		int v4 = ~v3 + 1;
		
		System.out.println(v4); // -120�� v4�� ����
	
}
}
