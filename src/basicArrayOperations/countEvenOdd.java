package basicArrayOperations;

import java.util.Scanner;

public class countEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size:");
		int n=sc.nextInt();
		int[] num=new int[n];
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		int even=0;
		int odd=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("even:"+even);
		System.out.println("odd:"+odd);
	}
}
