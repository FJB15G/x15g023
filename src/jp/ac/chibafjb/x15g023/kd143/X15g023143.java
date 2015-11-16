package jp.ac.chibafjb.x15g023.kd143;

import java.util.Scanner;

public class X15g023143 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.print("住所の入力  --> ");
		String a = sin.next();
		System.out.print("氏名の入力  --> ");
		String b = sin.next();
		System.out.print("電話番号の入力  --> ");
		String c = sin.next();
		sin.close();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
