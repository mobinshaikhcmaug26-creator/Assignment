package forloop;

public class ReverseNumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int irow=1;irow<=6;irow++) {
			for(int jcol=1;jcol<=7-irow;jcol++) {
	    		System.out.print(" "+jcol);
			}
          System.out.println();
	   }

	}

}
/*
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1*/