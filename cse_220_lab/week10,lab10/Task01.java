public class Task01 { 
  public static int minIndex(int a[], int i, int j){ 
        if (i == j) 
            return i; 
        int k = minIndex(a, i + 1, j); 

        return (a[i] < a[k])? i : k; 
    } 
       
    public static void selectionSort(int a[], int n, int index) //index==start
    { 
        if (index == n) 
           return; 
        int k = minIndex(a, index, n-1); 
        if (k != index){ // swap 
           int temp = a[k]; 
           a[k] = a[index]; 
           a[index] = temp; 
        } 
        selectionSort(a, n, index + 1); 
    } 
       
    public static void main(String args[])  
    { 
        int arr[] = {8,6,5,5,3,99}; 
        
        selectionSort(arr, arr.length, 0); 

        for (int i = 0; i< arr.length; i++) 
            System.out.print(arr[i] + " "); 
    } 
}  