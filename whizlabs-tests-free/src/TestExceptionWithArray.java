
public class TestExceptionWithArray {

	public static void main(String[] args) {

		/**
		 * Which exception will the following statement generate?
		 * int array[] = new int[-2];
		 * 
		 * Answer is: Exception in thread "main" java.lang.NegativeArraySizeException
		 */
		
		int array[] = new int[-2];
		System.out.println(array);
	}

}
