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
		String str = "Korea"; // String-문자열 str-변수명
		
		
		s = sum(i,j);
		System.out.println(s); // 30
		System.out.println("S값은"+ s + "입니다"); // S값은30입니다
		System.out.println("Hello world!!!"); // Hello world!!!
		System.out.println(str); // Korea
		
		
	
		
		
		
	}

}
