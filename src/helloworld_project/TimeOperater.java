package helloworld_project;

import java.util.*;


public class TimeOperater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scann = new Scanner(System.in); // Scanner 객체를 선언
		System.out.println("시간을 입력하세요(second):");
		int time = scann.nextInt();
		
		int second = time % 60; // 60으로 나눈 나머지는 초에 저장
		int minute = (time/60) % 60; //60으로 나눈 몫을 다시 60으로 나눈 나머지는 분
		int hour = (time/60) / 60; //60으로 나눈 몫을 다시 60으로 나눈 몫은 시간
		System.out.print(time+"초는 ");
		System.out.print(hour+"시간 / ");
		System.out.print(hour+"분 / ");
		System.out.print(hour+"초 입니다 .");
		
		scann.close();
		
	}

}
