public class Exam2Prep {
    static void printArray(int[] arr, int size){
    for(int i = 0; i < size; i++)
        System.out.print(arr[i] + " ");
         
    System.out.println();
}
    public static int quickSortCount(int[] A, int start, int end, int count) {
        if(end-start<1){count++; 
            System.out.println(count);
            return count;
        }
        int pivotIndex= partition(A,start,end);
        quickSortCount(A,start,pivotIndex-1, count+1);
        return quickSortCount(A,pivotIndex+1,end, count+1);
    }
    public static void quickSort(int[] A, int start, int end, int count) {
        if(end-start<1){count++; 
            System.out.println(count);
            return;
        }
        int pivotIndex= partition(A,start,end);
        quickSort(A,start,pivotIndex-1, count+1);
        quickSort(A,pivotIndex+1,end, count+1);
    }
    public static int partition(int[] A, int start, int end) {
        int pivot= A[start];
        int less= start+ 1;
        int more= end;
        int aux;
        while(less< more) 
        {while(less< A.length&& A[less] <= pivot) less++;
            while(more> 0 && A[more] > pivot) more--;
            if(less< more) {
                aux= A[less];
                A[less] = A[more];A[more] = aux;}}
                if(A[more] < pivot) {aux= A[more];
        A[more] = pivot;A[start] = aux;
        return more;}
        return start;}
    public static void main(String[] args) {
        //int A[] = {5, 9, 4, 6, 5, 3};
        int A[] = {1, 2, 3, 4};
        int B[] = {7,6,5,4,3,2,1};
        int c[] = {45, 78, 3, 52, 2, 1};
        int D[] = { 5,1,10,2,7,8,3,4,9};
        int count = 1;
        //System.out.println(quickSort(A, 0, 2, 0));
        quickSort(B, 0, B.length-1);
        //This one doesnt work use quicksort.java
        //partition(B, 0, B.length-1);
        printArray(B, B.length-1);
    }
}
