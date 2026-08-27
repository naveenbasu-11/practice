package searchingCounting;

import java.util.Scanner;

public class greaterThanGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[]arr= {22,44,66,5,6,99};
		
		System.out.println("enter a number");
		int given=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>given) {
				System.out.println(arr[i]);
			}
		}
	}

}
