package prob02;

import java.util.Scanner;

public class Prob02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arr[] = new int[5];
		int total = 0;
		int result = 0;
		
		/* 키보드에서 배열 크기만큼 입력 받아 배열에 저장하는 코드 */
		System.out.println( "5개의 숫자를 입력하세요." );
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
			System.out.println("값 입력완료 :" + arr[i]);
		}
		
		/* 배열에 저장된 정수 값 더하기 */
		for(int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		
		/* 출력 */
		System.out.println("평균은" + (double)total/5 + "입니다.");
		
		/* 자원정리 */
		scanner.close();
	}
}
