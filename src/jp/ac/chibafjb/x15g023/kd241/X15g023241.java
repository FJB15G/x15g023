package jp.ac.chibafjb.x15g023.kd241;

public class X15g023241 {

	public static void main(String[] args) {
		int[] num = {32,53,91,23,57};
		System.out.print("num[] = ");
		for(int i=0;i<num.length;i++){
			System.out.print(ArrayProc.bubblesort1(num)[i]+",");
		}
	}
	
	public static class ArrayProc{
		public static int[] bubblesort1(int[] num){
			int work;
			for(int j = num.length - 1;j>=1;j--){
				for(int i = 0;i<j;i++){
					if(num[i]>num[i+1]){
						work = num[i];
						num[i] = num[i+1];
						num[i+1] = work;
					}
				}
			}
			return num;
		}
	}

}
