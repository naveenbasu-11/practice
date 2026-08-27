package searchingCounting;

import java.util.Scanner;

public class secondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[]arr= {133,55,3,4,77,69};
		
		int largest=arr[0];
		int secondlargest=Integer.MIN_VALUE;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
			secondlargest=largest;
			largest=arr[i];
		}else if(arr[i]>secondlargest) {
			secondlargest=arr[i];
		}
		}
		System.out.println(secondlargest);
	}
}
