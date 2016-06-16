import java.util.Random;

public class DataArray {
	
	private static Integer[] testArray;
	
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
	
	public static Integer[] sortedArray(Integer[] arrayToBeSorted, int recursionLimit)
	{		
		FHsort.setRecursionLimit(recursionLimit);
		FHsort.quickSort(arrayToBeSorted);
		return arrayToBeSorted;		
	}
}
