public class SelectionSort {

         /* Selection Sort function */

    public static void sort( int arr[] ){
    	
        int N = arr.length;
        int i, j, temp;

        for (i = 0; i < N; i++)
        {
            for (j = i+1; j < N; j++)
            {
                if (arr[j] < arr[i])
                {
                	/* Swap arr[i] and arr[pos] */
                	temp = arr[i];
                    arr[i] = arr[j];
                    arr[j]= temp;
                }
            }          
        }       
      }
}