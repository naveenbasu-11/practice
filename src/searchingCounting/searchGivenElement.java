package searchingCounting;

import java.util.Scanner;

public class searchGivenElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[]arr= {1,3,5,7,9,22,44,66,77};
		
		System.out.println("enter a element:");
		int search=sc.nextInt();
		
		boolean found=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				System.out.println("element found at index:"+i);
				found=true;
				break;
			}
		}
		if(found==false) {
			System.out.println("elemrnt not found");
		}
	}

}
