import java.util.Scanner;
public class CopyArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int[] copy = new int[arr.length];
		for(int i=0;i<copy.length;i++) {
			copy[i]=arr[i];
		}
		for (int i = 0; i < copy.length; i++) {
		    System.out.println(copy[i]);
		}
		sc.close();

	}

}
