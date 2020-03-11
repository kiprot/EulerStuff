class Euler17 {


    private static final String[] nums = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen" ,"sixteen", "seventeen", "eighteen", "nineteen"};

    private static final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };


    public static String convert(int n) {

	if(n < 0) return "-" + convert(n);
	
	if(n < 20) return nums[n];

	if(n < 100) return tens[n / 10] + nums[n % 10];
	

	if(n < 1000) 
		return nums[n / 100] + "hundred" + ((n % 100 != 0) ? "and" : "") + convert(n % 100);

	if(n == 1000) return "onethousand"; 
	
	return " ";

    }


    public static int lengthOfWords() {
	
	int res = 0;
	for(int i = 0; i <= 1000; i++) {
	    String temp = convert(i);
	    System.out.println(temp);
	    res += temp.length();
	}
	return res;
    }
   
    public static void main(String[] args) {
	System.out.println(convert(11));
	System.out.println(convert(10));	
	System.out.println(convert(21));
	System.out.println(convert(32));
	System.out.println(convert(43));
	System.out.println(convert(54));	
	System.out.println(convert(65));
	System.out.println(convert(76));
	System.out.println(convert(87));
	System.out.println(convert(98));
	System.out.println(convert(109));
	System.out.println(convert(210));
	System.out.println(convert(1000));
	System.out.println(lengthOfWords());
    }

}
