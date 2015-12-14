package jp.ac.chibafjb.x15g023.kd173;

import java.util.Scanner;

public class X15g023173 {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		int k = 3;
		int[] data = {0,0,0,0};
		for(int i=0;i<k;i++)
		{
			data[i] = sin.nextInt();
		}
		sin.close();
		for(int i=k;i>=1;i--)
		{
			data[i] = data[i-1];
		}
		for(int i=0;i<=k;i++)
		{
			System.out.println("data["+i+"] = "+data[i]);
		}


	}

}
