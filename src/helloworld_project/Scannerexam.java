package helloworld_project;

import java.util.Scanner;

public class Scannerexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("2자리수 정수를 입력(10~99):");
		int score = scanner.nextInt();
		
		
		
		if((score>=10)&&(score<=99)) {
			int a = score / 10;
			int b = score % 10;
			if(a==b) {
			
			System.out.println("Yes ! 10의 자리와 1의 자리가 같습니다.");
		}
		else  {
			System.out.println("no ! 10의 자리와 1의 자리가 같지 않습니다.");
		}
		scanner.close();
	}
	   
	   
	}
}