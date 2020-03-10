class Euler7 {


    public static int nthPrime(int n) {

	for(int i = 2, count = 0; ; i++) {
	    if(isPrime(i)) {
		count++;
	    	if(count == n)
		    return i;
	    }	

	} 

    }

    private static boolean isPrime(int n) {

	if(n <= 1)
	    throw new IllegalArgumentException();

	if(n == 2 || n == 3) return true;

	if(n % 2 == 0) return false;

	for(int i = 3, end = (int) Math.sqrt(n) + 1; i <= end; i += 2) {
	    if(n % i == 0) 
		return false;
	}
	return true;

    }

    public static void main(String [] args) {
	System.out.println(nthPrime(10001) );

    }

}
