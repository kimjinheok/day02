package day02;

import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
	//final String KOREA = "���ѹα�";
//	System.out.println(KOREA);
//	KOREA = "�ɳ���";
//	System.out.println(KOREA);
//	int ����;
//	String ����; 

//	Scanner intput = new Scanner(System.in);
//	System.out.println("�̸� �Է� : ");
//	String name = intput.next();
//	int age;
//	System.out.println("���� �Է� : ");
//	age = intput.nextInt();
//	
//	System.out.println(name+"���� ���̴� "+age);

	Scanner intput = new Scanner(System.in);
	System.out.println("����� �̸��� �����Դϱ�?");
	String name = intput.next();
	int num; int num2; int num3;
	System.out.println(name+"���� ���� ���� : ");
	num = intput.nextInt();
	System.out.println(name+"���� ���� ���� : ");
	num2 = intput.nextInt();
	System.out.println(name+"���� ���� ���� : ");
	num3 = intput.nextInt();
	System.out.println("����� �̸��� �����Դϱ�?"+name);
	System.out.println(name+"���� ���� ���� : "+num);
	System.out.println(name+"���� ���� ���� : "+num2);
	System.out.println(name+"���� ���� ���� : "+num3);
	
	System.out.println("==============");
	System.out.println("�̸� : " +name);
	System.out.println("==============");
	System.out.println("���� : " +num);
	System.out.println("���� : " +num2);
	System.out.println("���� : " +num3);
	System.out.println("==============");
	System.out.println("�հ� : "+(num+num2+num3));
	System.out.println("==============");
	
	
}
}
