package searchingCounting;

import java.util.Scanner;

public class countElementOccurs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr= {1,55,5,4,77,55,70,55};
		
		int count=0;
		System.out.println("enter a element:");
		int given=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(given==arr[i]) {
				count++;
			}
		}
		System.out.println("count:"+count);
	}

}
