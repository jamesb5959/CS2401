public class insertion {
    public static void insertionSort(int[] A) {
        for(int i=1; i<A.length; i++) 
        insert(A,i);}
        public static int insert(int[] A, int indexToBeInserted) {
            int toBeInserted= A[indexToBeInserted];
            int indexToBeChecked= indexToBeInserted-1;
            while(indexToBeChecked>= 0 && A[indexToBeChecked] > toBeInserted) 
            {A[indexToBeChecked+1] = A[indexToBeChecked];
                indexToBeChecked--;}
                if(indexToBeChecked< 0) 
                return A[0] = toBeInserted;
else
return A[indexToBeChecked+1] = toBeInserted;}

public static void main(String[] args) {
    int[] A= {1,2,3,4,5,6};
    System.out.print(insert(A,5));
}
}
