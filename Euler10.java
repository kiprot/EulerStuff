class Euler10 {

    public static long primeSum(int n) {

	long sum = 0;
	for(int i = 0; i < n ; i++) {
	    if(isPrime(i)){
		sum += i;
	    }
	}
	return sum;

    }

    private static boolean isPrime(int n) {

	if(n <= 1) return false;
	
	if(n == 2 || n == 3) return true;
	
	if(n % 2 == 0) return false;
	
	for(int i = 3, end = (int) Math.sqrt(n)+1; i <= end; i += 2) {
	    if(n % i == 0) 
		return false;
	}
	return true;
    }

    public static void main(String[] args) {
	System.out.println(primeSum(2000000));
    }

}
