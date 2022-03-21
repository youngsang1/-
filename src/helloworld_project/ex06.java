package helloworld_project;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("2자리수 정수를 입력(10~99):");
		int num = scanner.nextInt();
		
		if((num>=1)&&(num<=99)) {
			int a = num / 10; // 10자리만 추출
			int b = num % 10; // 1자리만 추출
			if((a % 3 == 0 )&&(b % 3 == 0 )){
				System.out.println("박수짝짝");
			}
			else if((a % 3 == 0 )||(b % 3 == 0 )){
				System.out.println("박수짝");
		}  else {
			System.out.println("박수없");
		}
		
	}

}
}