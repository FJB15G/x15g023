package jp.ac.chibafjb.x15g023.kd221;

import java.util.Scanner;

public class X15g023221 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		int s_num;
		int score[] = new int[101];
		for(int i=0;i<100;i++){
			score[i] = (int) (Math.random()*100);
		}
		score[100] = 999;
		s_num = sin.nextInt();
		
		System.out.println("探索値"+s_num+"は、配列score["+ArrayProc.linerSearch1(score,s_num)+"]に存在します。");
		if(ArrayProc.linerSearch1(score,s_num)==100){
			System.out.println("探索値"+s_num+"は、配列score[]に存在しません。");
			}else{
				System.out.println("探索値"+s_num+"は、配列score["+ArrayProc.linerSearch2(score,s_num)+"]に存在します。");
			}
	}
	public static class ArrayProc {
		public static int linerSearch1(int s[],int n){
			int i = 0;
			for(i=0;i<100;i++){
				if(n==s[i]){
					break;
				}
			
			}
			return(i);
		}
		public static int linerSearch2(int s[],int n){
			int i = 99;
			for(i=99;i>=0;i--){
				if(n==s[i]){
					break;
				}
			
			}
			if(i==-1){
				return(100);
			}else{
				return(i);
			}
		}
	}

}

