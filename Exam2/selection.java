public class selection {
    public static void selection(int[] A) {
        int index;
        int aux;
        for(int i=A.length-1; i>0; i--) { 
            index= select(A,i);
            aux= A[index];
            A[index] = A[i];
            A[i] = aux;} }
            public static int select(int[] A, int end) {
                if(A.length< 1) return-1;
                int indexMax= 0;
                for(int i=1; i<= end; i++) {
                    if(A[i] > A[indexMax]) 
                    indexMax= i;}
                    return indexMax;}
                    public static void main(String[] args) {
                        int G[] = {1,2,3,4,5};
                        System.out.print(select(G, 4));
                    }
}
