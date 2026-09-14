package forloop;

public class DecreasingStarPattern {

	public static void main(String[] args) {
		
	    for(int irow=1;irow<=5;irow++) {
	    	for(int jcol=5;jcol>=irow;jcol--) {
	    		System.out.print("*");
	    	}
	    	System.out.println();
	    }

	}

}
