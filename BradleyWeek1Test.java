public class BradleyWeek1Test {
    public static String reversed(String str) { //1
        String reversed = "";
        for (int i=str.length()-1;i>=0;i--) {
        reversed = reversed+str.charAt(i);
        }
        return reversed;  
    }

    public static String NextAlphabetical(String str){ //2
        String NextAlphabetical = "";
		for(int i=0;i<str.length();i++){ 
        NextAlphabetical=NextAlphabetical+(char)(str.charAt(i)+1); 
        } 
        return NextAlphabetical;
        }

    public static String Array(int[] A, int e){ //3
        e = 2;
        int counter =0;
        String t = "true";
        String f = "false";
        for(int i=1;i<A.length;i++){
        if(A[i]==e){
        counter++;
        }
        }
        if(counter == e){
            return t;
        }
        else{
            return f;
        }
    
    }
    public static int Minimum(int[] A){ //4
        int min = A[0]; 
        for(int i=1;i<A.length;i++){ 
        if(A[i] < min){ 
        min = A[i]; 
          } 
        } 
        return min; 
        }

    public static String TightArray(int[] A) { //5 
        int min = A[0]; 
        int max = A[0];
        int counter =1;
        String t = "true";
        String f = "false";
        for(int i=1;i<A.length;i++){ 
        if(A[i] > max){ 
        max = A[i]; 
                } 
            } 
        for(int i=1;i<A.length;i++){ 
        if(A[i] < min){ 
        min = A[i]; 
            } 
        }
        for(int i=1;i<A.length;i++){ 
        if(A[i] == A[i]){ 
        counter++;
            } 
        }
        int diff = max-min;
        if(diff<counter){
            return f;
        }
        else{
            return t;
        }
        }


    public static String SameValue(int[] A){//5
        int counter =1;
        String t = "true";
        String f = "false";
        for(int i=1;i<A.length;i++){
        if(A[i]==A[i]){
        counter++;
        }
        }
        if(counter == 1){
        return f;
        }
        else{
        return t;
        }
    }

    public static void main(String a[]){
        String word = "abc";
        int array[] = {1,10,5,6,18,9};
        System.out.println(reversed(word));
        System.out.println(NextAlphabetical(word));
        System.out.println(Array(array, 0));
        System.out.println(Minimum(array));
        System.out.println(TightArray(array));
        System.out.println(SameValue(array));
    }
}