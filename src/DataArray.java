import java.util.Random;
/**
 * Creating an array of size specified by client for testing quick sorts sorting time 
 * in respect of different recursion limits
 * @author swati
 *
 */
public class DataArray {
	
	private static Integer[] testArray;
	
	/**
	 * creates an array of randomly generated ints
	 * @param arraySize size of array of type int to be created
	 * @return array with randomly generated ints
	 */
	public static Integer[] initialiseArray(int arraySize)
	{
		testArray = new Integer[arraySize];
		
		Random randomGenerator = new Random(); 
		
		int number = 1;
		
		for(int i = 0; i < testArray.length; i++)
		{
			testArray[i] = randomGenerator.nextInt(number);	
			number = number + 1 ;
		}
		return testArray;
	}
	
	/**
	 *  quick sorts a given array with a given recursion limit
	 * @param arrayToBeSorted array of ints to be sorted
	 * @param recursionLimit recursion limit for quick sort
	 * @return sorted array
	 */
	public static Integer[] sortedArray(Integer[] arrayToBeSorted, int recursionLimit)
	{		
		FHsort.setRecursionLimit(recursionLimit);
		FHsort.quickSort(arrayToBeSorted);
		return arrayToBeSorted;		
	}
}
