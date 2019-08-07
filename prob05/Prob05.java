package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		
		int minNumber = 1;
		int maxNumber = 100;
		int num = 1;
		String an = "y";
		
		System.out.println("Computer가 수를 결정하였습니다. 맞추어 보세요.");
		System.out.println("1-100 사이 숫자");
		
		Random random = new Random();
		int correctNumber = random.nextInt(maxNumber);
		
		//정답 랜덤하게 만들기
		while(true) {
			
			System.out.println(correctNumber);
			
			System.out.println(maxNumber +"-"+ minNumber);
			System.out.print( num +">>");
			int number = scanner.nextInt();
			num++;
			
			if(correctNumber > number) {
				System.out.println("더 높게");
				minNumber = number;
				
			}else if(correctNumber < number) {
				System.out.println("더 낮게");
				maxNumber = number;
			}
			
			if(correctNumber == number) {
				System.out.println("정답");
				System.out.print("다시하시겠습니까(Y/N)");
				
				String answer = scanner.next();

				if(answer.equalsIgnoreCase(an)){
					num = 1;
					continue;
				}else if(!answer.equalsIgnoreCase(an)){
					break;
				}
			}
		}
		
		scanner.close();
	}

}