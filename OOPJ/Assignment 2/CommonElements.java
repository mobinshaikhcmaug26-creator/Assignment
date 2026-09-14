import java.util.Scanner;

public class CommonElements {
	public static void common(int[]arr1,int[]arr2) {
		for (int i = 0; i < arr1.length; i++) {
	        boolean alreadyPrinted = false;
	        for (int k = 0; k < i; k++) {
	            if (arr1[k] == arr1[i]) {
	                alreadyPrinted = true;
	                break;
	            }
	        }	        
		    for (int j = 0; j < arr2.length; j++) {
		    	if(arr1[i] == arr2[j] && !alreadyPrinted) {
		    		System.out.println("Commaon Elements are: "+arr1[i]);
		    	    break;
		    	}

		    }
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int size1 = sc.nextInt();
		int size2 = sc.nextInt();

		int[] arr1 = new int[size1];
		for(int i=0;i<size1;i++) {
			arr1[i] =sc.nextInt();
		}
		int[] arr2 = new int[size2];
		for(int i=0;i<size2;i++) {
			arr2[i] =sc.nextInt();
		}
		common(arr1, arr2);
		sc.close();

	}

}
