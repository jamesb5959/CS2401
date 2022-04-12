public class Sort {
    public static void insert(int[] A, int indexToBeInserted) {
        int toBeInserted= A[indexToBeInserted];
        int indexToBeChecked= indexToBeInserted-1;
        while(indexToBeChecked>= 0 && A[indexToBeChecked] > toBeInserted) {
            A[indexToBeChecked+1] = A[indexToBeChecked];
            indexToBeChecked--;
        }
        if(indexToBeChecked< 0) 
        A[0] = toBeInserted;
        else
        A[indexToBeChecked+1] = toBeInserted;}
        static void printArray(int A[])
        {
            int n = A.length;
            for (int i = 0; i < n; ++i)
                System.out.print(A[i] + " ");
     
            System.out.println();
        }
        public static void main(String[] args) {
            int[] A= {1,2,3,4,5,6};
            insert(A,3);
            printArray(A);
        }
}
