import java.util.Scanner;

public class Topic4 
{
	public static String computeBinary(int n)
  	{
    	if (n == 0) 
    	{
      		return "0";
    	}

    	String result = "";
    	while (n > 0) 
    	{
    		int remainder = n % 2;
      		result = remainder + result;
      		n = n / 2;
    	}
    	return result;
  	}

  	public static int factorialIterative(int n) 
	{
    	if (n == 0) 
    	{
      	return 1;
    	}

    	int result = 1;
    	for (int count = n; count >= 1; count--) 
		{
      		result = result * count;
    	}
    	return result;
  	}


  	public static int getValidNumber(Scanner sc) 
	{
    	int number;
    	boolean valid = false;

    	while (!valid) 
		{
      		System.out.print("Enter an integer between 0 and 1000: ");
      		number = sc.nextInt();

      		if (number >= 0 && number <= 1000) 
			{
        		valid = true;
        		return number;
      		} 
			else 
			{
        		System.out.println("Invalid input (out of range). Try again.");
      		}
    	}
    	return 0;
	}

	
  	public static void minMaxAvgTracker(Scanner sc, int totalCount) 
	{
    	int highest = 0;
    	int lowest = 0;
    	int counter = 0;
    	int sum = 0;

    	while (counter < totalCount) 
		{
      		int number = getValidNumber(sc);

      		if (counter == 0) 
			{
        		highest = number;
        		lowest = number;
      		} 
			else 
			{
      			if (number > highest) 
				{
      				highest = number;
      			}
      			if (number < lowest) 
				{
        			lowest = number;
      			}
    		}

      		sum += number;
      		counter++;
  		}

    	double average = sum / (double) totalCount;
    	System.out.println("Highest = " + highest);
    	System.out.println("Lowest  = " + lowest);
    	System.out.println("Average = " + average);
	}


  	public static double meanOfData(double[] data) 
	{
    	double sum = 0.0;
    	for (double value : data) 
		{
      		sum += value;
    	}
    	return sum / data.length;
  	}


  	public static void bubbleSort(double[] data) 
	{
    	boolean swapped = true;
    	int n = data.length;

    	while (swapped) 
		{
      		swapped = false;
      		for (int i = 0; i < n - 1; i++) 
			{
        		if (data[i] > data[i + 1]) 
				{
          			double temp = data[i];
          			data[i] = data[i + 1];
          			data[i + 1] = temp;
          			swapped = true;
        		}
    		}
    	n--;
    	}
  	}

	
	public static double medianOfData(double[] data) 
	{
    	bubbleSort(data);

    	int n = data.length;
    	if (n % 2 == 1) 
		{
    		return data[n / 2];
    	} 
		else 
		{
      		double a = data[(n / 2) - 1];
      		double b = data[n / 2];
      		return (a + b) / 2.0;
    	}
  	}

	
  	public static int[] buildFrequency(int[] data) 
  	{
    	int[] freq = new int[101];

    	for (int value : data) 
		{
      		if (value >= 1 && value <= 100) 
	  		{
        		freq[value]++;
      		}
    	}
    	return freq;
  	}

	
  	public static void splitRainbow(String[] rainbow, String[] colours, String[] order) 
	{
    	int k = 0;
    	for (int i = 0; i < rainbow.length; i += 2) 
		{
      		colours[k] = rainbow[i];
      		order[k] = rainbow[i + 1];
      		k++;
    	}
  	}

	
  	public static void sortByOrder(String[] colours, String[] order) 
	{
    	boolean swapped = true;
    	int n = order.length;

    	while (swapped) 
		{
      		swapped = false;
      		for (int i = 0; i < n - 1; i++) 
			{
        		if (order[i].compareTo(order[i + 1]) > 0) 
				{
          			String tempO = order[i];
          			order[i] = order[i + 1];
          			order[i + 1] = tempO;

          			String tempC = colours[i];
          			colours[i] = colours[i + 1];
          			colours[i + 1] = tempC;

          			swapped = true;
        		}
      		}
      		n--;
    	}
  	}

	public static boolean isIn(int x, int[] col) 
	{
	    int i = 0;
	    boolean found = false;
	
	    while (i < col.length && !found) 
	    {
	        if (col[i] == x) 
	        {
	            found = true;
	        }
	        i++;
	    }
	
	    return found;
	}
	
