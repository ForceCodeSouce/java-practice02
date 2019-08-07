package prob04;


public class Prob04 {
	static String strC;
	

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		/* 코드를 완성합니다 */
		char[] c = new char[str.length()];
		
		for(int i = 0; i < c.length; i++) {
			c[i] = str.charAt(c.length-1-i);
		}
		
		return c;
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		
		System.out.println();
		
		
	}
}