package jp.ac.chibafjb.x15g023.kd165;

public class X15g023165 {

	public static void main(String[] args) {
		int[] a = {5,10,15};
		int[] b = {0,0,0};
		int m = 3;
		for(int i=0;i<m;i++)
		{
			b[i] = a[m-i-1];
			System.out.println("b["+i+"] = "+b[i]);
		}
	}

}
