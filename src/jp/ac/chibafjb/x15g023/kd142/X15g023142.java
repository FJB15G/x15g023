package jp.ac.chibafjb.x15g023.kd142;

import java.util.Scanner;

public class X15g023142 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.print("整数ａの入力  --> ");
		int a = sin.nextInt();
		System.out.print("整数ｂの入力  --> ");
		int b = sin.nextInt();
		sin.close();
		System.out.println(a +"+"+ b +"="+ (a+b));
		System.out.println(a +"-"+ b +"="+ (a-b));
		System.out.println(a +"*"+ b +"="+ (a*b));
		System.out.println(a +"/"+ b +"="+ (a/b));
		
		
	}

}
