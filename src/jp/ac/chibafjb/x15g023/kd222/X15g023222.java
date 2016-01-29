package jp.ac.chibafjb.x15g023.kd222;

import java.util.Scanner;

public class X15g023222 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		double s_num;
		double[] score = new double[101];
		for(int i=0;i<100;i++){
			score[i] = (double) (Math.random()*100);
		}
		score[100] = 999;
		s_num = sin.nextDouble();
		
		System.out.println("探索値"+s_num+"は、配列score["+ArrayProc.linerSearch1(score,s_num)+"]に存在します。");
		}

	}
	 class ArrayProc {
		public static int linerSearch1(double s[],double n){
			int i = 0;
			for(i=0;i<100;i++){
				if(n==s[i]){
					break;
				}
			}
			return(i);
		}

	}

