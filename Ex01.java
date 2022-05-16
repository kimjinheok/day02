package day02;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	//final String KOREA = "대한민국";
//	System.out.println(KOREA);
//	KOREA = "케나다";
//	System.out.println(KOREA);
//	int 변수;
//	String 변수; 

//	Scanner intput = new Scanner(System.in);
//	System.out.println("이름 입력 : ");
//	String name = intput.next();
//	int age;
//	System.out.println("나이 입력 : ");
//	age = intput.nextInt();
//	
//	System.out.println(name+"님의 나이는 "+age);

	Scanner intput = new Scanner(System.in);
	System.out.println("당신의 이름은 무엇입니까?");
	String name = intput.next();
	int num; int num2; int num3;
	System.out.println(name+"님의 국어 점수 : ");
	num = intput.nextInt();
	System.out.println(name+"님의 영어 점수 : ");
	num2 = intput.nextInt();
	System.out.println(name+"님의 수학 점수 : ");
	num3 = intput.nextInt();
	System.out.println("당신의 이름은 무엇입니까?"+name);
	System.out.println(name+"님의 국어 점수 : "+num);
	System.out.println(name+"님의 영어 점수 : "+num2);
	System.out.println(name+"님의 수학 점수 : "+num3);
	
	System.out.println("==============");
	System.out.println("이름 : " +name);
	System.out.println("==============");
	System.out.println("국어 : " +num);
	System.out.println("영어 : " +num2);
	System.out.println("수학 : " +num3);
	System.out.println("==============");
	System.out.println("합계 : "+(num+num2+num3));
	System.out.println("==============");
	
	
}
}
