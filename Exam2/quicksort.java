public class quicksort {
    public static void quickSort(int[] A, int start, int end) {
        if(end-start< 1) return;
        int pivotIndex= partition(A,start,end);
        quickSort(A,start,pivotIndex-1);
        quickSort(A,pivotIndex+1,end);}

        public static int partition(int[] A, int start, int end) {
            int pivot= A[start];int less= start+ 1;
            int more= end;
            int aux;
            while(less< more) {
                while(less< A.length&& A[less] <= pivot) 
                less++;
                while(more> 0 && A[more] > pivot) more--;
                if(less< more) {aux= A[less];A[less] = A[more];
                    A[more] = aux;}}
                    if(A[more] < pivot) {
                        aux= A[more];A[more] = pivot;
                        A[start] = aux;
                        return more;}return start;}
                        static void printArray(int A[])
                        {
                            int n = A.length;
                            for (int i = 0; i < n; ++i)
                                System.out.print(A[i] + " ");
                     
                            System.out.println();
                        }
                        public static void main(String[] args) {
                            int B[] = { 5,1,10,2,7,8,3,4,9};
                            //quickSort(B, 0, B.length-1);
                            partition(B, 0, B.length-1);
                            printArray(B);
                        }

}
