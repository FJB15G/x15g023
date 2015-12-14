package jp.ac.chibafjb.x15g023.kd171;

public class X15g023171 {

	public static void main(String[] args) {
		int[] data = {100,200,300,0};
		int k = 3;
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
