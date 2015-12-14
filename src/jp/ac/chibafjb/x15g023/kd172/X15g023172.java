package jp.ac.chibafjb.x15g023.kd172;

public class X15g023172 {

	public static void main(String[] args) {
		int x[] = {1,2,3};
		int y[] = {7,8};
		int m = 3;
		int n = 2;
		int z[] = {0,0,0,0,0};
		for(int i=0;i<m;i++)
		{
			z[i] = x[i];
		}
		for(int i=m;i<m+n;i++)
		{
			z[i] = y[i-m];
		}
		System.out.print("z[] = {"+z[0]+","+z[1]+","+z[2]+","+z[3]+","+z[4]+"}");

	}

}
