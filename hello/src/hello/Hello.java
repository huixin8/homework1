package hello;

import java.util.Scanner;

public class Hello {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		String name;
		int age;
		
		System.out.print("請輸入姓名");
		name=scn.nextLine();
		
		System.out.print("請輸入年齡");
		age=scn.nexInt();
		
		System.out.print("歡迎,"+name+",您目前");
		System.out.println(age+"歲");
	}
}