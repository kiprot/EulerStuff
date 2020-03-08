import java.util.*;

class Euler3 {


    public static long getSmallestFactor(long n) {
	if(n <= 1) 
	    throw new IllegalArgumentException();
	for(long i = 2, end =(long) Math.sqrt(n); i <= end; i++) {
	    if(n % i == 0) return i;
	}
	return n;
    }


     public static long largestPrimeFactor() {
	
	long num = 600851475143L;
	while(true) {
	    long divisor = getSmallestFactor(num);
	    if(divisor < num) 
		num /= divisor;
	    else 
		return num;

	}

    }

    public static void main(String[] args) {

	System.out.println(largestPrimeFactor());

    }

}
