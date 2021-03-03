
public class TestOutputCode1 {

	public static void main(String[] args) {
		/**
		 * What will be the output of following program code?
		 * 
		 * Answer is: x cannot be resolved to a variable
		 */
		
		int sum = 0;
		for(int x = 0; x <= 10; x++)
			sum += x;
		System.out.print("Sum for 0 to " + x);
		System.out.println(" = " + sum);
	}

}
