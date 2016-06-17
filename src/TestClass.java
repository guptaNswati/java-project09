
/**
 * tests run time of quick sort by creating and copying arrays of different sizes with different recursion limits
 * @author swati
 *
 */
public class TestClass 
{		
	public static void main(String[] args)
	{
		int arraySize = 20000;

		long startTime, estimatedTime;

		while(arraySize <= 15000000)
		{	
			// creates array
			Integer [] original = DataArray.initialiseArray(arraySize);

			int recursionLimit = 2;			
			while(recursionLimit <= 300)
			{	
				// copies original
				Integer [] copyOfOriginalArray = original.clone();			

				// starts time 
				startTime = System.nanoTime();
				
				// call quick sort
				DataArray.sortedArray(copyOfOriginalArray, recursionLimit);
				estimatedTime = System.nanoTime() - startTime;
				System.out.println("Array Size: " + copyOfOriginalArray.length 
						+ "\n" + "Recursion Limit: " + recursionLimit 
						+ "\n" + "Algorithm Elapsed Time: " + TimeConverter.convertTimeToString(estimatedTime) 
						+ "\n");

				recursionLimit = recursionLimit+2;
			}			
			arraySize = 2 * arraySize;			
		}
	}

}
