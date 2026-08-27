package searchingCounting;

import java.util.Scanner;

public class firstOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[]arr= {33,5,6,7,33,8,4,88};
		
		System.out.println("enter a number:");
		int given=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(given==arr[i]) {
				System.out.println("first occurence at index:"+i);
				break;
			}
		}
	}

}
