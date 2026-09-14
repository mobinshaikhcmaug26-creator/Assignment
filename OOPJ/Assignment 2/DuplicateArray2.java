import java.util.Scanner;
	public class DuplicateArray2 {
		
		public static void duplicate(int arr[]) {
			for(int i=0; i<arr.length; i++) {

			    boolean alreadyPrinted = false;

			    for(int k=0; k<i; k++) {
			        if(arr[k] == arr[i]) {
			            alreadyPrinted = true;
			            break;
			        }
			    }

			    for(int j=i+1; j<arr.length; j++) {

			        if(arr[i] == arr[j] && !alreadyPrinted) {

			            System.out.println("Duplicate Element in array is : " + arr[i]);
			            break;
			        }
			    }
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] =sc.nextInt();
			}
			duplicate(arr);
			sc.close();
			

		}

	}
