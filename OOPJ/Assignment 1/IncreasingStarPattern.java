package forloop;

public class IncreasingStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int irow=1 ;irow<=5;irow++) {
			for(int jcol=1;jcol<=irow;jcol++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
}
