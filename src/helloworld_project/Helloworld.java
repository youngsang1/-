package helloworld_project;

public class Helloworld {
	
	public static int sum(int a, int b)
	{
		int sum;
		sum = a+b;
		return sum;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello world!!!");
		int i = 10, j=20;
		int s;
		String str = "Korea"; // String-���ڿ� str-������
		
		
		s = sum(i,j);
		System.out.println(s); // 30
		System.out.println("S����"+ s + "�Դϴ�"); // S����30�Դϴ�
		System.out.println("Hello world!!!"); // Hello world!!!
		System.out.println(str); // Korea
		
		
	
		
		
		
	}

}
