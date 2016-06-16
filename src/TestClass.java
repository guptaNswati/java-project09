public class TestClass 
{		
	public static void main(String[] args)
	{
		int arraySize = 20000;

		long startTime, estimatedTime;

		while(arraySize <= 15000000)
		{				
			Integer [] original = DataArray.initialiseArray(arraySize);

			int recursionLimit = 2;			
			while(recursionLimit <= 300)
			{					
				Integer [] copyOfOriginalArray = original.clone();			

				startTime = System.nanoTime();
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
