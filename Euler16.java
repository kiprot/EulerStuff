import java.math.BigInteger;

class Euler16 {

    public static String power(long a, long b) {

	long res = 1;
	while(b > 0) {
	    if(b % 2 != 0)
		res = res * a;
	    a = a * a;
	    b >>= 1; 
	}
	System.out.println(res);
	return Long.toString(res);

    }

    public static int sumOfDigits(String s) {

	int res = 0, i = 0;
	while(i < s.length() ) {
	    res += (s.charAt(i) - '0');
	    i++;
	}	
	return res;

    }

    public static String run() {
	String temp = BigInteger.ONE.shiftLeft(1000).toString();
	int sum = 0;
	for (int i = 0; i < temp.length(); i++)
	    sum += temp.charAt(i) - '0';
        return Integer.toString(sum);
    }



    public static void main(String[] args) {

	System.out.println(run());
	String str = power(2, 1000);
	int result = sumOfDigits(str);
	System.out.println(str);
	//System.out.println(result);
	System.out.println(result);

    }

}


/*
public static long binpow(long a, long b) {
        long res = 1;
        while(b > 0) {

            if(b % 2 != 0)
                res = res * a;
            a = a * a;
            b >>= 1;
        }
        return res;
}
*/
