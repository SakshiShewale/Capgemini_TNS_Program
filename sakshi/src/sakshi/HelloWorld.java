package sakshi;

public class HelloWorld {
	
	static boolean canMakeEqual(int a[], int n)
	{

	    // Iterate over all numbers

	    for (int i = 0; i < n; i++) {

	  

	        // If a number has a power of 5

	        // remove it

	        while (a[i] % 5 == 0) {

	            a[i] /= 5;

	        }
	        while (a[i] % 4 == 0) {

	            a[i] /= 4;

	        }
	  

	        // If a number has a power of 3

	        // remove it

	        while (a[i] % 3 == 0) {

	            a[i] /= 3;

	        }
	        
	        while (a[i] % 2 == 0) {

	            a[i] /= 2;

	        }

	    }

	  

	    int last = a[0];

	  

	    // Check if all elements are equal

	    // in the final array

	    for (int i = 1; i < n; i++) {

	        if (a[i] != last) {

	            return false;

	        }

	    }

	  

	    return true;
	}

public static void main(String[] args) {
	
	 int arr[] = { 8,1,4,2,2 };

	  

	    int n = arr.length;

	  

	    // Function call to check if all

	    // element in the array can be equal

	    // or not.

	    if (canMakeEqual(arr, n)) {

	        System.out.print("YES" +"\n");

 }

 else {

     System.out.print("NO" +"\n");

 } 
	    
	    
	    
	    int arr1[] = { 2,4,6,4,6 };

		  

	    int n1 = arr.length;

	  

	    // Function call to check if all

	    // element in the array can be equal

	    // or not.

	    if (canMakeEqual(arr1, n1)) {

	        System.out.print("YES" +"\n");

 }

 else {

     System.out.print("NO" +"\n");

 } 
}
	//System.out.println("Hello Gayaytri");
	
	

		  
		// Function to find if it's possible
		// to make all array elements equal

		
		  
		// Driver's Code

		
	
}

