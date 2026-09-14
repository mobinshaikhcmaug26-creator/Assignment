package forloop;

public class ContinuousNumberPattern {

	public static void main(String[] args) {
	int itemp =1;
	for(int irow=1;irow<=4;irow++) {
		for(int jcol=1;jcol<=irow;jcol++) {
    		System.out.print(" "+itemp);	
    		itemp++;

		}
		System.out.println();
	   }
	}
}
/* 1
   2 3 
   4 5 6
   7 8 9 10
*/