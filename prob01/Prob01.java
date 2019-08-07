package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );
		
		int unit = 50000;
		int num = 0;
		int sw = 0;
		int [] arr = new int[10];
		
		System.out.print( "금액: " );
		int money = scanner.nextInt();
		
		
			
			for(int i = 0; i < 10; i++) 
			{
				num = money/unit;
				arr[i] = num;
				
				money = money - unit*num;
				
				if(sw == 0) {
					unit = unit / 2;
					sw = 1;
				}else {
					unit = unit / 5;
					sw = 0;
				}
			}	
			
			System.out.println("50000원 :"+ arr[0] +"개");
			System.out.println("10000원 :"+ arr[1] +"개");
			System.out.println("5000원 :"+ arr[2] +"개");
			System.out.println("1000원 :"+ arr[3] +"개");
			System.out.println("500원 :"+ arr[4] +"개");
			System.out.println("100원 :"+ arr[5] +"개");
			System.out.println("50원 :"+ arr[6] +"개");
			System.out.println("10원 :"+ arr[7] +"개");
			System.out.println("5원 :"+ arr[8] +"개");
			System.out.println("1원 :"+ arr[9] +"개");
		
		scanner.close();
 	}
}