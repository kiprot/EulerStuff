class Euler12 {


    public static long numOfDivisors(int n) {

	int tracker = 1;		
	long i = 1;
	int res = 0;
	while(res <= n) {
	    res = divisors(i);
	    if(res >= n)
		return i;
	    else {
		tracker++;
		i += tracker;
	    }
	}
	return 0;
    }


    private static int divisors(long n) {
	
	int total = 0;
	long end = (long) Math.sqrt(n);
	for(long i = 1; i < end; i++) {
	    if(n % i == 0)
		total += 2;
	}
	if(end * end == n) total++;
	return total;
    }

    public static void main(String[] args) {
	System.out.println(numOfDivisors(500));
    }

}
