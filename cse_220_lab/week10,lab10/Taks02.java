public class Taks02{ 
    public static void insertionSort(int arr[], int n) { 
        if (n <= 1) 
            return; 
        insertionSort( arr, n-1 ); 
        int last = arr[n-1]; 
        int j = n-2; 
        while (j >= 0 && arr[j] > last) { 
            arr[j+1] = arr[j]; 
            j--; 
        } 
        arr[j+1] = last; 
    } 
//
    public static void main(String[] args) { 
        int arr[] = {18,17,99,0,4}; 
     
        insertionSort(arr, arr.length); 
        for (int i = 0; i< arr.length; i++){ 
            System.out.print(arr[i] + " "); 
    }  
    } 
} 