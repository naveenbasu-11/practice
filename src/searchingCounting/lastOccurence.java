package searchingCounting;

import java.util.Scanner;

public class lastOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[]arr= {10,40,30,10,40,45};
		
		System.out.println("enter a number:");
		int given=sc.nextInt();
		
		int lastindex=-1;
		for(int i=0;i<arr.length;i++) {
			if(given==arr[i]) {
				lastindex=i;
			}
			
			}
		if(lastindex!=-1) {
			System.out.println("last occurence index:"+lastindex);
		}else {
			System.out.println("last occurence not found");
		}
	}

}
