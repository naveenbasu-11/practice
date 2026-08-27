package basicArrayOperations;

import java.util.Scanner;

public class countPosNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int positive=0;
		int negative=0;
		int zero=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				positive++;
			}else if(arr[i]<0) {
			    negative++;
			}else {
				zero++;
			}
		}
		System.out.println("positive:"+positive);
		System.out.println("negative:"+negative);
		System.out.println("zero:"+zero);
	}

}
