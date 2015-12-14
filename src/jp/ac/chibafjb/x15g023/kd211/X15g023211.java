package jp.ac.chibafjb.x15g023.kd211;

import java.util.Scanner;

public class X15g023211 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		int a = 5;
		int[] num = {10,22,31,4,5};
		System.out.println("配列num[]の最大値は、"+ArrayProc.maxFind1(num, a)+"です。");
		System.out.println("配列num[]の最大値は、"+ArrayProc.maxFind2(num, a)+"です。");
	}
	static class ArrayProc {
		public static int maxFind1(int num[],int a){
			int m = 0;
			for(int i=0;i<a;i++){
				if(num[i]>m){
					m = num[i];
				}
			}
			return (m);
		}
		public static int maxFind2(int num[],int a){
			int m = num[0];
			for(int i=1;i<a;i++){
			if(num[i]>m){
				m = num[i];
				}
			}
			return(m);
		}

	}
}
