public class SwapJavaProgramWithTwoVariable {
	public static void main(String[] args) {
		
		String a = "Love";
		String b = "You";
		
		//System.out.println("String before Swap a  "+ a+ " b "+b);
		
		a=a+b;
		b=a.substring(0, a.length()-b.length())	;
		a=a.substring(b.length());
		
		System.out.println(a);
		System.out.println(b);
	}
}
/*********
 * important
 * if we wrote a.substring(5);//then it will give value after fifth postion frome given string
 * if we have to retrive unique word from string then use a.substring(0,5);etc
 */
