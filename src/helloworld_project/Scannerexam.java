package helloworld_project;

import java.util.Scanner;

public class Scannerexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("2�ڸ��� ������ �Է�(10~99):");
		int score = scanner.nextInt();
		
		
		
		if((score>=10)&&(score<=99)) {
			int a = score / 10;
			int b = score % 10;
			if(a==b) {
			
			System.out.println("Yes ! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}
		else  {
			System.out.println("no ! 10�� �ڸ��� 1�� �ڸ��� ���� �ʽ��ϴ�.");
		}
		scanner.close();
	}
	   
	   
	}
}