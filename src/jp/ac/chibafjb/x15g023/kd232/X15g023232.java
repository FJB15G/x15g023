package jp.ac.chibafjb.x15g023.kd232;

import java.util.Scanner;

public class X15g023232 {

	public static void main(String[] args) {
			Scanner sin = new Scanner(System.in);
			int data[] = {6,5,3,2,1};
			System.out.print("探索する値を入力 -->");
			int s_int = sin.nextInt();
			
			if(ArrayProc.binarySearch1(data, s_int)==-1){
				System.out.println("探索値"+s_int+"は、配列data[]に存在しません。");
			}else{
				System.out.println("探索値"+s_int+"は、配列data["+ArrayProc.binarySearch1(data, s_int)+"]に存在します。");
			}
			if(ArrayProc.binarySearch2(data, s_int)==-1){
				System.out.println("探索値"+s_int+"は、配列data[]に存在しません。");
			}else{
				System.out.println("探索値"+s_int+"は、配列data["+ArrayProc.binarySearch2(data, s_int)+"]に存在します。");
			}
			
		}
		
		public static class ArrayProc{
			public static int binarySearch1(int d[],int s){
				int L = 0;
				int H = 4;
				int m = (L+H)/2;
				for(;L <= H && d[m]!=s;){
					if(d[m]<s){
						L = m+1;
					}else{
						H = m-1;
					}
					m = (L+H)/2;
				}
				if(L<=H){
					return(m);
				}else{
					return(-1);
				}
			}
			public static int binarySearch2(int d[],int s){
				int L = 0;
				int H = 4;
				int m = (L+H)/2;
				for(;L <= H && d[m]!=s;){
					if(d[m]>s){
						L = m+1;
					}else{
						H = m-1;
					}
					m = (L+H)/2;
				}
				if(L<=H){
					return(m);
				}else{
					return(-1);
				}
			}

		}
}
