package prob03;

public class Prob03 {
	
	static int num = 0;
	static String str1 = null;
	
	public static void main(String args[]) {
		
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };

		// 원래 배열 원소 출력
		printCharArray(c);

		// 공백 문자 바꾸기
		replaceSpace(c);

		// 수정된 배열 원소 출력
		printCharArray(c);
	}
	

	public static void replaceSpace(char c[]) {
		str1 = String.valueOf(c);
		
		str1 = str1.replace(" ", ",");
		
		
		//System.out.println(str1);
		
	}

	public static void printCharArray(char c[]) {
		
		
		if(num == 0) {
		for(int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
			num++;
		}}else {
			System.out.println();
			System.out.println(str1);
		}
		
	}
}
