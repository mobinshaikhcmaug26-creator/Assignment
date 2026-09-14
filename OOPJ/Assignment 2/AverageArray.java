import java.util.Scanner;

public class AverageArray {
	public static void avg(int[] arr) {
		int sum = 0;
    	for (int i = 0;i < arr.length; i++) {
    		 sum += arr[i]; 
    	}
    	double a = (double)sum/arr.length;
    	System.out.println("Average of Your array is: "+a);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }

        avg(arr);
        sc.close();

	}

}
