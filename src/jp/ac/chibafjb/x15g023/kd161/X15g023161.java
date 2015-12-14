package jp.ac.chibafjb.x15g023.kd161;

public class X15g023161 {

	public static void main(String[] args) {
		int[] test;
		test = new int[2];
		test[0] = 10;
		test[1] = 20;
		int work = 0;
		work = test[1];
		test[1] = test[0];
		test[0] = work;
		for(int i = 0;i<2;i++)
		{
			System.out.println("test["+i+"] = "+test[i]);
		}
		

	}

}
