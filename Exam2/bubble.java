public class bubble {
    public static int bubbleSort(int[] A) {
        boolean swap= true;
        int length= A.length;
        int count= 0;
        while(swap&& length>= 2){
        count++;
        swap= bubble(A,length);
        length--;}
        return count;}
        public static boolean bubble(int[] A, int length) {
            boolean result= false;
            for(int i=0; i<length-1; i++){
                if(A[i] > A[i+1]) {
                    int aux= A[i];
                    A[i] = A[i+1];
                    A[i+1] = aux;
                    result= true;}}
                    return result;}
                    public static void main(String[] args) {
                        int G[] = {1,2,3,4,5,8,7,6};
                        System.out.println(bubbleSort(G));
                    }
}
