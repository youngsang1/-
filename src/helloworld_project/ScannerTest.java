package helloworld_project;

import java.util.*; //java.util.* 패키지를 불러옴. * = 패키지 안의 모든 것.
 
public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("당신의 이름을 입력하세요:");
        String name = scanner.next();
        System.out.println("내 이름은"+name+"입니다.");
        System.out.println("당신의 직업을 입력하세요:");
        String job = scanner.next();
        System.out.println("내 직업은"+job+"입니다.");
        System.out.println("당신의 나이를 입력하세요:");
        int age = scanner.nextInt();
        System.out.println("제 나이는"+age+"입니다.");
        
        scanner.close();
        
        
        
        
        
		
	}

}
