package helloworld_project;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("2�ڸ��� ������ �Է�(10~99):");
		int num = scanner.nextInt();
		
		if((num>=1)&&(num<=99)) {
			int a = num / 10; // 10�ڸ��� ����
			int b = num % 10; // 1�ڸ��� ����
			if((a % 3 == 0 )&&(b % 3 == 0 )){
				System.out.println("�ڼ�¦¦");
			}
			else if((a % 3 == 0 )||(b % 3 == 0 )){
				System.out.println("�ڼ�¦");
		}  else {
			System.out.println("�ڼ���");
		}
		
	}

}
}