	public static void bubbleSortDescending(int[] nums) 
	{
	    boolean swapped = true;
	    int n = nums.length;
	
	    while (swapped) 
	    {
	        swapped = false;
	        for (int i = 0; i < n - 1; i++) 
	        {
	            if (nums[i] < nums[i + 1])  
	            {
	                int temp = nums[i];
	                nums[i] = nums[i + 1];
	                nums[i + 1] = temp;
	                swapped = true;
	            }
	        }
	        n--;
	    }
	}

	public static void selectionSortDescending(int[] nums) 
	{
	    for (int i = 0; i < nums.length - 1; i++) 
	    {
	        int maxIndex = i;
	
	        for (int j = i + 1; j < nums.length; j++) 
	        {
	            if (nums[j] > nums[maxIndex]) 
	            {
	                maxIndex = j;
	            }
	        }
	
	        int temp = nums[i];
	        nums[i] = nums[maxIndex];
	        nums[maxIndex] = temp;
	    }
	}

	public static boolean binarySearch(int[] nums, int target) 
	{
	    int left = 0;
	    int right = nums.length - 1;
	
	    while (left <= right) 
	    {
	        int mid = (left + right) / 2;
	
	        if (nums[mid] == target) 
	        {
	            return true;
	        }
	        else if (nums[mid] > target) 
	        {
	            right = mid - 1;
	        }
	        else 
	        {
	            left = mid + 1;
	        }
	    }
	    return false;
	}

	
  	public static void main(String[] args) 
	{
    	Scanner sc = new Scanner(System.in);

    	// 1. Test computeBinary
    	System.out.println("computeBinary(5) = " + computeBinary(5)); 

    	// 2. Test factorialIterative
    	System.out.println("factorialIterative(5) = " + factorialIterative(5)); 

    	// 3 & 4. Test getValidNumber and minMaxAvgTracker
    	System.out.println("Testing processNumbers with 3 inputs:");
    	minMaxAvgTracker(sc, 3);

    	// 5 & 7. Test meanOfData and medianOfData
    	double[] data = { 5, 2, 9, 4, 7 };
    	double mean = meanOfData(data);
    	double median = medianOfData(data);
    	System.out.println("Data for mean/median: 5, 2, 9, 4, 7");
    	System.out.println("Mean = " + mean);
    	System.out.println("Median = " + median);

    	// 8. Test buildFrequency
    	int[] sampleValues = { 5, 5, 3, 1, 100, 5, 3 };
    	int[] freq = buildFrequency(sampleValues);
    	System.out.println("Frequency of some values in {5,5,3,1,100,5,3}:");
    	System.out.println("freq[1] = " + freq[1]);
    	System.out.println("freq[3] = " + freq[3]);
    	System.out.println("freq[5] = " + freq[5]);
    	System.out.println("freq[100] = " + freq[100]);

    	// 9 & 10. Test splitRainbow and sortByOrder
    	String[] rainbow = 
		{
      		"Blue", "E",
      		"Green", "D",
      		"Indigo", "F",
      		"Orange", "B",
      		"Red", "A",
      		"Violet", "G",
      		"Yellow", "C"
    	};

    	String[] colours = new String[7];
	    String[] order = new String[7];

    	splitRainbow(rainbow, colours, order);
    	sortByOrder(colours, order);

    	System.out.println("Rainbow colors sorted by order indicator:");
    	for (int i = 0; i < colours.length; i++) 
		{
        	System.out.println(order[i] + " : " + colours[i]);
    	}
	
    	sc.close();

		// 10. Test isIn method
		int[] BASKETBALL = {10011, 11876, 10122};
		System.out.println("isIn(11876, BASKETBALL) = " + isIn(11876, BASKETBALL));
		System.out.println("isIn(22103, BASKETBALL) = " + isIn(22103, BASKETBALL));

		// 11. Test bubbleSortDescending
		int[] nums1 = {12, 52, 16, 42, 88, 86};
		bubbleSortDescending(nums1);
		System.out.print("Bubble Descending: ");
		for (int n : nums1)
		{
		    System.out.print(n + " ");
		}		
		System.out.println();
		
		// 12. Test selectionSortDescending
		int[] nums2 = {12, 52, 16, 42, 88, 86};
		selectionSortDescending(nums2);
		System.out.print("Selection Descending: ");
		for (int n : nums2)
		{
		    System.out.print(n + " ");
		}		
		System.out.println();
		
		// 13. Test binarySearch
		int[] sortedArray = {102, 215, 330, 445, 556, 670, 789, 890};
		System.out.println("binarySearch(330) = " + binarySearch(sortedArray, 330));
		System.out.println("binarySearch(500) = " + binarySearch(sortedArray, 500));

	}
}

