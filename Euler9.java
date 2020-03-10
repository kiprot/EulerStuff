class Euler9 {

    public static int thousandSumTriplet() {

	for(int a = 1; a < 500; a++) {
	    for(int b = 1; b < 500; b++) {
	    	for(int c = 1; c < 500; c++) {
		    if(a*a + b*b == c*c) {
			if(a + b + c == 1000) { 
			    System.out.println(a);
			    System.out.println(b);
			    System.out.println(c);
			    return a*b*c;
			}
		    }
		}
	    }
	}
	return 0;
    }

    public static void main(String[] args) {
	System.out.println(thousandSumTriplet());
    }


}
