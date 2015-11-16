package jp.ac.chibafjb.x15g023.kdT21;

import java.util.Scanner;

public class X15g023T21 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.print("ハンバーガーの個数   --> ");
		int h = sin.nextInt();
		System.out.print("フライドポテトの個数 --> ");
		int f = sin.nextInt();
		
		System.out.println("ハンバーガーの代金   = "+(h*100)+"円");
		System.out.println("フライドポテトの代金 = "+(f*180)+"円");
		System.out.println("小計                 = "+(h*100+f*180)+"円");
		int s = (h*100+f*180);
		
		System.out.println("消費税               = "+(int)Math.floor((s*0.08))+"円");
		int z = (int) Math.floor((s*0.08));
		System.out.println("合計金額             = "+(int)(z+s)+"円");
		int g = (int) (z+s);
		
		System.out.print("受取金額                --> ");
		int u = sin.nextInt();
		sin.close();
		System.out.println("つり銭               = "+(u-g)+"円");

	}

}
