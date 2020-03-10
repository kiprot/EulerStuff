class Euler6 {

    public static int sumOfSquares(int num) {
	int sum = 0;
	for(int i = 1; i <=num; i++) {
	    sum += i*i;
	}
	return sum;

    }

    public static int squareOfSums(int num) {

	int tracker = 0;
	for(int i = 1; i <= num; i++) {
	    tracker += i;
	}
	int sum = tracker * tracker;
	return sum;

    }

    public static void main(String[] args) {
	System.out.println(Math.abs( sumOfSquares(100) - squareOfSums(100) ) );

    }


}
