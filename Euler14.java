class Euler14 {


    public static long collatz(int n) {

	int max = 0;
	for(int i = 13; i < n; i++) {
	    int track = 0;
	    int x = i;
	    
	    while(x != 1) {
		if(x % 2 == 0) {
		    x /= 2;
		    track++;
		}
		if(x % 2 != 0) {
		    x = (3*x) + 1;
		    track++;
		}
	    }
	    track++;
	    System.out.println(track); 
	    max = Math.max(track, max);

	}
	return max;
    }

    public static void main(String[] args) {
	System.out.println(collatz(1000000));
    }


}
