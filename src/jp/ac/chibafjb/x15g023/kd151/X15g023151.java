package jp.ac.chibafjb.x15g023.kd151;

import java.util.Scanner;

public class X15g023151 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.print("aの入力 --> ");
		float a = sin.nextFloat();
		System.out.print("bの入力 --> ");
		float b = sin.nextFloat();
		sin.close();
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/b));
		

	}

}
