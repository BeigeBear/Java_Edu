package RealJava;

public class P83_ifThen {

	public static void main(String[] args) {
		
		// 진짜자바 P83 예제1
		int a = 89;
		if( a>=60 ) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	    System.out.println("if문 밖");

	    // 진짜자바 P83 예제2
	    
	    boolean b = false;
	    if( b ) {
	    	System.out.println("ture");
	    } else {
	    	System.out.println("flase");
	    }
	    System.out.println("if문 밖");
	    
	}

}