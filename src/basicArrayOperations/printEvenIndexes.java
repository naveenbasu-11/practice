package basicArrayOperations;

public class printEvenIndexes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {1,7,7,4,5,6,};
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.println(arr[i]);
			}
		}
	}

}
