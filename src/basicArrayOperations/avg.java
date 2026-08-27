package basicArrayOperations;

import java.util.Scanner;

public class avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size:");
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		int avg=0;
		for(int i=0;i<arr.length;i++) {
			 sum=sum+arr[i];
			 avg=sum/arr.length;
		}
		System.out.println("Average:"+avg);
	}

}
