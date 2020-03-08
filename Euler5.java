class Euler5 {

    public static int smallestDivisible() {

	int num = 2520;
	int start = 1, end = 20;
	while(start <= end) {
	    if(num % start == 0) {
		start++;
	    } else {
		num++;
		start = 1;
	    }

	}
	return num;
    }

    public static void main(String[] args) {
	System.out.println(smallestDivisible());
    }


}
