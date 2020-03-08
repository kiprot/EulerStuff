

class Euler4 {

    public static int largestPalindrome() {
	
	int max = 0;
	for(int i = 999; i >= 100; i--) {
	    for(int j = 999; j >= 100; j--) {
		int temp = i*j;
		if(isPalindrome(temp))
		    max = Math.max(max, temp);
	    }
	}
	return max;

    }

    private static boolean isPalindrome(int n) {
	
	String str = Integer.toString(n);
	StringBuilder sb = new StringBuilder(str).reverse();
	int res = Integer.parseInt(sb.toString());
	return res == n;

    }
	
    public static void main(String[] args) {
	System.out.println(largestPalindrome());
    }

}
