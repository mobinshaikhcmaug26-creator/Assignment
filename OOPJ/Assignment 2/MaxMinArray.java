import java.util.Scanner;

public class MaxMinArray {
	
	
	
	public static int findMax(int[] arr) {
	    // find maximum
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

	public static int findMin(int[] arr) {
	    // find minimum
		
		int min = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}

		int max = findMax(arr);
		int min = findMin(arr);

		System.out.println("Maximum: " + max);
		System.out.println("Minimum: " + min);
		sc.close();

	}

}
