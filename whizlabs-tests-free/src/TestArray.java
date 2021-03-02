public class TestArray {

	public static void main(String[] args) {
		
	/**
	 * What will be the output of following program code?
	 * Oops.. Identifed Exception :: java.lang.ArrayIndexOutOfBoundsException: 11
	 * Explanation
	 * Array is declared with 10 elements. 
	 * Then the code tries to access the 11th index element of the array which throws an standard exception 
	 * 'java.lang.ArrayIndexOutOfBoundsException'.
	 */
		
		try {
			int TestArrayData[] = new int[10];
			System.out.println("Accessing Element Eleven: " + TestArrayData[11]);
		} catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Oops.. Identifed Exception ::" + ex);
		}
	}

}
